/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.dao;

import com.app.bean.Applic;
import com.app.bean.ApplicantBeans;
import com.app.bean.JobPullBean;
import java.util.ArrayList;

/**
 *
 * @author Swarnendu
 */
public interface JobPullDao {
    public ArrayList<JobPullBean>getAllJob();
    public void applyJob(Applic ap);
    public void addJob(JobPullBean jb);
    public int delJob(int jid);
    public ArrayList<Applic>getAllCan();
}
