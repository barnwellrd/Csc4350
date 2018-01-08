/*
 * Created by Ricky Barnwell
 * Csc 4350 GSU Summer 2017
 * Software Engineering
 * PopupManager.java
 */
package panels;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Popup;

/** The PopupManager class handles all of the popups for WTIMS
*/
class PopupManager extends Popup
{
    /** String to store the error type
    */
    private String type;

    /** Constructor
    *	@pre String t
    *	@post assigns type
    */
    public PopupManager(String t) 
    {
        type = t;
    }
    
    /**	displayErrorPopup() displays the appropriate error message
    *	@pre type initialized
    *	@post displays an erro message based on type's value
    */
    public void displayErrorPopup()
    {
        switch(type)
        {
            case "login_error":
                JOptionPane.showMessageDialog(null, "Credentials provided not found.", "Login Error", JOptionPane.ERROR_MESSAGE);
                break;
            case "database_error":
                JOptionPane.showMessageDialog(null, "Could not connect to database.", "Database Error", JOptionPane.ERROR_MESSAGE);
                break;
                case "no_results_search":
                JOptionPane.showMessageDialog(null, "No results found.", "Search Error", JOptionPane.ERROR_MESSAGE);
                break;
            default:
                //JOptionPane.showMessageDialog(null, ("No Popup for type: " + type), ("No Popup for type: " + type), JOptionPane.ERROR_MESSAGE);
                break;
        }
        
    }
    
