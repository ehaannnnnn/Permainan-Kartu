import java.util.Random;

public class PemainComputer extends Pemain{
    public PemainComputer(String name) {
        super(name);
    }

    @Override
    public void playTurn() {
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
