public class Student{
    String name;
    int id;
    int score;
    double averageScore;

    public Student(double a){
        averageScore=a;
    }
    public void setName(String n){
        name=n;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setScore(int s){
        score=s;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getScore(){
        return score;
    }

    public double getStandings(){
        return (((double) score)/averageScore-1.0)*100.00;
    }

}