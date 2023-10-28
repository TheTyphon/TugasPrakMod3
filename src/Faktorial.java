import java.util.Scanner;
public class Faktorial {
    /**
     * @param args
     * Ini adalah kelas untuk menghitung faktorial
     * Memanfaatkan fitur scanner agar user bisa memasukkan angka yang ingin difaktorialkan sendiri
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai yang ingin difaktorialkan: ");
        int angka = sc.nextInt();
        int hasil = 1;
        for (int i = 1; i <= angka; i++) {
            hasil = hasil * i;
        }
        System.out.println("Sebelum faktorial: " +angka);
        System.out.println("Setelah faktorial: " +hasil);
    }
}
