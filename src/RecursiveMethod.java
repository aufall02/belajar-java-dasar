public class RecursiveMethod {
    //recursive method kemapuan memanggil method itu sendiri
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(1 * 2 * 3 * 4 * 5);
        System.out.println(factorialRecursive(5));

        loop(10000); //StackOverFlowError karna terlalu dalam ketika pemanggilan method atau melewati batas pemanggilan method
    }
    static  int factorialLoop(int value){
        var result = 1;

        for (var i = 1; i <= value ; i++){
            result *= i;

        }
        return result;
    }

    static  int factorialRecursive(int value ){
        if (value == 1){
            return 1;
        }else {
            return value    * factorialRecursive(value-1);
        }
    }

    static void loop(int value){
        if (value == 0){
            System.out.println("selasai");
        }else {
            System.out.println("Loop "+value );
            loop(value -1);
        }
    }
}
