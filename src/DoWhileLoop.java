public class DoWhileLoop {
    public static void main(String[] args) {

        //do while adalah kebalikan dari while
        var counter = 100;

        while (counter <= 10){
            System.out.println("perulangan" + counter);
            counter++;
        }

        do{
            System.out.println("perulangan "+ counter);
        } while (counter <= 10);
    }
}
