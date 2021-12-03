public class DishNotGiven extends Observer {
    public DishNotGiven(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        if (subject.getState() == "Not") {
            System.out.println("makanan dan minuman tidak diberikan");
        }
    }
}
