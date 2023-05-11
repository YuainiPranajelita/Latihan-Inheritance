package inheritance;


public class Koleksi {
    String judul;
    String penerbit;
    int tahun;
    public Koleksi (){
        System.out.println("Yuaini's Library");
    }
    public void speak(){
        System.out.println("Welcome");
    }
    
    public static void main(String[] args) {
    Koleksi k = new Koleksi();
    k.speak();
        System.out.println("\n");
    Buku b = new Buku();
    b.speak();
        System.out.println("\n");
    Majalah m = new Majalah();
    m.speak();
        System.out.println("\n");
    Skripsi s = new Skripsi();
    s.speak();
    s.lancar();
        System.out.println("\n");
    }
}

class Buku extends Koleksi {
    String penulis;
    public Buku (){
        super ();
        judul="Penerapan OOP Pada Kalkulator Rumus Matematika";
        penerbit="Mahasiswa UPNVJT";
        tahun= 2023;
        penulis = "Yuaini Pranajelita";
        System.out.println("Ini adalah buku "+judul);
        System.out.println("Penerbit nya adalah "+penerbit);
        System.out.println("Tahun terbit nya adalah "+tahun);
        System.out.println("Penulis buku ini adalah "+penulis);
    }
    
    public void speak (){
        System.out.println("Finish");
    }
}

class Majalah extends Koleksi {
    String edisi;
    public Majalah (){
        super ();
        judul = "Majalah resep memasak";
        penerbit = "PT. Food Indonesia";
        tahun = 2022;
        edisi = "terbaru";
        System.out.println("Ini adalah buku "+judul);
        System.out.println("Penerbit nya adalah "+penerbit);
        System.out.println("Tahun terbit nya adalah "+tahun);
        System.out.println("Edisi buku ini adalah "+edisi);
    }
    public void speak (){
        System.out.println("Happy cooking !!!!!!");
    }
}

class Skripsi extends Buku {
    String NPM;
    public Skripsi (){
        super ();
        NPM = "204";
        System.out.println("NPM = "+NPM);
    }
    public void lancar (){
        System.out.println("Bismillah Lancar !!!!");
    }
}
