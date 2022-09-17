package org.p2.pbo;

/**
 *
 * @author abdurrahman al ghifari
 */
public class Pbo {
  public static void main(String args[])
  { 
      System.out.println("Latihan PBO - OOP Pertemuan 2");
      System.out.println("-----------------------------");
      System.out.println("");
      
      //buat objek dari class Manusia
      Manusia orang = new Manusia();
      
      //set keterangan orang nya.
      orang.rambut="Bergelombang."; //ok
      orang.mata="Hitam "; //ok
      orang.mulut="Bersih ";
      orang.telinga="Bagus "; //ok
      orang.tangan="Tangan "; //ok
      orang.kaki="Memakai sepatu ";
      
      System.out.println("---- MANUSIA ---");
      //menampilkan nilai property object Manusia
      System.out.println("Ghifari memiliki jenis rambut "+orang.rambut+" suka mencuci "+orang.tangan+"dengan bersih.");
      System.out.println("dia juga memiliki mata berwarna "+orang.mata+"serta memiliki pendengaran yang "+orang.telinga+"serta mulut yang "+orang.mulut);
      System.out.println("");        
      //menampilkan hasil method object Manusia
      System.out.println("Ghifari "+orang.bekerja());
      System.out.println("sebelum berangkat dia "+orang.memasak()+orang.makan()+"serta mencuci "+orang.mencuci());
      System.out.println("dia memiliki game favorit yaitu "+orang.bermain()+" di gadget kesayangan nya." );
      System.out.println("");
      
      //buat objek dari class Hewan
      Hewan hewan = new Hewan();
      
      //set keterangan hewan nya.
      hewan.mata="Hitam "; //ok
      hewan.mulut="Bersih ";
      hewan.telinga="Panjang."; //ok
      hewan.kaki=4;
      
      System.out.println("---- HEWAN ---");
      //menampilkan nilai property object HEWAN
      System.out.println("Kelinci itu memiliki mata berwarna "+hewan.mata+"berkaki "+hewan.kaki+" memiliki mulut yang "+hewan.mulut+"serta telinga yang "+hewan.telinga);
      System.out.println("");
      System.out.println("Kelinci "+hewan.bermain()+"menyukai "+hewan.makan()+" serta "+hewan.tidur());
      //menampilkan hasil method object Hewan
      
      //buat objek dari class Pesawattelepon
      Pesawattelepon telp = new Pesawattelepon();
      telp.bentuk="kotak";
      telp.kabel="panjang";
      telp.gagang_telepon="hitam";
      System.out.println("");
      System.out.println("---- Pesawat Telepon---");
      System.out.println("Telepon speedy berbentuk "+telp.bentuk+" gagang nya berwarna "+telp.gagang_telepon+" dan memiliki kabel yang "+telp.kabel);
      System.out.println("Ghifari menerima "+telp.terima_panggilan()+"dan melakukan panggilan ke "+telp.melakukan_panggilan());
      
      
  }
  
  
}
