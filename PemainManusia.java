import java.util.Random;
import java.util.Scanner;

public class PemainManusia extends Pemain{
    public PemainManusia(String nama) {
        super(nama);
    }

    @Override
    public void playTurn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print(nama + ", tekan Enter untuk melempar dadu...");
        scanner.nextLine();

        Random random = new Random();
        int diceRoll = random.nextInt(6) + 1;
        System.out.println();
        System.out.println("=======================================================");
        System.out.println(nama + " mengocok dadu dan mendapatkan angka " + diceRoll);

        posisi += diceRoll;
    }

    @Override
    public void displayInfo() {
        System.out.println(nama + " sedang di kotak nomor: " + posisi);
        System.out.println("=======================================================");
    }
}
