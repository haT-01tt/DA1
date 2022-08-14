/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reopsitory;

import java.util.List;
import com.mycompany.entity.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.mycompany.utils.HibernateUtil;
import com.mycompany.utils.SQLCommand;
import javax.persistence.TypedQuery;

/**
 *
 * @author haanh
 */
public class EmployeeRepo {

    Session session = HibernateUtil.getFACTORY().openSession();
    public List<Employee> getAll() {
        Query q = session.createQuery(SQLCommand.FIND_ALL_EMPLOYEE);
        List<Employee> list = q.getResultList();
        return list;
    }
    public Employee selectOne(String username,String password){
        Query<Employee> queryLogin = session.createQuery(SQLCommand.ACCOUNT_LOGIN);
        queryLogin.setParameter(0, username);
        queryLogin.setParameter(1, password);
        
       return queryLogin.getSingleResult();
    }
    
    public List<Object[]> getAllAcount(){
        List<Object[]> listRs = session.createQuery(SQLCommand.FIND_ALL_ACCOUNT).list();
        return listRs;
    }
    public Employee getByUsername(String username){
        TypedQuery<Employee> q = session.createQuery(SQLCommand.getByUsername, Employee.class);
        q.setParameter("username", username);
        return q.getSingleResult();
    }
    public Employee getByEmpCode(String empCode){
        TypedQuery<Employee> t = session.createQuery(SQLCommand.getByCodeEmployee,Employee.class);
        t.setParameter("empCode", empCode);
        return t.getSingleResult();
    }

    public Employee getEmpById(Integer id) {
        Transaction transaction = null;
        Employee person = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();

            person = session.get(Employee.class, id);

            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }

        }
        return person;
    }

    public Boolean save(Employee employee) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();

            session.save(employee);

            transaction.commit();

            return true;
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return false;
    }

    public Boolean remove(Integer id) {
        Transaction transaction = null;
        Employee employee = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();

            employee = session.get(Employee.class, id);
            session.delete(employee);
            
            transaction.commit();

            return true;
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return false;
    }

    public Boolean update(Employee employee) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();

            session.saveOrUpdate(employee);

            transaction.commit();

            return true;
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return false;
    }
}
