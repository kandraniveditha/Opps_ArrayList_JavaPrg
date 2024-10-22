package Java.partice.Messagetypepriority;

public enum MessageType {
    A(Priority.LOW),
    B(Priority.MEDIUM),
    C(Priority.HIGH),
    D(Priority.CRITICAL);

    private final Priority priority;

    // Constructor to assign priority to each message type
    MessageType(Priority priority) {
        this.priority = priority;
    }

    // Getter to return the priority of the message type
    public Priority getPriority() {
        return priority;
    }
}
