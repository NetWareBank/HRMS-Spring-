/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.service;

import com.app.bean.Applic;
import com.app.bean.JobPullBean;
import com.app.dao.JobPullDao;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Swarnendu
 */

/**
 * THIS CLASS IS IMPLEMENTIONG ALL SERVICE ABSTRACT METHOD 
 * 
 * 
 */

@Service("jobservice")
public class JobServiceImpl implements JobService{

    @Autowired
    private JobPullDao jobdao ;
    public ArrayList<JobPullBean> getAlljobs() {
        ArrayList<JobPullBean> jobs = jobdao.getAllJob();
        return jobs;
    }

    
    
    public void applyjob(Applic ap) {
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    jobdao.applyJob(ap);
    }

    
    public void jobpost(JobPullBean jp) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       jobdao.addJob(jp);
    
    }

    public void jobDel(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Applic> getAllCandi() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
     
        ArrayList<Applic> jobs = jobdao.getAllCan();
        return jobs;
    }
   
}
