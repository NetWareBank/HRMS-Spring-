/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bean;

/**
 *
 * @author Tukai
 */
public class BlockBean {
    private int block_id;
    private String block_name;
    private String district_name;

    /**
     * @return the block_id
     */
    public int getBlock_id() {
        return block_id;
    }

    /**
     * @param block_id the block_id to set
     */
    public void setBlock_id(int block_id) {
        this.block_id = block_id;
    }

    /**
     * @return the block_name
     */
    public String getBlock_name() {
        return block_name;
    }

    /**
     * @param block_name the block_name to set
     */
    public void setBlock_name(String block_name) {
        this.block_name = block_name;
    }

    /**
     * @return the district_name
     */
    public String getDistrict_name() {
        return district_name;
    }

    /**
     * @param district_name the district_name to set
     */
    public void setDistrict_name(String district_name) {
        this.district_name = district_name;
    }
    
}
