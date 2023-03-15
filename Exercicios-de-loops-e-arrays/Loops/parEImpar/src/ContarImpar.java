import java.util.Scanner; 
    
public class ContarImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        //int pessoasNoCamarote = 0;

       // System.out.println("Digite a quantidade de pessoas na fila: ");
        int tamanhoDaFila = leitor.nextInt();

        // TODO: Crie a condição necessária para verificar quais números, de acordo com o range de entrada, são ímpares.
    for (int pessoasNoCamarote= 0;pessoasNoCamarote<=tamanhoDaFila;pessoasNoCamarote++) {
      if (pessoasNoCamarote % 2 != 0){
        System.out.println(pessoasNoCamarote);
      }
    }}}


		
    
