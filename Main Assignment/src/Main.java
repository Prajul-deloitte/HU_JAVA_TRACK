import java.util.*;
import java.lang.*;
import java.io.*;


class Csv {
    public ArrayList<ArrayList<String>> outer_list = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<String>> Csv_List(){
        try {

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\prajchaudhary\\HU_JAVA_TRACK\\Main Assignment\\id_pass.csv"));
            String line = "";
            line = br.readLine();
            int n = -1;

            ArrayList<String> inner_list = new ArrayList<>();

            while ((line = br.readLine()) != null) {
                n++;
                inner_list = new ArrayList<>();

                String [] list1 = line.split(",");


                for (int i =0; i<2; i++){

                    inner_list.add(list1[i]);
                }

                outer_list.add(inner_list);


            }

        } catch ( IOException e) {
            System.out.println("some error happen");
        }
        return outer_list;
    }

}









class Csvdata {
    public ArrayList<ArrayList<String>> data_list = new ArrayList<ArrayList<String>>();
    ArrayList<ArrayList<String>> Csv_List_data(){
        try {

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\prajchaudhary\\HU_JAVA_TRACK\\Main Assignment\\UserDetail.csv"));
            String line = "";
            line = br.readLine();
            int n = -1;

            ArrayList<String> inner_list = new ArrayList<>();

            while ((line = br.readLine()) != null) {
                n++;
                inner_list = new ArrayList<>();

                String [] list1 = line.split(",");


                for (int i =0; i<8; i++){

                    inner_list.add(list1[i]);
                }

                data_list.add(inner_list);


            }

        } catch ( IOException e) {
            System.out.println("some error happen");
        }
        return data_list;
    }

}














public class Main{
    public static void main(String[] args) {

        System.out.println("1.Login \n 2.registration");
        Scanner scn = new Scanner(System.in);
        int choice = scn.nextInt();
        if (choice ==1){
            Login log = new Login();
            if (log.login().equals("login Successfull")){
                main_menu me = new main_menu();
                me.menu();
            }
        }
        if (choice == 2) {
            Registration registration = new Registration();
            try {
                System.out.println(Registration.register());
            }
            catch(Exception e){
                System.out.println(e);
            }
        }


    }
}
