/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import com.app.bean.BlockBean;
import com.app.bean.DistrictBean;
import com.app.service.SocityService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Tukai
 */
@Controller
public class SocityController {
 @Autowired
 private SocityService socityservice;
 
 
 
 
         
  @RequestMapping(value ="/dBMenu", method = RequestMethod.GET)   
  public String dbmenu(Model m){
      
      return "dBMenu";
  }
  
  
  @RequestMapping(value = "/hraddDist",method = RequestMethod.GET)
    public String hrAddDist(Model m){
        
        return"postdist";
    }
    
    @RequestMapping(value = "/hrdistform",method = RequestMethod.POST)
    public String  addStatebyHr(@ModelAttribute("district")DistrictBean db, BindingResult result, Model m ){
       socityservice.addDist(db);
       
       
        m.addAttribute( "msg","DISTRICT ADDED");
        return "postdist2";
        
    }
    
    
@RequestMapping(value = "/hraddBlock",method = RequestMethod.GET)
    public String hrAddBlock(Model m){
        ArrayList<DistrictBean> lst= socityservice.getAllDists();
        m.addAttribute("lst", lst);
        return"postblock";
    }
      @RequestMapping(value = "/hrblockform",method = RequestMethod.POST)
    public String  addStatebyHr(@ModelAttribute("block")BlockBean bb, BindingResult result, Model m ){
       socityservice.addBlock(bb);
       
        ArrayList<DistrictBean> lst= socityservice.getAllDists();
        m.addAttribute("lst", lst);
       
        m.addAttribute("msg","BLOCK ADDED");
        return "postblock";
        
    }
   
}
    
    

