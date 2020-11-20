/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119010.latihan55.handphone;

/**
 *
 * @author Maulana Imam Malik
 * NAMA     : Maulana Imam Malik
 * KELAS    : IF1
 * NIM      : 10119010
 * Deskripsi Program : Program ini menampilkan produk handphone dengan konsep OOP
 */
public class WindowsPhone extends Handphone {
    
    private String wpKeyStore;
    
    public WindowsPhone(String man, String os, String model, int harga, String wpKeyStore) {
        super(man, os, model, harga);
        this.wpKeyStore = wpKeyStore;
    }
    
    public String getWpKeyStore() {
        return this.wpKeyStore;
    }
    
    public void setWpKeyStore(String wpKeyStore) {
        this.wpKeyStore = wpKeyStore;
    }
}
