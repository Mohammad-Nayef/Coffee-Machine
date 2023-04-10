package course.project;

public class Grinder {

    private double grindSize, amountOfCoffee;

    public Grinder(double grindSize, double amountOfCoffee) {
        this.grindSize = grindSize;
        this.amountOfCoffee = amountOfCoffee;
    }

    public double getGrindSize() {
        return grindSize;
    }

    public double getAmountOfCoffee() {
        return amountOfCoffee;
    }

    public void setGrindSize(double grindSize) {
        this.grindSize = grindSize;
    }

    public void setAmountOfCoffee(double amountOfCoffee) {
        this.amountOfCoffee = amountOfCoffee;
    }

    public void grindCoffee(Coffee coffee, double amountOfCoffee) {

    }

    public String getInfo() {
        return "Grind size = " + grindSize + ", Amount of coffee = " + amountOfCoffee;
    }
}
