class KarakterGame {
    private final String nama;
    private int kesehatan;

    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }
    public String getNama() {
        return nama;
    }
    public int getKesehatan() {
        return kesehatan;
    }
    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }
}

class Pahlawan extends KarakterGame {
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan pedang!");
        target.setKesehatan(target.getKesehatan() - 20);
        System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
    }
}

class Musuh extends KarakterGame {
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan sihir!");
        target.setKesehatan(target.getKesehatan() - 15);
        System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
    }
}

public class Codelab {
    public static void main(String[] args) {
        Pahlawan brimstone = new Pahlawan("Brimstone", 150);
        Musuh viper = new Musuh("Viper", 200);

        System.out.println("Kesehatan Awal:");
        System.out.println(brimstone.getNama() + " - " + brimstone.getKesehatan());
        System.out.println(viper.getNama() + " - " + viper.getKesehatan());

        System.out.println("\nPertarungan dimulai!");
        brimstone.serang(viper);
        viper.serang(brimstone);
    }
}

