/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuiz_pbo;
import java.util.Scanner;
/**
 *
 * @author Yohanes Ageng
 */
public class Kuiz_PBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean keluar = false;
        Scanner input;
        input = new Scanner(System.in);
        
        //tampilan disamakan dengan video dari aslab
         
        System.out.println("Form Pendaftaran PT.UDIN");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Pilih Jenis Form : ");
        int menuawal = input.nextInt();
        switch(menuawal) {
            case 1:
            double nik,nilaiTT, nilaiTC, nilaiTW;
            String nama;
            
                System.out.println(" ");
                Scanner data = new Scanner(System.in);
                System.out.println("FORM PENDAFTARAN MAHASISWA\n");
                
                System.out.print("Input NIK : ");
                nik = data.nextDouble();
                System.out.print("Input Nama : ");
                data.nextLine();
                nama = data.nextLine();
                System.out.print("Input Nilai Tes Tulis : ");
                nilaiTT = data.nextDouble();
                System.out.print("Input Nilai Tes Coding : ");
                nilaiTC = data.nextDouble();
                System.out.print("Input Nilai Tes Wawancara : ");
                nilaiTW = data.nextDouble();
                PelamarAndroid pelamarandroid = new PelamarAndroid(nik,nilaiTT,nilaiTC, nilaiTW,nama);
                
                do {
                    System.out.println(" ");
                    System.out.println("Menu");
                    System.out.println("1. Edit");
                    System.out.println("2. Tampil");
                    System.out.println("3. Exit");
                    System.out.print("Pilih : ");
                    int pilihmenu = input.nextInt();
                    
                    switch(pilihmenu)
                    {
                        
                        case 1: //Pengeditan data
                            Scanner inputBlank = new Scanner(System.in);
                            System.out.println(" ");
                            System.out.println("FORM EDIT");
                            System.out.print("Input Nilai Tes Tulis : "); 
                            pelamarandroid.nilaiTT = inputBlank.nextDouble();
                            System.out.print("Input Nilai Tes Coding : "); 
                            pelamarandroid.nilaiTC = inputBlank.nextDouble();
                            System.out.print("Input Nilai Tes Wawancara : "); 
                            pelamarandroid.nilaiTW = inputBlank.nextDouble();
                        break;
                            
                        case 2: // Penampilan data
                            double nilaiAkhir;
                            String namaMahasiswa;
                            System.out.println(" ");
                            
                            nilaiAkhir = pelamarandroid.SeleksiTT() + pelamarandroid.SeleksiTC() + pelamarandroid.SeleksiTW();
                            namaMahasiswa = pelamarandroid.getNama();
                          
                            System.out.println("Nilai Akhir : " + nilaiAkhir);
                            if (nilaiAkhir < 85) {
                                    System.out.println("KETERANGAN : GAGAL!");
                                System.out.println("Mohon Maaf Kepada " + namaMahasiswa + " Telah Ditolak Sebagai Android Developer");
                            } else {
                                System.out.println("KETERANGAN : LOLOS!");
                                System.out.println("Selamat Kepada " + namaMahasiswa + " Telah Diterima Sebagai Android Developer");
                            }
                        break;
                            
                        case 3: //keluar
                            keluar = true;
                        break;
                    }    
                } while (!keluar); 
            break;
            
            case 2:
            double nikWeb,nilaiTTWeb, nilaiTCWeb, nilaiTWWeb;
            String namaWeb;
            System.out.println(" ");
            Scanner dataweb = new Scanner(System.in);
            System.out.println("FORM PENDAFTARAN MAHASISWA\n");
            
            System.out.print("Input NIK : ");
            nikWeb = dataweb.nextDouble();
            System.out.print("Input Nama : ");
            dataweb.nextLine();
            namaWeb = dataweb.nextLine();
            System.out.print("Input Nilai Tes Tulis : ");
            nilaiTTWeb = dataweb.nextDouble();
            System.out.print("Input Nilai Tes Coding : ");
            nilaiTCWeb = dataweb.nextDouble();
            System.out.print("Input Nilai Tes Wawancara : ");
            nilaiTWWeb = dataweb.nextDouble();
            PelamarWeb pelamarweb = new PelamarWeb(nikWeb, nilaiTTWeb, nilaiTCWeb, nilaiTWWeb, namaWeb);
                    do{
                    System.out.println(" ");
                    System.out.println("Menu");
                    System.out.println("1. Edit");
                    System.out.println("2. Tampil");
                    System.out.println("3. Exit");
                    System.out.print("Pilih : ");
                    int pilihmenu = input.nextInt();
                    
                    switch(pilihmenu)
                    {
                        
                        case 1: //Pengeditan data
                            Scanner inputBlank = new Scanner(System.in);
                            System.out.println(" ");
                            System.out.println("FORM EDIT");
                            System.out.print("Input Nilai Tes Tulis : "); 
                            pelamarweb.nilaiTT = inputBlank.nextDouble();
                            System.out.print("Input Nilai Tes Coding : "); 
                            pelamarweb.nilaiTC = inputBlank.nextDouble();
                            System.out.print("Input Nilai Tes Wawancara : "); 
                            pelamarweb.nilaiTW = inputBlank.nextDouble();
                        break;
                            
                        case 2: //Penampilan data
                            double nilaiAkhir;
                            String namaMahasiswa;
                            System.out.println(" ");
                            
                            nilaiAkhir = pelamarweb.SeleksiTT() + pelamarweb.SeleksiTC() + pelamarweb.SeleksiTW();
                            namaMahasiswa = pelamarweb.getNama();
                          
                            System.out.println("Nilai Akhir : " + nilaiAkhir);
                            if (nilaiAkhir < 85) {
                                    System.out.println("KETERANGAN : GAGAL!");
                                System.out.println("Mohon Maaf Kepada " + namaMahasiswa + " Telah Ditolak Sebagai Web Developer");
                            } else {
                                System.out.println("KETERANGAN : LOLOS!");
                                System.out.println("Selama2"
                                        + " Kepada " + namaMahasiswa + " Telah Diterima Sebagai Web Developer");
                            }
                        break;
                            
                        case 3: // keluar
                            keluar = true;
                        break;
                    }    
                } while (!keluar); 
            break;
        }
    }
}