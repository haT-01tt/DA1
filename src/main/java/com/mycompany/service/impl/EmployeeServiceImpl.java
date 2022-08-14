/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import java.util.List;
import com.mycompany.entity.Employee;
import com.mycompany.reopsitory.EmployeeRepo;
import com.mycompany.service.EmployeeService;

/**
 *
 * @author haanh
 */
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepo personRepo = new EmployeeRepo();

    @Override
    public List<Employee> getList() {
        return personRepo.getAll();
    }

    @Override
    public Employee selectOne(String username, String password) {
        return personRepo.selectOne(username, password);
    }

    @Override
    public Boolean save(Employee person) {
        return personRepo.save(person);
    }

    @Override
    public Employee getByUsername(String username) {
        return personRepo.getByUsername(username);
    }

    @Override
    public Employee getByEmpCode(String empCode) {
        return personRepo.getByEmpCode(empCode);
    }

    @Override
    public Boolean modify(Employee employee) {
        return personRepo.update(employee);
    }

    @Override
    public Boolean remove(Integer id) {
        Employee employee = this.getPersonById(id);

        if (employee != null) {
            employee.setAvaliable(false);
            this.modify(employee);
            return true;
        }
        return false;
    }

    @Override
    public Employee getPersonById(Integer id) {
        return personRepo.getEmpById(id);
    }

}
