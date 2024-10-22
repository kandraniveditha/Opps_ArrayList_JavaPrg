package Java.partice.HelpDeskforonlinestore;

import java.util.PriorityQueue;

public class DefaultHelpDeskFacade implements HelpDeskFacade {
    private PriorityQueue<SupportTicket> ticketQueue;
    private int nextSequenceNumber = 1;

    public DefaultHelpDeskFacade() {
        // Initialize priority queue with custom comparator for ticket ordering
        this.ticketQueue = new PriorityQueue<>(new CustomSupportTicketsComparator());
    }

    @Override
    public void addNewSupportTicket(SupportTicket supportTicket) {
        // Add ticket to queue and set its unique sequential number
        ((DefaultSupportTicket) supportTicket).setSequentialNumber(nextSequenceNumber++);
        ticketQueue.add(supportTicket);
    }

    @Override
    public SupportTicket getNextSupportTicket() {
        return ticketQueue.poll();
    }

    @Override
    public int getNumberOfTickets() {
        return ticketQueue.size();
    }
}