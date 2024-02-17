package school;

public class Student {


    public String name;
    public String fatherName;
    public  String mobileNo;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    public String dateOfBirth;

    String schoolName;

}
