public abstract class Pemain {
    protected String nama;
    protected int posisi;

    public Pemain(String nama) {
        this.nama = nama;
        this.posisi = 1;
    }

    public String getNama() {
        return nama;
    }

    public int getPosisi() {
        return posisi;
    }

    public void setPosisi(int posisi) {
        this.posisi = posisi;
    }

    public abstract void playTurn();

    public abstract void displayInfo();
}
