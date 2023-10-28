import java.util.Scanner;
public class Main {
    float s, l, k;

    public float hitungLuas(){
        l = s*s;
        return l;
    }

    public float hitungKeliling(){
        k = s*4;
        return s;
    }

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fitur;
        System.out.print("Fitur yang ingin anda gunakan: \n1. Hitung Luas & Keliling Persegi\n2. Kalkulator sederhana\nPilihan: ");
        fitur = sc.nextInt();
        if (fitur == 1) {
            System.out.println("Perhitungan luas dan keliling persegi");
            System.out.print("Masukkan panjang sisi: ");
            s = sc.nextFloat();
            System.out.println("Panjang sisi: " + s);
            System.out.println("Panjang luas: " + hitungLuas());
            System.out.println("Panjang keliling: " + hitungKeliling());
        } if (fitur == 2){
            int angka1, angka2;
            System.out.println("Kalkulator sederhana");
            System.out.print("Masukkan angka pertama: ");
            angka1 = sc.nextInt();
            System.out.print("Masukkan angka kedua: ");
            angka2 = sc.nextInt();
            int tambah = angka1 + angka2;
            int kurang = angka1 - angka2;
            int bagi = angka1 / angka2;
            int kali = angka1 * angka2;
            System.out.println("Angka pertama ditambah angka kedua: "+tambah);
            System.out.println("Angka pertama dikurangi angka kedua: "+kurang);
            System.out.println("Angka pertama dibagi angka kedua: "+bagi);
            System.out.println("Angka pertama dikali angka kedua: "+kali);
        }
    }
}
