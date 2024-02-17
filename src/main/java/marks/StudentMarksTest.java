package marks;

public class StudentMarksTest {

   public boolean isPassed(Subject subject) {
        System.out.println(" from isPassed " + subject.name);
        return subject.marks >= 35;
    }


   public  boolean isPassedInHindhi(Subject subject) {
        System.out.println(" from isPassedInHindhi " + subject.name);
        return subject.marks >= 21;
    }

    Student getResult(Student inputStudent) {


        if (isPassed(inputStudent.marks.engishSubject)){
            inputStudent.marks.engishSubject.result="Pass";
        }else{
            inputStudent.marks.engishSubject.result="Fail";
        }

        if (isPassed(inputStudent.marks.teluguSubject)){
            inputStudent.marks.teluguSubject.result="Pass";
        }else{
            inputStudent.marks.teluguSubject.result="Fail";
        }

        if (isPassed(inputStudent.marks.socailSubject)){
            inputStudent.marks.socailSubject.result="Pass";
        }else{
            inputStudent.marks.socailSubject.result="Fail";
        }
        if (isPassed(inputStudent.marks.sceinceSubject)){
            inputStudent.marks.sceinceSubject.result="Pass";
        }else{
            inputStudent.marks.sceinceSubject.result="Fail";
        }
        if (isPassed(inputStudent.marks.mathsSubject)){
            inputStudent.marks.mathsSubject.result="Pass";
        }else{
            inputStudent.marks.mathsSubject.result="Fail";
        }

        if (isPassed(inputStudent.marks.hindhiSubject)){
            inputStudent.marks.hindhiSubject.result="Pass";
        }else{
            inputStudent.marks.hindhiSubject.result="Fail";
        }



        if (inputStudent.marks.engishSubject.result.equals("Pass")
        && inputStudent.marks.hindhiSubject.result.equals("Pass")
                && inputStudent.marks.mathsSubject.result.equals("Pass")
                && inputStudent.marks.sceinceSubject.result.equals("Pass")
                && inputStudent.marks.socailSubject.result.equals("Pass")
                && inputStudent.marks.teluguSubject.result.equals("Pass")
        ){
            inputStudent.result="Pass";
        }else {
            inputStudent.result="Fail";
        }



        return inputStudent;
    }


    public static void main(String[] args) {


        Subject teluguSubject = new Subject("telugu",72);


        Subject hindhiSubject = new Subject();
        hindhiSubject.marks = 37;
        hindhiSubject.name = "hindhi";

        Subject mathsSubject = new Subject();
        mathsSubject.marks = 60;
        mathsSubject.name = "Maths";

        Subject socailSubject = new Subject();
        socailSubject.name = "social";
        socailSubject.marks = 52;
        Subject sceinceSubject = new Subject();
        sceinceSubject.marks = 51;
        sceinceSubject.name = "sceince";

        Subject engishSubject = new Subject();

        engishSubject.name = "english";
        engishSubject.marks = 21;


        Marks marks = new Marks();

        marks.engishSubject = engishSubject;
        marks.hindhiSubject = hindhiSubject;
        marks.mathsSubject = mathsSubject;
        marks.sceinceSubject = sceinceSubject;
        marks.teluguSubject = teluguSubject;
        marks.socailSubject = socailSubject;

        Student student = new Student();

        student.marks = marks;

        student.name = "srini";
        student.fatherName = "Surya";
        student.dateOfBirth = "01/01/2010";
        student.mobileNo = "12345";

        StudentMarksTest test = new StudentMarksTest();
        Student latestStudent = test.getResult(student);

        System.out.println(latestStudent);

    }
}
