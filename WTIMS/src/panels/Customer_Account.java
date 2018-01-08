/*
 * Created by Ricky Barnwell
 * Csc 4350 GSU Summer 2017
 * Software Engineering
 * Customer_Account.java
 */
package panels;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**	Customer_Account class to store all of the information 
*	relating to a real world customer
*/
class Customer_Account 
{
    /**	The following variables store the values 
    * 	appropriate to their names in the Customer_Account object
    */
    private String name;
    private String accountNum;
    private String socialNum;
    private String address;
    private String phone;
    private String email;
    private double cbal;
    private double abal;
    private List<Transaction> transactions;

    /**	@post assigns accountNum
    */
    public void setAccountNum(String accountNum) 
    {
        this.accountNum = accountNum;
    }

    /**	@post assigns transactions
    */
    public void setTransactions(List<Transaction> transactions) 
    {
        this.transactions = transactions;
        transactions.forEach((transaction) -> 
        {
            if(transaction.getType().equals("deposit"))
            {
                cbal += Double.valueOf(transaction.getAmount());
            }
            else
            {
                cbal -= Double.valueOf(transaction.getAmount());
            }
            try {
                Date transDate = (Date) new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH).parse(transaction.getDate());
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
                LocalDate now = LocalDate.now();
                Date todayDate = (Date) new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH).parse(dtf.format(now));
                if(transDate.before(todayDate))
                {
                    if(transaction.getType().equals("deposit"))
                    {
                        abal += Double.valueOf(transaction.getAmount());
                    }
                    else
                    {
                        abal -= Double.valueOf(transaction.getAmount());
                    }
                }
            } 
            catch (ParseException ex) 
            {
                Logger.getLogger(Customer_Account.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    /**	@post returns name
    */
    public String getName() 
    {
        return name;
    }

    /**	@post assigns name
    */
    public void setName(String firstname) 
    {
        this.name = firstname;
    }

    /**	@post returns socialNum
    */
    public String getSocialNum() 
    {
        return socialNum;
    }

    /**	@post assigns socialNum
    */
    public void setSocialNum(String socialNum) 
    {
        this.socialNum = socialNum;
    }

    /**	@post returns address
    */
    public String getAddress() 
    {
        return address;
    }

    /**	@post assigns address
    */
    public void setAddress(String address) 
    {
        this.address = address;
    }

    /**	@post returns accountNum
    */
    public String getAccountNum() 
    {
        return accountNum;
    }

    /**	@post returns phone
    */
    public String getPhone() 
    {
        return phone;
    }

    /**	@post assigns phone
    */
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    /**	@post returns email
    */
    public String getEmail() 
    {
        return email;
    }

    /**	@post assigns email
    */
    public void setEmail(String email) 
    {
        this.email = email;
    }
    
    /**	@post returns transactions
    */
    public List<Transaction> getTransactions() 
    {
        return transactions;
    }

    /**	@post returns cbal
    */
    public double getCbal() 
    {
        return cbal;
    }

    /**	@post returns abal
    */
    public double getAbal() 
    {
        return abal;
    }    
}
