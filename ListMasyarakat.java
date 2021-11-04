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
public class ListMasyarakat extends List{
    // array
    Masyarakat[] listMasyarakat = {
        new Masyarakat(1, "Tortelini", "Kediri", "+62 81******123"),
        new Masyarakat(2, "Ahmad J.", "Malang", "+62 82******335"),
        new Masyarakat(3, "Habibi", "Surabaya", "+62 85******999"),
        new Masyarakat(4, "Burhan", "Blitar", "+62 81******554"),
        new Masyarakat(5, "Moh. Isman", "T.Agung", "+62 85******888"),
        new Masyarakat(6, "Purnama", "Jember", "+62 81******055"),
    };
    
    // method utk menampilkan
    @Override
    public void view(){
        System.out.println("- List Masyarakat --------------------------------------------");
        System.out.println("ID \t Nama \t\t Alamat \t Telepon");
        for (int i = 0; i < listMasyarakat.length; i++) {
            System.out.println(listMasyarakat[i].getIdMasyarakat() + " \t " +
                    listMasyarakat[i].getNama() + " \t " +
                    listMasyarakat[i].getAlamat()+ " \t " +
                    listMasyarakat[i].getTelepon());
        }
    }
    
    public int cariMasyarakat(int id){
        int found = 0;
        // pencarian berdasarkan id
        for (int i = 0; i < listMasyarakat.length; i++) {
            if (listMasyarakat[i].getIdMasyarakat() == id) {
                found = i; //menyimpan nilai index dari data yg ditemukan
            }
        }
        return found;
    }
}
