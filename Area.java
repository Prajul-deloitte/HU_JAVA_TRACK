public class Area {
    void calculateArea(float x)
    {
        System.out.println("The area of the square is "+Math.pow(x, 2)+" sq units");
    }
    void calculateArea(float x, float y)
    {
        System.out.println("The area of the rectangle is "+x*y+" sq units");
    }
    void calculateArea(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("The area of the circle is "+z+" sq units");
    }
}
