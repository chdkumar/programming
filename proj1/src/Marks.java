import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        int marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks of the student: ");
        marks=sc.nextInt();
        if (marks>=90)
        {
            System.out.println("A+ grade");
        }
        else if (marks>=80||marks<=90)
         {
           System.out.println("A grade"); 
        }
        else if (marks>=70&&marks<=80) {
            System.out.println("B+ grade");
        }
        else if (marks>=60&&marks<=70) {
            System.out.println("B grade");
        }
        else if (marks>=35&&marks<=60) 
        {
            System.out.println("C grade");
        }
        else
        {
            System.out.println("Fail");
        }

    }
    
}
