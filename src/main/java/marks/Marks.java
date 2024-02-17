package marks;

public class Marks {

    public Marks(){
        System.out.println("  From Default Marks Subject  ");
    }


    public Subject teluguSubject;

    public Subject hindhiSubject;
    public Subject mathsSubject;
    public  Subject socailSubject;
    public Subject sceinceSubject;
    public  Subject engishSubject;

    @Override
    public String toString() {
        return "Marks{" +
                "teluguSubject=" + teluguSubject +
                ", hindhiSubject=" + hindhiSubject +
                ", mathsSubject=" + mathsSubject +
                ", socailSubject=" + socailSubject +
                ", sceinceSubject=" + sceinceSubject +
                ", engishSubject=" + engishSubject +
                '}';
    }
}
