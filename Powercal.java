
import java.util.Scanner;
public class Powercal {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the base");
        double base=scanner.nextDouble();//double is the data type
        System.out.println("enter the power");
        double power=scanner.nextDouble();
        double result=Math.pow(base,power);
        System.out.println(result);
        scanner.close();
    }    
}