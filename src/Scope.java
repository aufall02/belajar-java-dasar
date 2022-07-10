/**
 *
 */


public class Scope {
    public static void main(String[] args) {
        sayHello("Aufal");
        sayHello(""); // hi tidak tampi; karna pengecekan di ifnya nilainya false
    }
    static  void sayHello(String name){
        String hello = "Hello " + name;

        if (!name.isBlank()){
            String hi = "Hi " + name;
            System.out.println(hi);
        }
        System.out.println(hello);
    }
}
