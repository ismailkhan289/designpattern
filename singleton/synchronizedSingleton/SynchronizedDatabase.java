public class SynchronizedDatabase{

    private static SynchronizedDatabase singleObject;
    private int record;
    private String name;

    private SynchronizedDatabase(String n){
        name=n;
        record=0;
    }

    public static synchronized SynchronizedDatabase getInstance(String n){
        if(singleObject==null){
            singleObject = new SynchronizedDatabase(n);
        }
        return singleObject;
    }

    public String getName(){
        return name;
    }

    public void editRecords(String operation){
        System.out.println("Performing a + "
        +operation+" operation on record "+record+ " in database "+name );

    }
}