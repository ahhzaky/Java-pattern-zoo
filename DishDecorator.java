public abstract class DishDecorator implements Dish {
    private Dish newDish;

    public DishDecorator(Dish newDish) {
        this.newDish = newDish;
    }

    @Override
    public String giveFood() {
        return newDish.giveFood();
    }

    public String giveDrink() {
        return newDish.giveFood();
    }
}
