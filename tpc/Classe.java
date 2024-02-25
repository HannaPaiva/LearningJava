import java.io.*;

public class Classe {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Tem que ter dois argumentos: o arquivo de origem e o arquivo de destino.");
            return;
        }

        String arquivoOrigem = args[0];
        String arquivoDestino = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoOrigem));
             BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoDestino))) {

            String linha;
            int numeroLinha = 1;
            while ((linha = reader.readLine()) != null) {
                String linhaNumerada = String.format("%s%n", linha);
                writer.write(linhaNumerada);
                numeroLinha++;
            }

            System.out.println("Cópia concluída. Número de linhas copiadas: " + (numeroLinha - 1));
        } catch (IOException e) {
            System.out.println("Ocorreu um erro durante a cópia do arquivo.");
            e.printStackTrace();
        }
    }
}
