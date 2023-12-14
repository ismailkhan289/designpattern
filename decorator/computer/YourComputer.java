public class YourComputer{
    public static void main(String[] args){
        Computer computer = new Computer();
        computer = new CD(computer);
        computer = new Monitor(computer);
        computer = new Disk(computer);
        System.out.println(computer.description());
    }
}