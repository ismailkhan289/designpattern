public class HandsFree extends SamsungDecorator{
    Samsung samsung;
    public HandsFree(Samsung s){
        samsung=s;
    }
    public String bucket(){
        return samsung.bucket()+" and an Hands free";
    }
}