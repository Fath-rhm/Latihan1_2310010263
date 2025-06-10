package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika fathur = new Matematika(6,3);
        
        System.out.println("Hasil Penjumlahan: "+fathur.setPenjumlahan());
        System.out.println("Hasil Pengurangan: "+fathur.setPengurangan());
        System.out.println("Hasil Perkalian: "+fathur.setPerkalian());
        System.out.println("Hasil Pembagian: "+fathur.setPembagian());
    }
}
