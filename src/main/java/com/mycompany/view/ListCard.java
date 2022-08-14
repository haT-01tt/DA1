/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

import com.mycompany.entity.Customer;
import com.mycompany.entity.Employee;
import com.mycompany.entity.Order;
import com.mycompany.entity.OrderDetail;
import com.mycompany.entity.Product;
import com.mycompany.model.CardItem;
import com.mycompany.service.CustomerService;
import com.mycompany.service.EmployeeService;
import com.mycompany.service.OrderDetailService;
import com.mycompany.service.OrderService;
import com.mycompany.service.ProductService;
import com.mycompany.service.impl.CustomerServiceImpl;
import com.mycompany.service.impl.EmployeeServiceImpl;
import com.mycompany.service.impl.OrderDetailServiceImpl;
import com.mycompany.service.impl.OrderServiceImpl;
import com.mycompany.service.impl.ProductServiceImpl;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author haanh
 */
public class ListCard extends javax.swing.JFrame {

    private List<CardItem> listCards = null;
    private Employee em = null;
//    private Product product = new Product();
    private Map<Object[], Integer> mapCard = null;
    Double totalprice = 0.0;
    Double discount = 0.0;
    Double moneyGiven = 0.0;
    Integer quantity = 0;
    Date date = new Date();
    private OrderService orderService = null;
    private OrderDetailService detailService = null;
    private EmployeeService employeeService = new EmployeeServiceImpl();
    private CustomerService customerService = new CustomerServiceImpl();
    private ProductService productService = new ProductServiceImpl();
//    private ColorService colorService = new ColorServiceImpl();

