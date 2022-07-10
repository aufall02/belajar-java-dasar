public class ForEach {

    public static void main(String[] args) {
        String [] names={
                "aufal","marom","ria","rima"
        };
//manual
        for (var i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
//menggunakan for Each
        for (var name : names){
            System.out.println(name);
        }
    }
}
