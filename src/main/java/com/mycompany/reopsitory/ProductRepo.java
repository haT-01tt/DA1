/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reopsitory;

import com.mycompany.entity.Customer;
import com.mycompany.entity.Product;
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
public class ProductRepo {

    Session session = HibernateUtil.getFACTORY().openSession();

    public List<Object[]> getAll() {
        Query query = session.createQuery(SQLCommand.FIND_ALL_PRODUCT);
        List<Object[]> list = query.getResultList();
        return list;
    }

    public Product getByProductCode(String productCode) {
        TypedQuery<Product> t = session.createQuery(SQLCommand.getByProductCode, Product.class);
        t.setParameter("productCode", productCode);
        return t.getSingleResult();
    }

    public List<Object[]> getAllByCode(String productCode) {
        Query query = session.createQuery(SQLCommand.FIND_ALL_BY_PRODUCTCODE);
        query.setParameter("productCode", productCode);
        List<Object[]> list = query.getResultList();
        return list;
    }
//    public Product getAllByCode(String productCode) {
//        TypedQuery<Product> t = session.createQuery(SQLCommand.getByProductCode, Product.class);
//        t.setParameter("productCode", productCode);
//        return t.getSingleResult();
//    }

    public Product getColorByProduct(Integer id) {
        TypedQuery<Product> t = session.createQuery(SQLCommand.FIND_BY_PRODUCT_ID, Product.class);
        t.setParameter("id", id);
        return t.getSingleResult();
    }
//     public Product getByColorName(String colorName) {
//        TypedQuery<Product> t = session.createQuery(SQLCommand.getByColorName, Color.class);
//        t.setParameter("colorName", colorName);
//        return t.getSingleResult();
//    }

    public Product getOById(Integer id) {
        Transaction transaction = null;
        Product product = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();

            product = session.get(Product.class, id);

            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }

        }
        return product;
    }

    public Boolean save(Product product) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();

            session.save(product);

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
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();

            session.delete(id);

            transaction.commit();
            return true;
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return false;
    }

    public Boolean update(Product product) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();

            session.saveOrUpdate(product);

            transaction.commit();

            return true;
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return false;
    }

    public Product getProById(Integer id) {
        Transaction transaction = null;
        Product product = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();

            product = session.get(Product.class, id);

            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }

        }
        return product;
    }
}
