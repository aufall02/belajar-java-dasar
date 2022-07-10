public class TernaryOperator {
    public static void main(String[] args) {
        var nilai =  75;

        String ucapan;

        if (nilai >= 75){
            ucapan = "Selamat anda lulus ";
        }else {
            ucapan = "Silakan Coba lagi";
        }

        System.out.println(ucapan);

        // Ternary Operator (Type data) (variable) = (kondisi)? (if true ) : (if false )

     String ucapan2 = nilai >= 75? "Selamat anda lulus" : "Coba lagi tahun depan";
        System.out.println(ucapan2);
    }
}

