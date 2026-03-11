/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg011_kuis_pbo_g;
import DataKamarInvalidException;

/**
 *
 * @author Lab Informatika
 */
public class kamarStandar extends tipeKamar (String kodeReservasi, Profil profil, double hargaDasar ) thorws DataKamarInvalidException {
    super (kodeReservasi, profil, harga);
}

@Override
public double hitungTotalHarga(){
    return hargaDasar;
}
