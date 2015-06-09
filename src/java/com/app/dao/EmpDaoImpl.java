/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.dao;

import com.app.bean.DepertMent;
import com.app.bean.Emoloyee;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Swarnendu
 */
@Repository("empdao")
public class EmpDaoImpl implements EmpDao {

    @Autowired
    private JdbcTemplate jdbc;
    private Emoloyee emp;
    private DepertMent dep;
    
    
    /*
      
    */

    public ArrayList<Emoloyee> viewAllEmp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    }
    
      /*
      the above method is use to display all the employe listed 
    */

    public void addEmp(Emoloyee emp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
      /*
      the above code is use to add employee 
    */ 

    public void delEmp(int eid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void editEmp(Emoloyee emp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
      /*
        ALL DEPTERMENT WISE DAO IMPLEMENTING HERE 
    */
    
    
    public ArrayList<DepertMent> viewAllDep() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

      /*
       the above class is use to add depertment 
    */
    
    public void addDep(DepertMent dep) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void editDep(DepertMent dep) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delDep(int did) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
