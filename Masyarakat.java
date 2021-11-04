/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl_pbo;

/**
 *
 * @author LENOVO
 */
public class Masyarakat extends Person {
    private int idMasyarakat;
    
    public Masyarakat(int idMasyarakat, String nama, String alamat, String telepon){
        super(nama, alamat, telepon);
        this.idMasyarakat = idMasyarakat;
    }
    
    //implementasi enkapsulasi, membuat method utk mengakses data private "idMasyarakat"
    public int getIdMasyarakat(){
        return idMasyarakat;
    }
    //data private "nama"
    public String getNama(){
        return nama;
    }
    //data private "alamat"
    public String getAlamat(){
        return alamat;
    }
    //data private "telepon"
    public String getTelepon(){
        return telepon;
    }
    
}
