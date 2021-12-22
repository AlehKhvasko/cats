package projectsHandsOn.AdvancedOOP.animals.cat;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /**
         *  Below code is for testing.
         */
        Plate plate = new Plate(10);
        //Cat cat = new Cat("Sir John", 5);
        //plate.info();
        //cat.eat(plate);
        //plate.info();

        /**
         * *
         * #5 Create an array of random cats and a plate with food and ask cats to eat from this plate.
         * Display results on a screen.
         */
        Cat[] cats = new Cat[10];
        String[] names = {"Black and White", "Little Bob", "Shiny", "Carrol", "Donut", "Trump",
                "Night Pain", "Frosty","Mr Sleepy","Shadow"};
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat(names[i], ((int)(Math.random()*10) + 1));
        }

        /**
         * create plate with food
         */
        plate.addFood(10);

        /**
         * feed all cats
         */
        for (Cat catt:cats) {
            System.out.println();
            System.out.print(catt.getName() + " appetite is>: " + catt.getAppetite() + " \n");
            catt.eat(plate);
            System.out.print(catt.getName() + " is hungry>: " + catt.isHungry + " \n");
            System.out.print("Remaining food on a ");
            plate.info();
        }
        plate.info();
    }
}
