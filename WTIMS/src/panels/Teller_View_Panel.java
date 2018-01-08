/*
 * Created by Ricky Barnwell
 * Csc 4350 GSU Summer 2017
 * Software Engineering
 * Teller_View_Panel.java
 */
package panels;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/** The Teller_View_Panel displays the view and controls for a Teller User
*   extends the javax.swing.JPanel Object
*/

public class Teller_View_Panel extends javax.swing.JPanel 
{
    /** The current Customer_Account being modified/displayed
    */
    User user;
    
    /** The Current User that is logged in assigned when the Branch_Manager_View_Panel is 
    *   created.
    */
    Customer_Account c;

    /**	Constructor that initializes the user variable and creates the current view
    *  	@pre User object passed as argument
    *	@post initComponents() called to build and initialize the view
    */
    public Teller_View_Panel(User u) 
    {
        user = u;
        initComponents();
        usernameLabel.setText(user.getName());
        idLabel.setText(user.getEmployeeID());
        typeLabel.setText(user.getType());
    }

    /**	initializes the view when called
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        customerTransactionList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cashDepositButton = new javax.swing.JButton();
        checkDepositButton = new javax.swing.JButton();
        withdrawButton = new javax.swing.JButton();
        addressLabel = new javax.swing.JLabel();
        customerNameLabel = new javax.swing.JLabel();
        accountNumberLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        currentBalanceLabel = new javax.swing.JLabel();
        availableBalanceLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setName(""); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1200, 800));

        jLabel1.setText("User: ");

        jLabel2.setText("Employee ID:");

        jLabel3.setText("Type:");

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jSplitPane1.setDividerLocation(400);

        jPanel2.setOpaque(false);

        jLabel5.setText("Customer Transaction History:");

        customerTransactionList.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        customerTransactionList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Transaction ID:    Amount:       Type:          Date:          By Whom:       Location:      Notes:" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        customerTransactionList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        customerTransactionList.setToolTipText(null);
        jScrollPane3.setViewportView(customerTransactionList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 974, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel2);

        jSplitPane1.setRightComponent(jScrollPane1);

        jLabel4.setText("Customer Information:");

        jLabel6.setText("Customer Name:");

        jLabel7.setText("Account Number:");

        jLabel8.setText("Address:");

        jLabel9.setText("Phone:");

        jLabel10.setText("Email:");

        jLabel11.setText("Current Balance:");

        jLabel12.setText("Available Balance:");

        cashDepositButton.setText("Cash Deposit");
        cashDepositButton.setEnabled(false);
        cashDepositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashDepositButtonActionPerformed(evt);
            }
        });

        checkDepositButton.setText("Check Deposit");
        checkDepositButton.setEnabled(false);
        checkDepositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDepositButtonActionPerformed(evt);
            }
        });

        withdrawButton.setText("Withdraw");
        withdrawButton.setEnabled(false);
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });

        addressLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accountNumberLabel)
                            .addComponent(phoneLabel)
                            .addComponent(emailLabel)
                            .addComponent(currentBalanceLabel)
                            .addComponent(availableBalanceLabel)
                            .addComponent(customerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cashDepositButton)
                        .addGap(18, 18, 18)
                        .addComponent(checkDepositButton)
                        .addGap(18, 18, 18)
                        .addComponent(withdrawButton)))
                .addContainerGap(363, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(customerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(accountNumberLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(phoneLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(currentBalanceLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(availableBalanceLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashDepositButton)
                    .addComponent(checkDepositButton)
                    .addComponent(withdrawButton))
                .addContainerGap(301, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        jSplitPane1.setLeftComponent(jScrollPane2);

        usernameLabel.setText("jLabel13");

        idLabel.setText("jLabel14");

        typeLabel.setText("jLabel15");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernameLabel)
                                    .addComponent(typeLabel))
                                .addGap(0, 1062, Short.MAX_VALUE)))))
                .addGap(7, 7, 7))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usernameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(idLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(typeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    /**	Action performed when the searchButton is clicked
    *	@pre searchButton is pressed
    *	@post View is updated or error popup
    */
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String input = searchField.getText();
        if(input.length() != 0)
        {
            Database_Driver dd = new Database_Driver();
            try 
            {
                c = dd.getCustomerInfo(input);
                if(c.getName() != null)
                {
                    customerNameLabel.setText(c.getName());
                    accountNumberLabel.setText(c.getAccountNum());
                    addressLabel.setText(c.getAddress());
                    phoneLabel.setText(c.getPhone());
                    emailLabel.setText(c.getEmail());
                    c.setTransactions(dd.getCustomerHistory(c.getAccountNum()));
                    DecimalFormat moneyFormat = new DecimalFormat("$0.00");
                    currentBalanceLabel.setText(String.valueOf(moneyFormat.format(c.getCbal())));
                    availableBalanceLabel.setText(String.valueOf(moneyFormat.format(c.getAbal())));
                    DefaultListModel dl = new DefaultListModel();
                    customerTransactionList.setModel(dl);
                    dl.clear();
                    dl.addElement("Transaction ID:    Amount:       Type:          Date:          By Whom:       Location:      Notes:");
                    c.getTransactions().forEach((transaction) -> 
                    {
                        dl.addElement(transaction);
                    });
                    cashDepositButton.setEnabled(true);
                    checkDepositButton.setEnabled(true);
                    withdrawButton.setEnabled(true);
                }
                else
                {
                    PopupManager pm = new PopupManager("no_results_search");
                    pm.displayErrorPopup();
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(Teller_View_Panel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            PopupManager pm = new PopupManager("no_results_search");
            pm.displayErrorPopup();
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    /**	Action performed when the cashDepositButton is clicked
    *	@pre cashDepositButton is pressed
    *	@post View is updated or error popup
    */
    private void cashDepositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashDepositButtonActionPerformed
        // TODO add your handling code here:
        PopupManager pm = new PopupManager(" ");
        pm.displayCashDepositPopup(user, c);
        String input = searchField.getText();
        if(input.length() != 0)
        {
            Database_Driver dd = new Database_Driver();
            try 
            {
                c = dd.getCustomerInfo(input);
                if(c.getName() != null)
                {
                    customerNameLabel.setText(c.getName());
                    accountNumberLabel.setText(c.getAccountNum());
                    addressLabel.setText(c.getAddress());
                    phoneLabel.setText(c.getPhone());
                    emailLabel.setText(c.getEmail());
                    c.setTransactions(dd.getCustomerHistory(c.getAccountNum()));
                    DecimalFormat moneyFormat = new DecimalFormat("$0.00");
                    currentBalanceLabel.setText(String.valueOf(moneyFormat.format(c.getCbal())));
                    availableBalanceLabel.setText(String.valueOf(moneyFormat.format(c.getAbal())));
                    DefaultListModel dl = new DefaultListModel();
                    customerTransactionList.setModel(dl);
                    dl.clear();
                    dl.addElement("Transaction ID:    Amount:       Type:          Date:          By Whom:       Location:      Notes:");
                    c.getTransactions().forEach((transaction) -> 
                    {
                        dl.addElement(transaction);
                        customerTransactionList.setModel(dl);
                    });
                    cashDepositButton.setEnabled(true);
                    checkDepositButton.setEnabled(true);
                    withdrawButton.setEnabled(true);
                }
                else
                {
                    pm = new PopupManager("no_results_search");
                    pm.displayErrorPopup();
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(Teller_View_Panel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            pm = new PopupManager("no_results_search");
            pm.displayErrorPopup();
        }
    }//GEN-LAST:event_cashDepositButtonActionPerformed

    /**	Action performed when the checkDepositButton is clicked
    *	@pre checkDepositButton is pressed
    *	@post View is updated or error popup
    */
    private void checkDepositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDepositButtonActionPerformed
        // TODO add your handling code here:
        PopupManager pm = new PopupManager(" ");
        pm.displayCheckDepositPopup(user, c);
        String input = searchField.getText();
        if(input.length() != 0)
        {
            Database_Driver dd = new Database_Driver();
            try 
            {
                c = dd.getCustomerInfo(input);
                if(c.getName() != null)
                {
                    customerNameLabel.setText(c.getName());
                    accountNumberLabel.setText(c.getAccountNum());
                    addressLabel.setText(c.getAddress());
                    phoneLabel.setText(c.getPhone());
                    emailLabel.setText(c.getEmail());
                    c.setTransactions(dd.getCustomerHistory(c.getAccountNum()));
                    DecimalFormat moneyFormat = new DecimalFormat("$0.00");
                    currentBalanceLabel.setText(String.valueOf(moneyFormat.format(c.getCbal())));
                    availableBalanceLabel.setText(String.valueOf(moneyFormat.format(c.getAbal())));
                    DefaultListModel dl = new DefaultListModel();
                    customerTransactionList.setModel(dl);
                    dl.clear();
                    dl.addElement("Transaction ID:    Amount:       Type:          Date:          By Whom:       Location:      Notes:");
                    c.getTransactions().forEach((transaction) -> 
                    {
                        dl.addElement(transaction);
                        customerTransactionList.setModel(dl);
                    });
                    cashDepositButton.setEnabled(true);
                    checkDepositButton.setEnabled(true);
                    withdrawButton.setEnabled(true);
                }
                else
                {
                    pm = new PopupManager("no_results_search");
                    pm.displayErrorPopup();
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(Teller_View_Panel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            pm = new PopupManager("no_results_search");
            pm.displayErrorPopup();
        }
    }//GEN-LAST:event_checkDepositButtonActionPerformed

    /**	Action performed when the withdrawButtonAction is clicked
    *	@pre withdrawButtonAction is pressed
    *	@post View is updated or error popup
    */
    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed
        // TODO add your handling code here:
        PopupManager pm = new PopupManager(" ");
        pm.displayWithdrawalPopup(user, c);
        String input = searchField.getText();
        if(input.length() != 0)
        {
            Database_Driver dd = new Database_Driver();
            try 
            {
                c = dd.getCustomerInfo(input);
                if(c.getName() != null)
                {
                    customerNameLabel.setText(c.getName());
                    accountNumberLabel.setText(c.getAccountNum());
                    addressLabel.setText(c.getAddress());
                    phoneLabel.setText(c.getPhone());
                    emailLabel.setText(c.getEmail());
                    c.setTransactions(dd.getCustomerHistory(c.getAccountNum()));
                    DecimalFormat moneyFormat = new DecimalFormat("$0.00");
                    currentBalanceLabel.setText(String.valueOf(moneyFormat.format(c.getCbal())));
                    availableBalanceLabel.setText(String.valueOf(moneyFormat.format(c.getAbal())));
                    DefaultListModel dl = new DefaultListModel();
                    customerTransactionList.setModel(dl);
                    dl.clear();
                    dl.addElement("Transaction ID:    Amount:       Type:          Date:          By Whom:       Location:      Notes:");
                    c.getTransactions().forEach((transaction) -> 
                    {
                        dl.addElement(transaction);
                        customerTransactionList.setModel(dl);
                    });
                    cashDepositButton.setEnabled(true);
                    checkDepositButton.setEnabled(true);
                    withdrawButton.setEnabled(true);
                }
                else
                {
                    pm = new PopupManager("no_results_search");
                    pm.displayErrorPopup();
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(Teller_View_Panel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            pm = new PopupManager("no_results_search");
            pm.displayErrorPopup();
        }
    }//GEN-LAST:event_withdrawButtonActionPerformed

    /**	Action performed when the enter key is pressed while the searchField is focused
    *	@pre searchField is focused
    *	@pre Enter key is pressed
    *	@post View is updated or error popup
    */
    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
        String input = searchField.getText();
        if(input.length() != 0)
        {
            Database_Driver dd = new Database_Driver();
            try 
            {
                c = dd.getCustomerInfo(input);
                if(c.getName() != null)
                {
                    customerNameLabel.setText(c.getName());
                    accountNumberLabel.setText(c.getAccountNum());
                    addressLabel.setText(c.getAddress());
                    phoneLabel.setText(c.getPhone());
                    emailLabel.setText(c.getEmail());
                    c.setTransactions(dd.getCustomerHistory(c.getAccountNum()));
                    DecimalFormat moneyFormat = new DecimalFormat("$0.00");
                    currentBalanceLabel.setText(String.valueOf(moneyFormat.format(c.getCbal())));
                    availableBalanceLabel.setText(String.valueOf(moneyFormat.format(c.getAbal())));
                    DefaultListModel dl = new DefaultListModel();
                    customerTransactionList.setModel(dl);
                    dl.clear();
                    dl.addElement("Transaction ID:    Amount:       Type:          Date:          By Whom:       Location:      Notes:");
                    c.getTransactions().forEach((transaction) -> 
                    {
                        dl.addElement(transaction);
                        customerTransactionList.setModel(dl);
                    });
                    cashDepositButton.setEnabled(true);
                    checkDepositButton.setEnabled(true);
                    withdrawButton.setEnabled(true);
                }
                else
                {
                    PopupManager pm = new PopupManager("no_results_search");
                    pm.displayErrorPopup();
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(Teller_View_Panel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            PopupManager pm = new PopupManager("no_results_search");
            pm.displayErrorPopup();
        }
    }//GEN-LAST:event_searchFieldActionPerformed
    /**All of the swing component objects used in this class.
    */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountNumberLabel;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel availableBalanceLabel;
    private javax.swing.JButton cashDepositButton;
    private javax.swing.JButton checkDepositButton;
    private javax.swing.JLabel currentBalanceLabel;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JList<String> customerTransactionList;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JButton withdrawButton;
    // End of variables declaration//GEN-END:variables
}
