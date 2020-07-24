import java.util.Random;

public class Dados {
    
    //Função Geradora da Matriz//
    public static void geramatiz(int matriz [] []){
         //instância um objeto da classe Random usando o construtor padrão
         Random gerador = new Random();
         int linha;
         int coluna;
         for (int i = 0; i <= 36000000; i++){
                linha = (gerador.nextInt(6) +1) -1;
                coluna = (gerador.nextInt(6) +1) -1;
                matriz [linha] [coluna] += 1;     
         }
    }

    //Função para apresentar a Matriz//
    public static void apresentamatriz(int matriz [][]) {
        System.out.println("|   |\t|    1    |\t|    2    |\t|    3    |\t|    4    |\t|    5    |\t|    6    |");
        for (int i = 0; i < 6; i++){
            System.out.printf("| %d |\t", i + 1);
            for (int j = 0; j < 6; j++){
                System.out.printf("[ %d ]\t", matriz[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {    
        int matriz [] [] = new int [6] [6];
        geramatiz(matriz);
        apresentamatriz(matriz);

    }
}

