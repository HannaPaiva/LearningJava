public class SomarArray {
  

    public static int somarArray(int[] array) {
        int soma = 0;
       
        for (int elemento : array) {
            soma += elemento;
        }
        return soma; 
    }

    public static void main(String[] args) {
      
        int[] array = {1, 2, 3, 4, 5};

        int resultado = somarArray(array);
      
        System.out.println("A soma dos elementos do array é: " + resultado);
    }
}
