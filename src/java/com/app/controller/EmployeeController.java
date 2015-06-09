/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Swarnendu
 */

@Controller
public class EmployeeController {
    
    
    @RequestMapping(value = "/empMenu",method = RequestMethod.GET )
    public String callEmpMenu(){
        return "empMenu";
    }
}
