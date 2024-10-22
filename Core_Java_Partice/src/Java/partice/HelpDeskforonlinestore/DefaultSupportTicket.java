package Java.partice.HelpDeskforonlinestore;

public class DefaultSupportTicket implements SupportTicket {
    private int sequentialNumber;
    private Priority priority;
    private RequestType requestType;

    public DefaultSupportTicket(Priority priority, RequestType requestType) {
        this.priority = priority;
        this.requestType = requestType;
    }

    @Override
    public Priority getPriority() {
        return priority;
    }

    @Override
    public int getSequentialNumber() {
        return sequentialNumber;
    }

    public void setSequentialNumber(int sequentialNumber) {
        this.sequentialNumber = sequentialNumber;
    }

    @Override
    public RequestType getRequestType() {
        return requestType;
    }
}