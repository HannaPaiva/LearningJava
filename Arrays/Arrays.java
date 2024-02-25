public class Arrays {
    public static void main(String[] args) {
    
        int[] vetor = {1, 2, 3, 4, 5, 6};
        int[][] matriz = {{1, 2, 3}, {4, 5}};
        String[][] matriz3 = {{"aa", "aa", "aa", "aa"}, {"aa", "aa", "aa", "aa"}};
      
        System.out.print("Array (Vrwtor): ");



        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        System.out.println();

   
        System.out.println("Array (Matriz):");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println();
        }



    }


}
