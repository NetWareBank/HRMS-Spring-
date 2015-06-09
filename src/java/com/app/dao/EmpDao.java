/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.dao;

import com.app.bean.DepertMent;
import com.app.bean.Emoloyee;
import java.util.ArrayList;

/**
 *
 * @author Swarnendu
 */

/**
 * 
 * this is use to add employee management
 */
public interface EmpDao {
    
    // ALL DAO'S FOR EMP CRUD OPARATION
    public ArrayList<Emoloyee>viewAllEmp();
    public void addEmp(Emoloyee emp);
    public void delEmp(int eid);
    public void editEmp(Emoloyee emp);
    
    //ALL DAO'S FOR DEPT CRUD OPARATION
    
    public ArrayList<DepertMent>viewAllDep();
    public void addDep(DepertMent dep);
    public void editDep(DepertMent dep);
    public void delDep(int did);
}
