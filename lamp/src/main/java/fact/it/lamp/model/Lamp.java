package fact.it.lamp.model;

public class Lamp {
    //atributtes
    private String brand;
    private int power;

    public Lamp() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String showPowerInTermsOfStars() {
        // Return as many starts as power
        String stars = "";

        //5 power -> *****

        for (int i = 0; i < power; i++) {
            stars += "*";
        }

        return stars;
    }
}
