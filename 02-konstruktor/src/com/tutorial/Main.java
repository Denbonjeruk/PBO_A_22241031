package com.tutorial;

// class tanpa konstruktor
class polos {
    String dataString;
    int dataInteger;
}
// class dengan konstruktor
class Mahasiswa {
    String nama;
    String nim;
    String prodi;
    //membuat konstruktor tanpa parameter
    
    
    // Mahasiswa() {
    //     System.out.println("ini adalah konstruktor");
    // }
    
    // membuat konstruktor dengan parameter
    Mahasiswa (String inputNama, String inputNim, String inputProdi){
        nama = inputNama;
        nim = inputNim;
        prodi = inputProdi;

        System.out.println("janovaSuryadendi:" + nama );
        System.out.println("22241031:" + nim);
        System.out.println("Pti:" + prodi);
    
    }
}
public class Main{
       public static void main(String[] args) {
        // instansiasi objek dari class polos
        // Polos pls = new polos();

        // //isi ciri pada objek pls
        // pls.dataString ="POLOS";
        // pls.dataInteger =10;

        // //cek data
        // System.out.printIn("Isi Data String :" + pls.dataString);
        // System.out.printIn("Isi Data Integer : + pls.dataInteger" +pls.dataInteger);

        Mahasiswa mhs1 = new Mahasiswa("janovaSuryadendi", "22241031", "PTI");

        // memanggil konstruktor 
       }
    }

