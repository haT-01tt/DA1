/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reopsitory;


import com.mycompany.entity.Customer;
import com.mycompany.entity.Order;
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
public class OrderRepo {

    Session session = HibernateUtil.getFACTORY().openSession();

    public List<Order> getAll() {
        Query q = session.createQuery(SQLCommand.FIND_ALL_ORDER);
        List<Order> list = q.getResultList();
        return list;
    }
    

    public List<Object[]> getAllCustomOrder() {
        Query q = session.createQuery(SQLCommand.FIND_ALL_ORDER_CUSTOM);
        List<Object[]> list = q.getResultList();
        return list;
    }

    public Order getById(Integer id) {
        TypedQuery<Order> t = session.createQuery(SQLCommand.FIND_BY_ID_ORDER, Order.class);
        t.setParameter("id", id);
        return t.getSingleResult();
    }

    public Boolean update(Order order) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();

            session.saveOrUpdate(order);

            transaction.commit();

            return true;
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return false;
    }

    public Boolean delete(Integer id) {
        Transaction transaction = null;
        Order order = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();

            order = session.get(Order.class, id);
            session.delete(order);

            transaction.commit();

            return true;
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return false;
    }
     public Integer save(Order order) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();

            Integer res = (Integer)session.save(order);

            transaction.commit();

            return res;
        } catch (Exception ex) {
            ex.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return -1;
    }
}
