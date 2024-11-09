import java.util.Scanner;

public class Configuration {
    private int totalTickets;
    private int ticketReleaseRate;
    private int customerRetrievalRate;
    private int maxTicketCapacity;

    public Configuration() {
        configureSystem();
    }

    private void configureSystem() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("System Configuration:");
        this.totalTickets = promptForPositiveInt(scanner, "Total Tickets");
        this.ticketReleaseRate = promptForPositiveInt(scanner, "Ticket Release Rate");
        this.customerRetrievalRate = promptForPositiveInt(scanner, "Customer Retrieval Rate");
        this.maxTicketCapacity = promptForPositiveInt(scanner, "Max Ticket Capacity");
    }

    private int promptForPositiveInt(Scanner scanner, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt + ": ");
            try {
                value = Integer.parseInt(scanner.nextLine());
                if (value > 0) {
                    return value;
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a positive integer.");
            }
        }
    }

    public int getTotalTickets() { return totalTickets; }
    public int getTicketReleaseRate() { return ticketReleaseRate; }
    public int getCustomerRetrievalRate() { return customerRetrievalRate; }
    public int getMaxTicketCapacity() { return maxTicketCapacity; }
}
