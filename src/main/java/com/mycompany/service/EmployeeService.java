/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service;

import java.util.List;
import com.mycompany.entity.Employee;

/**
 *
 * @author haanh
 */
public interface EmployeeService {

    List<Employee> getList();

    Employee selectOne(String username, String password);

    Boolean save(Employee employee);
    
    Boolean remove(Integer id);

    Boolean modify(Employee employee);

    Employee getByUsername(String username);
    
    Employee getByEmpCode(String empCode);
    
    Employee getPersonById(Integer id);
}
