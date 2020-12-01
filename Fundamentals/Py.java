import java.Lang.Math;
public class Py{
    public double calculateHypotenuse(int legA, int legB){
        double a = legA * legA;
        double b = legB * legB;
        double c = Math.sqrt(a + b);
        return c;
    }
}