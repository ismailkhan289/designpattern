public class DisplayBikes{
    public static void main(String[] args) {
        Honda honda =new Honda();
        Unique unique = new Unique();
        Metro metro = new Metro();
        honda.bikeDisp();
        metro.bikeDisp();
        unique.bikeDisp();
    }
}