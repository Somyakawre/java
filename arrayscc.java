import java.util.Scanner;
public class arrayscc {
    public static void main (String args[]){
        int marks[]=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number : ");
        marks[0]=sc.nextInt();
           System.out.print("enter number : ");
        marks[1]=sc.nextInt();
           System.out.print("enter number : ");
        marks[2]=sc.nextInt();
        System.out.println("phy :"+marks[0]);
        System.out.println("chem :"+marks[1]);
        System.out.println("math :"+marks[2]);
        //update
        marks[2]=marks[2]+1;
        System.out.println("chem :"+marks[2]);
        //persantages
        int persantage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("persantage = "+ persantage+"%");
    }

    
}