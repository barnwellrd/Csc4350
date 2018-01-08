/*
 * Created by Ricky Barnwell
 * Csc 4350 GSU Summer 2017
 * Software Engineering
 * General_Manager_View_Panel.java
 */
package panels;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**	The General_Manager_View_Panel displays the view and controls for a General Manager User
* 	extends the javax.swing.JPanel Object
*/
public class General_Manager_View_Panel extends javax.swing.JPanel 
{
    /**	The current Customer_Account being modified/displayed
    */
    Customer_Account c;
    
    /**	The Current User that is logged in assigned when the Branch_Manager_View_Panel is 
    *	created.
    */
    private User user;
    
    /**The current User object being modified/displayed
    */
    private User curUser;
    
    /**A list of User objects to display on the View
    */
    List<User> userList;

    /**	Constructor that initializes the user variable and creates the current view
    *  	@pre User object passed as argument
    *	@post initComponents() called to build and initialize the view
    */
    public General_Manager_View_Panel(User u) 
    {
        user = u;
        
        initComponents();
        usernameLabel.setText(user.getName());
        idLabel.setText(user.getEmployeeID());
        typeLabel.setText(user.getType());
        usernameLabel1.setText(user.getName());
        idLabel1.setText(user.getEmployeeID());
        typeLabel1.setText(user.getType());
        Database_Driver dd = new Database_Driver();
        userList = dd.getAllUserInfo();
        DefaultListModel dl = new DefaultListModel();
        tellerDisplayList.setModel(dl);
        dl.addElement("User:            ID:       Location:   Drawer Balance:");
        userList.forEach((tellerList1) -> 
        {
            dl.addElement(tellerList1);
        });  
    }

