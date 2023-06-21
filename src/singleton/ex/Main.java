package singleton.ex;

public class Main {
    public static void main(String[] args) {
        TicketMaker t1 = TicketMaker.getInstance();
        System.out.println("t1 = " + t1.getNextTicketNumber());
        TicketMaker t2 = TicketMaker.getInstance();
        System.out.println("t2 = " + t2.getNextTicketNumber());
        System.out.println("t1 = " + t1.getNextTicketNumber());
        System.out.println("t2 = " + t2.getNextTicketNumber());

        Triple triple = Triple.getInstance("ALPHA");


    }
}
