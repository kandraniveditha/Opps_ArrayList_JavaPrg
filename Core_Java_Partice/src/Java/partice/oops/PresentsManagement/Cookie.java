package Java.partice.oops.PresentsManagement;

public abstract class Cookie extends Sweet {
    private double doughWeight;

    public double getDoughWeight() {
        return doughWeight;
    }

    public void setDoughWeight(double doughWeight) {
        this.doughWeight = doughWeight;
    }

    @Override
    public String toString() {
        return "Cookie [name=" + getName() + ", weight=" + getWeight() + ", sugarWeight=" + getSugarWeight() + ", doughWeight=" + doughWeight + "]";
    }
}