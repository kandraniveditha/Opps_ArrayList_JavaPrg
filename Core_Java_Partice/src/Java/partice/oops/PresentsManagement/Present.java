package Java.partice.oops.PresentsManagement;

import java.util.ArrayList;
import java.util.List;

public class Present {
    private List<Sweet> sweets = new ArrayList<>();

    // Add a sweet to the present
    public void addSweet(Sweet sweet) {
        sweets.add(sweet);
    }

    // Calculate the total weight of the present
    public double calculateTotalWeight() {
        double totalWeight = 0;
        for (Sweet sweet : sweets) {
            totalWeight += sweet.getWeight();
        }
        return totalWeight;
    }

    // Filter sweets by sugar range
    public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {
        List<Sweet> filteredSweets = new ArrayList<>();
        for (Sweet sweet : sweets) {
            if (sweet.getSugarWeight() >= minSugarWeight && sweet.getSugarWeight() <= maxSugarWeight) {
                filteredSweets.add(sweet);
            }
        }
        return filteredSweets.toArray(new Sweet[0]);
    }
}