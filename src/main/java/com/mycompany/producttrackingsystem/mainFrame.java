package com.mycompany.producttrackingsystem;

import javax.swing.ImageIcon;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level; 
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class mainFrame extends javax.swing.JFrame {
    
    ImageIcon icon=new ImageIcon("src/photo.png");
    Connection connect = null;
    Statement s = null;
    DefaultTableModel model;
    String sorgu;
    ResultSet rs;
    PreparedStatement ps;
    
    public mainFrame() {
        initComponents();
        
        this.setTitle("Product Tracking System");
        this.setIconImage(icon.getImage());
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        model=(DefaultTableModel)tablo.getModel();
        model.setRowCount(26);
        
        tablo.setModel(model);
        
        durum_Label.setText(connect_database());
        
    }

    public String connect_database(){
        String durum="";
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/producttrackingsystem" +
                    "?user=admin&password=admin");
            if (connect != null) durum="* Successfully connected to the database !";
        } 
        catch (Exception e) 
        {
            durum="* Could not connect to database !  :  "+e.getMessage();
        }
        return durum;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ekle_Ad = new javax.swing.JTextField();
        ekle_Fiyat = new javax.swing.JTextField();
        ekle_Buton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sil_Buton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fiyatGuncelle_Buton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        fiyatGuncelle_Fiyat = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        durum_Label = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ekle_Stok = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        stokGuncelle_Adet = new javax.swing.JTextField();
        stokGuncelle_Buton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        listele_Buton = new javax.swing.JButton();
        sil_ComboBox = new javax.swing.JComboBox<>();
        fiyatGuncelle_ComboBox = new javax.swing.JComboBox<>();
        stokGuncelle_ComboBox = new javax.swing.JComboBox<>();

        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name:");

        jLabel2.setText("Price:");

        ekle_Buton.setBackground(new java.awt.Color(204, 204, 204));
        ekle_Buton.setText("Add Product");
        ekle_Buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekle_ButonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        jLabel3.setText("ADD PRODUCT");

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        jLabel4.setText("DELETE PRODUCT");

        jLabel5.setText("Name:");

        sil_Buton.setBackground(new java.awt.Color(204, 204, 204));
        sil_Buton.setText("Delete Product");
        sil_Buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sil_ButonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        jLabel6.setText("UPDATE PRICE");

        jLabel7.setText("Name:");

        fiyatGuncelle_Buton.setBackground(new java.awt.Color(204, 204, 204));
        fiyatGuncelle_Buton.setText("Update Price");
        fiyatGuncelle_Buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiyatGuncelle_ButonActionPerformed(evt);
            }
        });

        jLabel8.setText("New Price:");

        jLabel11.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        jLabel11.setText("Aziz Can HAMASOGLU");

        durum_Label.setText("jLabel13");

        jLabel12.setText("Stock:");

        jLabel13.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        jLabel13.setText("UPDATE STOCK");

        jLabel14.setText("Name:");

        jLabel15.setText("New Stock:");

        stokGuncelle_Buton.setBackground(new java.awt.Color(204, 204, 204));
        stokGuncelle_Buton.setText("Update Stock");
        stokGuncelle_Buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stokGuncelle_ButonActionPerformed(evt);
            }
        });

        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Price", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablo);

        listele_Buton.setBackground(new java.awt.Color(204, 204, 204));
        listele_Buton.setText("List Products");
        listele_Buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listele_ButonActionPerformed(evt);
            }
        });

        sil_ComboBox.setBackground(new java.awt.Color(204, 204, 204));

        fiyatGuncelle_ComboBox.setBackground(new java.awt.Color(204, 204, 204));

        stokGuncelle_ComboBox.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listele_Buton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ekle_Buton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(sil_Buton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(fiyatGuncelle_Buton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(fiyatGuncelle_Fiyat)
                                                    .addComponent(fiyatGuncelle_ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addComponent(stokGuncelle_Buton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel14)
                                                    .addComponent(jLabel15))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(stokGuncelle_Adet)
                                                    .addComponent(stokGuncelle_ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(sil_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(110, 110, 110)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel13))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel1)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel12))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(ekle_Stok)
                                                    .addComponent(ekle_Fiyat)
                                                    .addComponent(ekle_Ad))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(108, 108, 108)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(durum_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(listele_Buton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ekle_Ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ekle_Fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(ekle_Stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ekle_Buton)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(sil_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sil_Buton)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(fiyatGuncelle_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addComponent(jLabel8))
                            .addComponent(fiyatGuncelle_Fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fiyatGuncelle_Buton)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(stokGuncelle_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(stokGuncelle_Adet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stokGuncelle_Buton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(durum_Label)
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ekle_ButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekle_ButonActionPerformed
        if(ekle_Ad.getText().equals("") || ekle_Fiyat.getText().equals("") || ekle_Stok.getText().equals("")){
            durum_Label.setText("* Please enter name, price, stock information.");
        }
        else{
            sorgu="Insert into table1 (name,price,stock) values (?,?,?)";               
            try {
                ps=connect.prepareStatement(sorgu);
                ps.setString(1, ekle_Ad.getText());
                ps.setString(2, ekle_Fiyat.getText());
                ps.setString(3, ekle_Stok.getText());
                ps.execute();
                durum_Label.setText("Add product successful !");
                ekle_Ad.setText("");
                ekle_Fiyat.setText("");
                ekle_Stok.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }       
            tabloGuncelle();
       
    }//GEN-LAST:event_ekle_ButonActionPerformed

    private void listele_ButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listele_ButonActionPerformed
        tabloGuncelle();       
    }//GEN-LAST:event_listele_ButonActionPerformed

    private void sil_ButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sil_ButonActionPerformed
        if(sil_ComboBox.getSelectedItem().equals("")){
            durum_Label.setText("Please enter the name information.");
        }
        else{
            sorgu="Delete from table1 where name=?";
            try {
                ps=connect.prepareStatement(sorgu);
                ps.setString(1, sil_ComboBox.getSelectedItem().toString());
                ps.execute();
                durum_Label.setText("Deletion successful!");
            } catch (SQLException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        tabloGuncelle();
    }//GEN-LAST:event_sil_ButonActionPerformed

    private void fiyatGuncelle_ButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiyatGuncelle_ButonActionPerformed
        if(fiyatGuncelle_ComboBox.getSelectedItem().equals("") || fiyatGuncelle_Fiyat.getText().equals("")){
            durum_Label.setText("Please enter name and price information.");
        }
        else{
            sorgu="Update table1 set price=? where name=?";
            try {
                ps=connect.prepareStatement(sorgu);
                ps.setString(1, fiyatGuncelle_Fiyat.getText());
                ps.setString(2,fiyatGuncelle_ComboBox.getSelectedItem().toString());
                ps.execute();
                durum_Label.setText("Price update successful!");
            } catch (SQLException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            tabloGuncelle();
            
        }
    }//GEN-LAST:event_fiyatGuncelle_ButonActionPerformed

    private void stokGuncelle_ButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokGuncelle_ButonActionPerformed
        if(stokGuncelle_ComboBox.getSelectedItem().equals("") || stokGuncelle_Adet.getText().equals("")){
            durum_Label.setText("Please enter name and price information.");
        }
        else{
            sorgu="Update table1 set stock=? where name=?";
            try {
                ps=connect.prepareStatement(sorgu);
                ps.setString(1, stokGuncelle_Adet.getText());
                ps.setString(2,stokGuncelle_ComboBox.getSelectedItem().toString());
                ps.execute();
                durum_Label.setText("Stock update successful!");
            } catch (SQLException ex) {
                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            tabloGuncelle();
            
        }
    }//GEN-LAST:event_stokGuncelle_ButonActionPerformed

    public void tabloGuncelle(){
        sorgu="Select * from table1"; 
        model = (DefaultTableModel) tablo.getModel();
        model.setRowCount(0);
        sil_ComboBox.removeAllItems();
        fiyatGuncelle_ComboBox.removeAllItems();
        stokGuncelle_ComboBox.removeAllItems();
        try {
            s=connect.createStatement();
            rs=s.executeQuery(sorgu);
            while(rs.next()){
                model.addRow(new Object[]{rs.getString("name"),rs.getFloat("price") ,rs.getInt("stock")});
                sil_ComboBox.addItem(rs.getString("name"));
                fiyatGuncelle_ComboBox.addItem(rs.getString("name"));
                stokGuncelle_ComboBox.addItem(rs.getString("name"));
                
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                mainFrame mf=new mainFrame();
                mf.setVisible(true);   
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel durum_Label;
    private javax.swing.JTextField ekle_Ad;
    private javax.swing.JButton ekle_Buton;
    private javax.swing.JTextField ekle_Fiyat;
    private javax.swing.JTextField ekle_Stok;
    private javax.swing.JButton fiyatGuncelle_Buton;
    private javax.swing.JComboBox<String> fiyatGuncelle_ComboBox;
    private javax.swing.JTextField fiyatGuncelle_Fiyat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton listele_Buton;
    private javax.swing.JButton sil_Buton;
    private javax.swing.JComboBox<String> sil_ComboBox;
    private javax.swing.JTextField stokGuncelle_Adet;
    private javax.swing.JButton stokGuncelle_Buton;
    private javax.swing.JComboBox<String> stokGuncelle_ComboBox;
    private javax.swing.JTable tablo;
    // End of variables declaration//GEN-END:variables
}
