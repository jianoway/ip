package duke.task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Deadline extends Task {

    protected LocalDate date;

    /**
     * The constructor for the Deadline object.
     *
     * @param description The description of the Deadline
     * @param date The due date
     */
    public Deadline(String description, LocalDate date) {
        super(description);
        this.taskType = TaskType.D;
        this.date = date;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += String.format(" (by: %s)", this.date.format(DateTimeFormatter.ofPattern("dd MMM yyyy")));
        return str;
    }

    @Override
    public String getDataString() {
        return String.format("%s_~_%s_~_%s_~_%s", this.taskType,
            this.getStatusInt(), this.description, this.date.format(DateTimeFormatter.ofPattern("d/MM/yyyy")));
    }
    @Override
    public boolean equals(Object object) {
        Deadline otherDeadline = (Deadline) object;
        return this.date.equals(otherDeadline.date)
                && this.getStatusIcon().equals(otherDeadline.getStatusIcon())
                && this.description.equals(otherDeadline.description)
                && this.taskType.equals(otherDeadline.taskType);
    }
}
