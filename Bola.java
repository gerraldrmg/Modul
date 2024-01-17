public class Bola {
    private double jarijari;

    public Bola(double jarijari) {
        this.jarijari = jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    public void showDiameter() {
        double diameter = 2 * jarijari;

        System.out.printf("Diameter bola = %.2f\n", diameter);
    }

    public void showLuasPermukaan() {
        double luas = 4 * Math.PI * Math.pow(jarijari, 2);
        System.out.printf("Luas permukaan bola = %.2f\n", luas);
    }

    public void showVolume() {
        double volume = 4.0 / 3.0 * Math.PI * Math.pow(jarijari, 3);
        System.out.printf("Volume bola = %.2f\n", volume); }
    }