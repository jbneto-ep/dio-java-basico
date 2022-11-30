//Verificar dois numeros e informar se sao ou nao iguais

import java.util.Scanner;
public class Desafio {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
    
        int A;
        int B;
        
        
        A= scan.nextInt();
                
        B= scan.nextInt();
        
        if (A==B)System.out.println("Sao iguais!");
        else System.out.println("Nao sao iguais!");
     
        }
}
