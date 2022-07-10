public class Continue {
    public static void main(String[] args) {

//continue untuk menghentinkan perulangan saat ini dan melanjutkan perulangan selanjtnya
        for (var counter = 1;counter <=100 ;counter ++) {
            if (counter % 2 == 0){
                continue;
            }
            System.out.println(" perulangan ganjil - " + counter);

        }
    }
}
