/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cashier_1;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;


public class kasirApp extends javax.swing.JFrame {
    
    private int all;
    String url;
    File file;
    BufferedReader br;
    BufferedWriter bw;
    DefaultTableModel model;
    public String Belanjaan;
    public double totalBelanja;
    public double cash;
    public double kembalian;
    int HARGA;
    String rego;
    
    public kasirApp() {
        initComponents();
        AutoCompleteDecorator.decorate(name);
        setLocationRelativeTo(this);
        setTitle("App by Us");
        Jumlah.setVisible(false);
        loadData();
    }
    
    public void loadData(){
        url = "src/Cashier_1/Belanjaan.txt";
        file = new File(url);
        try{
            br = new BufferedReader(new FileReader(file));
            String barisPertama = br.readLine();
            String[] namaKolom = barisPertama.split(",");
            model = (DefaultTableModel)Tabel.getModel();
            model.setColumnIdentifiers(namaKolom);
            
            Object[] dataBaris = br.lines().toArray();
            for(int i=0;i<dataBaris.length;i++){
                String baris = dataBaris[i].toString();
                String[] data = baris.split("/");
                model.addRow(data);
            }
        }catch(Exception e){
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        qty = new javax.swing.JTextField();
        addProduct = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();
        reset = new javax.swing.JButton();
        cashIn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        buttonTotal = new javax.swing.JButton();
        messege = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Kembalian = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Jumlah = new javax.swing.JTextField();
        name = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        TotalB = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(760, 485));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(760, 470));
        jPanel1.setLayout(null);

