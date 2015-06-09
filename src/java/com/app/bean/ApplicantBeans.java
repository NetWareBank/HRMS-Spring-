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
public class ApplicantBeans {

    private int aid;
    private String name;
    private String email;
    private String totex;
    private String desc;
    private String filename;
    private byte[] filedata;
    private int applyfor;
    private int phno;
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

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public byte[] getFiledata() {
        return filedata;
    }

    public void setFiledata(byte[] filedata) {
        this.filedata = filedata;
    }

    public int getApplyfor() {
        return applyfor;
    }

    public void setApplyfor(int applyfor) {
        this.applyfor = applyfor;
    }

    public int getPhno() {
        return phno;
    }

    public void setPhno(int phno) {
        this.phno = phno;
    }
}
