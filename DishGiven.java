public class DishGiven extends Observer {
    public DishGiven(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        if (subject.getState() == "yes") {
            System.out.println("Makanan dan minuman telah di berikan");
        }
    }
}
