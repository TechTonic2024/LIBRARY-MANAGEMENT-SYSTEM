/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao.custom;

import edu.ijse.dao.CrudUtil;
import edu.ijse.entity.MemberEntity;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author HP Elitebook
 */
public class MemberDaoImpl implements MemberDao {

    @Override
    public String save(MemberEntity entity) throws Exception {
        boolean isSaved = CrudUtil.executeUpdate("INSERT INTO item VALUES(?,?,?,?,?,?)", entity.getMemberID(), 
            entity.getMemberFirstName(), entity.getMemberLastName(), entity.getEmail(), entity.getPhoneNumber(), 
            entity.getAddress());

        return isSaved ? "Success" : "Fail";
    }

    @Override
    public String update(MemberEntity entity) throws Exception {
        boolean isUpdated = CrudUtil.executeUpdate("UPDATE member SET FirstName=?, LastName=?, Email=?, PNumber=?, Address=? WHERE MemberID=?", 
            entity.getMemberFirstName(), entity.getMemberLastName(), entity.getEmail(), entity.getPhoneNumber(),
            entity.getAddress(), entity.getMemberID());

        return isUpdated ? "Success" : "Fail";

    }

    @Override
    public String delete(String id) throws Exception {
        boolean isDeleted = CrudUtil.executeUpdate("DELETE FROM member WHERE MemberID =?", id);
        return isDeleted ? "Success" : "Fail";
    }

    @Override
    public MemberEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Member WHERE MemberID =?", id);
        if (rst.next()) {
            return new MemberEntity(rst.getString("MemberID"), rst.getString("FirstName"), rst.getString("LastName"),
            rst.getString("email"), rst.getInt("PNumber"), rst.getString("Address"));
        }
        return null;
    }

    @Override
    public ArrayList<MemberEntity> getAll() throws Exception {
         ArrayList<MemberEntity> memberEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Member");
        while (rst.next()) {
            MemberEntity entity = new MemberEntity (rst.getString("MemberID"), rst.getString("FirstName"), rst.getString("LastName"),
                rst.getString("email"), rst.getInt("PNumber"), rst.getString("Address"));
        
            memberEntities.add(entity);
        }

        return memberEntities;
    }

    
}
