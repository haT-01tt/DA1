/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.entity.Role;
import com.mycompany.reopsitory.RoleRepo;
import com.mycompany.service.RoleService;
import com.mycompany.reopsitory.RoleRepo;

/**
 *
 * @author haanh
 */
public class RoleServiceImpl implements RoleService {

    private RoleRepo roleRepo = new RoleRepo();

    @Override
    public Role getById(Integer id) {
        return roleRepo.getById(id);
    }

}
