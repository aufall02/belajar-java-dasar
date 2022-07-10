public class ForLoop {
    public static void main(String[] args) {
        /*
        for (InitStatement;kondisi;PostStatement){
            block code
        }
        ketika kondisi tidak diisi otomatis kondisi bernilai true
        init statement hanya di eksekusi sekali diawal
        post statement akan selalu dieksekusi diakhir perulangan
         */

//        for (;;){
//            System.out.println("perulanangan tanpa henti");
//        }

//        var counter = 1;
//
//        for (;counter <= 10;){
//            System.out.println("perulangan" + counter);
//
//            counter++;
//        }
//
//        System.out.println(counter);
////perulangan  dengan  Initstatement
//        for (var counter = 1;counter <= 10;){
//            System.out.println("perulangan" + counter);
//            counter++;
//        }

        //perulangan  dengan  Poststatement
        for (var counter = 1;counter <= 10;counter++){
            System.out.println("perulangan" + counter);

        }
    }
}
