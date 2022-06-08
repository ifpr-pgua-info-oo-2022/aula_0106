import java.util.Scanner;

public class MegaSena{


    public static boolean verificaRepetido(int escolha, int[] escolhas){
        for(int j=0;j<6;j++){
            if(escolhas[j] == escolha){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int escolha;
        int[] escolhas;
        boolean flag;
        escolhas = new int[6];
        //int i;

        for(int i=0;i<6;i++){
            do{
                System.out.println("Digite um número entre 1 e 60:");
                escolha = scan.nextInt();
                if(escolha < 1 || escolha > 60){
                    System.out.println("Valor inválido!!");
                }

                flag = verificaRepetido(escolha, escolhas);
                if(flag == true){
                    System.out.println("Valor repetido!");
                }

            }while(escolha<1 || escolha > 60  || flag==true);

        
            System.out.println("Digitou "+escolha);
            escolhas[i] = escolha;
        }

        for(int i=0;i<6;i++){
            System.out.print(escolhas[i]+", ");
        }
        

    }
}

