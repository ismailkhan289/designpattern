public class MyStore{
    public static void main(String[] args){
        Samsung s=new Samsung();
        s=new HandsFree(s);
        s= new Charger(s);
        s=new PowerBank(s);

        System.out.println(s.bucket());
    }
}