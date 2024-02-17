package bankdemo;


public class CardProcessTest {
    public static void main(String[] args) throws InterruptedException {



        CardProcessService processService = new CardProcessService();


        boolean loginStatus = processService.login(new CardDetails());

        CreditService creditService = new CreditService();
       if (loginStatus){
       int balance =     creditService.credit("1234 1234 1234",100);
           System.out.println(balance);
           System.out.println("  CreditService   hashcode "+creditService.hashCode());
           int balance2 =     creditService.credit("1234 1234 1234",100);
           System.out.println("  CreditService creditService2   hashcode "+creditService.hashCode());
           System.out.println(balance2);


       }
    }
}
