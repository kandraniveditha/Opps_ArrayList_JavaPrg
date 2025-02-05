package Java.partice.oops.PresentsManagement;

public abstract class Sweet {
    private String name;
    private double weight;
    private double sugarWeight;

    // Getters and setters for name, weight, and sugarWeight
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSugarWeight() {
        return sugarWeight;
    }

    public void setSugarWeight(double sugarWeight) {
        this.sugarWeight = sugarWeight;
    }

    @Override
    public String toString() {
        return "Sweet [name=" + name + ", weight=" + weight + ", sugarWeight=" + sugarWeight + "]";
    }
}