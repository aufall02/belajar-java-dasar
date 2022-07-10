public class MethodOverLoading {

    //method over loading yaitu kempampuan untuk memiliki nama method yang sama namun dengna parameter yang berbeda
    public static void main(String[] args) {
        sayHello();
        sayHello("aufal");
        sayHello("aufal","marom");

    }
    static void sayHello(){
        System.out.println(" Hello word");
    }

    static void sayHello(String name){
        System.out.println(" Hello " + name);
    }

    static  void sayHello(String firstName, String lastName){
        System.out.println(" Hello " + firstName + " " + lastName);
    }
}
