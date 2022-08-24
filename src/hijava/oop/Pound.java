package hijava.oop;

public class Pound extends Weight{

    @Override
    public int getGram(int g) {
        return g * 453;
    }
}
