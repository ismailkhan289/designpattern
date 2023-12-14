public abstract class Vehicle{
    private MyGoAlgo goAlgo;
    public Vehicle(){

    }//constructor
    public void setMyGoAlgorithm(MyGoAlgo algorithm){
        goAlgo=algorithm;
    }
    public void go(){
        goAlgo.go();
    }
}