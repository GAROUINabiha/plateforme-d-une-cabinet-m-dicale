
package javaapplication4;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class GestionPatient extends javax.swing.JFrame {
   Connexion conn=new Connexion();
   Statement stm;
   ResultSet Rs;
   DefaultTableModel model=new DefaultTableModel();
    public GestionPatient() {
        initComponents();
          model.addColumn("IDP");
model.addColumn("dateC");
model.addColumn("nomP");
model.addColumn("prenomP");
model.addColumn("datenaiss");
model.addColumn("adresse");
model.addColumn("sexe");
model.addColumn("telephone");
try {
stm=(Statement) conn.obtenirconnexion().createStatement();
ResultSet Rs=stm.executeQuery("Select * from patient");
while(Rs.next()){
model.addRow(new Object[]{Rs.getString("IDP"),Rs.getString("dateC"),Rs.getString("nomP"),
    Rs.getString("prenomP"),Rs.getString("datenaiss"),Rs.getString("adresse"),Rs.getString("sexe"),Rs.getString("telephone")});

}
}catch(Exception e){System.err.println(e);}

tble.setModel(model);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        t = new javax.swing.JTextField();
        a = new javax.swing.JTextField();
        dn = new javax.swing.JTextField();
        d = new javax.swing.JTextField();
        n = new javax.swing.JTextField();
        p = new javax.swing.JTextField();
        s = new javax.swing.JComboBox();
        c = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tble = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        j = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("gestion des patients");
        setPreferredSize(new java.awt.Dimension(750, 550));
        getContentPane().setLayout(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("             FICHE PATIENT");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 0, 290, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setText("ID :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 40, 59, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        jLabel4.setText("DATE création :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 70, 100, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setText("nom :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 100, 80, 20);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel6.setText("prénom :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 130, 70, 20);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 13)); // NOI18N
        jLabel7.setText("DATE naissance :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 160, 100, 20);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel8.setText("adresse :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 190, 70, 20);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel9.setText("sexe :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 210, 70, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel10.setText("télephone :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 240, 70, 30);
        jPanel1.add(t);
        t.setBounds(130, 240, 91, 30);
        jPanel1.add(a);
        a.setBounds(130, 180, 91, 30);

        dn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dnActionPerformed(evt);
            }
        });
        jPanel1.add(dn);
        dn.setBounds(130, 150, 91, 30);
        jPanel1.add(d);
        d.setBounds(130, 30, 91, 30);
        jPanel1.add(n);
        n.setBounds(130, 90, 91, 30);

        p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pActionPerformed(evt);
            }
        });
        jPanel1.add(p);
        p.setBounds(130, 120, 91, 30);

        s.setEditable(true);
        s.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "male", "femelle", " " }));
        s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sActionPerformed(evt);
            }
        });
        jPanel1.add(s);
        s.setBounds(130, 210, 90, 30);
        jPanel1.add(c);
        c.setBounds(130, 60, 91, 30);

        tble.setFont(new java.awt.Font("Times New Roman", 3, 11)); // NOI18N
        tble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        tble.setPreferredSize(new java.awt.Dimension(700, 300));
        tble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tble);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 280, 670, 90);

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/les images/rechercher.png"))); // NOI18N
        jButton1.setText("RECHERCHE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(380, 40, 150, 30);
        jPanel1.add(j);
        j.setBounds(540, 40, 40, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/les images/supprimer.png"))); // NOI18N
        jButton2.setText("SUPPRIMER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(380, 160, 150, 30);

        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/les images/ajouter.png"))); // NOI18N
        jButton3.setText("AJOUTER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(380, 80, 150, 30);

        jButton4.setFont(new java.awt.Font("Times New Roman", 3, 11)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/les images/nouveau.png"))); // NOI18N
        jButton4.setText("MODFIER");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(380, 120, 150, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/les images/assurance-pret-immobilier-visite-medicale_opt.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 410);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 420);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sActionPerformed

    private void tbleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbleMouseClicked
        // TODO add your handling code here:
         try {  int i=tble.getSelectedRow();
            deplace(i);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"erreur selectionne\n"+e.getMessage());
        }
    }//GEN-LAST:event_tbleMouseClicked

    private void pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pActionPerformed

    private void dnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
String IDP=d.getText();
String dateC=c.getText();
String nomP=n.getText();
String prenomP=p.getText();
String datenaiss=dn.getText();
String adresse=a.getText();
String sexe=s.getSelectedItem().toString();
String telephone=t.getText();
String req="INSERT INTO patient(IDP,dateC,nomP,prenomP,datenaiss,adresse,sexe,telephone)VALUES('"+IDP+
        "','"+dateC+"','"+nomP+"','"+prenomP+"','"+datenaiss+"','"+adresse+"','"+sexe+"','"+telephone+"')";
try {
    stm=(Statement) conn.obtenirconnexion().createStatement();
//stm.executeQuery(req);
stm.executeUpdate(req);
JOptionPane.showMessageDialog(null,"le patient est ajoutée correctement !");//
c.setText("");
n.setText("");
p.setText("");
d.setText("");
a.setText("");
s.setSelectedItem(2);
t.setText("");
afficher();
}
catch(SQLException e){System.err.println(e);
JOptionPane.showMessageDialog(null,"veuillez changer le num id parce que est déja attribue pour un autre patient ");
    }   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
           try { 
            if (JOptionPane.showConfirmDialog (null,"confirmer la modification","modification",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {

                stm.executeUpdate("UPDATE patient SET dateC='"+c.getText()+"',nomP='"+n.getText()+"',prenomP='"+p.getText()+"',datenaiss='"+dn.getText()
                      +"',adresse='"+a.getText()+"',sexe='"+s.getSelectedItem().toString()+"',telephone='"+t.getText()+
                        "' WHERE IDP= "+d.getText());
                
                afficher();
            } 
        } catch (HeadlessException | SQLException e){JOptionPane.showMessageDialog(null,"erreur de modifier !!!!!!!"+e.getMessage());
        System.err.println(e);}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
             try {
           model.setRowCount(0);// pour vider la list des client
      {
       Rs = stm.executeQuery("Select * From patient WHERE IDP = '"+j.getText()+"'");
       }while (Rs.next()){
       
       Object [] patient ={Rs.getInt(1),Rs.getString(2),Rs.getString(3),Rs.getString(4),Rs.getString(5),Rs.getString(6),Rs.getString(7),Rs.getString(8)};
     model.addRow(patient);
       } if (model.getRowCount () == 0){JOptionPane.showMessageDialog(null,"il y a aucun patient");
       
       } else{ int i=0;
       deplace(i);
       }
       
       }catch (Exception e) { System.err.println(e);
       JOptionPane.showMessageDialog(null,e.getMessage());
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
             if(JOptionPane.showConfirmDialog(null,"attention vous avez supprimer un patient,est ce que tu et sure?"
                     ,"supprimer patient",JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION)
         
            if(d.getText().length() != 0){
        stm.executeUpdate("Delete From patient where IDP = "+d.getText());
        afficher();
             }//ca est pour recharger la list des stagiaire
            
            else { JOptionPane.showMessageDialog(null,"veuillez remplir le champ id !");}
        
        }catch (Exception e){JOptionPane.showMessageDialog(null,"erreur de supprission \n"+e.getMessage());}
    }//GEN-LAST:event_jButton2ActionPerformed
 private void deplace(int i){
        try{
               d.setText(model.getValueAt (i, 0).toString());
      // txttp.setSelectedItem(dt.getValueAt (i, 5).toString());
        c.setText(model.getValueAt (i, 1).toString());
        // txtb.setSelectedItem(dt.getValueAt (i, 2).toString());
          n.setText(model.getValueAt (i, 2).toString());
          p.setText(model.getValueAt (i, 3).toString());
     dn.setText(model.getValueAt (i, 4).toString());
      a.setText(model.getValueAt (i, 5).toString());
       s.setSelectedItem(model.getValueAt (i, 6).toString());
      t.setText(model.getValueAt (i, 7).toString());
        }
        catch(Exception e)
        {
            System.err.println(e);
            JOptionPane.showMessageDialog(null,"erreur de deplacement"+e.getLocalizedMessage());
        }
        
    }
    private void afficher(){
    try {
 model.setRowCount(0);
stm=(Statement) conn.obtenirconnexion().createStatement();
ResultSet Rs=stm.executeQuery("Select * from patient");
while(Rs.next()){
model.addRow(new Object[]{Rs.getString("IDP"),Rs.getString("dateC"),Rs.getString("nomP"),
    Rs.getString("prenomP"),Rs.getString("datenaiss"),Rs.getString("adresse"),Rs.getString("sexe"),Rs.getString("telephone")});

}
}catch(Exception e){System.err.println(e);}

tble.setModel(model);
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a;
    private javax.swing.JTextField c;
    private javax.swing.JTextField d;
    private javax.swing.JTextField dn;
    private javax.swing.JTextField j;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField n;
    private javax.swing.JTextField p;
    private javax.swing.JComboBox s;
    private javax.swing.JTextField t;
    private javax.swing.JTable tble;
    // End of variables declaration//GEN-END:variables
}
