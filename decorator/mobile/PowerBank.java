public class PowerBank extends SamsungDecorator{
    Samsung samsung;
    public PowerBank(Samsung s){
        samsung=s;
    }

    public String bucket(){
        return samsung.bucket()+" and a power bank";
    }
}