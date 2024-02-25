public class PercorrerMatriz {
    
 
    public static void main(String[] args) {
        
        int[][] matriz = {
            {1, 2, 3},
            {4, -5, 6},
            {7, 8, -9}
        };

        if (contemNegativos(matriz)) {
            System.out.println("Tem negativos na matriz.");
        } else {
            System.out.println("A matriz não tem valores negativos.");
        }
    }


    public static boolean contemNegativos(int[][] matriz) {
   
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
               
                if (matriz[i][j] < 0) {
                    return true; 
                }
            }
        }
        return false; 
    }

}
