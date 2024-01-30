public class Task {
    private static int counter=0;
    private int id;
    private String title;
    private int days;
    private Status status;

    public Task(String title, int days, Status status) {
        this.id = ++counter;
        this.title = title;
        this.days = days;
        this.status = status;
    }

    @Override
    public String toString() {
        return id + " Task: " + title + " [" + status + " " + days + "]";
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        return id == task.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getDays() {
        return days;
    }

    public Status getStatus() {
        return status;
    }
}
