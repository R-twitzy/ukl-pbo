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
public class ListBarang extends List {
    // mengisi array 'listBarang' dgn tipe class Barang
    Barang[] listBarang ={
        new Barang(1, "Sweater Nasa", 200000, true),
        new Barang(2, "Kaos Bape", 150000, true),
        new Barang(3, "Jogger Nasa", 120000, true),
        new Barang(4, "Hoodie Bape", 500000, true),
        new Barang(5, "Sepatu Yeezy", 1000000, true),
        new Barang(6, "Sepatu Nike", 750000, true),
        new Barang(7, "Kaos Supreme", 150000, true),
    };
    
    // method utk menampilkan data list barang
    @Override
    public void view(){
        System.out.println("- List Barang --------------------------------------------");
        System.out.println("ID \tNama Barang \tHarga Awal \tStatus");
        for (int i = 0; i < listBarang.length; i++) {
            System.out.println(listBarang[i].getIdBarang() + "\t" + 
                    listBarang[i].getNamaBarang() + "\t" +
                    listBarang[i].getHargaAwal() + "\t\t" +
                    listBarang[i].getStatus());
        }
    }
    
    public int cariBarang(int id){
        int found = 0;
        // pencarian berdasarkan id
        for (int i = 0; i < listBarang.length; i++) {
            if (listBarang[i].getIdBarang() == id) {
                found = i; //menyimpan nilai index dari data yg ditemukan
            }
        }
        return found;
    }
}
