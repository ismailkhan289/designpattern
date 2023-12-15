public class TestingStudent {
    public static void main(String[] args) {
        String names[]={"kami", "rashid", "ali"};
        int ids[]={121,122,123};
        int scores[]={34,56,65};
        
        double total=0;
        for(int loopIndex=0; loopIndex < scores.length; loopIndex++){
            total+=scores[loopIndex];
        }
        double averageScore=total/scores.length;
        Student student=new Student(averageScore);

        for (int loopIndex=0;loopIndex<scores.length;loopIndex++){
            student.setName(names[loopIndex]);
            student.setId(ids[loopIndex]);
            student.setScore(scores[loopIndex]);
        
        
        System.out.println("Name Student: "+student.getName());
        System.out.println("Ranking: "+ Math.round(student.getStandings()));
        System.out.println(" ");
        }
    }
}
