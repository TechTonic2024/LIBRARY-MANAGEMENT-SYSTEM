/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.service.custom;

import java.util.ArrayList;

import edu.ijse.dto.MemberDto;
import edu.ijse.service.SuperService;

/**
 *
 * @author HP Elitebook
 */
public interface MemberService extends SuperService{

    public String save(MemberDto memberDto) throws Exception;
    public String update(MemberDto memberDto) throws Exception;
    public String delete(String memberId) throws Exception;
    public MemberDto get(String memberID) throws Exception;
    public ArrayList<MemberDto> getAll() throws Exception;
}
