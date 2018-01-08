/*
 * Created by Ricky Barnwell
 * Csc 4350 GSU Summer 2017
 * Software Engineering
 * PopupManager.java
 */
package panels;
import javax.swing.JFrame;

/** Login_View is the main class for WTIMS
*	It extends JFrame and houses the main method
*/
public class Login_View extends javax.swing.JFrame 
{
    /**	Variable to store the user that logs in
    */
    private User user; 
    
    /** Constructor
    */
    public Login_View() 
    {
        initComponents();
    }

    /** initComponents() initializes all of the User Interface Components
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Wells-Trust Internal Management Suite");
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 800));

        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 800));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Wells - Trust Internal Management Suite");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(293, 293, 293))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(288, 288, 288))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(292, 292, 292))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(480, 480, 480)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(282, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel1)
                .addGap(152, 152, 152)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addContainerGap(319, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBounds(0, 0, 1216, 839);
    }// </editor-fold>//GEN-END:initComponents

    /**	loginButtonActionPerformed() passes the input fields to the the database to 
    *	validate them
    *	@pre all fields are filled in
    *	@post checkCredentials() is called
    */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //get user input
        String username = usernameField.getText();
        String password = passwordField.getText();
        //validate credentials
        boolean validCredentials = checkCredentials(username, password);
        //if credentials valid, return the User from database
        if(validCredentials)
        {
            //set the current user
            setUser(username);
            //update to the appropriate user view
            updatePanel();
        }
        else
        {
            //Display login error popup
            PopupManager l = callErrorPopup("login_error");
            l.displayErrorPopup();
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    /**	passwordFieldActionPerformed() emulates the login button being pushed if enter is 
    *	pressed while
    *	passwordField is focused
    *	@pre passwordField is focused and the Enter key is pressed
    *	@post checkCredentials() is called
    */
    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        //get user input
        String username = usernameField.getText();
        String password = passwordField.getText();
        //validate credentials
        boolean validCredentials = checkCredentials(username, password);
        //if credentials valid, return the User from database
        if(validCredentials)
        {
            //set the current user
            setUser(username);
            //update to the appropriate user view
            updatePanel();
        }
        else
        {
            //Display login error popup
            PopupManager l = callErrorPopup("login_error");
            l.displayErrorPopup();
        }  
    }//GEN-LAST:event_passwordFieldActionPerformed
    
    /**	checkCredentials() passes input to the database
    *	@pre username, password
    *	@post updatePanel() is called if valid credentials, else callErrorPopup()
    */
    private boolean checkCredentials(String u, String p)
    {
        //connects to the database and returns boolean for success or failed
        Database_Driver dbM = new Database_Driver();
        return dbM.authenticateUser(u, p);     
    }
    
    /**	callErrorPopup() calls an error popup
    *	@pre String s
    *	@post PopupManage object returned to display error message
    */
    private PopupManager callErrorPopup(String s)
    {
        //calls the Popup_Manager to display the appropriate error and returns it
        PopupManager popup = new PopupManager(s);
        return popup;     
    }
    
    /** SetUser sets the user object
    *	@pre valid username
    *	@post sets user
    */
    private void setUser(String username)
    {
        //creates a database driver and gets/sets the user's info
        Database_Driver dbM = new Database_Driver();
        user = dbM.getUserInfo(username);
    }
    
    /** updatePanel() updates the login page to the appropriate User View
    *	@post updates the panel to a new User View
    */
    private void updatePanel()
    {
        //set new frame properties
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jf.setTitle("Wells-Trust Internal Management Suite");
        jf.setMaximumSize(new java.awt.Dimension(1200, 800));
        jf.setMinimumSize(new java.awt.Dimension(1200, 800));
        jf.setPreferredSize(new java.awt.Dimension(1200, 800));
        jf.setSize(new java.awt.Dimension(1200, 800));
        jf.setResizable(false);
        //switch based on the user's type
        switch(user.getType())
        {
            //if teller, create a new window with the teller view panel
            case "Teller":
                this.remove(jPanel1);
                Teller_View_Panel  tv = new Teller_View_Panel(user);
                jf.add(tv);
                this.dispose();
                jf.setVisible(true);
                jf.revalidate();
                jf.repaint();
                jf.pack();
                break;               
            //if branch_manager, create a new window for branch manager view
            case "Branch Manager":
                this.remove(jPanel1);
                Branch_Manager_View_Panel  bmv = new Branch_Manager_View_Panel(user);
                jf.add(bmv);
                jf.setVisible(true);
                this.dispose();
                jf.revalidate();
                jf.repaint();
                jf.pack();
                break;
            //if general_manager, create a new window for general manager view
            case "General Manager":
                this.remove(jPanel1);
                General_Manager_View_Panel  gmv = new General_Manager_View_Panel(user);
                jf.add(gmv);
                jf.setVisible(true);
                this.dispose();
                jf.revalidate();
                jf.repaint();
                jf.pack();
                break;
            //default case, won't be used
            default:
                break;
        }    
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login_View().setVisible(true);
        });
    }

    /**	The following variables are for the User Interface component
    */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
