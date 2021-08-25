public class Event extends Task {

    protected String date;

    public Event(String description, String date) {
        super(description);
        this.date = date;
        this.taskType = TaskType.E;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += String.format(" (at: %s)", this.date);
        return str;
    }

    @Override
    public String getDataString() {
        return String.format("%s_~_%s_~_%s_~_%s", this.taskType, this.getStatusInt(), this.description, this.date);
    }

}
