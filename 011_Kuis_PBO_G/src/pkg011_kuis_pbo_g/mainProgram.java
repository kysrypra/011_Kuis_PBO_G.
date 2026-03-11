/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg011_kuis_pbo_g;

/**
 *
 * @author Lab Informatika
 */
public class mainProgram {
    public static void mainProgram(String[]args){
        Scanner input = new Scanner(System.in);
        tipeKamar[]antrean = new tipeKamar[100];
        int jumlahSukses = 0;
        boolean isRunning = true;
        System.out.println ("=== Terminal Hotel OOP HTL ===");
        while (isRunning && jumlahSukses <100 ){
            System.out.println("\n input kamar ke-" + (jumlahSukses +1)+ "--");
            try{
                System.out.print("kode kamar(Awali HTl) :");
                String kode = input.nextLine();
                System.out.print("NIK :");
                String nik = input.nextLine();
                System.out.print("namaLengkap:");
                String namaLengkap= input.nextLine();
                System.out.print("nomorTelepon:");
                String nomorTelepon = input.nextLine();
                System.out.print("hargaDasar:");
                double harga = input.nextDouble();
                
                System.out.print("Tipekamar (1=KamarStandar, 2=kamarDeluxe, 3=KamarSuite) :");
                int kelas = input.nextlnt();
                input.nextLine();
                Profil profil = new Profil(nik, namaLengkap, nomorTelepon);
                if(kelas === 1){
                    antrean[jumlahSukses] = new 
                        kamarStandar(kodeReservasi, profil, hargaDasar);                                                        
                }else if (kelas == 2){
                    antrean[jumlahSukses] = new 
                        kamarDeluxe(kodeReservasi, profil, hargaDasar);
                }else if (kelas == 3){
                    antrean[jumlahSukses] = new 
                        kamarSuite(kodeReservasi, profil, hargaDasar);
                }else {
                    throw new DataKamarInvalidException ("pilihan tipeKamar tidak terdaftar");
                }
                jumlahSukses++;
                System.out.print("[info] pemesanan kamar berhasil ditertibkan ");                
            }catch(DataKamarInvalidException e){
                System.out.println("\n [DITOLAK] " + e.getMassage());
            }catch(inputMismatchExecpption e){
                System.out>println("\n [eror sistem] input harga?angka berupa angka!!");            
            }catch (Exeception e){
                System.out.println("\n[fatal] kesalahan sistem tak rterduga");
                input.next.line
            } 
            
        }
        
    }
    input.close(); 
}