    public ListCard(Map<Object[], Integer> map, Employee emp) {
        initComponents();
        mapCard = map;
        fillMapToListCard();
        em = emp;
        for (Map.Entry<Object[], Integer> e : mapCard.entrySet()) {
            Object[] o = e.getKey();
            totalprice += (Double) o[9] * e.getValue();
            discount += (Double) o[9] * (Double) o[13] / 100 * e.getValue();
        }
        lblTotal.setText(String.valueOf(totalprice));
        txtODList.setText("OD" + getSaltString());
//        employee = employeeService.getByEmpCode(empCode);
        txtEmpName.setText(em.getFullName());
        txtEmpCode.setText(em.getEmpCode());
        txtDate.setText(datetoString(date));
        lblDis.setText(String.valueOf(discount));
        lblSell.setText(String.valueOf(totalprice - discount));

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        lblOrderCode = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();
        lblDiscount = new javax.swing.JLabel();
        lblMoneyG = new javax.swing.JLabel();
        lblRefunds = new javax.swing.JLabel();
        txtMoneyGiven = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnRefresh = new javax.swing.JButton();
        btnPay = new javax.swing.JButton();
        btcCancel = new javax.swing.JButton();
        txtEmpName = new javax.swing.JTextField();
        txtODList = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCusName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListCard = new javax.swing.JTable();
        lblToP = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblDis = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblSell = new javax.swing.JLabel();
        lblRe = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtEmpCode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblOrderCode.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblOrderCode.setText("Order Code: ");

        lblTotalPrice.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTotalPrice.setText("Total Price(VND):");

        lblDiscount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDiscount.setText("Discount(VND):");

        lblMoneyG.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMoneyG.setText("Money given(VND):");

        lblRefunds.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRefunds.setText("Refunds:");

        txtMoneyGiven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtMoneyGivenMouseExited(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

        btnRefresh.setBackground(new java.awt.Color(255, 204, 51));
        btnRefresh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRefresh.setText("Refresh");

        btnPay.setBackground(new java.awt.Color(255, 204, 51));
        btnPay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPay.setText("Pay");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        btcCancel.setBackground(new java.awt.Color(255, 153, 0));
        btcCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btcCancel.setText("Exit");
        btcCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPay)
                .addGap(42, 42, 42)
                .addComponent(btnRefresh)
                .addGap(31, 31, 31)
                .addComponent(btcCancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btcCancel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRefresh)
                            .addComponent(btnPay))))
                .addGap(82, 82, 82))
        );

        txtEmpName.setEnabled(false);

        txtODList.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Employee Name:");

        txtDate.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Customer Name:");

        txtCusName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCusNameActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Create Date:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Information ");

        tblListCard.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Product Code", "Product Name", "Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(tblListCard);

        lblTotal.setText("jLabel1");

        lblDis.setText("jLabel2");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Pay(VND):");

        lblSell.setText("jLabel2");

        lblRe.setText("jLabel2");

        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Phone Number");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Employee Code:");

        txtEmpCode.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(lblOrderCode)
                                    .addGap(16, 16, 16))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtODList, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(txtCusName)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(lblToP, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEmpCode, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDate)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(lblRefunds, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)
                                        .addComponent(lblRe))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTotalPrice)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addGap(46, 46, 46)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblSell)
                                            .addComponent(lblDis, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(231, 231, 231)
                                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 38, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(174, 174, 174)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jLabel8))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMoneyG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMoneyGiven, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDiscount)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCusName, txtDate, txtEmpName, txtODList});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblOrderCode, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtCusName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtODList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtEmpCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(lblToP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch))
                        .addGap(1, 1, 1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(15, 15, 15)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotal)
                            .addComponent(lblTotalPrice))))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiscount)
                    .addComponent(lblDis))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblSell))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMoneyG)
                    .addComponent(txtMoneyGiven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRefunds)
                    .addComponent(lblRe))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMoneyGivenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMoneyGivenMouseExited
        // TODO add your handling code here:
        if (txtMoneyGiven.getText().isEmpty()) {
            return;
        }
        moneyGiven = Double.parseDouble(txtMoneyGiven.getText());
        if (moneyGiven < (totalprice - discount)) {
            JOptionPane.showMessageDialog(this, "The amount entered must be greater than the amount paid!");
        } else {
            Double refund = moneyGiven - (totalprice - discount);
            lblRe.setText(String.valueOf(refund));
        }

    }//GEN-LAST:event_txtMoneyGivenMouseExited

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed

        int a = JOptionPane.showConfirmDialog(this, "Are you sure you want to pay?", "Confirm", JOptionPane.YES_NO_OPTION);

        if (a == JOptionPane.YES_OPTION) {
            try {
                orderService = new OrderServiceImpl();
                Order order = new Order();
                em = employeeService.getByEmpCode(txtEmpCode.getText());
                order.setEmployee(em);
                
                Customer customer = null;
                try {
                    customer = customerService.getPhoneNumber(txtPhoneNumber.getText());
                } catch (Exception e) {
                    customer = new Customer();
                    customer.setFullName(txtCusName.getText());
                    customer.setPhoneNumber(txtPhoneNumber.getText());
                    customer.setAvai(true);
                    customer.setId(customerService.create(customer));
                }
             
                order.setCustomer(customer);
                order.setOrderCode(txtODList.getText());
                order.setCreateDate(date);
                order.setTotalPrice(Double.parseDouble(lblSell.getText()));
                order.setStatus(true);
                order.setId(orderService.create(order));

                detailService = new OrderDetailServiceImpl();
                for (Map.Entry<Object[], Integer> e : mapCard.entrySet()) {
                    OrderDetail detail = new OrderDetail();
                    Product product = productService.getProById((Integer) e.getKey()[0]);
                    detail.setProduct(product);
                    detail.setOrder(order);
                    detail.setOrderDetailCode("ODD" + getSaltString());
                    detail.setPrice((Double) e.getKey()[9]);
                    detail.setQuantity(e.getValue());

                    detailService.create(detail);
//                    Color color = colorService.getColorByProduct(product.getId());
                    product.setQuantity(product.getQuantity() - e.getValue());
                    productService.modify(product);
                }

                JOptionPane.showMessageDialog(this, "Payment success");
                OrderManagement od = new OrderManagement();
                od.setVisible(true);
                this.dispose();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Payment fail");
                e.printStackTrace();
            }
        } else {
            return;
        }


    }//GEN-LAST:event_btnPayActionPerformed

    private void txtCusNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCusNameActionPerformed

    }//GEN-LAST:event_txtCusNameActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if(txtPhoneNumber.getText().length() < 0 && txtPhoneNumber.getText().length() > 12){
            JOptionPane.showMessageDialog(this, "Please input phonenumber have length > 0 and length < 12");
            return;
        }
        try {
            String phoneNumber = txtPhoneNumber.getText();
            Customer customer = customerService.getPhoneNumber(phoneNumber);

            txtCusName.setText(customer.getFullName());
            JOptionPane.showMessageDialog(this, "Found success");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Customer is not exist");
            e.printStackTrace();
        }


    }//GEN-LAST:event_btnSearchActionPerformed

    private void btcCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcCancelActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btcCancelActionPerformed

//    public void fillToListCard(List<CardItem> listCards) {
//
//        DefaultTableModel defaultTableModel = (DefaultTableModel) tblListCard.getModel();
//        defaultTableModel.setRowCount(0);
//        for (CardItem c : listCards) {
//            defaultTableModel.addRow(new Object[]{
//                c.getId(), c.getProductCode(), c.getName(), c.getQuantity(), c.getPrice()
//            });
//        }
//    }
    public void fillMapToListCard() {

        DefaultTableModel defaultTableModel = (DefaultTableModel) tblListCard.getModel();
        defaultTableModel.setRowCount(0);
        for (Map.Entry<Object[], Integer> e : mapCard.entrySet()) {
            Object[] o = e.getKey();
            defaultTableModel.addRow(new Object[]{
                o[0], o[1], o[2], e.getValue(), o[9]
            });
        }
    }

    public static String getSaltString() {
        String SALTCHARS = "0123456789";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() <= 1) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

    public String datetoString(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcCancel;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDis;
    private javax.swing.JLabel lblDiscount;
    private javax.swing.JLabel lblMoneyG;
    private javax.swing.JLabel lblOrderCode;
    private javax.swing.JLabel lblRe;
    private javax.swing.JLabel lblRefunds;
    private javax.swing.JLabel lblSell;
    private javax.swing.JLabel lblToP;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JTable tblListCard;
    private javax.swing.JTextField txtCusName;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEmpCode;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtMoneyGiven;
    private javax.swing.JTextField txtODList;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
