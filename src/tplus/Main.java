package tplus;

import extension.HintTextFieldUI;
import java.awt.Color;
import java.awt.Cursor;


public class Main extends javax.swing.JFrame {


    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNickname = new javax.swing.JTextField();
        txtErrorNickname = new javax.swing.JLabel();
        txtIP = new javax.swing.JTextField();
        txtErrorIP = new javax.swing.JLabel();
        txtPort = new javax.swing.JTextField();
        txtErrorPort = new javax.swing.JLabel();
        btnLogin = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        imgLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(401, 592));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Chatting - TPlus");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, -1, 25));

        txtNickname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNickname.setUI(new HintTextFieldUI("Nickname"));
        txtNickname.setBorder(null);
        txtNickname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNicknameKeyPressed(evt);
            }
        });
        getContentPane().add(txtNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 222, 260, 30));

        txtErrorNickname.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtErrorNickname.setForeground(java.awt.Color.red);
        getContentPane().add(txtErrorNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        txtIP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtIP.setUI(new HintTextFieldUI("IP Address"));
        txtIP.setToolTipText("");
        txtIP.setBorder(null);
        txtIP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIPKeyPressed(evt);
            }
        });
        getContentPane().add(txtIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 310, 260, 30));

        txtErrorIP.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtErrorIP.setForeground(java.awt.Color.red);
        getContentPane().add(txtErrorIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        txtPort.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPort.setUI(new HintTextFieldUI("Port"));
        txtPort.setToolTipText("");
        txtPort.setBorder(null);
        txtPort.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPortKeyPressed(evt);
            }
        });
        getContentPane().add(txtPort, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 400, 260, 30));

        txtErrorPort.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtErrorPort.setForeground(java.awt.Color.red);
        getContentPane().add(txtErrorPort, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btnLogin.png"))); // NOI18N
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, -1, -1));

        btnExit.setBackground(new Color(0,0,0,0)
        );
        btnExit.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(102, 102, 102));
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("x");
        btnExit.setOpaque(true);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 1, 30, 24));

        imgLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login.png"))); // NOI18N
        imgLogin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                imgLoginMouseDragged(evt);
            }
        });
        imgLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imgLoginMousePressed(evt);
            }
        });
        getContentPane().add(imgLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, -1, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imgLoginMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgLoginMouseDragged
        int x = evt.getXOnScreen() - this.x;
        int y = evt.getYOnScreen() - this.y;
        this.setLocation(x, y);
    }//GEN-LAST:event_imgLoginMouseDragged

    private void imgLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgLoginMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_imgLoginMousePressed

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setForeground(Color.WHITE);
        btnExit.setBackground(Color.RED);
        btnExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setForeground(new Color(102,102,102));
        btnExit.setBackground(new Color(249,249,249));
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        btnLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        checkValid();
    }//GEN-LAST:event_btnLoginMouseClicked

    private void txtNicknameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNicknameKeyPressed
        txtErrorNickname.setText("");
        if (evt.getKeyCode() == 10) checkValid();
    }//GEN-LAST:event_txtNicknameKeyPressed

    private void txtIPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIPKeyPressed
        txtErrorIP.setText("");
        if (evt.getKeyCode() == 10) checkValid();
    }//GEN-LAST:event_txtIPKeyPressed

    private void txtPortKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPortKeyPressed
        txtErrorPort.setText("");
        if (evt.getKeyCode() == 10) checkValid();
    }//GEN-LAST:event_txtPortKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JLabel imgLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txtErrorIP;
    private javax.swing.JLabel txtErrorNickname;
    private javax.swing.JLabel txtErrorPort;
    private javax.swing.JTextField txtIP;
    private javax.swing.JTextField txtNickname;
    private javax.swing.JTextField txtPort;
    // End of variables declaration//GEN-END:variables

    int x,y;
    
    /**
     * Nick name must not be blank
     * @return 
     */
    private boolean checkNickname() {
        return !txtNickname.getText().trim().equals("");
    }
    
    /**
     * Check IP valid or not
     * It's can be 'localhost'
     * @return 
     */
    private boolean checkIP() {
        if (txtIP.getText().equals("localhost")) return true;
        String IPV4_PATTERN = "^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$";
        return txtIP.getText().matches(IPV4_PATTERN);
    }
    
    /**
     * Check Port
     * It's number
     * @return 
     */
    private boolean checkPort() {
        try {
            int port = Integer.parseInt(txtPort.getText());
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
    
    /**
     * Check the information before login
     * If something goes wrong, show an error message
     */
    private void checkValid() {
        boolean checkNickname = checkNickname();
        boolean checkIP = checkIP();
        boolean checkPort = checkPort();
        
        if (!checkNickname) txtErrorNickname.setText("Nickname must not be blank!!! e.g: TPlus");
        if (!checkIP) txtErrorIP.setText("IP address invalid!!! e.g: 127.1.2.3");
        if (!checkPort) txtErrorPort.setText("Port invalid!!! e.g: 8888");
        
        if (checkNickname && checkIP && checkPort) login();
    }

    /**
     * Change show chatting frame if login success
     */
    private void login() {
        new Client(txtNickname.getText(),
                   txtIP.getText(),
                   txtPort.getText()).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }
}
