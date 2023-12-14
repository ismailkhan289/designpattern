public class TestingSynchDatabase implements Runnable{
    Thread thread;

    public static void main(String[] args) {
        TestingSynchDatabase t=new TestingSynchDatabase();
    }

    public TestingSynchDatabase(){
        SynchronizedDatabase database;
        database =SynchronizedDatabase.getInstane("products");
        thread= new Thread(this, "second");
        thread.start();
        
        System.out.println("This is the" +
        database.getName() + "database.");
    }
    public void run()
    {    
        SynchronizedDatabase database = SynchronizedDatabase.getInstane("employees");
        System.out.println("This is the " +database.getName() + " database.");
    }

}