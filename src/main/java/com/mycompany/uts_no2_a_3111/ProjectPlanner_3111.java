/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_a_3111;

/**
 *
 * @author Hadgy Hanan Aqmal
 */
public class ProjectPlanner_3111 extends Employee_3111{
    public float Komisi;
    public float TotalHslProyek;
    public double Totalgaji;
    
    public ProjectPlanner_3111(){
        
    }
            
    public double TotalGaji(){
        Totalgaji = GajiPokok + (Komisi * TotalHslProyek) - (GajiPokok*5/100);
        return Totalgaji;
    }
    
    public void TampilData(){
        System.out.println("Project Plannner");
        Tampil();
        System.out.println("Total Gaji: " + Totalgaji);
    }
}

