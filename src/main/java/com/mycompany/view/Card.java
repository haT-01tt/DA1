/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

import com.mycompany.entity.Employee;
import com.mycompany.entity.Product;
import com.mycompany.model.CardItem;
import com.mycompany.service.ProductService;
import com.mycompany.service.impl.ProductServiceImpl;
import java.util.ArrayList;
import java.util.*;
import java.util.Map.Entry;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TRUNG
 */
public class Card extends javax.swing.JFrame {

    /**
     * Creates new form Card
     */
    private Product product = null;
    private List<Object[]> list = null;
    private List<CardItem> listCard = new ArrayList<>();
    private CardItem card = null;
    private int rowSelectedPro = -1;
    private int rowSelectedCard = -1;
    private Map<Object[], Integer> map = new HashMap<>();
    private static Employee em = null;
    private Object[] obj = null;
    private DefaultTableModel defaultTableModel = null;

    public Card(Employee employee) {
        initComponents();
        setLocationRelativeTo(null);
        fillToProduct(null);
        em = employee;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCard = new javax.swing.JTable();
        btnDeleteOne = new javax.swing.JButton();
        btnDeleteAll = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JSpinner();
        btnUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btcCancel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        btnAddCard = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtSearchPro = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblCard.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Product code", "Product name", "Quantity", "Price"
            }
        ));
        tblCard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCardMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCard);

        btnDeleteOne.setBackground(new java.awt.Color(255, 153, 0));
        btnDeleteOne.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnDeleteOne.setText("Remove");
        btnDeleteOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteOneActionPerformed(evt);
            }
        });

        btnDeleteAll.setBackground(new java.awt.Color(255, 153, 0));
        btnDeleteAll.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnDeleteAll.setText("Clear");
        btnDeleteAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAllActionPerformed(evt);
            }
        });

        jLabel13.setText("Quantity:");

        txtQuantity.setMinimumSize(new java.awt.Dimension(0, 0));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Card");

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("PAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btcCancel.setBackground(new java.awt.Color(255, 153, 0));
        btcCancel.setText("EXIT");
        btcCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDeleteOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(101, 101, 101))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnDeleteAll, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btcCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(34, 34, 34)
                        .addComponent(btnDeleteOne)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDeleteAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btcCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(53, 145, Short.MAX_VALUE))))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Product Code", "Product Name", "Color", "Size", "Discount(%)", "Category", "Quantity", "Price", "Description"
            }
        ));
        tblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProduct);
        if (tblProduct.getColumnModel().getColumnCount() > 0) {
            tblProduct.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblProduct.getColumnModel().getColumn(4).setPreferredWidth(10);
            tblProduct.getColumnModel().getColumn(7).setPreferredWidth(20);
        }

        btnAddCard.setBackground(new java.awt.Color(255, 153, 0));
        btnAddCard.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnAddCard.setText("Add card");
        btnAddCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCardActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Search product :");

        btnSearch.setBackground(new java.awt.Color(255, 153, 0));
        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearchPro, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                        .addComponent(btnAddCard, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSearch, jButton2});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCard)
                    .addComponent(jLabel4)
                    .addComponent(txtSearchPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSearch, jButton2});

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("List product");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCardActionPerformed
        if (rowSelectedPro == -1) {
            JOptionPane.showMessageDialog(this, "Choose product you want buy");
            return;
        }
        int answer = JOptionPane.showConfirmDialog(this, "Do you want add carditem ?", "NOTIFY", JOptionPane.YES_NO_OPTION);
        if (answer == JOptionPane.YES_OPTION) {
            Object[] objects = list.get(rowSelectedPro);
            System.out.println(Arrays.toString(objects));
            Set<Object[]> set = map.keySet();
            boolean flg = false;
            for (Entry<Object[], Integer> e : map.entrySet()) {
                if (e.getKey()[0].equals(objects[0])) {
                    e.setValue(e.getValue() + 1);
                    flg = true;
                    break;
                }
            }
            if (!flg) {
                map.put(objects, 1);
            }
            fillMapToCard();
//            Integer productId = (Integer) tblProduct.getValueAt(rowSelectedPro, 0);
//            String productCode = (String) tblProduct.getValueAt(rowSelectedPro, 1);
//            String productName = (String) tblProduct.getValueAt(rowSelectedPro, 2);
//            Integer quantity = 1;
//            Double price = (Double) tblProduct.getValueAt(rowSelectedPro, 8);
//            String promoCode = (String) tblProduct.getValueAt(rowSelectedPro, 5);
//
//            boolean check = false;
//            for (CardItem item : listCard) {
//                if (item.getProductCode() == productCode) {
//                    item.setQuantity(item.getQuantity() + 1);
//                    check = true;
//                    fillToCard();
//                    break;
//                }
//            }
//            if (!check) {
//                CardItem cardItem = new CardItem(productId, productCode, productName, quantity, price);
//                listCard.add(cardItem);
//                fillToCard();
//            }
        } else {
            return;
        }
    }//GEN-LAST:event_btnAddCardActionPerformed

    private void tblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMouseClicked
        rowSelectedPro = tblProduct.getSelectedRow();

    }//GEN-LAST:event_tblProductMouseClicked

    private void tblCardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCardMouseClicked
        click();
    }//GEN-LAST:event_tblCardMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (rowSelectedCard == -1) {
            JOptionPane.showMessageDialog(this, "Please choose quantity");
            return;
        }
        int select = JOptionPane.showConfirmDialog(this, "Do you want update quantity ?", "Message", JOptionPane.YES_NO_CANCEL_OPTION);
        if (select == JOptionPane.YES_OPTION) {
            List<Object[]> listObject = new ArrayList<>(map.keySet());
            Object[] flag = null;
            for (int i = 0; i < listObject.size(); i++) {
                if (i == rowSelectedCard) {
                    flag = listObject.get(i);
                }
            }
            Integer quantity = (Integer) txtQuantity.getValue();
            map.replace(flag, map.get(flag), quantity);
            fillMapToCard();
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteOneActionPerformed
        if (rowSelectedCard == -1) {
            JOptionPane.showMessageDialog(this, "Please choose row table you want remove");
            return;
        }
        listCard.remove(rowSelectedCard);
        txtQuantity.setValue(0);
        fillToCard();

    }//GEN-LAST:event_btnDeleteOneActionPerformed

    private void btnDeleteAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAllActionPerformed
        
        listCard = new ArrayList<>();
        fillToCard();

    }//GEN-LAST:event_btnDeleteAllActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ListCard lc = new ListCard(map, em);
        lc.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        ProductService productService = new ProductServiceImpl();
        
        String proCode = txtSearchPro.getText();
