/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utils;

import com.mycompany.entity.Role;
import com.mycompany.entity.Employee;
import com.mycompany.entity.Product;
import com.mycompany.entity.OrderDetail;
import com.mycompany.entity.Promotion;
import com.mycompany.entity.Category;
import com.mycompany.entity.Order;
import com.mycompany.entity.Customer;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author haanh
 */
public class HibernateUtil {

    private static final SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();

        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName=ShStore");
        properties.put(Environment.USER, "tuanha");
        properties.put(Environment.PASS, "123");
        properties.put(Environment.SHOW_SQL, "true");

        conf.setProperties(properties);
        conf.addAnnotatedClass(Customer.class);
        conf.addAnnotatedClass(Category.class);
        conf.addAnnotatedClass(Order.class);
        conf.addAnnotatedClass(OrderDetail.class);
        conf.addAnnotatedClass(Employee.class);
        conf.addAnnotatedClass(Product.class);
        conf.addAnnotatedClass(Promotion.class);
        conf.addAnnotatedClass(Role.class);

        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(registry);

    }

    public static SessionFactory getFACTORY() {
        return FACTORY;
    }
}
