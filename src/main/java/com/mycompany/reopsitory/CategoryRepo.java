/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reopsitory;

import com.mycompany.entity.Category;
import com.mycompany.entity.Customer;
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
public class CategoryRepo {
    Session session = HibernateUtil.getFACTORY().openSession();
    public List<Category> getAll(){
        Query q = session.createQuery(SQLCommand.FIND_ALL_CATEGORY);
        List<Category> list = q.getResultList();
        return list;
    }
    public Category getByCateName(String name) {
        TypedQuery<Category> t = session.createQuery(SQLCommand.getByCategoryName, Category.class);
        t.setParameter("name", name);
        return t.getSingleResult();
    }
    public Category getCateById(Integer id) {
        Transaction transaction = null;
        Category category = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();

            category = session.get(Category.class, id);

            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }

        }
        return category;
    }

    public Boolean save(Category category) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();

            session.save(category);

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
        Category category = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();

            category = session.get(Category.class, id);
            session.delete(category);
            
            transaction.commit();

            return true;
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return false;
    }

    public Boolean update(Category category) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();

            session.saveOrUpdate(category);

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

