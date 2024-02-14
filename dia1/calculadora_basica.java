import java.util.Scanner;


public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo à Calculadra!");
        System.out.println("Por favor, insira a operação a ser realizada (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);
        
        System.out.println("Insira o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Insira o segundo número: ");
        double num2 = scanner.nextDouble();
        
        double resultado = 0;
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero!");
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                return;
        }
        
        System.out.println("O resultado de " + num1 + " " + operacao + " " + num2 + " é: " + resultado);
    }
}
