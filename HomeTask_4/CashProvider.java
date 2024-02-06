public class CashProvider {
    Long card;
    boolean isAuthoriation;

    boolean buy(int price) {
        return true;
    }

    boolean repealTicket(int price) {
        return false;
    }
    void isAuthoriation(Customer customer){}
}
