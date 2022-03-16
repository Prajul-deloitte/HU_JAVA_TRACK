public class Animal {
    private String type;
    private int age;
    private int legs;
    public void setAnimal(String a,int b,int c)
    {
        this.type = a;
        this.age = b;
        this.legs = c;
    }
    public void getAnimal()
    {
        System.out.println("Type : " +this.type+" Age : "+this.age+" Legs : "+this.legs);
    }

}
