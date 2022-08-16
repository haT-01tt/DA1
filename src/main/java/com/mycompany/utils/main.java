/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utils;

import com.mycompany.entity.OrderDetail;
import com.mycompany.entity.Customer;
import java.sql.SQLException;
import java.util.List;
import com.mycompany.entity.Employee;
import com.mycompany.entity.Product;
import com.mycompany.entity.Role;
import com.mycompany.reopsitory.EmployeeRepo;
import org.hibernate.Hibernate;
import com.mycompany.service.ProductService;
import com.mycompany.service.RoleService;
import com.mycompany.service.impl.EmployeeServiceImpl;
import com.mycompany.service.impl.ProductServiceImpl;
import com.mycompany.service.impl.RoleServiceImpl;
import java.util.Arrays;
import com.mycompany.service.EmployeeService;
import com.mycompany.service.*;
import com.mycompany.service.impl.CustomerServiceImpl;
import com.mycompany.service.impl.*;
import com.mycompany.service.impl.*;
import static java.lang.Integer.max;
import java.util.Random;

/**
 *
 * @author haanh
 */
public class main {

    public static void main(String[] args) throws SQLException {
//        PersonService personService = new  PersonServiceImpl();
//        Person person = new Person();
//        
//        ColorService colorService = new ColorServiceImpl(); 
//        RoleService roleService = new RoleServiceImpl();
//        
//        
//        Role role = roleService.getById(3);
//        System.out.println(role.toString());
//        
//        PersonRepo rp = new PersonRepo();
//        System.out.println(rp.getPersonById(2).toString());

//        List<Person> list = personService.getList();
//        List<Object[]> list = personService.selectOne(person);
//        if(list.isEmpty()){
//            System.out.println("Not found");
//        }else{
//           
//            list.forEach(System.out::print);
//        }
//        OrderDetailService detailService = new OrderDetailServiceImpl();
//        OrderDetail order = detailService.getById(1);
//        System.out.println(order.toString());
//        System.out.println("OD"+getSaltString());
//        EmployeeService employeeService  = new EmployeeServiceImpl();
//        CustomerService customerService = new CustomerServiceImpl();
//        String phoneNumber = "0974685444";
//        Customer cus = customerService.getPhoneNumber(phoneNumber);
//        System.out.println(cus);
//        if(cus == null){
//            System.out.println("Khong ton tai ");
//        }else{
//            System.out.println(cus);
//        }
//        ProductService productService = new ProductServiceImpl();
        //        Integer id = 1;
        //        String phoneNumber = "0974685332";
        ////        Employee employee = employeeService.getByEmpCode(phoneNumber);
        //        Customer customer = customerService.getPhoneNumber(phoneNumber);
        //        Product product = productService.getProById(id);
        //        System.out.println(product.toString());
        //        ColorService colorService = new ColorServiceImpl();
        //        Color color = colorService.getColorByProduct(1);
        //        System.out.println(color.toString());
        //        System.out.println(HibernateUtil.getFACTORY());
        //        Product product = new Product();
        //        String productCode = 
        //        List<Object[]> list = productService.getAllByCode(product);
        //
        //        list.forEach(System.out::print);
//        String proCode = "PRO01";
//        Product product = productService.getAllByCode(proCode);
//        System.out.println(product.toString());
        Random random = new Random();
        int x = random.nextInt(10000);
        System.out.println(x);
    }

}
