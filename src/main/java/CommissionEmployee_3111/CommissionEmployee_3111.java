/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CommissionEmployee_3111;

import com.mycompany.uts_no2_a_3111.Employee_3111;

/**
 *
 * @author Hadgy Hanan Aqmal
 */
public class CommissionEmployee_3111 extends Employee_3111{
    public float Komisi;
    public float TotalPenjualan;
    public float Totalgaji;
    
    public CommissionEmployee_3111(){
        
    }
    
    public float TotalGaji(){
        Totalgaji = GajiPokok + (Komisi * TotalPenjualan);
        return Totalgaji;
    }
    
    public void TampilData(){
        System.out.println("Commission Employee");
        Tampil();
        System.out.println("Total Gaji: " + Totalgaji);
    }
}