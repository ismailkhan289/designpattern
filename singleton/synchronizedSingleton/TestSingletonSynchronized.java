public class TestSingletonSynchronized implements Runnable
{
    Thread thread;
    public static void main(String args[])
    {
    TestSingletonSynchronized t = new TestSingletonSynchronized();
    }
    public TestSingletonSynchronized()
    {
    SynchronizedDatabase database;
        database = SynchronizedDatabase.getInstance("products");
        thread = new Thread(this, "second");
        thread.start(); 
        System.out.println("This is the " +
        database.getName() + " database.");
    }

    public void run()
    {
        SynchronizedDatabase database = 
    SynchronizedDatabase.getInstance("employees");
    System.out.println("This is the " +
    database.getName() + " database.");
    }
}
