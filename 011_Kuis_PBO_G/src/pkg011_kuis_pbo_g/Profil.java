/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg011_kuis_pbo_g;

/**
 *
 * @author Lab Informatika
 */
public class Profil {
    private String nik;
    private String namaLengkap;
    private String nomorTelepon;
    
    public Profil(String nik, String namaLengkap, String nomorTelepon){
        this.nik = nik;
        this.namaLengkap = namaLengkap;
        this.nomorTelepon = nomorTelepon;
               
    }
    public String getinfoProfil (){
        return nik + "" + namaLengkap + "- nomor" + nomorTelepon;
    }
}
