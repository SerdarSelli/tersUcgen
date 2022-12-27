import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("basamak sayısı?");
        n= scan.nextInt();

        for (int i =n;i>=1;i--){
            for (int k =1; k<=(n-i);k++)
                System.out.print(" ");
            for (int j=1;j<=(i*2)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    }
