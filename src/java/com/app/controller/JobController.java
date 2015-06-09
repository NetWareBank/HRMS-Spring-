/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import com.app.bean.Applic;
import com.app.bean.JobPullBean;
import com.app.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Swarnendu
 */

@Controller
public class JobController {

   @Autowired
   private  JobService jobservic ;
    @RequestMapping (value = "/jobLst", method = RequestMethod.GET)
    public String getAllJob(Model  m){
       m.addAttribute("jobs",jobservic.getAlljobs());
       return "allJobs";
    }
    
    @RequestMapping (value = "/applyJob", method = RequestMethod.GET)
    public String fillJob(@RequestParam(value = "jid")int jid, Model m){
        m.addAttribute("jobid",jid);
        return "filljob";
    }
    
    
    @RequestMapping(value = "/apply", method = RequestMethod.POST)
            public String applyForJob(@ModelAttribute(value = "applicant")Applic ap,BindingResult result ,Model m){
               jobservic.applyjob(ap);
               m.addAttribute("msg","THANX FOR APPLY");
               m.addAttribute("jid",ap.getApplyfor());
               return"filljob";
              //return "redirect:applyJob.nw?jid="+ap.getApplyfor();
            }
            
            
            
    @RequestMapping (value = "/hraddJob", method = RequestMethod.GET)
    public String fillJob(Model m){
        
        return "postjob";
    }
    
            
            
    @RequestMapping(value = "/hrJobPost",method = RequestMethod.POST)
    public String hrJobPost(@ModelAttribute (value = "jobpull")JobPullBean jp,BindingResult result,Model m){
        jobservic.jobpost(jp);
        String msg = "JOB POSTED";
         m.addAttribute("msg",msg);
        return"postjob";
    }
    
    
    
     @RequestMapping (value = "/hrjobLst", method = RequestMethod.GET)
    public String allJobHr(Model m){
         m.addAttribute("jobs",jobservic.getAlljobs());
       
        return "hrjobLst";
    }
    
            
     @RequestMapping (value = "/candiList", method = RequestMethod.GET)
    public String getAllCandi(Model  m){
       m.addAttribute("jobs",jobservic.getAllCandi());
       return "allCandi";
    }       
            
    
}