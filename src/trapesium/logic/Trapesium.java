/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trapesium.logic;

// Pilar 2: Inheritance (extends) dan implements interface
public class Trapesium extends BangunDatar implements Geometri {
    // Pilar 1: Encapsulation (semua atribut private)
    private double alasAtas;
    private double alasBawah;
    private double tinggi;

    // Pilar 3: Overloading Constructor (Dua versi constructor)
    public Trapesium(String nama) {
        super(nama);
    }

    public Trapesium(String nama, double a, double b, double t) {
        super(nama);
        this.alasAtas = a;
        this.alasBawah = b;
        this.tinggi = t;
    }

    // Getter dan Setter (Information Hiding)
    public double getAlasAtas() { return alasAtas; }
    public void setAlasAtas(double a) { this.alasAtas = a; }
    
    public double getAlasBawah() { return alasBawah; }
    public void setAlasBawah(double b) { this.alasBawah = b; }

    public double getTinggi() { return tinggi; }
    public void setTinggi(double t) { this.tinggi = t; }

    // Pilar 4: Overriding method dari interface
    @Override
    public double hitungLuas() {
        return 0.5 * (alasAtas + alasBawah) * tinggi;
    }

    @Override
    public double hitungKeliling() {
        // Penyederhanaan: Keliling butuh sisi miring. 
        // Bisa kamu tambahkan logika Pythagoras jika ingin lebih detail.
        return 0; 
    }

    @Override
    public void tampilInfo() {
        System.out.println("Bangun: " + getNama());
        System.out.println("Luas Trapesium: " + hitungLuas());
    }
}
