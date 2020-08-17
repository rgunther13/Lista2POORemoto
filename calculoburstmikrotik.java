import java.util.Scanner;
public class calculoburstmikrotik {

    public static void main(String[] args) {
        double mega;
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("Entre com o valor em Megabits: ");
            mega = input.nextInt();
            System.out.printf("O valor do Threshold é: %.0fk",((mega*1024*30)/90));
            System.out.println();
        }while (mega !=0);
        input.close();
    }
}