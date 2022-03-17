import java.util.Scanner;

public class Strings {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String");
        String s1 = sc.nextLine();
        System.out.println("Enter 2nd String");
        String s2 = sc.nextLine();
        System.out.println("Enter 3rd String");
        String s3 = sc.nextLine();
        if(checkvalid(s1,s2,s3)){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
    public static boolean checkvalid(String s1, String s2, String s3){
        int j = 0;
        int n = s3.length();
        int []visited = new int[n];
        for(int i = 0 ; i < s1.length() ; i++){
            boolean flag = false;
            while(j < s3.length()){
                if(visited[j] == 0 && s1.charAt(i) == s3.charAt(j)){
                    visited[j] = 1;
                    j++;
                    flag = true;
                    break;
                }
                j++;
            }
            if(!flag){
                return false;
            }
        }
        j=0;
        for(int i = 0 ; i < s2.length() ; i++){
            boolean flag = false;
            while(j < s3.length()){
                if(visited[j] == 0 && s2.charAt(i) == s3.charAt(j)){
                    flag = true;
                    visited[j] = 1;
                    j++;
                    break;
                }
                j++;
            }
            if(!flag){
                return false;
            }
        }
        return true;
    }
}
