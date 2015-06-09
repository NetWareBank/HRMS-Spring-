/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.dao;

import com.app.bean.Applic;
import com.app.bean.ApplicantBeans;
import com.app.bean.JobPullBean;
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
 * @author Swarnendu
 */
/*
 THIS IS THE JOBPULLDAO CLASS IMPLEMENTING JOBPULLDAO .
 ALL THE ABSTRACT METHODS ARE IMPLEMENTING HERE 
 REPOSITORY "jobdao" AS AUTOWARED AND USE IN SERVICE OR CONTROLLER

 JDBC TEMPLATE IS AUTOWARED AS jdbc
 */
@Repository("jobdao")
public class JobPullDaoImpl implements JobPullDao {

    @Autowired
    private JdbcTemplate jdbc;

    /*
     THIS METHOD IS USE TO DISPLAY ALL THE ACTIVE JOB POSTED IN JOB PULL
     ITS RETURN AN ARRAYLIST OF JOBPULL OBJECT .
     */
    public ArrayList<JobPullBean> getAllJob() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (ArrayList< JobPullBean>) jdbc.query("SELECT * FROM JOBBENCH WHERE STATUS ='ACTIVE'", new ResultSetExtractor<ArrayList<JobPullBean>>() {

            public ArrayList<JobPullBean> extractData(ResultSet rs) throws SQLException, DataAccessException {
                ArrayList<JobPullBean> jobs = new ArrayList<JobPullBean>();
                while (rs.next()) {
                    JobPullBean job = new JobPullBean();
                    job.setJobid(rs.getInt("jobid"));
                    job.setJobdesc(rs.getString("jdesc"));
                    job.setJname(rs.getString("jname"));
                    jobs.add(job);
                    System.out.println("RESULT :" + rs.getInt("jobid") + rs.getString("jdesc"));
                }
                return jobs;
            }

        });
    }

    /*
     This fuction is use for job module.Here the Applicant object is save. we use Spring JdbcTemplate
     to manage jdbc transaction.
     The function take input paramiter an Applicant Object Send from JobService .
     And process it .
       
     */
    public void applyJob(final Applic ap) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

//    String quary = "INSERT INTO Applicant "+"values( '"+ap.getName()+"','"+ap.getEmail()+"','"+
//            ap.getTotex()+"','"+ap.getDesc()+"','"+ap.getPhno()+"','"+ap.getApplyfor()+"')" ;
//    jdbc.execute(quary);
        String quary = "INSERT INTO Applicant(name,email,totex,jdesc,phno,applyfor) values(?,?,?,?,?,?)";
        jdbc.execute(quary, new PreparedStatementCallback<Boolean>() {

            public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                ps.setString(1, ap.getName());
                ps.setString(2, ap.getEmail());
                ps.setString(3, ap.getTotex());
                ps.setString(4, ap.getDesc());
                ps.setString(5, ap.getPhno().toString());
                ps.setString(6, Integer.toString(ap.getApplyfor()));
                return ps.execute();
            }

        });

    }

    /*
     THIS FUCTION IS USE FOR POSTING JOB IN JOBPULL. USE BY HR OR ADMIN.
     ITS TAKE JOBPULLBEAN OBJECT AS A PARAMETER . AND USING SPRING JdbcTeMplate
     THE OBJECT IS SAVED IN DB .
     */
    public void addJob(final JobPullBean jb) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String Quary = "insert into hrms.jobbench (jname,jdesc,status) values(?,?,?)";
        jdbc.execute(Quary, new PreparedStatementCallback<Boolean>() {

            public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                ps.setString(1, jb.getJname());
                ps.setString(2, jb.getJobdesc());
                ps.setString(3, jb.getJobStatus());
                return ps.execute();
            }
        });

    }

    public int delJob(int jid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Applic> getAllCan() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        return (ArrayList<Applic>) jdbc.query("select appid,name,email,totex,phno,jname from applicant Left join  jobbench on applicant.applyfor=jobbench.jobid;", new ResultSetExtractor<ArrayList<Applic>>() {

            public ArrayList<Applic> extractData(ResultSet rs) throws SQLException, DataAccessException {
                ArrayList<Applic> jobs = new ArrayList<Applic>();
                while (rs.next()) {
                    Applic job = new Applic();
                    job.setAid(Integer.parseInt(rs.getString("appid")));
                    job.setName(rs.getString("name"));
                    job.setEmail(rs.getString("email"));
                    job.setTotex(rs.getString("totex"));
                    job.setPhno(rs.getDouble("phno"));
                    job.setJobname(rs.getString("jname"));
                    jobs.add(job);
                    System.out.println("RESULT :" + rs.getString("jname") +" APPID:" +rs.getString("appid"));
                }
                return jobs;
            }

        });
    }

}