//        List<Object[]> list2 = productService.getAllByCode(proCode);

        try {
//            DefaultTableModel df = (DefaultTableModel) tblProduct.getModel();
//            df.setColumnCount(0);
//            for (Object[] x : list2) {
//                df.addRow(new Object[]{
//                    x[0], x[1], x[2], x[4], x[5], x[13], x[7], x[8], x[9], x[10]
//                   
//                });
///                System.out.println(x[1]);
//            }
            fillToProduct(proCode);
            JOptionPane.showMessageDialog(this, "Search success");
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Search failed");
        }
        

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btcCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcCancelActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btcCancelActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        fillToProduct(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Card(em).setVisible(true);
//            }
//        });
//    }
    public void fillToProduct(String data) {
        defaultTableModel = (DefaultTableModel) tblProduct.getModel();
        ProductService pro = new ProductServiceImpl();
        if (data == null) {
            list = pro.findAll();
        } else {
            list = pro.getAllByCode(data);
        }
        
        defaultTableModel.setRowCount(0);
        for (Object[] x : list) {
            defaultTableModel.addRow(new Object[]{
                x[0], x[1], x[2], x[4], x[5], x[13], x[7], x[8], x[9], x[10]
            });
        }
    }
    
    public void fillToCard() {
        
        DefaultTableModel defaultTableModel = (DefaultTableModel) tblCard.getModel();
        defaultTableModel.setRowCount(0);
        for (CardItem c : listCard) {
            defaultTableModel.addRow(new Object[]{
                c.getId(), c.getProductCode(), c.getName(), c.getQuantity(), c.getPrice()
            });
        }
    }
    
    public void fillMapToCard() {
        
        DefaultTableModel defaultTableModel = (DefaultTableModel) tblCard.getModel();
        defaultTableModel.setRowCount(0);
        for (Entry<Object[], Integer> e : map.entrySet()) {
            Object[] o = e.getKey();
            defaultTableModel.addRow(new Object[]{
                o[0], o[1], o[2], e.getValue(), o[9]
            });
        }
    }
    
    public void click() {
        rowSelectedCard = tblCard.getSelectedRow();
        List<Object[]> listObject = new ArrayList<>(map.keySet());
        Object[] flag = null;
        for (int i = 0; i < listObject.size(); i++) {
            if (i == rowSelectedCard) {
                flag = listObject.get(i);
            }
        }
        Integer flagQuantity = map.get(flag);
        System.out.println("");
        txtQuantity.setValue(flagQuantity);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcCancel;
    private javax.swing.JButton btnAddCard;
    private javax.swing.JButton btnDeleteAll;
    private javax.swing.JButton btnDeleteOne;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCard;
    private javax.swing.JTable tblProduct;
    private javax.swing.JSpinner txtQuantity;
    private javax.swing.JTextField txtSearchPro;
    // End of variables declaration//GEN-END:variables
}
