/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.service;

import com.app.bean.BlockBean;
import com.app.bean.DistrictBean;
import java.util.ArrayList;

/**
 *
 * @author Tukai
 */
public interface SocityService {
    //SOCITY SERVICE 
       public ArrayList<DistrictBean>getAllDists();
    
    public void addDist(DistrictBean db);
    public int delDist(int jid);
    
      public ArrayList<BlockBean>getAllblockss();
    
    public void addBlock(BlockBean bb);
    public int delBlock(int bid);
}
