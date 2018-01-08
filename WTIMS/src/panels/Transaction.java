/*
 * Created by Ricky Barnwell
 * Csc 4350 GSU Summer 2017
 * Software Engineering
 * Transaction.java
 */
package panels;
import java.text.DecimalFormat;

/** The Transaction class is to store transaction information from the database
*/
class Transaction 
{
    private String id;
    private String amount;
    private String type;
    private String notes;
    private String user_actioned;
    private String date;
    private String accountNum;
    private String location;
    
    /**	Constructor
    */
    public Transaction()
    {
        
    }
    
    /**	getId()
    *	@post returns id
    */
    public String getId() 
    {
        return id;
    }
    
    /**	setId
    *	@pre String id
    *	@post sets id
    */
    public void setId(String id) 
    {
        this.id = id;
    }
    
    /**	getAmount()
    *	@post returns amount
    */
    public String getAmount() 
    {
        return amount;
    }
    
    /**	setAmount()
    *	@pre String amount
    *	@post sets amount
    */
    public void setAmount(String amount) 
    {
        this.amount = amount;
    }
    
    /**	getType()
    *	@post returns type
    */
    public String getType() 
    {
        return type;
    }
    
    /**	setType()
    *	@pre String type
    *	@post sets type
    */
    public void setType(String type) 
    {
        this.type = type;
    }
    
    /**	getNotes()
    *	@post returns notes
    */
    public String getNotes() 
    {
        return notes;
    }
    
    /**	setNotes()
    *	@pre String notes
    *	@post sets notes
    */
    public void setNotes(String notes) 
    {
        this.notes = notes;
    }
    
    /**	getUser_actioned()
    *	@post returns user_actioned
    */
    public String getUser_actioned() 
    {
        return user_actioned;
    }
    
    /**	setUser_actioned()
    *	@pre String user_actioned
    *	@post sets user_actioned
    */
    public void setUser_actioned(String user_actioned) 
    {
        this.user_actioned = user_actioned;
    }
    
    /**	getDate()
    *	@post returns date
    */
    public String getDate() 
    {
        return date;
    }
    
    /**	setDate()
    *	@pre String date
    *	@post sets date
    */
    public void setDate(String date) 
    {
        this.date = date;
    }
    
    /**	getAccountNum()
    *	@post returns accountNum
    */
    public String getAccountNum() 
    {
        return accountNum;
    }
    
    /**	setAccountNum()
    *	@pre String accountNum
    *	@post sets accountNum
    */
    public void setAccountNum(String accountNum) 
    {
        this.accountNum = accountNum;
    }
    
    /**	getLocation()
    *	@post returns location
    */
    public String getLocation() 
    {
        return location;
    }
    
    /**	setLocation()
    *	@pre String location
    *	@post sets location
    */
    public void setLocation(String location) 
    {
        this.location = location;
    }
    
    /**	toString()
    *	@post returns a formatted String with all Transaction info
    */
    @Override
    public String toString()
    {
        String _amount = amount;
        DecimalFormat moneyFormat = new DecimalFormat("$0.00");
        _amount = moneyFormat.format(Double.valueOf(_amount));
        _amount = String.format("%1$-" + 14 + "s", _amount);
        String _type = type;
        _type = String.format("%1$-" + 10 + "s", _type);
        String _date = date;
        _date = String.format("%1$-" + 10 + "s", _date);
        String _user_actioned = user_actioned;
        _user_actioned = String.format("%1$-" + 10 + "s", _user_actioned);
        String _location = location;
        _location = String.format("%1$-" + 10 + "s", _location);
        return id + "        " + _amount + "" + _type + "     " + _date + "     " 
                + _user_actioned + "     " + _location + "     " + notes;   
    }   
}
