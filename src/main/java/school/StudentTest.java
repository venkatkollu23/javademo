package school;

public class StudentTest {


    Student getSchoolName(Student student){


   student.schoolName="ABC";

    return  student;
}



    Student getSchoolNameDeepClone(Student student){
        Student clonedStudent = new Student();
        clonedStudent.name=student.name;
        clonedStudent.fatherName = student.fatherName;
        clonedStudent.dateOfBirth = student.dateOfBirth;
        clonedStudent.mobileNo = student.mobileNo;
        clonedStudent.schoolName="ABC";

        return  clonedStudent;
    }


    public static void main(String[] args){

        StudentTest test = new StudentTest();
        Student student = new Student();

        student.name="kiran";
        student.fatherName="Surya";
        student.dateOfBirth="01/01/2010";
        student.mobileNo="123456";


        Student studentLatest= test.getSchoolNameDeepClone(student);

        System.out.println("studentLatest  schoolName"+studentLatest.hashCode());


        System.out.println("Student  schoolName"+student.hashCode());

    }
}
