package projectsHandsOn.AdvancedOOP.animals.cat;

public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }

    public void info() {
        System.out.println("plate:> " + food);
    }
    /**
     * #2 Make sure you have enough of food to feed a current cat.
     * @param appetite amount of food(hunger) of a cat.
     * @return true/false based on remaining food.
     */
    public boolean decreaseFood(int appetite){
        if (food > appetite){
            food -= appetite;
            return true;
        }
        return false;
    }

    /**
     * #6 Create a method that increases food amount.
     * @param food
     */
    public void addFood(int food){
        this.food += food;
    }
}
