/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utils;

/**
 *
 * @author haanh
 */
public class SQLCommand {

    public static String FIND_ALL_EMPLOYEE
            = "SELECT e FROM Employee e";

    public static String FIND_ALL_CUSTOMER
            = "SELECT c FROM Customer c WHERE c.avai = true";

    public static String ACCOUNT_LOGIN
            = "SELECT p.username,p.password FROM Person p WHERE p.username =? AND p.password =?";

    public static String getByUsername
            = "SELECT e FROM Employee e WHERE e.username = :username ";

    public static String getByCategoryName
            = "SELECT c FROM Category c WHERE c.name = :name AND c.available = true";

    public static String getByCodeEmployee
            = "SELECT e FROM Employee e WHERE e.empCode = :empCode AND e.avaliable = true";

    public static String getByPromoCode
            = "SELECT p FROM Promotion p WHERE p.promoCode= :promoCode";

    public static String getByCusCode
            = "SELECT c FROM Customer c WHERE c.cusCode = :cusCode AND c.avai = true";

    public static String getByPhoneNumber
            = "SELECT c FROM Customer c WHERE c.phoneNumber = :phoneNumber AND c.avai = true";

    public static String FIND_ALL_CATEGORY
            = "SELECT c FROM Category c WHERE c.available = true";

//     public static String getByColorName =
//             "SELECT c FROM Color c WHERE c.colorName = :colorName";
    public static String FIND_ALL_ORDER
            = "SELECT o FROM Order o";

    public static String FIND_BY_ID_ORDER
            = "SELECT o FROM Order o WHERE o.id = :id";

    public static String FIND_BY_ID_ORDER_DETAILS
            = "SELECT od FROM OrderDetail od WHERE od.id = :id";

    public static String FIND_ALL_ORDER_CUSTOM
            = "SELECT o.id, o.orderCode, o.employee.fullName, o.customer.fullName,  o.createDate, SUM(d.price * d.quantity), o.status ,count(o.id)"
            + "FROM Order o INNER JOIN OrderDetail d ON o.id = d.order.id "
            + "GROUP BY o.id, o.employee.fullName, o.customer.fullName, o.orderCode, o.createDate, o.status";

    public static String FIND_ALL_ORDER_CUSTOM_DATE
            = "SELECT o.id, o.orderCode, o.employee.fullName, o.customer.fullName,  o.createDate, SUM(d.price * d.quantity), o.status ,count(o.id)"
            + "FROM Order o INNER JOIN OrderDetail d ON o.id = d.order.id "
            + "GROUP BY o.id, o.employee.fullName, o.customer.fullName, o.orderCode, o.createDate, o.status"
            + "HAVING o.createDate LIKE ?";

    public static String FIND_ALL_PRODUCT
            = "SELECT p.id,p.productCode,p.name,p.createDate,p.colorName,"
            + "p.size,p.promotion.promoCode,p.category.name,p.quantity,p.price,"
            + "p.description,p.valiable,p.image, p.promotion.discount"
            + " FROM Product p WHERE p.valiable = true";

    public static String FIND_ALL_ORDERDETAIL_BY_ORDERCODE
            = "SELECT od FROM OrderDetail od WHERE od.order.orderCode = :orderCode AND od.product.valiable = true";

    public static String FIND_ALL_ORDERDETAIL
            = "SELECT od FROM OrderDetail od WHERE od.order.orderCode = :orderCode AND od.product.valiable = true";

    public static String FIND_ALL_ACCOUNT
            = "SELECT p.username,p.password,p.firstName,p.lastName,p.email FROM Person p";

    public static String FIND_ALL_PROMOTION
            = "SELECT pr FROM Promotion pr";

    public static String FIND_ROLEID
            = "SELECT r FROM Role r WHERE r.id = :id";

    public static String FIND_BY_PRODUCT_ID
            = "SELECT p FROM Product WHERE p.id = :id";

    public static String getByProductCode
            = "SELECT p FROM Product p WHERE p.valiable = true AND p.productCode = :productCode";

    public static String FIND_ALL_BY_PRODUCTCODE
            = "SELECT p.id,p.productCode,p.name,p.createDate,p.colorName,"
            + "p.size,p.promotion.promoCode,p.category.name,p.quantity,p.price,"
            + "p.description,p.valiable,p.image, p.promotion.discount"
            + " FROM Product p WHERE p.valiable = true AND p.productCode = :productCode";
}
