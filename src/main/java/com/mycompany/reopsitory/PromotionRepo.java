/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reopsitory;

import com.mycompany.entity.Promotion;
import com.mycompany.utils.HibernateUtil;
import com.mycompany.utils.SQLCommand;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author haanh
 */
public class PromotionRepo {

    Session session = HibernateUtil.getFACTORY().openSession();

    public Promotion getByPromoCode(String promoCode) {
        TypedQuery<Promotion> t = session.createQuery(SQLCommand.getByPromoCode, Promotion.class);
        t.setParameter("promoCode", promoCode);
        return t.getSingleResult();
    }
   

    public List<Promotion> getAll() {
        Query q = session.createQuery(SQLCommand.FIND_ALL_PROMOTION);// truy vấn trên entity(HQL)
        List<Promotion> list = q.getResultList();
        return list;
    }

    public Boolean save(Promotion promotion) {
        Transaction tran = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            tran = session.beginTransaction();
            session.save(promotion);
            tran.commit();
            return true;
        } catch (Exception e) {
            if (tran != null) {
                tran.rollback();
            }
        }
        return false;
    }

    public Boolean update(Promotion promotion) {
        Transaction tran = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            tran = session.beginTransaction();
            session.update(promotion);
            tran.commit();
            return true;
        } catch (Exception e) {
            if (tran != null) {
                tran.rollback();
            }
        }
        return false;
    }

    public Boolean delete(Integer id) {
        Transaction transaction = null;
        Promotion promotion = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();

//            promotion = session.get(Promotion.class, id);
            session.delete(promotion);

            transaction.commit();

            return true;
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return false;
    }
    public Boolean delete1(Promotion promotion) {     
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(promotion);
            transaction.commit();
            return true;
        } catch (Exception e) {
        }
        return null;
    }
    public Promotion getProById(Integer id) {
        Transaction transaction = null;
        Promotion promotion = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();

            promotion = session.get(Promotion.class, id);

            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }

        }
        return promotion;
    }

    
}
