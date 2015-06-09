/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bean;

/**
 *
 * @author Swarnendu
 */
public class Applic {
   private int aid;
    private String name;
    private String email;
    private String totex;
    private String desc;
    private int applyfor;
    private Number phno; 

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }
    private String jobname;
public Applic(){
    
}
    public Applic(int aid, String name, String email, String totex, String desc, int applyfor, int phno) {
        this.aid = aid;
        this.name = name;
        this.email = email;
        this.totex = totex;
        this.desc = desc;
        this.applyfor = applyfor;
        this.phno = phno;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTotex() {
        return totex;
    }

    public void setTotex(String totex) {
        this.totex = totex;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getApplyfor() {
        return applyfor;
    }

    public void setApplyfor(int applyfor) {
        this.applyfor = applyfor;
    }

    public Number getPhno() {
        return phno;
    }

    public void setPhno( Number phno) {
        this.phno = phno;
    }
}
