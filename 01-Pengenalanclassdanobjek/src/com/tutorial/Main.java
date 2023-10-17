package com.tutorial;

class Mahasiswa { 
      String nama;
      String NIM;
      String prodi;
}


public class Main {
    public static void main(String[] args) {
        // instansiasi pembuatan objek；

        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "den";
        mhs1.NIM = "22241031";
        mhs1.prodi = "PTI";

        System.out.println("Nama mahasiswa:" + mhs1.nama);
        System.out.println("NIM Mahasiswa：" + mhs1.NIM);
        System.out.println("prodi Mahasiswa:" + mhs1.prodi);

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama = "janovasuryadendi";
        mhs2.NIM ="1111111";
        mhs2.prodi = "PTI";

        System.out.println("Nama mahasiswa:" + mhs2.nama);
        System.out.println("NIM Mahasiswa:" + mhs2.NIM);        
        System.out.println("prodi mahasiswa:" + mhs2.prodi);
    }   
}

        
        

