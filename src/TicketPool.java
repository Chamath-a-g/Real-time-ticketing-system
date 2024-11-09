public class TicketPool {
    private int currentTickets;

    public TicketPool(int initialTickets) {
        this.currentTickets = initialTickets;
    }

    public synchronized void addTickets(int amount) {
        currentTickets += amount;
        System.out.println("Added " + amount + " tickets. Current total: " + currentTickets);
    }

    public synchronized boolean removeTicket() {
        if (currentTickets > 0) {
            currentTickets--;
            System.out.println("Ticket sold. Current total: " + currentTickets);
            return true;
        }
        return false;
    }
}
