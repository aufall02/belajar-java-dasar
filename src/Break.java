public class Break {
    public static void main(String[] args) {

        //kata kunci break untuk menhentikan perulangan
        var counter = 1;

        while (true){
            System.out.println("perulangan ke- "+ counter);
            counter++;

            if (counter > 10){
                break;
            }
        }

        System.out.println("Perulangan berhenti");




    }
}
