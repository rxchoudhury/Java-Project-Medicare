/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MedicinesupplierRole;
import Business.Role.MarketAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author quanp
 */
public class MedicineSupplierOrganization extends Organization{

    public MedicineSupplierOrganization() {
        super(Type.MedicineSupplier.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MedicinesupplierRole());
        return roles;
    }
    
}
