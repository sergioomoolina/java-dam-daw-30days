import java.util.Scanner;
public class Exercise6Tabla{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿De qué numero quieres la tabla de multiplicar? ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        scanner.close();
    }
}