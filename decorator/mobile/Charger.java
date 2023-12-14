public class Charger extends SamsungDecorator{
    Samsung samsung;
    public Charger(Samsung s){
        samsung=s;
    }
    public String bucket(){
        return samsung.bucket()+ " and a Charger";
    }
}