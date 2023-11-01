package com.tutorial;

class Mahasiswa {
    //Data member
    String nama;
    String nim;
    String prodi;

//contsruktor dengan parameter
    Mahasiswa(String nama, String nim,String prodi){
       this.nama = nama;
       this.nim = nim;
       this.prodi = prodi;
    }

//method tanpa parameter dan tanpa return 1
void show(){
    System.out.println("Nama :"+ this.nama);
    System.out.println("Nim :" + this.nim);
    System.out.println("prodi:" + this.prodi);
}
    //method tanpa return dengan parameter
    void setNama (String nama){
        this.nama = nama;

    }
    //metod dengan return tanpa parameter
    String getNama() {
        return this.nama;
    }  

    //method dengan return dan parameter
    String sayHi(String pesan) {
        return pesan + "dendi anak baik" + this.nama;
    }
       
        
        

    
}   
public class Main {
    public static void main(String[] args) {
        //instansiasi objek
        Mahasiswa mhs1 = new Mahasiswa("Den", "22241031", "PTI");

      mhs1.show(); 
      mhs1.setNama("janova");
      mhs1.show();
      System.out.println(mhs1.getNama());

      String pesan = mhs1.sayHi("hallo");
      System.out.println(pesan);
    }
}
