public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Gà: Chip chip!";
    }

    @Override
    public String howToEat() {
        return "Mổ";
    }
}
