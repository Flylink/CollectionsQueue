public class Person {
    protected String name;
    protected String surname;
    protected int amountTickets;

    public Person(String name, String surname, int amountTickets) {
        this.name = name;
        this.surname = surname;
        this.amountTickets = amountTickets;
    }

    public void spendTicket() {
        amountTickets--;
    }

    public boolean hasMoreTickets() {
        return amountTickets > 0;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAmountTickets() {
        return amountTickets;
    }
}
