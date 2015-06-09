/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.dao;

import com.app.bean.BlockBean;
import com.app.bean.DistrictBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Tukai
 */

@Repository("dist")
public class SocityDaoImpl  implements SocityDao{
      @Autowired
    private JdbcTemplate jdbc;

    public ArrayList<DistrictBean> getAllDist() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
         return (ArrayList< DistrictBean>) jdbc.query("SELECT dist_name FROM district ", new ResultSetExtractor<ArrayList<DistrictBean>>() {

            public ArrayList<DistrictBean> extractData(ResultSet rs) throws SQLException, DataAccessException {
                ArrayList<DistrictBean> district = new ArrayList<DistrictBean>();
                while (rs.next()) {
                    DistrictBean dis = new DistrictBean();
                    dis.setDist_name(rs.getString("dist_name"));
                    System.out.println("DIST:"+dis.getDist_name());
                   
                    district.add(dis);
                  
                }
                return district;
            }

        });
    }

    public void addDist( final DistrictBean db) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           String Quary = "insert into hrms.district (dist_name) values(?)";
        jdbc.execute(Quary, new PreparedStatementCallback<Boolean>() {

            public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                ps.setString(1, db.getDist_name());
               
                return ps.execute();
            }
        });
    }

    public int delDist(int jid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<BlockBean> getAllBlock() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addBlock(final BlockBean bb) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
             String Quary = "insert into hrms.block (block_name,district_name) values(?,?)";
        jdbc.execute(Quary, new PreparedStatementCallback<Boolean>() {

            public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                ps.setString(1, bb.getBlock_name());
                ps.setString(2, bb.getDistrict_name());
                
               
                return ps.execute();
            }
        });
    }

    public void addBlock(DistrictBean bb) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int delBlock(int bid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
   
    
}
