public class KonversiNumber {
    public static void main(String[] args) {
        byte iniByte= 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        int iniInt2 = 100;
//      int iniInt2 = 1000; NUmber Over flow -> karna nilai melebihi ukuran yang dapat ditampung oleh byte
        byte iniByte2 = (byte) iniInt2;


    }
}
