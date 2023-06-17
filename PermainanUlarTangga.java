import java.util.List;

public class PermainanUlarTangga {
    private List<Pemain> pemain;
    private int indexpemainsaatini;
    private boolean gameOver;

    public PermainanUlarTangga(List<Pemain> pemain) {
        this.pemain = pemain;
        this.indexpemainsaatini = 0;
        this.gameOver = false;
    }

    public void GameDimulai() {
        System.out.println("Permainan Ular Tangga dimulai!");

        while (!gameOver) {
            Pemain pemainsaatini = pemain.get(indexpemainsaatini);

            pemainsaatini.playTurn();
            CekUlarTangga(pemainsaatini);
            CekKondisiPermainan(pemainsaatini);

            pemainsaatini.displayInfo();

            indexpemainsaatini = (indexpemainsaatini + 1) % pemain.size();
        }
    }

    private void CekUlarTangga(Pemain player) {
        int posisisaatini = player.getPosisi();
        int posisibaru;

        if (posisisaatini > PapanPermainan.getUkuranPapan()) {
            posisibaru = PapanPermainan.getUkuranPapan() - (posisisaatini - PapanPermainan.getUkuranPapan());
        } else {
            posisibaru = PapanPermainan.getTujuanUlar(posisisaatini);
            posisibaru = PapanPermainan.getTujuanTangga(posisibaru);
        }

        player.setPosisi(posisibaru);
    }

    private void CekKondisiPermainan(Pemain player) {
        if (player.getPosisi() == PapanPermainan.getUkuranPapan()) {
            System.out.println();
            System.out.println("SELAMAT "+player.getNama() + " TELAH BERHASIL MEMENANGKAN PERMAINAN!");
            gameOver = true;
        }
    }
}
