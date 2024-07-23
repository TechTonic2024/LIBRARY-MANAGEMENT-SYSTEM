/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.controller;

import edu.ijse.dto.MemberDto;
import edu.ijse.service.ServiceFactory;
import edu.ijse.service.custom.MemberService;

import java.util.ArrayList;

/**
 *
 * @author HP Elitebook
 */
public class memberController {

    private MemberService memberService = (MemberService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.MEMBER);
    
    public String save(MemberDto memberDto) throws Exception{
    
        return null;
    }
    
    public String update(MemberDto memberDto) throws Exception{
    
        return null;
    }
    
    public String delete(String memberID) throws Exception{
    
        return null;
        
    }
    
    public ArrayList<MemberDto> getAll() throws Exception{
    
        return null;
    }
    
    public MemberDto get(String memberID) throws Exception{
    
        return null;
    }
            
}
