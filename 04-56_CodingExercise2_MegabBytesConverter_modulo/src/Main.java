/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
    }
}


/**
 * MegaBytesConverter
 */
class MegaBytesConverter {

    /**
     * printMegaBytesAndKiloBytes()
     * @param kiloBytes
     */
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = kiloBytes / 1024;
        int remainingKiloBytes = kiloBytes % 1024; // modulus: remaining KB
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
}
