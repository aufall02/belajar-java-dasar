public class Array {
    public static void main(String[] args) {
        // tipe data [] nama variable Array
        String [] stringArray;
        stringArray = new String[2];

        stringArray [0] = "Aufal";
        stringArray [1] = "Marom";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);

        stringArray[0] = "Budi";
        stringArray[0] = null;
        System.out.println(stringArray[0]);

        String [] stringArray2 = new String[3];


        //inisialisai dara array

        int[] arrayInt = new int[]{
                12,23,21,54,76
        };

        long [] arrayLong = {12L,21L,43L,56L};

        arrayLong [0]= 0 ;

        System.out.println(arrayLong.length);

        String [][] members = {
                {"pikri","niko"},
                {"basofi","aziz"},
                {"bayu","rezal"}
        };

        System.out.println(members[0]);
        System.out.println(members[2][0]);

    }
}
