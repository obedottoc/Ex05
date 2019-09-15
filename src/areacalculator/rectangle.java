package areacalculator;
import java.util.Scanner;

public class rectangle extends Shapes{
    Double Rarea;
    Scanner sc =new Scanner(System.in);
    void printarea() {
        System.out.println("Enter the height and breadth of Rectangle: ");
        a=sc.nextInt();
        b=sc.nextInt();
        Rarea=(double) (a*b);                
        System.out.println("The area of Reactangle is: "+Rarea);
    }
            
}

