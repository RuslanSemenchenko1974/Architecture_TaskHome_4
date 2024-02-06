import java.util.Date;

public class Ticket {

    int rootNumber;
    int price;
    Date dataStart;
    Date dataEnd;
    int place;
    boolean isValid;
    public Ticket(int rootNumber,
    int price,
    Date dataStart,
    Date dataEnd,
    int place,
    boolean isValid){
        this.rootNumber = rootNumber;
        this.dataStart = dataStart;
        this.dataEnd = dataEnd;
        this.place = place;
        this.isValid = isValid;
    }
}