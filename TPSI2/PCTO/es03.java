import java.util.Scanner;

public class es03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    

System.out.print("Primo numero: ");
    double num1 = Double.parseDouble(scanner.nextLine());
            
 System.out.print("Secondo numero: ");
    double num2 = Double.parseDouble(scanner.nextLine());
    

    double ris = num1 * num2;

    System.out.println("la moltiplicazione tra "+ "" + num1 + " "+ num2+ "" + " e uguale a"+ ris);
    


}
}