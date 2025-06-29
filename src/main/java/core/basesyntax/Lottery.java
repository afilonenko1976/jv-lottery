package core.basesyntax;

import java.util.Random;

public class Lottery {

    public static Ball getRandomBall() {

        ColorSupplier colorSupplier = new ColorSupplier();

        Color color = colorSupplier.getRandomColor();
        int randomNumber = new Random().nextInt(100);

        Ball ball = new Ball(color,randomNumber);

        return ball;
    }

}
