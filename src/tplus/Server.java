package tplus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollBar;
import javax.swing.text.DefaultCaret;

public class Server extends javax.swing.JFrame {

    public Server() {
        initComponents();
        this.setLocationRelativeTo(null);
        Thread server = new Thread(new ServerProgram());
        server.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtComandLine = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Server - TPlus");
        setResizable(false);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setAutoscrolls(true);
        JScrollBar scrollBar = new JScrollBar(JScrollBar.VERTICAL) {

            @Override
            public boolean isVisible() {
                return true;
            }
        };
        jScrollPane1.setVerticalScrollBar(scrollBar);
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);

        txtComandLine.setEditable(false);
        txtComandLine.setBackground(new java.awt.Color(0, 0, 0));
        txtComandLine.setWrapStyleWord(true);
        DefaultCaret caret = (DefaultCaret)txtComandLine.getCaret();
        caret.setUpdatePolicy(DefaultCaret.OUT_BOTTOM);
        txtComandLine.setLineWrap(true);
        txtComandLine.setColumns(20);
        txtComandLine.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtComandLine.setForeground(java.awt.Color.green);
        txtComandLine.setRows(5);
        txtComandLine.setBorder(null);
        jScrollPane1.setViewportView(txtComandLine);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Server().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtComandLine;
    // End of variables declaration//GEN-END:variables
    String commandLine = "";
    ArrayList<String> listNameClient = new ArrayList<>();
    ArrayList<Socket> listSocket = new ArrayList<>();

    private class ServerProgram implements Runnable {

        @Override
        public void run() {
            ServerSocket listener = null;

            commandLine += "o----------------------------------------------------------o\n";
            commandLine += "/       .`     `.   .:` -:.    -s-                         /\n";
            commandLine += "/      oMMMNNNMM+ -MMM:dMMMh` `NMM.                        /\n";
            commandLine += "/      /+omMNs+:  :MMNm:-MMM- hMMN.                        /\n";
            commandLine += "/        -MMm     oMMd` /MMy /MMN- ./oo .yo`  `+syo-       /\n";
            commandLine += "/        hMM/    `mMNyssMm+  mMM:  hMMs /MMh +NmymMM/      /\n";
            commandLine += "/       -MMN     hMM:/so:   /MMm   NMN``mMN- dMMmo-.       /\n";
            commandLine += "/       yMMd    hMMh        hMMy  oMM+-mMMs `.:yNMN`       /\n";
            commandLine += "/       mMMd    yMM:        hMMs .MMMmdyMMy.mMmhyMs        /\n";
            commandLine += "/       so/-     +o         +s+.  +yo- -s+: -oyhy:         /\n";
            commandLine += "/                                                          /\n";
            commandLine += "o----------------------------------------------------------o\n";
            commandLine += "Server is running...\n";

            // Open server (port 6969)
            try {
                InetAddress ip = InetAddress.getLocalHost();
                listener = new ServerSocket(6969);
                commandLine += "- IP Address: " + ip.getHostAddress() + '\n';
                commandLine += "- Port: 6969 \n";
                commandLine += "-------------\n";
            } catch (IOException e) {
                commandLine += e + "\n";
                return;
            }

            txtComandLine.setText(commandLine);

            try {
                while (true) {

                    // Accept a connection request from the Client side.
                    // Also receive a Socket object at the server.
                    Socket socketOfServer = listener.accept();
                    new Thread(new ServiceThread(socketOfServer)).start();
                }
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    listener.close();
                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        private class ServiceThread implements Runnable {

            private Socket socketOfServer;

            public ServiceThread(Socket socketOfServer) {
                this.socketOfServer = socketOfServer;
            }

            @Override
            public void run() {
                boolean getNameClient = false;
                try {
                    // Mở luồng vào ra trên Socket tại Server.
                    BufferedReader is = new BufferedReader(new InputStreamReader(socketOfServer.getInputStream()));

                    while (true) {
                        // Đọc dữ liệu tới server (Do client gửi tới).
                        String line = is.readLine();
                        if (!getNameClient) {
                            listNameClient.add(line);
                            listSocket.add(socketOfServer);

                            commandLine += "Welcome " + line + "\n";
                            commandLine += "  - IP: " + socketOfServer.getLocalAddress().toString().substring(1) + "\n";
                            commandLine += "  - Port: " + socketOfServer.getPort() + "\n";
                            
                            txtComandLine.setText(commandLine);
                            sendMsg(socketOfServer,"is joined the conversation!");
                            getNameClient = true;
                        } else {
                            sendMsg(socketOfServer, line);
                        }
                    }
                } catch (IOException ex) {
                    int index = listSocket.indexOf(socketOfServer);
                    String clientExit = listNameClient.get(index);
                    commandLine += "Bye bye!!! " + clientExit + '\n';
                    txtComandLine.setText(commandLine);
                    listNameClient.remove(index);
                    listSocket.remove(index);
                    sendMsg(clientExit + " has left the conversation!");
                }
            }

            private void sendMsg(Socket socketOfServer, String line) {
                int index = listSocket.indexOf(socketOfServer);
                for (int i = 0; i < listSocket.size(); ++i) {
                    BufferedWriter os = null;
                    try {
                        os = new BufferedWriter(new OutputStreamWriter(listSocket.get(i).getOutputStream()));
                        os.write(listNameClient.get(index) + ": ");
                        os.write(line);
                        os.newLine();
                        os.flush();
                    } catch (IOException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            private void sendMsg(String msg) {
                for (int i = 0; i < listSocket.size(); ++i) {
                    BufferedWriter os = null;
                    try {
                        os = new BufferedWriter(new OutputStreamWriter(listSocket.get(i).getOutputStream()));
                        os.write(msg);
                        os.newLine();
                        os.flush();
                    } catch (IOException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }
}
