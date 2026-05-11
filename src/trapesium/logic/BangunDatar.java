/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trapesium.logic;

public abstract class BangunDatar {
    private String nama; // Pilar 1: Encapsulation

    public BangunDatar(String nama) {
        this.nama = nama;
    }

    // Getter untuk akses nama (Information Hiding)
    public String getNama() {
        return nama;
    }

    // Method ini akan di-override oleh class Trapesium
    public abstract void tampilInfo();
}