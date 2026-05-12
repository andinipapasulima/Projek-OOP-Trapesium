/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trapesium.logic;

// Pilar 1: Encapsulation & Information Hiding
// Pilar 4: Abstract method wajib di-override oleh subclass
public abstract class BangunDatar {

    private String nama; // private = information hiding

    // Constructor
    public BangunDatar(String nama) {
        this.nama = nama;
    }

    // Getter (satu-satunya cara akses nama dari luar)
    public String getNama() {
        return nama;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Pilar 4: Abstract method — wajib diimplementasikan oleh subclass
    public abstract void tampilInfo();
}