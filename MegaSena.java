import java.util.Scanner;
import java.util.Random;

public class MegaSena{


    public static boolean verificaRepetido(int escolha, int[] escolhas){
        for(int j=0;j<6;j++){
            if(escolhas[j] == escolha){
                return true;
            }
        }
        return false;
    }

    public static int[] escolhasUsuario(){
        Scanner scan = new Scanner(System.in);
        int escolha;
        int[] escolhas;
        boolean flag;
        escolhas = new int[6];
        

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
        return escolhas;
    }

    public static int[] sorteioComputador(){
        int[] sorteados = new int[6];
        int sorteado;
        Random rnd = new Random();
        boolean flag;

        for(int i=0;i<6;i++){
            do{
                sorteado = rnd.nextInt(60)+1;
                flag = verificaRepetido(sorteado, sorteados);
            }while(flag == true);
            sorteados[i]  = sorteado;
        }

        return sorteados;

    }

    public static int contaAcertos(int[] escolhas, int[] sorteados){

        int contador=0;

        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(escolhas[i] == sorteados[j]){
                    contador = contador + 1;
                }
            }
        }

        return contador;

    }


    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        int[] escolhas = escolhasUsuario();
        int[] sorteados = sorteioComputador();

        System.out.println("Escolhas do usuario:");
        for(int i=0;i<6;i++){
            System.out.print(escolhas[i]+", ");
        }

        System.out.println("Sorteio do computador:");
        for(int i=0;i<6;i++){
            System.out.print(sorteados[i]+", ");
        }

        int acertos = contaAcertos(escolhas, sorteados);

        System.out.println("Você acertou "+acertos+" números");

        if(acertos == 4){
            System.out.println("Você fez a quadra!!");
        }else if(acertos == 5){
            System.out.println("Você fez a quina!!");
        }else if(acertos == 6){
            System.out.println("Você ficou ricoooo!!");
        }else{
            System.out.println("Perdeu uns pila!");
        }

    }
}

