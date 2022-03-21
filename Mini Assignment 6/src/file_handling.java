import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class file_handling {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\prajchaudhary\\HU_JAVA_TRACK\\Mini Assignment 6\\studentrank.csv"));
            scanner.useDelimiter(",|\n");
            int column = 1;
            int row = 1;
            while (scanner.hasNext()){
                List<Student> list = new ArrayList<>();
                Student student = new Student();
                student.setName(scanner.next());
                System.out.println();
                column++;

                if(column == 5) {
                    column = 1;
                    row++;
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
