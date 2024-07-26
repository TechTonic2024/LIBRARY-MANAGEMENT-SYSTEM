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
    
        return memberService.save(memberDto);
    }
    
    public String update(MemberDto memberDto) throws Exception{
    
        return memberService.update(memberDto);
    }
    
    public String delete(String memberID) throws Exception{
    
        return memberService.delete(memberID);
        
    }
    
    public ArrayList<MemberDto> getAll() throws Exception{
    
        return memberService.getAll();
    }
    
    public MemberDto get(String memberID) throws Exception{
    
        return memberService.get(memberID);
    }
            
}
