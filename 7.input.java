import java.io.IOException;
import java.util.Scanner;

class input{
    public static void main(String[] args) throws IOException {

        //Scanner is buffer
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Your Roll");
        int ROllNo=scanner.nextInt();

        scanner.nextLine(); //This Line is used to tsore /n which was written by above line when you enter RollNo

        System.out.println("Enter Your Name.");
        String name=scanner.nextLine();

        System.out.println("Enter Age");
        byte age=scanner.nextByte();

        System.out.println("Your Roll No: "+ ROllNo);
        System.out.println("Your Name: "+ name);
        System.out.println("Your Age: "+ age);
        scanner.close();




    }
}