package fact.it.exline;

import fact.it.exline.model.Line;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExLineApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExLineApplication.class, args);
        // write code starting after this line

        Line line = new Line();

        line.setThickness(19);
        line.setBeginningX(5);
        line.setBeginningY(5);
        line.setEndX(5);
        line.setEndY(35);

        System.out.println(line.showCharacteristics());
        System.exit(0);
    }

}
