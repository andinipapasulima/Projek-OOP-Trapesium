/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trapesium.logic;

// Pilar 2: Inheritance (extends BangunDatar)
// Pilar 1: Encapsulation (semua atribut private)
// Pilar 3: Overloading (dua constructor)
// Pilar 4: Overriding (hitungLuas, hitungKeliling, hitungVolume, tampilInfo)
public class Trapesium extends BangunDatar implements Geometri {

    // Pilar 1: Semua atribut private
    private double alasAtas;
    private double alasBawah;
    private double tinggi;
    private double sisiMiring; // dihitung otomatis via Pythagoras

    // =============================================
    // Pilar 3: OVERLOADING CONSTRUCTOR
    // =============================================

    // Constructor 1 - hanya nama (default nilai 0)
    public Trapesium(String nama) {
        super(nama);
        this.alasAtas  = 0;
        this.alasBawah = 0;
        this.tinggi    = 0;
        this.sisiMiring = 0;
    }

    // Constructor 2 - dengan semua parameter
    public Trapesium(String nama, double alasAtas, double alasBawah, double tinggi) {
        super(nama);
        this.alasAtas  = alasAtas;
        this.alasBawah = alasBawah;
        this.tinggi    = tinggi;
        this.sisiMiring = hitungSisiMiring(); // hitung otomatis
    }

    // =============================================
    // Pilar 1: GETTER & SETTER (Information Hiding)
    // =============================================

    public double getAlasAtas() {
        return alasAtas;
    }
    public void setAlasAtas(double alasAtas) {
        this.alasAtas  = alasAtas;
        this.sisiMiring = hitungSisiMiring(); // update otomatis
    }

    public double getAlasBawah() {
        return alasBawah;
    }
    public void setAlasBawah(double alasBawah) {
        this.alasBawah  = alasBawah;
        this.sisiMiring = hitungSisiMiring(); // update otomatis
    }

    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi     = tinggi;
        this.sisiMiring = hitungSisiMiring(); // update otomatis
    }

    public double getSisiMiring() {
        return sisiMiring;
    }

    // =============================================
    // HELPER PRIVATE — hitung sisiMiring (Pythagoras)
    // Asumsi: trapesium sama kaki (isosceles)
    // private = tidak bisa diakses dari luar (information hiding)
    // =============================================
    private double hitungSisiMiring() {
        double selisihAlas = (alasBawah - alasAtas) / 2;
        return Math.sqrt(Math.pow(tinggi, 2) + Math.pow(selisihAlas, 2));
    }

    // =============================================
    // Pilar 4: OVERRIDING dari interface Geometri
    // =============================================

    @Override
    public double hitungLuas() {
        // Rumus: L = 1/2 x (a + b) x t
        return 0.5 * (alasAtas + alasBawah) * tinggi;
    }

    @Override
    public double hitungKeliling() {
        // Rumus: K = alasAtas + alasBawah + 2 x sisiMiring
        return alasAtas + alasBawah + (2 * sisiMiring);
    }

    @Override
    public double hitungVolume() {
        // Trapesium adalah bangun 2D, tidak memiliki volume
        return 0;
    }

    // =============================================
    // Pilar 4: OVERRIDING dari abstract class BangunDatar
    // =============================================

    @Override
    public void tampilInfo() {
        System.out.println("=================================");
        System.out.println("Bangun     : " + getNama());
        System.out.println("Alas Atas  : " + alasAtas);
        System.out.println("Alas Bawah : " + alasBawah);
        System.out.println("Tinggi     : " + tinggi);
        System.out.println("Sisi Miring: " + String.format("%.2f", sisiMiring));
        System.out.println("---------------------------------");
        System.out.println("Luas       : " + String.format("%.2f", hitungLuas()));
        System.out.println("Keliling   : " + String.format("%.2f", hitungKeliling()));
        System.out.println("=================================");
    }
}