        jLabel1.setText("Nama Barang");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 100, 80, 16);

        jLabel2.setText("Harga Satuan");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 140, 80, 16);

        jLabel3.setText("Qty");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 180, 70, 20);

        price.setEditable(false);
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceKeyTyped(evt);
            }
        });
        jPanel1.add(price);
        price.setBounds(130, 130, 150, 30);

        qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtyKeyTyped(evt);
            }
        });
        jPanel1.add(qty);
        qty.setBounds(130, 170, 70, 30);

        addProduct.setText("In");
        addProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductActionPerformed(evt);
            }
        });
        jPanel1.add(addProduct);
        addProduct.setBounds(220, 170, 60, 32);

        Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Barang", "Harga Satuan", "Qty", "Jumlah harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabel);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(310, 50, 430, 370);

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset);
        reset.setBounds(10, 380, 70, 32);

        cashIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashInActionPerformed(evt);
            }
        });
        cashIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cashInKeyTyped(evt);
            }
        });
        jPanel1.add(cashIn);
        cashIn.setBounds(130, 290, 150, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Cash");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 290, 50, 20);

        buttonTotal.setText("Total");
        buttonTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonTotalMouseClicked(evt);
            }
        });
        buttonTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTotalActionPerformed(evt);
            }
        });
        jPanel1.add(buttonTotal);
        buttonTotal.setBounds(90, 380, 70, 32);
        jPanel1.add(messege);
        messege.setBounds(210, 170, 290, 20);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Kembalian");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 340, 70, 14);

        jButton1.setText("Persediaan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 10, 110, 32);

        Kembalian.setEditable(false);
        Kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembalianActionPerformed(evt);
            }
        });
        jPanel1.add(Kembalian);
        Kembalian.setBounds(130, 330, 150, 30);

        jLabel4.setText("Tanggal");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 60, 50, 20);

        Jumlah.setEditable(false);
        Jumlah.setEnabled(false);
        Jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahActionPerformed(evt);
            }
        });
        jPanel1.add(Jumlah);
        Jumlah.setBounds(410, 360, 140, 20);

        name.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ".", "Nitrogen per Liter", "Debu Cosmic per Gram", "Gas Kalium Hidroksida per Kilogram", "Air Purba per Liter", "Fosil Batuan per Gram", "Beterai Plasma", "Infinity Stone - Reality Stone" }));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(130, 90, 150, 30);

        jLabel7.setText("Total Belanja");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 256, 100, 20);

        TotalB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalBActionPerformed(evt);
            }
        });
        jPanel1.add(TotalB);
        TotalB.setBounds(130, 250, 150, 30);

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(180, 380, 66, 32);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 760, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTotalActionPerformed
        // TODO add your handling code here:
        url = "src/Cashier_1/Belanjaan.txt";
        file = new File(url);
        try {
            bw = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < Tabel.getColumnCount(); i++) {
                if (i>0) {
                    bw.write(",");
                }
                bw.write(Tabel.getColumnName(i));
            }
            bw.newLine();
            for (int i = 0; i < Tabel.getRowCount(); i++) {
                for (int j = 0; j < Tabel.getColumnCount(); j++) {
                    if (j>0) {
                        bw.write("/");
                    }
                    bw.write(Tabel.getValueAt(i, j).toString());
                }
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
        }
         
    }//GEN-LAST:event_buttonTotalActionPerformed

    private void addProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductActionPerformed
        // TODO add your handling code here:
        Gudang gd = new Gudang();
        int harga= Integer.parseInt(price.getText());//var harga
        int kuantitas= Integer.parseInt(qty.getText());//var quantity
        int jumlahharga= harga*kuantitas;//var jumlah
        Jumlah.setText(""+jumlahharga);
        Jumlah.setVisible(false);
        boolean valid=true;
        DefaultTableModel tb = (DefaultTableModel) Tabel.getModel();
        
       
            Vector z = new Vector();
            z.add(name.getSelectedItem());
            z.add(price.getText());
            z.add(qty.getText());
            z.add(Jumlah.getText());
            
            tb.addRow(z);
            int total=0;
            for(int e=0;e<tb.getRowCount();e++){
                total +=Integer.parseInt(tb.getValueAt(e, 3).toString());
            }
        TotalB.setText(""+total);
        price.setText("");
        qty.setText("");
    }//GEN-LAST:event_addProductActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tb = (DefaultTableModel) Tabel.getModel();
        tb.getDataVector().removeAllElements();
        tb.fireTableDataChanged();
        
        name.setSelectedItem(".");
        price.setText("");
        qty.setText("");
        TotalB.setText("");
        cashIn.setText("");
        Kembalian.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_priceKeyTyped

    private void qtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_qtyKeyTyped

    private void cashInKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cashInKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_cashInKeyTyped

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void cashInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cashInActionPerformed

    private void KembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KembalianActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //dispose();
        Gudang stock = new Gudang();
        stock.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttonTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonTotalMouseClicked
        // TODO add your handling code here:
        cash= Double.parseDouble(cashIn.getText());
        totalBelanja = 0;
        for (int i = 0; i < Tabel.getRowCount(); i++){
            double amount = Double.parseDouble((String) Tabel.getValueAt(i, 3));
            totalBelanja += amount;  
        }
        kembalian= cash - totalBelanja;
        if(cash<totalBelanja){
            JOptionPane.showMessageDialog(rootPane, "Cash kurang Rp "+ cash +",00");
           
        }else{
        Kembalian.setText("Rp "+ kembalian+",00");
        }
        
        
        
        Interface cetak = new Interface(totalBelanja, cash, kembalian);
        cetak.setVisible(true);
    }//GEN-LAST:event_buttonTotalMouseClicked

    private void JumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JumlahActionPerformed

    private void TotalBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalBActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        HARGA = 0;
        if(name.getSelectedItem() =="."){
            HARGA = 0;
            
            
        }
       if(name.getSelectedItem() == "Nitrogen per Liter"){
           HARGA = 99;
           
           }
       else if(name.getSelectedItem() == "Debu Cosmic per Gram"){
           HARGA = 299;  
           
       }
       else if(name.getSelectedItem() == "Gas Kalium Hidroksida per Kilogram"){
           HARGA = 119;
           
       }
       else if(name.getSelectedItem() == "Air Purba per Liter"){
           HARGA = 2999;
           
       }
       else if(name.getSelectedItem() == "Fosil Batuan per Gram"){
           HARGA = 999;   
       }
       else if(name.getSelectedItem() == "Beterai Plasma"){
           HARGA = 799;
           
       }
       else if(name.getSelectedItem() == "Infinity Stone - Reality Stone"){
           HARGA = 99999;   
       }
       String rego = Integer.toString(HARGA);
       price.setText(rego);
       
    }//GEN-LAST:event_nameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    model = (DefaultTableModel) Tabel.getModel();
    int row = Tabel.getSelectedRow();
    model.removeRow(row);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    
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
            java.util.logging.Logger.getLogger(kasirApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kasirApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kasirApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kasirApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kasirApp().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Jumlah;
    private javax.swing.JTextField Kembalian;
    private javax.swing.JTable Tabel;
    private javax.swing.JTextField TotalB;
    private javax.swing.JButton addProduct;
    private javax.swing.JButton buttonTotal;
    private javax.swing.JTextField cashIn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel messege;
    private javax.swing.JComboBox name;
    private javax.swing.JTextField price;
    private javax.swing.JTextField qty;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
