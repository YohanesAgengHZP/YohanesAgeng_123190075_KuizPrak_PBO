/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuiz_pbo;

/**
 *
 * @author Yohanes Ageng
 */
public class PelamarWeb extends Pendaftaran implements Seleksi {
    
    public PelamarWeb(double nik, double nilaiTT, double nilaiTC, double nilaiTW, String nama) {
        super(nik, nilaiTT, nilaiTC, nilaiTW, nama);
    }
    
    // Bobot Nilai
    // Nilai tulis 40%
    // Nilai Coding 35%
    // Nilai Wawancara 25%
    
    @Override
    public double SeleksiTT() {
        return (double) (this.nilaiTT * 0.4);
    }

    @Override
    public double SeleksiTC() {
        return (double) (this.nilaiTC * 0.35);
    }

    @Override
    public double SeleksiTW() {
        return (double) (this.nilaiTW * 0.25);
    }  
}
