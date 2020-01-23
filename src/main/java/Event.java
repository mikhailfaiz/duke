public class Event extends Task{
    protected String at;

    public Event(String description, String at, int entrynum) {
        super(description, entrynum);
        this.at = at;
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: " + at + ")";
    }
}
