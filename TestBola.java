public class TestBola {
    public static void main(String[] args) {
        double jarijari = 10.0;

        // Menciptakan objek bola dengan menggunakan konstruktor Bola(jarijari)
        Bola bola = new Bola(jarijari);

        // Memanggil method showDiameter(), showLuasPermukaan(), dan showVolume() untuk objek bola
        bola.showDiameter();
        bola.showLuasPermukaan();
        bola.showVolume();

        // Memanipulasi objek bola dengan memanggil method setJarijari() dengan menggunakan variable jarijari yang telah dibuat
        bola.setJarijari(15.0);

        // Menampilkan lagi hasilnya dengan menggunakan method showDiameter(), showLuasPermukaan(), dan showVolume() untuk objek bola
    bola.showDiameter();
    bola.showLuasPermukaan();
    bola.showVolume();
}
}