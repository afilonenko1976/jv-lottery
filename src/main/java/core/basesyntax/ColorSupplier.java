package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public static String getRandomColor() {

        int index = new Random().nextInt(Color.values().length);
        Color color = Color.values()[index];
        System.out.println(color);

        return String.valueOf(color);

    }
}
