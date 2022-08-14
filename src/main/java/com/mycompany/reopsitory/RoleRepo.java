/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reopsitory;

import com.mycompany.entity.Employee;
import com.mycompany.entity.Role;
import com.mycompany.utils.HibernateUtil;
import com.mycompany.utils.SQLCommand;
import javax.persistence.TypedQuery;
import org.hibernate.Session;

/**
 *
 * @author haanh
 */
public class RoleRepo {
    Session session = HibernateUtil.getFACTORY().openSession();
    public Role getById(Integer id){
        TypedQuery<Role> q = session.createQuery(SQLCommand.FIND_ROLEID, Role.class);
        q.setParameter("id", id);
        return q.getSingleResult();
    }
}
