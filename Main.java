import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahPemain;
        String NamaPemain;
        Pemain player;
        System.out.println("PERMAINAN ULAR TANGGA");
            System.out.println("======================");
            do {
                System.out.print("Masukkan jumlah pemain (1-4): ");
                jumlahPemain = scanner.nextInt();
                
                if (jumlahPemain < 1 || jumlahPemain > 4) {
                    System.out.println("Jumlah pemain tidak valid!");
                    System.out.println("Total Maksimal pemain adalah 4 pemain");
                    return;
                }
            } while (jumlahPemain < 1 || jumlahPemain > 4);
            
            List<Pemain> players = new ArrayList<>();
            
            switch (jumlahPemain) {
            case 1:
            System.out.print("Masukkan nama pemain : ");
            NamaPemain = scanner.next();
            player = new PemainManusia(NamaPemain);
            players.add(player);
            player = new PemainComputer("Computer 1");
            players.add(player);
            player = new PemainComputer("Computer 2");
            players.add(player);
            player = new PemainComputer("Computer 3");
            players.add(player);
            break;
            case 2:
            for (int i = 1; i <= jumlahPemain; i++) {
                System.out.print("Masukkan nama pemain ke " + i + ": ");
                NamaPemain = scanner.next();
                player = new PemainManusia(NamaPemain);
                players.add(player);
            }
            player = new PemainComputer("Computer 1");
            players.add(player);
            player = new PemainComputer("Computer 2");
            players.add(player);
            break;
            case 3:
            for (int i = 1; i <= jumlahPemain; i++) {
                System.out.print("Masukkan nama pemain ke " + i + ": ");
                NamaPemain = scanner.next();
                player = new PemainManusia(NamaPemain);
                players.add(player);
            }
            player = new PemainComputer("Computer");
            players.add(player);
            break;
            case 4:
            for (int i = 1; i <= jumlahPemain; i++) {
                System.out.print("Masukkan nama pemain ke " + i + ": ");
                NamaPemain = scanner.next();
                player = new PemainManusia(NamaPemain);
                players.add(player);
            }
            break;
        }
        
        PermainanUlarTangga game = new PermainanUlarTangga(players);
        game.GameDimulai();
    }
}
