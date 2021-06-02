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
public class Pendaftaran implements Seleksi {
    double nik,nilaiTT, nilaiTC, nilaiTW;
    String nama;
    
    public Pendaftaran(double nik, double nilaiTT, double nilaiTC, double nilaiTW, String nama) {
        this.nik = nik;
        this.nilaiTT = nilaiTT;
        this.nilaiTC = nilaiTC;
        this.nilaiTW = nilaiTW;
        this.nama = nama;
    }

    public double getNik() {
        return nik;
    }

    public void setNik(double nik) {
        this.nik = nik;
    }

    public double getNilaiTT() {
        return nilaiTT;
    }

    public void setNilaiTT(double nilaiTT) {
        this.nilaiTT = nilaiTT;
    }

    public double getNilaiTC() {
        return nilaiTC;
    }

    public void setNilaiTC(double nilaiTC) {
        this.nilaiTC = nilaiTC;
    }

    public double getNilaiTW() {
        return nilaiTW;
    }

    public void setNilaiTW(double nilaiTW) {
        this.nilaiTW = nilaiTW;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    @Override
    public double SeleksiTT() {
        return 0;
    }

    @Override
    public double SeleksiTC() {
        return 0;
    }

    @Override
    public double SeleksiTW() {
        return 0;
    }
}
    