public class MethodVariableArgument {
    public static void main(String[] args) {

//        int [] values = {87,54,87,45,90,78};
        sayCongrats("ferian",80,80,90,34,7,86);

    }

    //tanpa varibale argument
//    static void sayCongrats(String name, int [] values){
    //Dengan variable argumnt
    static void sayCongrats(String name, int... values){
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue  = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " + name+ " , Anda Lulus");
        }else {
            System.out.println(" maaf "+ name+ " , Anda Belum Lulus");
        }
    }
}
