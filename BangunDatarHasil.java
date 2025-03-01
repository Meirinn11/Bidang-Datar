import java.util.Scanner;
public class BangunDatarHasil{
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Silahkan pilih Bangun Datar yang ingin dihitung:(Bujur Sangkar, Persegi Panjang, Segitiga)");
        String pilihan = scanner.nextLine().toLowerCase();

//Bujur Sangkar
if(pilihan.equals("bujur sangkar")){
        System.out.println("Masukkan sisi Bujur Sangkar :  ");
        float sisi = scanner.nextFloat();
        BujurSangkar bujursangkar = new BujurSangkar(sisi);
        System.out.println ("Luas Bujur Sangkar: " + bujursangkar.luas());
        System.out.println("Keliling Bujur Sangkar:"+ bujursangkar.keliling());
}
        //Persegi Panjang
else if (pilihan.equals("persegi panjang")){
        System.out.print("Masukkan panjang persegi panjang:" );
        float panjang= scanner.nextFloat();
        System.out.print("Masukkan lebar persegi panjang:");
        float lebar = scanner.nextFloat();
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
        System.out.println("Luas Persegi Panjang:"+ persegiPanjang.luas());
        System.out.println("Keliling persegi panjang:"+ persegiPanjang.keliling());
}
 //Segitiga
 else if(pilihan.equals("segitiga")){
        System.out.print("Masukkan alas segitiga: ");
        float alas= scanner.nextFloat();
        System.out.print("Masukkan tinggi segitiga:");
        float tinggi = scanner.nextFloat();
        System.out.print("Masukkan sisi A:");
        float sisiA = scanner.nextFloat();
        System.out.print("masukkan sisi B:");
        float sisiB = scanner.nextFloat();
        System.out.print("Masukkan sisi C:");
        float sisiC = scanner.nextFloat();

        Segitiga segitiga = new Segitiga(alas, tinggi, sisiA, sisiB, sisiC);
        System.out.println("Luas Segitiga:"+ segitiga.luas());
        System.out.println("Keliling Segitiga:"+ segitiga.keliling());
 }
 scanner.close();
    }
}
