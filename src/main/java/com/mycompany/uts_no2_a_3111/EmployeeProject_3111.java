/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no2_a_3111;

/**
 *
 * @author Hadgy Hanan Aqmal
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EmployeeProject_3111 {

    public static void main(String[] args) {
        SalariedEmployee_3111 se = new SalariedEmployee_3111();
        CommissionEmployee_3111 ce = new CommissionEmployee_3111();
        ProjectPlanner_3111 pp = new ProjectPlanner_3111();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        try{
            System.out.println("Data Pegawai");
            System.out.print("Nama: ");
            se.Nama = br.readLine();
            System.out.print("NIP: ");
            se.NIP = br.readLine();
            System.out.print("Gaji Pokok: ");
            se.GajiPokok = Float.parseFloat(br.readLine());
            se.TampilData();
            
            System.out.print("Nama: ");
            ce.Nama = br.readLine();
            System.out.print("NIP: ");
            ce.NIP = br.readLine();
            System.out.print("GajiPokok: ");
            ce.GajiPokok = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            ce.Komisi = Float.parseFloat(br.readLine());
            System.out.print("Total Penjualan: ");
            ce.TotalPenjualan = Float.parseFloat(br.readLine());
            ce.TotalGaji();
            ce.TampilData();
            
            System.out.print("Nama: ");
            pp.Nama = br.readLine();
            System.out.print("NIP: ");
            pp.NIP = br.readLine();
            System.out.print("Gaji Pokok: ");
            pp.GajiPokok = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            pp.Komisi = Float.parseFloat(br.readLine());
            System.out.print("Total Hasil Proyek: ");
            pp.TotalHslProyek = Float.parseFloat(br.readLine());
            pp.TotalGaji();
            pp.TampilData();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
