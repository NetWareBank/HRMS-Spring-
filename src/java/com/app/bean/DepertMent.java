/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bean;

import org.springframework.stereotype.Component;

/**
 *
 * @author Swarnendu
 */

@Component("dep")
public class DepertMent {

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
    private int did;
    private String dname;
    
}
