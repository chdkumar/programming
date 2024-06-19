import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        String sname;
        int age;
        double Score;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name:");
        sname= sc.nextLine();
        System.out.println("enter age:");
        age= sc.nextInt();
        System.out.println("enter Score:");
        Score= sc.nextDouble();
        System.out.println("Name :"+sname);
        System.out.println("Age :"+age);
        System.out.println("Score :"+Score);
        System.out.println("Name :"+sname+"Age :"+age+"Score :"+Score);
    }
    
}
