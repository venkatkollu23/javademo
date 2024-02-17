package constructoroverloading;

public class ConstructTest {

    public static void main(String[] args){

       /* Address address = new Address();
        address.city="KPHP";
        address.pinCode="1234";
        Student student = new Student("srini","Surya",
                "01/01/2010","12345",address
                );

System.out.println("    Joining student "+student);
*/

        Student examStudent = new Student("kiran","Surya",
                "01/01/2010","12345");


        examStudent.getAdharNo();
        examStudent.getFatherName();

        System.out.println("    examStudent student "+examStudent);


    }
}
