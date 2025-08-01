package main.com.watkins.behavioral.chainofresponsibility;

import java.time.LocalDate;
import java.time.Period;

public class LeaveApplication {

    public enum Type {Sick, PTO, Rejected}

    public enum Status {Pending, Approved, Rejected}

    private final Type type;

    private final LocalDate from;

    private final LocalDate to;

    private String processedBy;

    private Status status;

    public LeaveApplication(Type type, LocalDate from, LocalDate to) {
        this.type = type;
        this.from = from;
        this.to = to;
        this.status = Status.Pending;
    }

    public Type getType() {
        return type;
    }

    public LocalDate getFrom() {
        return from;
    }

    public LocalDate getTo() {
        return to;
    }

    public int getNumberOfDays() {
        return Period.between(from, to).getDays();
    }

    public String getProcessedBy() {
        return processedBy;
    }

    public Status getStatus() {
        return status;
    }

    public void approve(String approverName) {
        this.status = Status.Approved;
        this.processedBy = approverName;
    }

    public void reject(String approverName) {
        this.status = Status.Rejected;
        this.processedBy = approverName;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return type + " leave for " + getNumberOfDays() + " day(s) "+status
                + " by "+processedBy;
    }

    // LeaveApplication builder subclass named "Builder"
    public static class Builder {
        private Type type;
        private LocalDate from;
        private LocalDate to;
        private LeaveApplication application;

        private Builder() {

        }

        public Builder withType(Type type) {
            this.type = type;
            return this;
        }

        public Builder from(LocalDate from) {
            this.from = from;
            return this;
        }

        public Builder to(LocalDate to) {
            this.to = to;
            return this;
        }

        public LeaveApplication build() {
            this.application = new LeaveApplication(type, from, to);
            return this.application;
        }

        public LeaveApplication getApplication() {
            return application;
        }
    }
}
