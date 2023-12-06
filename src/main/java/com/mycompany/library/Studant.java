/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library;

/**
 *
 * @author BeSsO
 */
public class Studant extends Person {
   private String major;
   public Studant() {
    }
    public Studant(int id,String name,Date1 d1,int address,String m) {
       super(id,name,d1,address);
        major = m;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    /**
     *
     * @return
     */
    @Override
    public String getInfo()
    {
        return "major:" + this.major + super.getInfo();
    } 

}


   
    
        
    

