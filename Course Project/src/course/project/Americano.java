package course.project;

public class Americano extends Coffee {

    public Americano(String size) {
        amountOfGroundCoffee = 7;
        amountOfWater = 170;
        arabicaRatio = 0.7;
        robustaRatio = 0.3;
        
        if (size.equals("double")) {
            amountOfGroundCoffee *= 2;
            amountOfWater = 220;
        }
    }
}