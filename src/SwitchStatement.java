public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "B";
//switch expreison
        switch (nilai){
            case "A":
                System.out.println("Wow Anda lulus dengan baik ");
                break;
            case "B":
            case "C":
                System.out.println("Nilai anda cukup baik");
                break;
            case "D":
                System.out.println("Anda Tidak lulus");
                break;
            default:
                System.out.println("Mungkin adna salah jurusan");
        }

        //switch lamda

        switch (nilai){
            case "A" -> System.out.println("Wow anda lulus dengan baik");
            case "B", "C" -> System.out.println("Nilai anda Cukup baik");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> {
                System.out.println("Mungkin anda salah Jurusan");
            }
        }

        //manual
        String ucapan;
        switch (nilai){
            case "A" -> ucapan = "Wow anda lulus dengan baik";
            case "B", "C" -> ucapan = "Nilai anda Cukup baik";
            case "D" -> ucapan="Anda tidak lulus";
            default -> {
                ucapan="Mungkin anda salah Jurusan";
            }
        }

//        Switch dengan yield

        ucapan = switch (nilai){
            case "A" : yield "Wow anda lulus dengan baik";
            case "B","C" : yield "Nilai anda cukup baik";
            case "D" : yield "Anda Tidak lulus";
            default:yield "Mungkin anda salah jurusan";
        };
        System.out.println(ucapan);
    }
}
