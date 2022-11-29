/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_a_3111;

/**
 *
 * @author divap
 */
public class SalariedEmployee_3111 extends Employee_3111{

   

    
    public SalariedEmployee_3111(){
        
    }
    
    public void TampilData(){
        System.out.println("Salaried Employee");
        Tampil();
        System.out.println("Total Gaji: " + GajiPokok);
    }
}