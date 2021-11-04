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
public class ListPetugas extends List{
    // array
    Petugas[] listPetugas = {
        new Petugas(1, "Mr. Wagiman", "Malang", "+62 81******123"),
        new Petugas(2, "Mr. Ssam", "Malang", "+62 81******353"),
        new Petugas(3, "Mrs. Tika", "Malang", "+62 81******222"),
    };
    
    // method utk menampilkan
    @Override
    public void view(){
        System.out.println("- List Petugas --------------------------------------------");
        System.out.println("ID \t Nama \t\t Alamat \t Telepon");
        for (int i = 0; i < listPetugas.length; i++) {
            System.out.println(listPetugas[i].getIdPetugas() + " \t " +
                    listPetugas[i].getNama() + " \t " +
                    listPetugas[i].getAlamat()+ " \t " +
                    listPetugas[i].getTelepon());
        }
    }
    
    public int cariPetugas(int id){
        int found = 0;
        // pencarian berdasarkan id
        for (int i = 0; i < listPetugas.length; i++) {
            if (listPetugas[i].getIdPetugas() == id) {
                found = i; //menyimpan nilai index dari data yg ditemukan
            }
        }
        return found;
    }
}
