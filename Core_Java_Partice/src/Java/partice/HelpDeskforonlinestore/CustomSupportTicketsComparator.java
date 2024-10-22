package Java.partice.HelpDeskforonlinestore;

import java.util.Comparator;

public class CustomSupportTicketsComparator implements Comparator<SupportTicket> {
    @Override
    public int compare(SupportTicket t1, SupportTicket t2) {
        // First compare by priority
        int priorityComparison = t1.getPriority().compareTo(t2.getPriority());

        // If priorities are equal, compare by sequential number
        if (priorityComparison == 0) {
            return Integer.compare(t1.getSequentialNumber(), t2.getSequentialNumber());
        }
        return priorityComparison;
    }
}