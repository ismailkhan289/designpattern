public interface Subject{
    public void regObservor(Observer o);   
    public void remObservor(Observer o);
    public void notifyObservor();


}