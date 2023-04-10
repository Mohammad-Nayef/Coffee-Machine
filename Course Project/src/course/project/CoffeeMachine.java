package course.project;

public class CoffeeMachine {
    private double waterCapacity, beanCapacity, currentWaterLevel, currentBeansLevel;
    private int maxServedCups, servedCups;
    private Grinder coffeeGrinder;
    private Coffee coffee;

    public CoffeeMachine(double waterCapacity, double beanCapacity, String coffeeType, double grindSize) {
        
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
        
    }

    public String getInfo() {
        return "Water capacity = " + waterCapacity + ", Bean capacity = " + beanCapacity + ", Current water level = " + currentWaterLevel + ", Current beans level = " + currentBeansLevel + ", Max served cups = " + maxServedCups + ", Served cups = " + servedCups;
    }
}
