import java.util.Scanner;

public class stringa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Inserisci la prima stringa: ");
        String stringa1 = scanner.nextLine();

        
        System.out.print("Inserisci la seconda stringa: ");
        String stringa2 = scanner.nextLine();

      
        System.out.println("buona giornata " + stringa1 + "" + stringa2);
      

        scanner.close();
    }
}
