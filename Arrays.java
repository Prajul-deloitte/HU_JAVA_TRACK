import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Now Enter elements in array");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum=0,count=0;
        for(int i=0;i<n;i++)
        {
            sum=0;
            sum += arr[i];
            if(sum < 0)
            {
                count++;
            }
            for(int j=i+1;j<n;j++)
            {
                sum += arr[j];
                if(sum < 0)
                {
                    count++;
                }
            }
        }
        System.out.println("Count of negative Subarray : "+count);
    }
}
