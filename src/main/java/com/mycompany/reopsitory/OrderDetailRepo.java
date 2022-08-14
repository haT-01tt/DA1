/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reopsitory;

import com.mycompany.entity.Order;
import com.mycompany.entity.OrderDetail;
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
public class OrderDetailRepo {
    Session session = HibernateUtil.getFACTORY().openSession();
    public List<OrderDetail> getAll(String orderCode){
        Query q = session.createQuery(SQLCommand.FIND_ALL_ORDERDETAIL);
        q.setParameter("orderCode", orderCode);
        List<OrderDetail> list = q.getResultList();
        
        return list;
    }
    public OrderDetail getByOrderCode(String orderCode){
        TypedQuery<OrderDetail> tq = session.createQuery(SQLCommand.FIND_ALL_ORDERDETAIL_BY_ORDERCODE);
        tq.setParameter("orderCode", orderCode);
        return tq.getSingleResult();
    }
    public OrderDetail getById(Integer id) {
        TypedQuery<OrderDetail> t = session.createQuery(SQLCommand.FIND_BY_ID_ORDER_DETAILS, OrderDetail.class);
        t.setParameter("id", id);
        return t.getSingleResult();
    }
    public Boolean update(OrderDetail orderDetail) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();

            session.saveOrUpdate(orderDetail);

            transaction.commit();

            return true;
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return false;
    }
    public Boolean save(OrderDetail orderDetail) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();

            session.save(orderDetail);

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
