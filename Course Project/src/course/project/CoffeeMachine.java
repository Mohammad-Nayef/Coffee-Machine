package course.project;

public class CoffeeMachine {
    private double waterCapacity, robustaCapacity, arabicaCapacity, currentWaterLevel, currentBeansLevel;
    private int maxServedCups, servedCups;
    private Grinder coffeeGrinder;
    private Coffee coffee;

    public CoffeeMachine(double waterCapacity, double robustaCapacity, double arabicaCapacity, String coffeeType, double grindSize) {
        
    }
    
    public CoffeeMachine() {
        
    }
    
    public void brewCoffee() {
        
    }
    
    public void addWater(double amount) {
        
    }
    
    public void addBeans(double amount) {
        
    }
    
    public void cleanMachine() {
        
    }

    public double getCurrentWaterLevel() {
        return currentWaterLevel;
    }

    public double getCurrentBeansLevel() {
        return currentBeansLevel;
    }
    
    public boolean needsCleaning() {
        return true;
    }

    public String getInfo() {
        return "Water capacity = " + waterCapacity + ", Robusta capacity = " + robustaCapacity 
                + ", Arabica capacity = " + arabicaCapacity + ", Current water level = " + currentWaterLevel 
                + ", Current beans level = " + currentBeansLevel + ", Max served cups = " + maxServedCups 
                + ", Served cups = " + servedCups;
    }
}
