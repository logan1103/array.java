import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int a[] = new int[5]; int n, count = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter your array value");

            for(int i=0;i<a.length;i++)
            {
               a[i]=sc.nextInt();
            }
        }
        System.out.println("araay elements are");
        for(int i = 0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println("element to search");
            n = sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==n){
               count++;
            }

        }
        if(count>0){
            System.out.println("element found" + count + "elements");
        }
        else{
            System.out.println("element not found");
        }
    }
}
