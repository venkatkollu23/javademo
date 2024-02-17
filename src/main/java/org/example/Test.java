package org.example;

public class Test {

    public static void main(String[] args){
        TicketBookService ts = new TicketBookService();

        Ticket ticket = ts.bookTicket(6,"Salar","6AM");

        System.out.println(ticket);
ts.hello();
ts.hi();


    }
}
