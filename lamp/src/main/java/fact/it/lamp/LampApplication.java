package fact.it.lamp;

import org.springframework.boot.SpringApplication;
import fact.it.lamp.model.Lamp;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LampApplication {

    public static void main(String[] args) {
        SpringApplication.run(LampApplication.class, args);
        // write code starting after this line
        Lamp lampA = new Lamp();
        lampA.setBrand("Osram");
        lampA.setPower(8);

        Lamp lampB = new Lamp();
        lampB.setBrand("ABC");
        lampB.setPower(78);

        System.out.println("You created a lampA object with the following values:");
        System.out.println(lampA.getBrand() + " - " + lampA.getPower() + " Watt(" + lampA.showPowerInTermsOfStars() + ")");
        System.out.println(lampB.getBrand() + " - " + lampB.getPower() + " Watt(" + lampB.showPowerInTermsOfStars() + ")");


        System.exit(0);
    }

}
