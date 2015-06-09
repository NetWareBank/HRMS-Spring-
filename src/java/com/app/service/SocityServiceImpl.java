/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.service;

import com.app.bean.BlockBean;
import com.app.bean.DistrictBean;
import com.app.dao.SocityDao;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tukai
 */
@Service("distservice")

public class SocityServiceImpl implements SocityService{
    @Autowired
    private SocityDao socity;

    public ArrayList<DistrictBean> getAllDists() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          ArrayList<DistrictBean> districts = socity.getAllDist();
          for (DistrictBean item : districts) {
    System.out.println("ITEM DIST:"+item.getDist_name());
}
        return districts;
    }

    public void addDist(DistrictBean db) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        socity.addDist(db);
        
    }

    public int delDist(int jid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<BlockBean> getAllblockss() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addBlock(BlockBean bb) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        socity.addBlock(bb);
        
        
    }

    public int delBlock(int bid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
