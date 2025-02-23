/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.BankingFinance.BankingFinanceJPanel;


/**
 *
 * @author quanp
 */
public class BankingRole extends Role {
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        //return new FarmerWorkAreaJPanel(userProcessContainer, account, (FarmerOrganization)organization, enterprise,business);
        return new BankingFinanceJPanel(userProcessContainer, account, organization, enterprise, business);
        
    }
     @Override
    public String toString(){
        return RoleType.BankingRole.getValue();
    }
     
    
}
