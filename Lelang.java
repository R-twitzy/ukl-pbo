/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl_pbo;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Lelang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean stay=true;
        String key;
        
        // prepare objek
        int a = 10;
        ListBarang listBarang = new ListBarang();
        ListMasyarakat listMasyarakat = new ListMasyarakat();
        ListPetugas listPetugas = new ListPetugas();
        
        
        // jika var "stay" = true program terus berjalan
        while (stay) {
            System.out.println(" ");
            System.out.println("----------------------------------------------------------------");
            System.out.println(" ");
            System.out.println("+====-------------- TOKO LELANG BARANG MAHAL  -------------====+");
            System.out.println("1. List Masyarakat");
            System.out.println("2. List Petugas");
            System.out.println("3. List Barang");
            System.out.println("4. Tawar Barang");
            System.out.println("5. exit");
            System.out.print("Pilih menu: ");
            int menu=input.nextInt();
            System.out.println(" ");
            System.out.println("----------------------------------------------------------------");
            System.out.println(" ");
            
            if (menu==1) {
                // menampilkan daftar masyarakat
                listMasyarakat.view();
                System.out.print("Press any key and enter...");
                key = input.next();
            }else if (menu==2) {
                // menampilkan daftar petugas
                listPetugas.view();
                System.out.print("Press any key and enter...");
                key = input.next();
            }else if (menu==3) {
                // menampilkan daftar barang
                listBarang.view();
                System.out.print("Press any key and enter...");
                key = input.next();
            }else if (menu==4) {
                System.out.println("--------- Tawar Barang ----------"); System.out.println(" ");
                //prepare var selected dan hargatawar
                int selectedIDPetugas, selectedIDMasyarakat, selectedIDBarang, hargaTawar;
                
                // menampilkan daftar petugas, masyarakat, barang
                listPetugas.view(); System.out.println(" ");
                listMasyarakat.view(); System.out.println(" ");
                listBarang.view(); System.out.println(" ");
                
                // input Petugas
                System.out.print("Masukkan ID Petugas \t: ");
                selectedIDPetugas = input.nextInt();
                // "foundIndex" menyimpan posisi index
                int foundIndex = listPetugas.cariPetugas(selectedIDPetugas);
                // "selectedPetugas" menyimpan data
                Petugas selectedPetugas = listPetugas.listPetugas[foundIndex];
                
                // input Masyarakat
                System.out.print("Masukan ID Masyarakat \t: ");
                selectedIDMasyarakat = input.nextInt();
                // "foundIndex" menyimpan posisi index
                foundIndex = listMasyarakat.cariMasyarakat(selectedIDMasyarakat);
                // "selectedMasyarakat" menyimpan data
                Masyarakat selectedMasyarakat = listMasyarakat.listMasyarakat[foundIndex];
                
                // input Barang
                System.out.print("Masukkan ID Barang \t: ");
                selectedIDBarang = input.nextInt();
                // "foundIndex" menyimpan posisi index
                foundIndex = listBarang.cariBarang(selectedIDBarang);
                // "selectedMasyarakat" menyimpan data
                Barang selectedBarang = listBarang.listBarang[foundIndex];
                
                // jika status barang true maka bisa dilanjut
                if (selectedBarang.isStatus()) {
                    // input hargatawar
                    System.out.print("Masukkan Harga Tawar \t: Rp ");
                    hargaTawar = input.nextInt();
                    // jika hargaTawar lebih tinggi dari harga awal maka bisa dilanjut
                    if (hargaTawar > selectedBarang.getHargaAwal()) {
                        // merubah status Barang
                        listBarang.listBarang[foundIndex].changeStatus();
                        // menampilkan list penawaran
                        System.out.println(" ");
                        System.out.println("----------------------------------------------------------------");
                        System.out.println(" ");
                        System.out.println("--------- List Penawaran ----------");
                        System.out.println("petugas \t: "+ selectedPetugas.getNama());
                        System.out.println("Penawar \t: "+ selectedMasyarakat.getNama());
                        System.out.println("Nama Barang \t: "+ selectedBarang.getNamaBarang());
                        System.out.println("Harga Tawar \t: Rp "+ hargaTawar);
                    }else {
                        System.out.println("Harga barang harus lebih tinggi");
                    }
                }else {
                    System.out.println("Barang tidak dapat ditawar");
                }
                
                System.out.print("Press any key and enter...");
                key = input.next();
            }else if (menu==5) {
                //merubah var "stay" mjd false dan program akan berhenti
                stay=false;
            }
        }
    }
    
}
