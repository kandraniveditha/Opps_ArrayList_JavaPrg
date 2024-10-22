package Java.partice.Messagetypepriority;

public enum Priority {
    LOW(1),
    MEDIUM(2),
    HIGH(3),
    CRITICAL(4);

    private final int level;

    // Constructor to assign priority level
    Priority(int level) {
        this.level = level;
    }

    // Getter to return the priority level
    public int getLevel() {
        return level;
    }
}

