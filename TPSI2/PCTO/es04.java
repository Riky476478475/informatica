import java.util.Scanner;

public class es04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    

System.out.print("Primo numero: ");
    double num1 = Double.parseDouble(scanner.nextLine());
            
 System.out.print("Secondo numero: ");
    double num2 = Double.parseDouble(scanner.nextLine());

        double ris1 = num1 + num2;
        double ris2 = num1 - num2;
        double ris3 = num1 * num2;
        double ris4 = num1 / num2;

        System.out.println(num1 + " " + '+' +""+  num2 + "" + "risultato:" + ris1);
        System.out.println(num1 + " " + " " + '-'+ " " + " "+  num2 + "" + "risultato:" + ris2);
        System.out.println(num1 + " " + '*'  +" "+  num2 + "" + "risultato:" + ris3);
        System.out.println(num1 + " " + '/' +""+  num2 + "" + "risultato:" + ris4);





    
}

}