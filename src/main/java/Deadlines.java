public class Deadlines extends Task {

    protected String by;

    public Deadlines(String description, String by) {
        super(description);
        this.by = by;
    }

    @Override
    public String addString(int i) {
        String line = "_______________________________\n";
        String gotIt = "Got it. I've added this task: \n";
        String task = this.toString() + "\n";
        String now = String.format("Now you have %d tasks in the list \n", i);
        return line + gotIt + task + now + line;
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + by + ")";
    }

    public void setBy(String date) {
        by = date;
    }

    @Override
    public String saveString() {
        if (this.isDone) {
            return "D" + "X " + this.description + "/by" + this.by + "\n";
        } else {
            return "D  " + this.description + "/by" + this.by + "\n";
        }
    }
}