    /**	initializes the view when called
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        customerTransactionList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
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
        editCustomerButton = new javax.swing.JButton();
        usernameLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        newCustomerButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tellerTransactionList = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jSplitPane3 = new javax.swing.JSplitPane();
        jPanel10 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tellerDisplayList = new javax.swing.JList<>();
        jPanel11 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        drawerDepositButton = new javax.swing.JButton();
        locationLabel = new javax.swing.JLabel();
        tellerNameLabel = new javax.swing.JLabel();
        employeeIDLabel = new javax.swing.JLabel();
        drawerBalanceLabel = new javax.swing.JLabel();
        usernameLabel1 = new javax.swing.JLabel();
        idLabel1 = new javax.swing.JLabel();
        typeLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(1200, 800));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1200, 800));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1200, 800));

        jPanel4.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jPanel4.setMaximumSize(new java.awt.Dimension(1200, 800));
        jPanel4.setMinimumSize(new java.awt.Dimension(1200, 800));
        jPanel4.setName(""); // NOI18N
        jPanel4.setOpaque(false);

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

        jPanel5.setOpaque(false);

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 974, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel5);

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

        editCustomerButton.setText("Edit Information");
        editCustomerButton.setEnabled(false);
        editCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCustomerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accountNumberLabel)
                            .addComponent(phoneLabel)
                            .addComponent(emailLabel)
                            .addComponent(currentBalanceLabel)
                            .addComponent(availableBalanceLabel)
                            .addComponent(customerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel4))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cashDepositButton)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkDepositButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(withdrawButton)))
                .addContainerGap(363, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(customerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(accountNumberLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(phoneLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(currentBalanceLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(availableBalanceLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashDepositButton)
                    .addComponent(checkDepositButton)
                    .addComponent(withdrawButton))
                .addGap(18, 18, 18)
                .addComponent(editCustomerButton)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel6);

        jSplitPane1.setLeftComponent(jScrollPane2);

        usernameLabel.setText("jLabel13");

        idLabel.setText("jLabel14");

        typeLabel.setText("jLabel15");

        newCustomerButton.setText("New Customer");
        newCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCustomerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel)
                            .addComponent(typeLabel)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(idLabel)
                                .addGap(214, 214, 214)
                                .addComponent(newCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(281, 281, 281)
                                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchButton)))
                        .addGap(0, 171, Short.MAX_VALUE)))
                .addGap(7, 7, 7))
            .addComponent(jSeparator1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usernameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(idLabel)
                    .addComponent(newCustomerButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(typeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Customer Management", jPanel1);

        jPanel7.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jPanel7.setMaximumSize(new java.awt.Dimension(1200, 800));
        jPanel7.setMinimumSize(new java.awt.Dimension(1200, 800));
        jPanel7.setName(""); // NOI18N
        jPanel7.setOpaque(false);

        jLabel13.setText("User: ");

        jLabel14.setText("Employee ID:");

        jLabel15.setText("Type:");

        jSplitPane2.setDividerLocation(450);

        jPanel8.setOpaque(false);

        jLabel16.setText("User Transaction History:");

        tellerTransactionList.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        tellerTransactionList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Transaction ID:    Amount:       Type:          Date:          By Whom:       Location:      Notes:" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        tellerTransactionList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tellerTransactionList.setToolTipText(null);
        jScrollPane5.setViewportView(tellerTransactionList);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 974, Short.MAX_VALUE))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane4.setViewportView(jPanel8);

        jSplitPane2.setRightComponent(jScrollPane4);

        jSplitPane3.setDividerLocation(250);
        jSplitPane3.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jLabel25.setText("Users:");

        tellerDisplayList.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        tellerDisplayList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Name:            ID:       Location:   Drawer Balance:" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        tellerDisplayList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tellerDisplayList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tellerDisplayListMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tellerDisplayList);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(274, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane3.setTopComponent(jPanel10);

        jPanel11.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabel26.setText("User Information:");

        jLabel27.setText("Teller Name:");

        jLabel28.setText("Employee ID:");

        jLabel29.setText("Location:");

        jLabel32.setText("Drawer Balance:");

        drawerDepositButton.setText("Drawer Deposit");
        drawerDepositButton.setEnabled(false);
        drawerDepositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawerDepositButtonActionPerformed(evt);
            }
        });

        locationLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel28)
                            .addComponent(jLabel27)
                            .addComponent(jLabel32))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(locationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tellerNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(employeeIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(drawerBalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(drawerDepositButton))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel26)))
                .addContainerGap(337, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(tellerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(employeeIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(locationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(drawerBalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(drawerDepositButton)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        jSplitPane3.setRightComponent(jPanel11);

        jScrollPane6.setViewportView(jSplitPane3);

        jSplitPane2.setLeftComponent(jScrollPane6);

        usernameLabel1.setText("jLabel13");

        idLabel1.setText("jLabel14");

        typeLabel1.setText("jLabel15");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1181, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idLabel1)
                            .addComponent(usernameLabel1)
                            .addComponent(typeLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(7, 7, 7))
            .addComponent(jSeparator2)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(usernameLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(idLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(typeLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("User Management", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1195, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Notifications", jPanel3);

        jLabel17.setText("Bank Policies:");

        jLabel18.setText("Maximum Teller Check Cash Amount:");

        jLabel19.setText("NOT IMPLEMENTED");

        jButton1.setText("Change");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel20.setText("Teller Drawer Notification Minimum Balance:");

        jLabel21.setText("NOT EMPLEMENTED");

        jButton2.setText("Change");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel22.setText("Customer Low Ballance Notification:");

        jLabel23.setText("NOT IMPLEMENTED");

        jButton3.setText("Change");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(357, 357, 357)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(376, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addGap(30, 30, 30)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jButton3))
                .addContainerGap(617, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Bank Policies", jPanel9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("User Management");
    }// </editor-fold>//GEN-END:initComponents

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
                    editCustomerButton.setEnabled(true);
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
                    editCustomerButton.setEnabled(true);
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

   /**	Action performed when the editCustomerButton is clicked
    *	@pre editCustomerButton is pressed
    *	@post View is updated or error popup
    */ 
    private void editCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCustomerButtonActionPerformed
        // TODO add your handling code here:
        PopupManager pm = new PopupManager("");
        pm.displayCustomerEditPopup(c);
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
                    editCustomerButton.setEnabled(true);
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
    }//GEN-LAST:event_editCustomerButtonActionPerformed

    /**	Action performed when the newCustomerButtonAction is clicked
    *	@pre newCustomerButtonAction is pressed
    *	@post View is updated or error popup
    */
    private void newCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCustomerButtonActionPerformed
        // TODO add your handling code here:
        PopupManager pm = new PopupManager("");
        pm.displayNewCustomerPopup();
    }//GEN-LAST:event_newCustomerButtonActionPerformed

    /**	Action performed when the tellerDisplayList is clicked
    *	@pre tellerDisplayList is clicked
    *	@post View is updated or error popup
    */
    private void tellerDisplayListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tellerDisplayListMouseClicked
        // TODO add your handling code here:
        DefaultListModel dl2 = new DefaultListModel();
        tellerTransactionList.setModel(dl2);
        dl2.addElement("Transaction ID:    Amount:       Type:          Date:          By Whom:       Location:      Notes:");
        if(tellerDisplayList.getSelectedIndex() != -1 && tellerDisplayList.getSelectedIndex() != 0)
        {
            int index = tellerDisplayList.getSelectedIndex();
            User selectedUser = userList.get(index-1);
            curUser = selectedUser;
            selectedUser.getTransactions().stream().map((transaction) ->
                {
                    dl2.addElement(transaction);
                    return transaction;
                }).forEachOrdered((_item) ->
                    {
                        tellerTransactionList.setModel(dl2);
                    });
            drawerDepositButton.setEnabled(true);
            tellerNameLabel.setText(selectedUser.getName());
            employeeIDLabel.setText(selectedUser.getEmployeeID());
            locationLabel.setText(selectedUser.getLoc());
            DecimalFormat moneyFormat = new DecimalFormat("$0.00");
            String _balance = moneyFormat.format(selectedUser.getDrawerBalance());
            drawerBalanceLabel.setText(_balance);
        }
        else
        {
            drawerDepositButton.setEnabled(false);
            tellerNameLabel.setText("");
            employeeIDLabel.setText("");
            locationLabel.setText("");
            drawerBalanceLabel.setText("");
        }
    }//GEN-LAST:event_tellerDisplayListMouseClicked

    /**	Action performed when the drawerDepositButton is clicked
    *	@pre drawerDepositButton is pressed
    *	@post View is updated or error popup
    */
    private void drawerDepositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawerDepositButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tellerDisplayList.getSelectedIndex();
        PopupManager pm = new PopupManager("");
        pm.displayDrawerDepositPopup(curUser, user);
        Database_Driver dd = new Database_Driver();
        userList = dd.getAllUserInfo();
        DefaultListModel dl = new DefaultListModel();
        tellerDisplayList.setModel(dl);
        dl.addElement("User:            ID:       Location:   Drawer Balance:");
        userList.forEach((tellerList1) ->
            {
                dl.addElement(tellerList1);
            });
        DefaultListModel dl2 = new DefaultListModel();
        tellerTransactionList.setModel(dl2);
        tellerDisplayList.setSelectedIndex(selectedIndex);
        dl2.addElement("Transaction ID:    Amount:       Type:          Date:          By Whom:       Location:      Notes:");
        if(tellerDisplayList.getSelectedIndex() != -1 && tellerDisplayList.getSelectedIndex() != 0)
        {
            User selectedUser = userList.get(selectedIndex-1);
            curUser = selectedUser;
            selectedUser.getTransactions().stream().map((transaction) ->
                {
                    dl2.addElement(transaction);
                    return transaction;
                }).forEachOrdered((_item) ->
                    {
                        tellerTransactionList.setModel(dl2);
                    });
            drawerDepositButton.setEnabled(true);
            tellerNameLabel.setText(selectedUser.getName());
            employeeIDLabel.setText(selectedUser.getEmployeeID());
            locationLabel.setText(selectedUser.getLoc());
            DecimalFormat moneyFormat = new DecimalFormat("$0.00");
            String _balance = moneyFormat.format(selectedUser.getDrawerBalance());
            drawerBalanceLabel.setText(_balance);
        }
        else
        {
            drawerDepositButton.setEnabled(false);
            tellerNameLabel.setText("");
            employeeIDLabel.setText("");
            locationLabel.setText("");
            drawerBalanceLabel.setText("");
        }
    }//GEN-LAST:event_drawerDepositButtonActionPerformed

    //not implemented
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    //not implemented
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JLabel drawerBalanceLabel;
    private javax.swing.JButton drawerDepositButton;
    private javax.swing.JButton editCustomerButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel employeeIDLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idLabel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JButton newCustomerButton;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JList<String> tellerDisplayList;
    private javax.swing.JLabel tellerNameLabel;
    private javax.swing.JList<String> tellerTransactionList;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JLabel typeLabel1;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel usernameLabel1;
    private javax.swing.JButton withdrawButton;
    // End of variables declaration//GEN-END:variables
}
