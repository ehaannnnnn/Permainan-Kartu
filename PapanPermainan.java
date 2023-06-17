public class PapanPermainan {
    // set ukuran papan
    private static final int Ukuran_Papan = 100;

    // set lokasi dan tujuan dari Ular & Tangga
    private static final int[] Lokasi_Ular = {16, 47, 49, 56, 62, 64, 87, 93, 95, 98};
    private static final int[] Tujuan_Ular = {6, 26, 11, 53, 19, 60, 24, 73, 75, 78};
    private static final int[] Lokasi_tangga = {1, 4, 9, 21, 28, 36, 51, 71, 80};
    private static final int[] Tujuan_Tangga = {38, 14, 31, 42, 84, 44, 67, 91, 100};

    public static int getUkuranPapan() {
        return Ukuran_Papan;
    }

    public static int getTujuanUlar(int posisi_ular) {
        for (int i = 0; i < Lokasi_Ular.length; i++) {
            if (Lokasi_Ular[i] == posisi_ular) {
                return Tujuan_Ular[i];
            }
        }
        return posisi_ular;
    }

    public static int getTujuanTangga(int posisi_tangga) {
        for (int i = 0; i < Lokasi_tangga.length; i++) {
            if (Lokasi_tangga[i] == posisi_tangga) {
                return Tujuan_Tangga[i];
            }
        }
        return posisi_tangga;
    }
}

/*saya membuat class papan permainan untuk mendesain papan permainan ular tangganya
* saya set ukuran ukuran papannya 100
* saya juga men set lokasi untuk ular dan tangganya, sekaligus dengan tujuannya
* saya membuat method getTujuanUlar yang mana nantinya akan merubah posisi pemain sama dengan posisi tujuan ular.
* saya juga membuat method getTujuanTangga yang mana nantinya akan merubah posisi pemain sama dengan posisi tujuan Tangga.
*/