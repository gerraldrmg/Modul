public class TestBus3 {
    public static void main(String[] args) {
        Bus3 bus = new Bus3(10);
    
            bus.plusPenumpang(6);
            bus.plusBerat(60);
            bus.plusBerat(20);
            bus.plusBerat(30);
            bus.plusBerat(69);
            bus.plusBerat(40);
            bus.plusBerat(10);
            bus.cetak();
    }
    
}
