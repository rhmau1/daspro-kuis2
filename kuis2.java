import java.util.Scanner;

public class kuis2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan jumlah baris matriks: ");
        int baris = sc.nextInt();
        System.out.print("masukkan jumlah kolom matriks: ");
        int kolom = sc.nextInt();

        int[][] matriks1 = new int[baris][kolom];
        int[][] matriks2 = new int[baris][kolom];
        int[][] matriksHasilPenjumlahan = new int[baris][kolom];
        System.out.println("masukkan elemen matriks pertama:");
        for (int i = 0; i < matriks1.length; i++) {
            for (int j = 0; j < matriks1[0].length; j++) {
                System.out.print("elemen [" + i + "][" + j + "]: ");
                matriks1[i][j] = sc.nextInt();
            }
        }
        System.out.println("masukkan elemen matriks kedua:");
        for (int i = 0; i < matriks2.length; i++) {
            for (int j = 0; j < matriks2[0].length; j++) {
                System.out.print("elemen [" + i + "][" + j + "]: ");
                matriks2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matriksHasilPenjumlahan.length; i++) {
            for (int j = 0; j < matriksHasilPenjumlahan[0].length; j++) {
                matriksHasilPenjumlahan[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }

        System.out.println("Hasil penjumlahan matriks:");
        for (int i = 0; i < matriksHasilPenjumlahan.length; i++) {
            for (int j = 0; j < matriksHasilPenjumlahan[0].length; j++) {
                System.out.print(matriksHasilPenjumlahan[i][j] + " ");
            }
            System.out.println();
        }
    }
}
