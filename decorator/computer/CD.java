public class CD extends ComputerDecorator{
    Computer computer; // variable for storage of superclass description

    public CD(Computer c){
        computer=c; 

    }//constructor for CD to bring the description from superclass description of computer
    public String description(){
        return computer.description()+ " and a CD";
    }
}