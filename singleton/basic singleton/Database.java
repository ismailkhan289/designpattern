public class Database{
    private static Database singleObject;
    private String name;
    private int record;

    private Database(String n){              //This constructor is private it means no one can access this
                                            // constructor for initiallizing but can be accessed through
                                            //getInstace()
        name=n;
        record=0;
    }
    public static Database getInstace(String n){
        if (singleObject==null) {
            singleObject=new Database(n);    //Here the value comes from Class object initiallizing.
                                            //assignment is for only one time if the instace is Null
                                            //Other next assignment is not allowed the previous one 
                                            //will be return. hu hu
                                            //This mehtod can also be said setter method of once.
        }
        return singleObject;
    }
    public String getName(){                //This method is return the value of name when it is 
                                            //initiallized with class constructor. It can also works as
                                            //getter mehtod.
        return name;
    }

    public void editRecors(String operation){
        System.out.println("Performing a "+operation+" operation on record "+record+" in database "+name);
    }
}