import java.util.Scanner;

public class MegaSena{

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int escolha;
        int[] escolhas;

        escolhas = new int[6];
        //int i;

        for(int i=0;i<6;i++){
            do{
                System.out.println("Digite um número entre 1 e 60:");
                escolha = scan.nextInt();
                if(escolha < 1 || escolha > 60){
                    System.out.println("Valor inválido!!");
                }
            }while(escolha<1 || escolha > 60);
            System.out.println("Digitou "+escolha);
            escolhas[i] = escolha;
        }

        for(int i=0;i<6;i++){
            System.out.print(escolhas[i]+", ");
        }
        

    }
}

