package javaapplication4;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class auth extends javax.swing.JFrame {
    Connexion conn=new Connexion();
    Statement stm;
    ResultSet Rs;
    public auth() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        cnx = new javax.swing.JButton();
        cnx1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("page authentification secretaire");
        setPreferredSize(new java.awt.Dimension(500, 300));
        getContentPane().setLayout(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(410, 400));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("password");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 120, 95, 41);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("login");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 70, 90, 41);
        jPanel1.add(login);
        login.setBounds(150, 70, 200, 40);

        password.setText("123456789");
        jPanel1.add(password);
        password.setBounds(150, 120, 200, 40);

        cnx.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cnx.setForeground(new java.awt.Color(255, 255, 255));
        cnx.setText("CONNECTER");
        cnx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cnxMouseClicked(evt);
            }
        });
        cnx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnxActionPerformed(evt);
            }
        });
        jPanel1.add(cnx);
        cnx.setBounds(140, 180, 160, 40);

        cnx1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cnx1.setForeground(new java.awt.Color(255, 255, 255));
        cnx1.setText("QUITTER");
        cnx1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cnx1MouseClicked(evt);
            }
        });
        cnx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnx1ActionPerformed(evt);
            }
        });
        jPanel1.add(cnx1);
        cnx1.setBounds(320, 180, 140, 40);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel4.setText("         CABINET MEDICALE");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 10, 390, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/les images/secretaire-médicale.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 560, 300);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-5, 2, 550, 290);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cnxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnxActionPerformed
  String req="select * from secretaire where login='"+login.getText()+"' and password='"+password.getText()+"'";
 try{
            stm=(Statement) conn.obtenirconnexion().createStatement();
            ResultSet rs=stm.executeQuery(req);
            if (rs.next())
            {
                Realiser R=new Realiser();
                R.setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(null,"LOGIN ou MOT DE PASSE INCORRECT"
                        + " "); }
        }
        catch(SQLException ex){
            System.err.println(ex);
        }
    }//GEN-LAST:event_cnxActionPerformed

    private void cnxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cnxMouseClicked

    }//GEN-LAST:event_cnxMouseClicked

    private void cnx1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cnx1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cnx1MouseClicked

    private void cnx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnx1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnx1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new auth().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cnx;
    private javax.swing.JButton cnx1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField login;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
