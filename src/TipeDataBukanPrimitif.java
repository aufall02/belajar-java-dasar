public class TipeDataBukanPrimitif {

//    default value data bukan primitif adlah null karna berbentuk objek
//    default value data  primitif adlah 0 karna berbentuk objek
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 100000L;

        Byte iniByte = null;
//        byte inibyte = null; // eror karna default data primitif adalah 0

        System.out.println(iniByte);

        int iniInt = 100;
        Integer iniObject = iniInt;

        //konversi dari tipe data primitif ke non primitif

        short iniShort = iniObject.shortValue();
        long iniLong2  = iniObject.longValue();//mthod data bukan primitif
    }
}