    /**	displayCashDepositPopup() displays the cash deposit popup
    *	@pre User u, Customer_Account c
    *	@post displays popup and returns values to a Database_Driver
    */
    public void displayCashDepositPopup(User u, Customer_Account c)
    {
        JTextField inputField = new JTextField(10);
        int selection = JOptionPane.showConfirmDialog(null, inputField, "Cash Deposit Amount ", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (selection == JOptionPane.OK_OPTION)
        {
            try
            {
                double input = Double.valueOf(inputField.getText());
                Database_Driver dd = new Database_Driver();
                dd.updateDeposit(c, u, input, "none");
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Invalid Deposit Amount!", "Deposit Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    /**	displayCCheckDepositPopup() displays the check deposit popup
    *	@pre User u, Customer_Account c
    *	@post displays popup and returns values to a Database_Driver
    */
    public void displayCheckDepositPopup(User u, Customer_Account c)
    {
        JPanel Jpanel1 = new JPanel();
        JTextField checkAccountNumberField;
        JTextField checkAmountField;
        JTextField checkRoutingNumberField;
        JLabel jLabel1;
        JLabel jLabel2;
        JLabel jLabel3;
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        checkAccountNumberField = new javax.swing.JTextField();
        checkRoutingNumberField = new javax.swing.JTextField();
        checkAmountField = new javax.swing.JTextField();
        jLabel1.setText("Check Account Number:");
        jLabel2.setText("Check Routing Number:");
        jLabel3.setText("Amount:");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(Jpanel1);
        Jpanel1.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(checkRoutingNumberField)
                    .addComponent(checkAccountNumberField)
                    .addComponent(checkAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(checkAccountNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(checkRoutingNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(checkAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        int selection = JOptionPane.showConfirmDialog(null, Jpanel1, "Check Deposit Information ", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (selection == JOptionPane.OK_OPTION)
        {
            try
            {
                double input = Double.valueOf(checkAmountField.getText());
                Database_Driver dd = new Database_Driver();
                dd.updateDeposit(c, u, input, "none");
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Invalid Deposit Amount!", "Deposit Error", JOptionPane.ERROR_MESSAGE);
            }    
        }  
    }
    
    /**	displayWithdrawalPopup() displays the withdrawal popup
    *	@pre User u, Customer_Account c
    *	@post displays popup and returns values to a Database_Driver
    */
    public void displayWithdrawalPopup(User u, Customer_Account c)
    {
        JTextField inputField = new JTextField(10);
        int selection = JOptionPane.showConfirmDialog(null, inputField, "Withdrawal Amount ", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (selection == JOptionPane.OK_OPTION)
        {
            try
            {
                double input = Double.valueOf(inputField.getText());
                Database_Driver dd = new Database_Driver();
                dd.updateWithdrawl(c, u, input, "none");
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Invalid Withdrawal Amount!", "Withdrawal Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    /**	displayDrawerDepositPopup() displays the drawer deposit popup
    *	@pre User u, User c
    *	@post displays popup and returns values to a Database_Driver
    */
    public void displayDrawerDepositPopup(User u, User c)
    {
        JTextField inputField = new JTextField(10);
        int selection = JOptionPane.showConfirmDialog(null, inputField, "Drawer Deposit Amount ", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (selection == JOptionPane.OK_OPTION)
        {
            try
            {
                double input = Double.valueOf(inputField.getText());
                Database_Driver dd = new Database_Driver();
                dd.updateDrawerDeposit(u, c, input, "none");
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Invalid Deposit Amount!", "Deposit Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } 
    
    /**	displayCustomerEditPopup() displays the edit customer popup
    *	@pre Customer_Account c
    *	@post displays popup and returns values to a Database_Driver
    */
    public void displayCustomerEditPopup(Customer_Account c)
    {
        JPanel editCustomerPanel = new JPanel();
        JTextArea addressArea;
        JTextField emailField;
        JTextField firstNameField;
        JLabel jLabel1;
        JLabel jLabel2;
        JLabel jLabel3;
        JLabel jLabel4;
        JLabel jLabel5;
        JLabel jLabel6;
        JScrollPane jScrollPane1;
        JTextField lastNameField;
        JTextField phoneField;
        JTextField ssnField;
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        ssnField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressArea = new javax.swing.JTextArea();
        phoneField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        String a = c.getAddress().replace("<html><body>", "");
        a = a.replace("</body></html>", "");
        a = a.replace("<br/>", "\n");
        addressArea.setText(a);
        String[] name = c.getName().split(" ");
        firstNameField.setText(name[0]);
        lastNameField.setText(name[1]);
        ssnField.setText(c.getSocialNum());
        phoneField.setText(c.getPhone());
        emailField.setText(c.getEmail());
        jLabel1.setText("First Name:");
        jLabel2.setText("Last Name:");
        jLabel3.setText("Social Security Number:");
        jLabel4.setText("Address:");
        jLabel5.setText("Email:");
        jLabel6.setText("Phone Number:");
        addressArea.setColumns(20);
        addressArea.setRows(5);
        jScrollPane1.setViewportView(addressArea);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(editCustomerPanel);
        editCustomerPanel.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(emailField)
                    .addComponent(phoneField)
                    .addComponent(ssnField)
                    .addComponent(lastNameField)
                    .addComponent(firstNameField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ssnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        boolean isValidInput = false;
        int selection = 1;
        while(!isValidInput && selection != JOptionPane.CANCEL_OPTION && selection != JOptionPane.CLOSED_OPTION)
        {
            selection = JOptionPane.showConfirmDialog(null, editCustomerPanel, "Edit Customer Information ", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if(!addressArea.getText().isEmpty() && !emailField.getText().isEmpty() && !firstNameField.getText().isEmpty() 
                    && !lastNameField.getText().isEmpty() && !phoneField.getText().isEmpty() && !ssnField.getText().isEmpty()) 
            {
                isValidInput = true;
            }
            else
            {
                if(selection != JOptionPane.CANCEL_OPTION && selection != JOptionPane.CLOSED_OPTION)
                {
                    JOptionPane.showMessageDialog(null, "Invalid Customer Information! Please fill out all fields.", "Submit Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if (selection == JOptionPane.OK_OPTION)
        {
            try
            {
                String address = "<html><body>";
                String[] addressInput = addressArea.getText().split("\n");
                for (String addressInput1 : addressInput) 
                {
                    address += addressInput1 + "<br/>";
                }
                address += "</body></html>";
                c.setAddress(address);
                c.setEmail(emailField.getText());
                c.setName(firstNameField.getText() + " " + lastNameField.getText());
                c.setPhone(phoneField.getText());
                c.setSocialNum(ssnField.getText());
                Database_Driver dd = new Database_Driver();
                dd.updateCustomerInfo(c);
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Invalid Deposit Amount!", "Deposit Error", JOptionPane.ERROR_MESSAGE);
            }    
        }  
    } 
    
    /**	displayNewCustomerPopup() displays the new customer popup
    *	@post displays popup and returns values to a Database_Driver
    */
    public void displayNewCustomerPopup()
    {
        JPanel editCustomerPanel = new JPanel();
        JTextArea addressArea;
        JTextField emailField;
        JTextField firstNameField;
        JLabel jLabel1;
        JLabel jLabel2;
        JLabel jLabel3;
        JLabel jLabel4;
        JLabel jLabel5;
        JLabel jLabel6;
        JScrollPane jScrollPane1;
        JTextField lastNameField;
        JTextField phoneField;
        JTextField ssnField;
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        ssnField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressArea = new javax.swing.JTextArea();
        phoneField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        jLabel1.setText("First Name:");
        jLabel2.setText("Last Name:");
        jLabel3.setText("Social Security Number:");
        jLabel4.setText("Address:");
        jLabel5.setText("Email:");
        jLabel6.setText("Phone Number:");
        addressArea.setColumns(20);
        addressArea.setRows(5);
        jScrollPane1.setViewportView(addressArea);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(editCustomerPanel);
        editCustomerPanel.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(emailField)
                    .addComponent(phoneField)
                    .addComponent(ssnField)
                    .addComponent(lastNameField)
                    .addComponent(firstNameField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ssnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        boolean isValidInput = false;
        int selection = 1;
        while(!isValidInput && selection != JOptionPane.CANCEL_OPTION && selection != JOptionPane.CLOSED_OPTION)
        {
            selection = JOptionPane.showConfirmDialog(null, editCustomerPanel, "Edit Customer Information ", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if(!addressArea.getText().isEmpty() && !emailField.getText().isEmpty() && !firstNameField.getText().isEmpty() 
                    && !lastNameField.getText().isEmpty() && !phoneField.getText().isEmpty() && !ssnField.getText().isEmpty()) 
            {
                isValidInput = true;
            }
            else
            {
                if(selection != JOptionPane.CANCEL_OPTION && selection != JOptionPane.CLOSED_OPTION)
                {
                    JOptionPane.showMessageDialog(null, "Invalid Customer Information! Please fill out all fields.", "Submit Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if (selection == JOptionPane.OK_OPTION)
        {
            try
            {
                Customer_Account c = new Customer_Account();
                String address = "<html><body>";
                String[] addressInput = addressArea.getText().split("\n");
                for (String addressInput1 : addressInput) {
                    address += addressInput1 + "<br/>";
                }
                address += "</body></html>";
                c.setAddress(address);
                c.setEmail(emailField.getText());
                c.setName(firstNameField.getText() + " " + lastNameField.getText());
                c.setPhone(phoneField.getText());
                c.setSocialNum(ssnField.getText());
                Database_Driver dd = new Database_Driver();
                dd.insertNewCustomer(c);
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Invalid Deposit Amount!", "Deposit Error", JOptionPane.ERROR_MESSAGE);
            }    
        }  
    } 
}
