import java.util.ArrayList;

public class Customer {
    int id;
    ArrayList<Ticket> tickets;
    CashProvider cashProvider;

    public Customer(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
        this.id = 0;
        this.cashProvider = new CashProvider();
    }

    public boolean buyTicket(Ticket ticket) {
        return true;
    }

    public boolean repealTicket(Ticket ticket) {
        return false;
    }

    public ArrayList<Ticket> searchTicket(int rootNumber){
        return new ArrayList<Ticket>();
    }
}
