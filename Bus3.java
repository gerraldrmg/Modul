public class Bus3{
    private int penumpang,maxpenumpang;
    private double beratPenumpang;

public Bus3 (int maxpenumpang){
    this.maxpenumpang=maxpenumpang;
    penumpang=0;
    beratPenumpang=0;
}
public void plusPenumpang (int penumpang){
    int temp;
    temp= this.penumpang+penumpang;
    if (temp >=maxpenumpang){
        System.out.println("Over Load Penumpang");
    }else 
    this.penumpang=temp;

}

public double getPenumpang(){
    return penumpang;
}
public void plusBerat(double berat){
    beratPenumpang += berat;
}
public double getAverege(){
    return beratPenumpang/getPenumpang();
}
public void cetak(){
    System.out.println("Penumpang yang Sekarang : "+penumpang);
    System.out.println("Penumpang yang Seharusnya : "+maxpenumpang);
    System.out.println("Berat yang Sekarang : "+beratPenumpang);
    System.out.println("Berat yang Seharusnya : "+getAverege());
}
}