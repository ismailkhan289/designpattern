public class TestObserver{
    public static void main(String args[]){
        Database database=new Database();
        Archiver archiver=new Archiver();
        Client client=new Client();
        Boss boss=new Boss();

        database.regObservor(archiver);
        database.regObservor(client);
        database.regObservor(boss);        


        database.editRecords("delete", "record 1");

    }
}