/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2plkasir;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class kasirApp extends javax.swing.JFrame {
    
    private int all;
    String url;
    File file;
    BufferedReader br;
    BufferedWriter bw;
    DefaultTableModel model;
    public String Belanjaan;
    public int totalBelanja;
    
    public kasirApp() {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("App by Us");
        Jumlah.setVisible(false);
        loadData();
    }
    
    public void loadData(){
        url = "src/tugas2plkasir/Belanjaan.txt";
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
        name = new javax.swing.JTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(718, 482));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        jLabel1.setText("Nama Barang");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 100, 70, 14);

        jLabel2.setText("Harga Satuan");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 140, 70, 14);

        jLabel3.setText("Qty");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 180, 70, 20);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(90, 90, 150, 30);

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
        price.setBounds(90, 130, 150, 30);

        qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtyKeyTyped(evt);
            }
        });
        jPanel1.add(qty);
        qty.setBounds(90, 180, 70, 20);

        addProduct.setText("In");
        addProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductActionPerformed(evt);
            }
        });
        jPanel1.add(addProduct);
        addProduct.setBounds(170, 180, 60, 23);

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
        jScrollPane1.setBounds(270, 50, 430, 410);

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset);
        reset.setBounds(10, 370, 70, 23);

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
        cashIn.setBounds(90, 270, 165, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Cash");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 270, 50, 20);

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
        buttonTotal.setBounds(90, 370, 70, 23);
        jPanel1.add(messege);
        messege.setBounds(210, 170, 290, 20);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Kembalian :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 320, 70, 14);

        jButton1.setText("Persediaan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(0, 0, 110, 23);

        Kembalian.setEditable(false);
        Kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembalianActionPerformed(evt);
            }
        });
        jPanel1.add(Kembalian);
        Kembalian.setBounds(90, 320, 160, 20);

        jLabel4.setText("Tanggal");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 60, 50, 20);

        Jumlah.setEditable(false);
        Jumlah.setEnabled(false);
        jPanel1.add(Jumlah);
        Jumlah.setBounds(90, 210, 140, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 720, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTotalActionPerformed
        // TODO add your handling code here:
        url = "src/tugas2plkasir/Belanjaan.txt";
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
        messege.setText("");
        DefaultTableModel tb = (DefaultTableModel) Tabel.getModel();
        if(name.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Maaf anda harus melengkapi seluruh form");
        }
        else{
            Vector z = new Vector();
            z.add(name.getText());
            z.add(price.getText());
            z.add(qty.getText());
            z.add(Jumlah.getText());
            
            tb.addRow(z);
            int total=0;
            for(int e=0;e<tb.getRowCount();e++){
                total +=Integer.parseInt(tb.getValueAt(e, 3).toString());
            }
            
            
        }
    }//GEN-LAST:event_addProductActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tb = (DefaultTableModel) Tabel.getModel();
        tb.getDataVector().removeAllElements();
        tb.fireTableDataChanged();
        name.setText("");
        price.setText("");
        qty.setText("");
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

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

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
        totalBelanja = 0;
        for (int i = 0; i < Tabel.getRowCount(); i++){
            int amount = Integer.parseInt((String) Tabel.getValueAt(i, 3));
            totalBelanja += amount;  
        }
        Interface cetak = new Interface(totalBelanja);
        cetak.setVisible(true);
    }//GEN-LAST:event_buttonTotalMouseClicked
    
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
    private javax.swing.JButton addProduct;
    private javax.swing.JButton buttonTotal;
    private javax.swing.JTextField cashIn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel messege;
    private javax.swing.JTextField name;
    private javax.swing.JTextField price;
    private javax.swing.JTextField qty;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
