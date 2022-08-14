/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reopsitory;

import com.mycompany.entity.Customer;
import com.mycompany.entity.Employee;
import com.mycompany.utils.HibernateUtil;
import com.mycompany.utils.SQLCommand;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author haanh
 */
public class CustomerRepo {

    Session session = HibernateUtil.getFACTORY().openSession();

    public List<Customer> getAll() {
        Query q = session.createQuery(SQLCommand.FIND_ALL_CUSTOMER);
        List<Customer> list = q.getResultList();
        return list;
    }

    public Customer getByCusCode(String cusCode) {
        TypedQuery<Customer> t = session.createQuery(SQLCommand.getByCusCode, Customer.class);
        t.setParameter("cusCode", cusCode);
        return t.getSingleResult();
    }
    public Customer getPhoneNumber(String phoneNumber) {
        TypedQuery<Customer> t = session.createQuery(SQLCommand.getByPhoneNumber, Customer.class);
        t.setParameter("phoneNumber", phoneNumber);
        return t.getSingleResult();
       
    }

    public Customer getCusById(Integer id) {
        Transaction transaction = null;
        Customer customer = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();

            customer = session.get(Customer.class, id);

            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }

        }
        return customer;
    }

    public Integer save(Customer customer) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();

           Integer res = (Integer)session.save(customer);

            transaction.commit();

            return res;
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return -1;
    }

    public Boolean delete(Integer id) {
        Transaction transaction = null;
        Customer customer = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();

            customer = session.get(Customer.class, id);
            session.delete(customer);

            transaction.commit();

            return true;
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return false;
    }

    public Boolean update(Customer customer) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();

            session.saveOrUpdate(customer);

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
