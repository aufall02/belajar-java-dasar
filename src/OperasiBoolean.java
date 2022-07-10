public class OperasiBoolean {
    public static void main(String[] args) {
        var absen = 70;
        var nilaiAkhir = 80;

        var lulusAbsen = absen >= 75;
        var lulusNilai = absen >= 75;

        var lulus = lulusAbsen && lulusNilai;

        System.out.println(lulus);

        /*
        operasi and atau &&

        nilai1  && nilai2
        true && true -> true
        true && false -> false
        false && true -> false
        false && false -> false


        operasi or atau ||
        nilai1 || nilai2
        true || true -> true
        true || false -> true
        false || true -> true
        false || false -> false

        operasi kebalikan atau !
        !true -> false
        !false -> true
         */
    }
}
