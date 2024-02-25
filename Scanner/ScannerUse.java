
import java.util.Scanner;
import java.util.Random;

public class ScannerUse {


    public static void main(String[] args) {
       
    ola();
    calcularRandomShit();
    userIdStuff();   

    }


    public static void ola(){
         
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome de user:  ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");

        int idade = scanner.nextInt();
        scanner.nextLine();

    
        System.out.println("\nOlá, " + nome + "!");
        System.out.println(" De idade: " + idade);

        scanner.close();

    }



    public static void calcularRandomShit() {
        
        Random random = new Random();

        int soma = 0;
        int subtracao = 0;
        int multiplicacao = 1;

        for (int i = 0; i < 10; i++) {
            int numero = random.nextInt(100); 

            System.out.println("Número " + (i + 1) + ": " + numero);

            soma += numero; 
            if (i == 0) {
                subtracao = numero; 
            } else {
                subtracao -= numero; 
            }
            multiplicacao *= numero; 
        }

        // Exibir os resultados das operações
        System.out.println("\nSoma dos números: " + soma);
        System.out.println("Subtração dos números: " + subtracao);
        System.out.println("Multiplicação dos números: " + multiplicacao);
    }




    private static void adicionarUsuario(String nome) {
        usuarios[contadorUsuarios] = nome;
        System.out.println("Usuário '" + nome + "' criado com o ID: " + contadorUsuarios);
        contadorUsuarios++;
    }

    // Método para pesquisar um usuário existente pelo nome
    private static void pesquisarUsuario(String nome) {
        boolean encontrado = false;
        for (int i = 0; i < contadorUsuarios; i++) {
            if (usuarios[i] != null && usuarios[i].equalsIgnoreCase(nome)) {
                System.out.println("Usuário '" + nome + "' encontrado com o ID: " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Usuário '" + nome + "' não encontrado.");
        }
    }

    // Função principal para interagir com o usuário
    public static void userIdStuff() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        String nome;

        do {
            System.out.println("\nMenu:");
            System.out.println("1- Criar novo usuário");
            System.out.println("2- Pesquisar usuário existente");
            System.out.println("0- Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine(); // Limpar o buffer do scanner
                    System.out.print("Digite o nome do usuário: ");
                    nome = scanner.nextLine();
                    adicionarUsuario(nome);
                    break;
                case 2:
                    scanner.nextLine(); // Limpar o buffer do scanner
                    System.out.print("Digite o nome do usuário a ser pesquisado: ");
                    nome = scanner.nextLine();
                    pesquisarUsuario(nome);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 0);

        scanner.close();
    }






}
