import java.util.*;

import javax.xml.crypto.Data;
public class Database implements Subject{

    private Vector<Observer> observers;
    private String operation;
    private String record;

    public Database(){//construtor databse
        observers=new Vector<>();
    }

    public void regObservor(Observer o){
        observers.add(o);
    }
    public void remObservor(Observer o){
        observers.remove(o);
    }
    public void editRecords(String operation, String record){
        this.operation=operation;
        this.record=record;
        notifyObservor();
    }
    public void notifyObservor(){
        for (int i = 0; i < observers.size(); i++) {
            Observer observer=(Observer) observers.get(i);
            observer.update(operation, record);
        }
    }
}