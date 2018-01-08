/*
 * Created by Ricky Barnwell
 * Csc 4350 GSU Summer 2017
 * Software Engineering
 * User.java
 */
package panels;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**User class stores information from the database to represent a User in the system
*/
class User {
    /**	The following data fields are used to 
    *	store information for the User object
    */
    private String name;
    private String employeeID;
    private String username;
    private String type;
    private String loc;
    private List<Transaction> transactions; 
    private double drawerBalance;
    
    /**	User() Constructor
    *	@pre String n, String e, String u, String t, List<Transaction> tr, String l
    *	@post assigns name, employeeID, username, type, loc, transactions, drawerBalance;
    */
    public User(String n, String e, String u, String t, List<Transaction> tr, String l)
    {
        name = n;
        employeeID = e;
        username = u;
        type = t;
        loc = l;
        transactions = tr;
        if(tr != null)
        {
            drawerBalance = calcDrawerBalance();
        }
        else
        {
            drawerBalance = 3000;
        }
    }

    /**	getName()
    *	@post returns name
    */
    public String getName() 
    {
        return name;
    }
    
    /**	getEmployeeID()
    *	@post returns employeeID
    */
    public String getEmployeeID()
    {
        return employeeID;
    }

    /**	getUsername()
    *	@post returns username
    */
    public String getUsername() 
    {
        return username;
    }
    
    /**	getType()
    *	@post returns type
    */
    public String getType()
    {
        return type;
    }

    /**	getLoc()
    *	@post returns loc
    */
    public String getLoc() 
    {
        return loc;
    }
    
    /**	getTransactions()
    *	@post returns transactions
    */
    public List<Transaction> getTransactions()
    {
        return transactions;
    }

    /**	getDrawerBalance()
    *	@post returns drawerBalance
    */
    public double getDrawerBalance() 
    {
        return drawerBalance;
    }
    
    /**	calcDrawerBalance()
    *	@post returns calculated drawer balance from transactions
    */
    public double calcDrawerBalance()
    {
        double balance = 3000;
        for (Transaction transaction : transactions) 
        {
            try {
                Date transDate = (Date) new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH).parse(transaction.getDate());
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
                LocalDate now = LocalDate.now();
                Date todayDate = (Date) new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH).parse(dtf.format(now));
                if(transDate.equals(todayDate))
                {
                    if(transaction.getType().equals("deposit"))
                    {
                        balance += Double.valueOf(transaction.getAmount());
                    }
                    else
                    {
                        balance -= Double.valueOf(transaction.getAmount());
                    }
                }
            } 
            catch (ParseException ex) 
            {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return balance;
    }
    
    /**	toString()
    *	@post returns a formatted String with all User info
    */
    public String toString()
    {
        String _name = String.format("%1$-" + 17 + "s", name);
        String _id = String.format("%1$-" + 10 + "s", employeeID);
        String _loc = String.format("%1$-" + 12 + "s", loc);
        DecimalFormat moneyFormat = new DecimalFormat("$0.00");
        String _balance = moneyFormat.format(drawerBalance);
        return _name + _id + _loc + _balance;   
    }   
}
