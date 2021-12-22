package projectsHandsOn.AdvancedOOP.animals.cat;

public class Cat {
    private String name;
    private int appetite;
    /**
     * #3 Add a field of fullness to a cat.
     */
    boolean isHungry = true;

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
    }

    /**
     * #4 if cat has not enough food, he remains hungry.
     * @param plate
     */
    public void eat(Plate plate){
        if (plate.decreaseFood(this.appetite)){
            //plate.decreaseFood(this.appetite);
            isHungry = false;
        }else {
            isHungry = true;
        }

    }
}
