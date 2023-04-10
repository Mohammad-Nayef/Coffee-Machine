package course.project;

class Coffee {

    protected double amountOfGroundCoffee, amountOfWater;
    protected double arabicaRatio, robustaRatio;

    public Coffee() {

    }

    public Coffee(double arabicaRatio, double robustaRatio) {
        this.arabicaRatio = arabicaRatio;
        this.robustaRatio = robustaRatio;
    }

    public double getAmountOfGroundCoffee() {
        return amountOfGroundCoffee;
    }

    public double getAmountOfWater() {
        return amountOfWater;
    }

    public String getInfo() {
        return "Amount of ground coffee = " + amountOfGroundCoffee + ", Amount of water = " + amountOfWater + ", Arabica ratio = " + arabicaRatio + ", Robusta ratio = " + robustaRatio;
    }
}
