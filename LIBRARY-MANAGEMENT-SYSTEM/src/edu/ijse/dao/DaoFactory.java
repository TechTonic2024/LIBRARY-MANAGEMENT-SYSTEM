/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao;

import edu.ijse.dao.custom.MemberDaoImpl;

/**
 *
 * @author HP Elitebook
 */
public class DaoFactory {
    
    private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }
    
    public SuperDao getDao(DaoTypes daoType){
    
        switch (daoType){
        
            case MEMBER:
                return new MemberDaoImpl();
                
            default:
                return null;
        
        } 
    }
    
    public enum DaoTypes{
        
        MEMBER, BOOK_CATEGORY, BOOK, BARROWINGS, RETURNS
        
    }
    
}
