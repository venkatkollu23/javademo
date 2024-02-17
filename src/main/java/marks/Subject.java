package marks;

public class Subject {



    public Subject(String subjectName,int subjectMarks){
        this.name = subjectName;
        this.marks = subjectMarks;

        System.out.println("  From Default constructor Subject  ");
    }


    public Subject(){

    }



    public  String name;
    public int marks;

    public  String result;

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
