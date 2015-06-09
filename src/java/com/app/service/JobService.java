/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.service;

import com.app.bean.Applic;
import com.app.bean.JobPullBean;
import java.util.ArrayList;

/**
 *
 * @author Swarnendu
 */
/**
 * THIS IS THE SERVICE INTERFACE FOR JOBPULL ALL THE MODULE ARE DECLARE HERE AS
 * AABSTRACT
 * 
*/
public interface JobService {

    public ArrayList<JobPullBean> getAlljobs();

    public void applyjob(Applic ap);

    public void jobpost(JobPullBean jp);

    public void jobDel(int id);

    public ArrayList<Applic> getAllCandi();
}
