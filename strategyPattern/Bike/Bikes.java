public abstract class Bikes{
    private MyBikeInt dispCurrentBike;
    public Bikes(){

    }

    public void setMyBikeInterface(MyBikeInt whicBike){
        dispCurrentBike=whicBike;
    }
    
    public void bikeDisp(){
        dispCurrentBike.bikeDisp();
    }
}