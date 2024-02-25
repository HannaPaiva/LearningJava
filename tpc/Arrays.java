import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Arrays {
    private int rows;
    private int cols;
    private int[][] matriz;

    public Arrays() {
        this.rows = 0;
        this.cols = 0;
        this.matriz = null;
    }

    public void carregarMatriz() {
        try {
            BufferedReader texto = new BufferedReader(new FileReader("matriz.txt"));

            String line = texto.readLine();
            if (line != null) {
                String[] dimensoes = line.split(" ");
                this.rows = Integer.parseInt(dimensoes[0]);
                this.cols = Integer.parseInt(dimensoes[1]);

                this.matriz = new int[this.rows][this.cols];

                for (int i = 0; i < this.rows; i++) {
                    line = texto.readLine();
                    if (line != null) {
                        String[] valores = line.split(" ");
                        for (int j = 0; j < this.cols; j++) {
                            this.matriz[i][j] = Integer.parseInt(valores[j]);
                        }
                    }
                }
            }

            texto.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void imprimirMatriz() {
        if (this.matriz != null) {
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < this.cols; j++) {
                    System.out.print(this.matriz[i][j] + " ");
                }
                System.out.println();
            }
            gravarMatrizParaArquivo("matriz.txt"); 
        } else {
            System.out.println("Matriz não foi inicializada.");
        }
    }

    public void gravarMatrizParaArquivo(String filename) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            writer.write(this.rows + " " + this.cols);
            writer.newLine();
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < this.cols; j++) {
                    writer.write(this.matriz[i][j] + " ");
                }
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Arrays teste = new Arrays();
        teste.carregarMatriz();
        teste.imprimirMatriz();
    }
}
