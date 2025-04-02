import java.util.Scanner;

public class es05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    

System.out.print("Primo numero: ");
    double num1 = Double.parseDouble(scanner.nextLine());
            
 System.out.print("Secondo numero: ");
    double num2 = Double.parseDouble(scanner.nextLine());
            
 System.out.print("Operazione (+, -, *, /): ");
        char op = scanner.nextLine().charAt(0);
    
    
        double ris = 0;
        switch (op) {
            case '+':
                ris = num1 + num2;
                break;
            case '-':
                ris = num1 - num2;
                break;
            case '*':
                ris = num1 * num2;
                break;
            case '/':
                ris= num1 / num2;
                break;
            default:
            System.out.println  ("Errore: Operazione non valida.");
        }

 System.out.println(num1 + "" + op +""+  num2 + "" + "risultato:" + ris);
       
    
    
    
    
    
    
    
    }
}      