import java.util.Random;

public class Zar {
    public Zar() {

    }

    private int zarul() {
        Random random = new Random();
        int zar = random.nextInt(1, 6);
        return zar;
    }
    private final double punctajMax = 200.0 ;
    public int getZarul() {
        return zarul();
    }
}