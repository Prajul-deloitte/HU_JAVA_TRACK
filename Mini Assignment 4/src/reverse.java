import java.util.ArrayList;
import java.util.Collections;


public class reverse {
    public static void main(String[] args) {
        ArrayList<String> r = new ArrayList<String>();
        r.add("Hashedin");
        r.add("By");
        r.add("Deloitte");
        r.add("2022");
        System.out.println("Before Reversing : ");
        System.out.println(r);
        Collections.reverse(r);
        System.out.println("After Reversing : ");
        System.out.println(r);
    }
}
