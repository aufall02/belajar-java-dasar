public class Ifstatement {
    public static void main(String[] args) {
        var nilai = 70;
        var absen = 70;

        var nilaiLulus = nilai >= 75;
        var absenLulus = absen >= 75;

        var lulus = nilaiLulus && absenLulus;


        /*kondidisi nilai if harus bollean. jika hasilnya true maka kode block selanjutnya akan dieksekusi jika false
        kode maka akan mengeksekusi else

        Else if bisa digunakan jika ada banyak kondisi

        if(nilai >= 75 && absen >= 70)
         */
        if (lulus) {
            System.out.println("selamat anda lulus ");

        } else {
            System.out.println("Mohon coba lagi tahun depan");
        }

        if (nilai >= 85 && absen >= 85) {
            System.out.println("Nilai anda  A");
        } else if (nilai >= 80 && absen >= 80) {
            System.out.println("Nilai anda B");
        } else if (nilai >= 75 && absen >= 75) {
            System.out.println("Nilai anda C");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai anda D");
        }else {
            System.out.println("Nilai anda E");
        }
    }
}
