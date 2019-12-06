package tplus;

import java.awt.Color;
import java.awt.Cursor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollBar;
import javax.swing.text.DefaultCaret;


public class Client extends javax.swing.JFrame {
 
    int x, y;
    String nameClient;
    String msgSend = "";
    
    public Client(String name, String serverHost, String port) {
        initComponents();
        this.setLocationRelativeTo(null);
        txtSend.requestFocus();
        this.nameClient = name;
        lbHelloUsername.setText("Chatting - Welcome " + name);
        ClientSocket clientSocket = new ClientSocket(serverHost, Integer.parseInt(port));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnHeader = new javax.swing.JPanel();
        lbHelloUsername = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        txtSend = new javax.swing.JTextField();
        btnSend = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMsg = new javax.swing.JTextArea();
        imgBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnHeader.setOpaque(false);
        pnHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnHeaderMouseDragged(evt);
            }
        });
        pnHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnHeaderMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnHeaderLayout = new javax.swing.GroupLayout(pnHeader);
        pnHeader.setLayout(pnHeaderLayout);
        pnHeaderLayout.setHorizontalGroup(
            pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        pnHeaderLayout.setVerticalGroup(
            pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(pnHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 30));

        lbHelloUsername.setText("Chatting - Welcome ");
        getContentPane().add(lbHelloUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, -1, 25));

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
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 1, 30, 28));

        txtSend.setBackground(new Color(0,0,0,0)
        );
        txtSend.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtSend.setBorder(null);
        txtSend.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSendKeyReleased(evt);
            }
        });
        getContentPane().add(txtSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 260, 45));

        btnSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sendClick.png"))); // NOI18N
        btnSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSendMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSendMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSendMouseExited(evt);
            }
        });
        getContentPane().add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 520, -1, -1));

        jScrollPane1.setBorder(null);
        JScrollBar scrollBar = new JScrollBar(JScrollBar.VERTICAL) {

            @Override
            public boolean isVisible() {
                return true;
            }
        };
        jScrollPane1.setVerticalScrollBar(scrollBar);
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(32);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtMsg.setEditable(false);
        DefaultCaret caret = (DefaultCaret)txtMsg.getCaret();
        caret.setUpdatePolicy(DefaultCaret.OUT_BOTTOM);
        txtMsg.setColumns(20);
        txtMsg.setWrapStyleWord(true);
        txtMsg.setLineWrap(true);
        txtMsg.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtMsg.setRows(5);
        txtMsg.setBorder(null);
        jScrollPane1.setViewportView(txtMsg);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 350, 410));

        imgBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/chatBackground.png"))); // NOI18N
        getContentPane().add(imgBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setForeground(Color.WHITE);
        btnExit.setBackground(Color.RED);
        btnExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setForeground(new Color(102,102,102));
        btnExit.setBackground(new Color(249,249,249));
    }//GEN-LAST:event_btnExitMouseExited

    private void pnHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnHeaderMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_pnHeaderMousePressed

    private void pnHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnHeaderMouseDragged
        int x = evt.getXOnScreen() - this.x;
        int y = evt.getYOnScreen() - this.y;
        this.setLocation(x, y);
    }//GEN-LAST:event_pnHeaderMouseDragged

    private void txtSendKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSendKeyReleased
        if (evt.getKeyCode() == 10 && !txtSend.getText().trim().equals("")) {
            msgSend = txtSend.getText();
        }
    }//GEN-LAST:event_txtSendKeyReleased

    private void btnSendMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendMouseEntered
        btnSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sendExit.png")));
        btnSend.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnSendMouseEntered

    private void btnSendMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendMouseExited
        btnSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sendClick.png")));
    }//GEN-LAST:event_btnSendMouseExited

    private void btnSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendMouseClicked
        msgSend = txtSend.getText();
    }//GEN-LAST:event_btnSendMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnSend;
    private javax.swing.JLabel imgBackground;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbHelloUsername;
    private javax.swing.JPanel pnHeader;
    private javax.swing.JTextArea txtMsg;
    private javax.swing.JTextField txtSend;
    // End of variables declaration//GEN-END:variables

    /**
     * This class used to create 2-thread, one for InputStream and one for OutputStream
     */
    class ClientSocket {
        // Server address.
        String serverHost;
        int port;
        int d;
        
        Socket socketOfClient = null;
        BufferedWriter os = null;
        BufferedReader is = null;

        String name; //Save nick name when login

        public ClientSocket(String serverHost, int port) {
            this.serverHost = serverHost;
            this.port = port;
            this.name = nameClient;
            
            try {
                // Send request to server
                // Host: serverHost
                // Port: port
                socketOfClient = new Socket(serverHost, port);

                // Create output stream (Send message to server)
                os = new BufferedWriter(new OutputStreamWriter(socketOfClient.getOutputStream()));

                // Create input stream (Receive message from server)
                is = new BufferedReader(new InputStreamReader(socketOfClient.getInputStream()));

            } catch (UnknownHostException e) {
                System.err.println("Host: " + e);
            } catch (IOException e) {
                System.err.println("I/O Stream: " + e);
            }

            //Create 2-thread
            Thread send = new Thread(new Send());
            Thread receive = new Thread(new Receive());
            send.start();
            receive.start();
        }

        private class Send implements Runnable {

            @Override
            public void run() {
                try {
                    os.write(name);
                    os.newLine();
                    os.flush();
                    while (true) {
                        System.out.print("");
                        if (!msgSend.equals("")) {
                            os.write(msgSend); //Send message to server
                            os.newLine();
                            os.flush();
                            msgSend = "";
                            txtSend.setText("");
                            txtSend.requestFocus();
                        }
                    }
                } catch (IOException ex) {
                    System.err.println("OutputStream: " + ex);
                }
            }
        }

        private class Receive implements Runnable {

            @Override
            public void run() {
                try {
                    // Read message from server
                    String responseLine = "";
                    while ((responseLine = is.readLine()) != null) {
                        responseLine = txtMsg.getText() + '\n' + responseLine;
                        txtMsg.setText(responseLine);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(ClientSocket.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

}
