import java.util.Scanner;

public class Calcolatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Primo numero: ");
            double num1 = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Secondo numero: ");
            double num2 = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Operazione (+, -, *, /): ");
            char op = scanner.nextLine().charAt(0);
            
            double risultato;
            switch (op) {
                case '+':
                    risultato = num1 + num2;
                    break;
                case '-':
                    risultato = num1 - num2;
                    break;
                case '*':
                    risultato = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Errore: Divisione per zero.");
                    }
                    risultato = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Errore: Operazione non valida.");
            }
            
            System.out.println("Risultato: " + risultato);
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
