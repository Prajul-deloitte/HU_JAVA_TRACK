import java.util.Scanner;

public class Myclass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Area ob = new Area();
        System.out.println("Enter side of square\n");
        float x = sc.nextFloat();
        ob.calculateArea(x);
        System.out.println("Enter length and breadth of rectangle\n");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        ob.calculateArea(a,b);
        System.out.println("Enter Radius of circle\n");
        double r = sc.nextDouble();
        ob.calculateArea(r);

        //Animal Class Implementation
        System.out.println("Animal Class Begins\n");
        System.out.println("Enter type of animal\n");
        String t = sc.next();
        System.out.println("Enter age of animal\n");
        int ag = sc.nextInt();
        System.out.println("Enter legs of animal\n");
        int l = sc.nextInt();
        Animal object = new Animal();
        object.setAnimal(t,ag,l);
        object.getAnimal();
    }
}
