public class TestSingleton{
    public static void main(String args[]){

        Database database; // calling the Database Class using instace of database.
        database=  Database.getInstace("myInstance"); //initiallizing the the value through getInstace
                                                        //method that will also pass through private
                                                        //constructor.

        System.out.println("This is the "+ database.getName()+ " database"); //Here we simply call the getName
                                                                            // method for getting the name of
                                                                            //initiallized object.

        database = Database.getInstace("yourInstace");//using this method we are again try to initialize
                                                        //the object but it will go in vien because the object
                                                        //is already initiallized.
        System.out.println("Is this your Instance? Check Please! "+ database.getName()+" database");//So here
                                                        //we will get the same object where it was initiallized
                                                        //for the first time. That is the core object of sigleton
                                                        //pattern that one object will used throughout your program.
    }
}