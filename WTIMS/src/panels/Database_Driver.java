/*
 * Created by Ricky Barnwell and Nipuna Senanayake
 * Csc 4350 GSU Summer 2017
 * Software Engineering
 * Database_Driver.java
 */
package panels;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**	The Database_Driver class is used to make a connection to the database
*	and is used to send and receive data from it.
*/
public class Database_Driver 
{
    /**	default connection for the database
    */
    Connection conn;
    
    /**	Constructor initializes the conn object
    */
    public Database_Driver() 
    {
        try 
        {
            String path = Paths.get(".").toAbsolutePath().normalize().toString();
            String url = "jdbc:sqlite:";
            url += path + "/WTIMS.db";
            conn = DriverManager.getConnection(url);
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
    }
    
    /** authenticateUser() checks to see if credential provided are the database
    *	@pre valid credentials(u,p)
    *	@post boolean is returned 
    */
    public boolean authenticateUser(String u, String p)
    { 
        boolean isPasswordCorrect = false;
        String sql = "select password from users where username = '" + u + "';";
        try (
                Statement stmt  = conn.createStatement();
                ResultSet rs    = stmt.executeQuery(sql)
            )
        {  
            // loop through the result set
            while (rs.next()) 
            {
                isPasswordCorrect = p.equals(rs.getString("password"));
            }
             return isPasswordCorrect;
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    /** getUserInfo() takes a String to get a users information
    *	@pre valid string u
    *	@post returns a user object
    */
    public User getUserInfo(String u)
    {
        String firstName = null;
        String lastName = null;
        String employeeID = null;
        String username = u;
        String location = null;
        String type = null;
        User user;
        String sql = "select * from users where username = '" + u + "';";
        try (
            Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql)
            )
        {  
            // loop through the result set
            while (rs.next()) 
            {
                firstName = rs.getString("first_name");
                lastName = rs.getString("last_name");
                employeeID = rs.getString("employee_id");
                location = rs.getString("location");
                type = rs.getString("type"); 
            }
            user = new User((firstName + " " + lastName), employeeID, username, type, null, location);
            return user;
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    /**	getAlltellerInfo() returns a list of all users based on the current user's 
    *	location
    *	@pre location
    *	@post return a list of Users from the database
    */
    public List<User> getAllTellerInfo(String location)
    {
        //implement get teller info
        List<User> tellerList = new ArrayList<>();
        List<Transaction> transaction = new ArrayList<>();
        String sql = "SELECT * from users where type = 'Teller' and location = ?;";
        try
        {
            PreparedStatement pstmt  = conn.prepareStatement(sql);
            pstmt.setString(1,location);
            ResultSet rs  = pstmt.executeQuery();
            while (rs.next()) 
            {
                String id = rs.getString("employee_id");
                tellerList.add(new User(rs.getString("first_name") + " " + rs.getString("last_name"), id, null, null, getUserHistory(rs.getString("username"), id), rs.getString("location")));
            }
            return tellerList;
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }  
    }
    
    /**	updateBankPolicy() updates the bank's policies in the database
    *	@pre String as an argument to specify the policy being changed
    *	@post updates the database
    */
    public void updateBankPolicy(String s)
    {
        
    }
    
    /**	updateCustomerInfo() takes a Customer_Account and updates the database with its 
    *	information
    *	@pre Customer_Account c
    *	@post updates the database with c
    */
    public void updateCustomerInfo(Customer_Account c)
    {
        String sql = "UPDATE customers set name=?,ssn=?,address=?, phone=?, email=? where account_number=?";
        try
        {
            PreparedStatement pstmt  = conn.prepareStatement(sql);
            pstmt.setString(1,c.getName());
            pstmt.setString(2,c.getSocialNum());
            pstmt.setString(3,c.getAddress());
            pstmt.setString(4,c.getPhone());
            pstmt.setString(5,c.getEmail());
            pstmt.setString(6,c.getAccountNum());
            pstmt.executeUpdate();
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    /** insertNewCustomer() takes a Customer_Account and adds a new record in the database
    *	@pre Customer_Account c
    *	@post updates the database with c
    */
    public void insertNewCustomer(Customer_Account c)
    {
        String sql = "insert into customers (name, ssn, address, phone, email) values (?,?,?,?,?);";
        try
        {
            PreparedStatement pstmt  = conn.prepareStatement(sql);
            pstmt.setString(1,c.getName());
            pstmt.setString(2,c.getSocialNum());
            pstmt.setString(3,c.getAddress());
            pstmt.setString(4,c.getPhone());
            pstmt.setString(5,c.getEmail());
            pstmt.executeUpdate();
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    /** updateDeposit() adds a deposit transaction to the database
    *	@pre c, u, amount, note
    *	@post adds a new transaction record
    */
    public void updateDeposit(Customer_Account c, User u, double amount,String note)
    {
        String sql = "INSERT into transactions (amount, type, account_number, user_actioned, notes, date, location) values (?,?,?,?,?,?,?);";
        try 
        {
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
            // Get the date today using Calendar object.
            Date today = Calendar.getInstance().getTime();        
            PreparedStatement pstmt  = conn.prepareStatement(sql);
            pstmt.setDouble(1,amount);
            pstmt.setString(2,"deposit");
            pstmt.setString(3,c.getAccountNum());
            pstmt.setString(4,u.getUsername());
            pstmt.setString(5,note);
            pstmt.setString(6, String.valueOf(df.format(today)));
            pstmt.setString(7,u.getLoc());
            pstmt.executeUpdate();
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        } 
    }
    
    /** updateWithdrawal() adds a Withdrawal transaction to the database
    *	@pre c, u, amount, note
    *	@post adds a new transaction record
    */
    public void updateWithdrawl(Customer_Account c, User u, double amount,String note)
    {
        String sql = "INSERT into transactions (amount, type, account_number, user_actioned, notes, date, location) values (?,?,?,?,?,?,?);";
        try 
        {
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
            // Get the date today using Calendar object.
            Date today = Calendar.getInstance().getTime();        
            PreparedStatement pstmt  = conn.prepareStatement(sql);
            pstmt.setDouble(1,amount);
            pstmt.setString(2,"withdrawal");
            pstmt.setString(3,c.getAccountNum());
            pstmt.setString(4,u.getUsername());
            pstmt.setString(5,note);
            pstmt.setString(6, String.valueOf(df.format(today)));
            pstmt.setString(7,u.getLoc());
            pstmt.executeUpdate();
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        } 
    }
    
    /**	getBranchManagerInfo() returns a list of all Branch Managers
    *	@post return a list of Users from the database
    */
    public List<User> getBranchManagerInfo()
    {
        List<User> userList=null;
        String sql = "SELECT * from users where type = ?";
        try
        {
            PreparedStatement pstmt  = conn.prepareStatement(sql);
            pstmt.setString(1,"teller");
            ResultSet rs  = pstmt.executeQuery();
            
            while (rs.next()) 
            {
                List<Transaction> transactionList=null;
                String sql2 = "SELECT * from transatction where id = ?";
                PreparedStatement pstmt2  = conn.prepareStatement(sql2);
                pstmt2.setString(1,rs.getString("id"));
                ResultSet rs2  = pstmt2.executeQuery();
            
                while (rs2.next())
                {
                    transactionList.add(new Transaction());
                }
            
                //userList.add(new User(rs.getString("emp_id"),rs.getString("type"),transactionList));
            }
            return userList;
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    /** getCustomerInfo() takes a String to get a customer's information
    *	@pre valid string s
    *	@post returns a Customer_Account object
    */
    public Customer_Account getCustomerInfo(String s) throws SQLException
    {
        Customer_Account c = new  Customer_Account();
        String sql = "SELECT * from customers where " + s + " IN (account_number, ssn);";
        try 
            (
                Statement stmt  = conn.createStatement();
                ResultSet rs    = stmt.executeQuery(sql)
            )
        {  
            // loop through the result set
            while (rs.next()) 
            {
                c.setName(rs.getString("name"));
                c.setAccountNum(rs.getString("account_number"));
                c.setSocialNum(rs.getString("ssn"));
                c.setAddress(rs.getString("address"));
                c.setPhone(rs.getString("phone"));
                c.setEmail(rs.getString("email"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return c;
    }
    
    /**	getUserHistory() retrieves a User's history from the database
    *	@pre username, employeeID
    *	@post returns a list of Transactions for that user
    */
    public List<Transaction> getUserHistory(String username, String employeeID)
    {
        List<Transaction> th = new ArrayList<>();
        String sql = "SELECT * from transactions where user_actioned = ? OR account_number = ?";
        try
        {
            PreparedStatement pstmt  = conn.prepareStatement(sql);
            pstmt.setString(1,username);
            pstmt.setString(2,employeeID);
            ResultSet rs  = pstmt.executeQuery();
            while (rs.next()) 
            {
                Transaction t = new Transaction();
                t.setAccountNum(rs.getString("account_number"));
                t.setAmount(rs.getString("amount"));
                t.setDate(rs.getString("date"));
                t.setId(rs.getString("id"));
                t.setLocation(rs.getString("location"));
                t.setNotes(rs.getString("notes"));
                t.setType(rs.getString("type"));
                t.setUser_actioned(rs.getString("user_actioned"));
                th.add(t);
            }
        } 
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
      
        }
        return th;
    }
    
    /**	getCustomerHistory() retrieves a Customer's history from the database
    *	@pre accountNo
    *	@post returns a list of Transactions for that Customer
    */
    public List<Transaction> getCustomerHistory(String accountNo)
    {
        List<Transaction> th = new ArrayList<>();
        String sql = "SELECT * from transactions where account_number = '" + accountNo + "'";
        try (
                Statement stmt  = conn.createStatement();
                ResultSet rs    = stmt.executeQuery(sql)
            )
        {  
            // loop through the result set
            while (rs.next()) 
            {
                Transaction t = new Transaction();
                t.setAccountNum(rs.getString("account_number"));
                t.setAmount(rs.getString("amount"));
                t.setDate(rs.getString("date"));
                t.setId(rs.getString("id"));
                t.setLocation(rs.getString("location"));
                t.setNotes(rs.getString("notes"));
                t.setType(rs.getString("type"));
                t.setUser_actioned(rs.getString("user_actioned"));
                th.add(t);
            }
            return th;
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    /** updateDrawerDeposit() adds a drawer deposit transaction to the database
    *	@pre c, u, amount, note
    *	@post adds a new transaction record
    */
    public void updateDrawerDeposit(User c, User u, double amount,String note)
    {
        String sql = "INSERT into transactions (amount, type, account_number, user_actioned, notes, date, location) values (?,?,?,?,?,?,?);";
        try 
        {
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
            // Get the date today using Calendar object.
            Date today = Calendar.getInstance().getTime();        
            PreparedStatement pstmt  = conn.prepareStatement(sql);
            pstmt.setDouble(1,amount);
            pstmt.setString(2,"deposit");
            pstmt.setString(3,c.getEmployeeID());
            pstmt.setString(4,u.getUsername());
            pstmt.setString(5,note);
            pstmt.setString(6, String.valueOf(df.format(today)));
            pstmt.setString(7,u.getLoc());
            pstmt.executeUpdate();
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        } 
    }

    /**	getAllUserInfo() returns a list of all users based on the current user's
    *	@post return a list of Users from the database
    */
    public List<User> getAllUserInfo() 
    {
        List<User> tellerList = new ArrayList<>();
        List<Transaction> transaction = new ArrayList<>();
        String sql = "SELECT * from users;";
        try
        {
            PreparedStatement pstmt  = conn.prepareStatement(sql);
            ResultSet rs  = pstmt.executeQuery();
            while (rs.next()) 
            {
                String id = rs.getString("employee_id");
                tellerList.add(new User(rs.getString("first_name") + " " + rs.getString("last_name"), id, null, null, getUserHistory(rs.getString("username"), id), rs.getString("location")));
            }
            return tellerList;
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }  
    }
}