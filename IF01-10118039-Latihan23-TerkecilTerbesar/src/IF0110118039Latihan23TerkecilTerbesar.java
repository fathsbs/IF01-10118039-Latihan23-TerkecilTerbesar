
import java.util.Scanner;

/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program yang dapat menentukan nilai terbesar dan terkecil dari suatu input-an  
 */
public class IF0110118039Latihan23TerkecilTerbesar {

    String nama;
    int jmlMhs, min = 100, max = 0;

    Scanner masuk = new Scanner(System.in);

    public void MinMax() {
        System.out.println("===Program Nilai Terbesar dan Terkecil===");
        System.out.print("Masukkan Nama Petugas: ");
        nama = masuk.nextLine();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa: ");
        jmlMhs = masuk.nextInt();

        int[] nilaiMahasiswa = new int[jmlMhs];

        for (int i = 0; i <= (jmlMhs - 1); i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + "= ");
            nilaiMahasiswa[i] = masuk.nextInt();

        }

        //Tampil        
        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        for (int i = 0; i <= (jmlMhs - 1); i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " = " + nilaiMahasiswa[i]);

            if (nilaiMahasiswa[i] > max) {
                max = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < min) {
                min = nilaiMahasiswa[i];
            }
        }
        System.out.printf("%nNilai terbesar adalah %d", max);
        System.out.printf("%nNilai terkecil adalah %d%n%n", min);
        System.out.println("Petugas\t: " + nama);

    }

    public static void main(String[] args) {
        IF0110118039Latihan23TerkecilTerbesar TerkecilTerbesar = new IF0110118039Latihan23TerkecilTerbesar();
        TerkecilTerbesar.MinMax();

    }

}
