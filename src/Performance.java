public class Performance {
    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public static void main(String[] args) {
        Performance performance = new Performance();
        performance.status = Status.MEDIUM;
        System.out.println(performance.status);
    }
}
