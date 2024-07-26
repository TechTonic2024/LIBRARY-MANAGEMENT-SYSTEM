/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.entity;

/**
 *
 * @author HP Elitebook
 */
public class MemberEntity {
    
    private String memberID;
    private String memberFirstName;
    private String memberLastName;
    private String email;
    private Integer phoneNumber;
    private String Address;

    public MemberEntity() {
    }

    public MemberEntity(String memberID, String memberFirstName, String memberLastName, String email, Integer phoneNumber, String Address) {
        this.memberID = memberID;
        this.memberFirstName = memberFirstName;
        this.memberLastName = memberLastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.Address = Address;
    }

    /**
     * @return the memberID
     */
    public String getMemberID() {
        return memberID;
    }

    /**
     * @param memberID the memberID to set
     */
    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    /**
     * @return the memberFirstName
     */
    public String getMemberFirstName() {
        return memberFirstName;
    }

    /**
     * @param memberFirstName the memberFirstName to set
     */
    public void setMemberFirstName(String memberFirstName) {
        this.memberFirstName = memberFirstName;
    }

    /**
     * @return the memberLastName
     */
    public String getMemberLastName() {
        return memberLastName;
    }

    /**
     * @param memberLastName the memberLastName to set
     */
    public void setMemberLastName(String memberLastName) {
        this.memberLastName = memberLastName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phoneNumber
     */
    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    @Override
    public String toString() {
        return "MemberEntity{" + "memberID=" + memberID + ", memberFirstName=" + memberFirstName + ", memberLastName=" + memberLastName + ", email=" + email + ", phoneNumber=" + phoneNumber + ", Address=" + Address + '}';
    }
    
    

}
