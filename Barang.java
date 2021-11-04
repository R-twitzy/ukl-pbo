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
public class Barang {
    private int idBarang, hargaAwal;
    private String namaBarang;
    boolean status;
    
    public Barang(int idBarang, String namaBarang, int hargaAwal, boolean status){
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.hargaAwal = hargaAwal;
        this.status = status;
    }
    
    // implementasi enkapsulasi dengan pembuatan method untuk mengakses data private "idBarang"
    public int getIdBarang(){
        return idBarang;
    }
    //data private "namaBarang"
    public String getNamaBarang(){
        return namaBarang;
    }
    //data private "hargaAwal"
    public int getHargaAwal(){
        return hargaAwal;
    }
    
    // method utk mengubah status
    public void changeStatus(){
        this.status = !this.status;
    }
    // method utk mendapatkan status
    public String getStatus(){
        if (status) {
            return "Dapat ditawar";
        } else {
            return "Tidak dapat ditawar";
        }
    }
    
    // implementasi enkapsulasi dengan pembuatan method untuk mengakses data private "isStatus"
    public boolean isStatus(){
        return status;
    }
}
