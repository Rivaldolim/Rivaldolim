/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.ArrayList;

/**
 *
 * @author ASUS TUFF GK
 */
class Mobil {
    
    String merk;
    int tahun;
    
    public Mobil(String merk, int tahun) {
        
        this.merk = merk;
        this.tahun = tahun;
    }
}

public class Post_test1 {

    public static void main(String[] args) {
// Buat ArrayList untuk menyimpan objek Mobil
        ArrayList<Mobil> cars = new ArrayList<Mobil>();

        // Isikan ArrayList dengan objek Mobil
        cars.add(new Mobil("Honda", 2021));
        cars.add(new Mobil("Ford", 2020));
        cars.add(new Mobil("Chevrolet", 2022));
        cars.add(new Mobil("Nissan", 2021));

        // Perulangan untuk menampilkan informasi tentang mobil
        for (Mobil mobil : cars) {
            System.out.println("mobil " + mobil.merk + " tahun produksi " + mobil.tahun);    }
    }
}
