package Java.partice.oops.PresentsManagement;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {

        // Create instances of sweets
        Sweet candy = new RitterSport();
        candy.setName("Ritter Sport");
        candy.setSugarWeight(0.53);
        candy.setWeight(0.05);

        Cookie cookie = new Oreo();
        cookie.setName("Milk Oreo");
        cookie.setSugarWeight(0.1);
        cookie.setDoughWeight(0.3);
        cookie.setWeight(0.2);

        Sweet lollipop = new LollipopCandy();
        lollipop.setName("Lollipop");
        lollipop.setSugarWeight(0.2);
        lollipop.setWeight(0.5);

        // Create a present
        Present present = new Present();
        present.addSweet(candy);
        present.addSweet(cookie);
        present.addSweet(lollipop);

        // Filter sweets by sugar range
        Sweet[] filteredSweets = present.filterSweetsBySugarRange(0, 0.20);
        System.out.println(Arrays.toString(filteredSweets));

        // Calculate total weight of the present
        System.out.println("Total weight of the present: " + present.calculateTotalWeight());
    }
}

// Concrete class for Ritter Sport (a type of ChocolateCandy)
class RitterSport extends ChocolateCandy {
    // Additional attributes or methods specific to RitterSport can be added here
}

// Concrete class for Lollipop (as LollipopCandy)
class LollipopCandy extends Lollipop {
    // Additional attributes or methods specific to LollipopCandy can be added here
}