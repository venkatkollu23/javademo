package marks;

public class Student {

    public Student(){
        System.out.println("  From Default Student Subject  ");
    }

    public String name;
    public String fatherName;
    public  String mobileNo;


    public String dateOfBirth;

    String schoolName;

    public  Marks marks;

    public String result;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", marks=" + marks +
                ", result='" + result + '\'' +
                '}';
    }
}
