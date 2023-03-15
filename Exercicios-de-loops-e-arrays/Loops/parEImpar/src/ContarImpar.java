import java.util.Scanner; 
    
public class ContarImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int pessoasNoCamarote = 0;
        int tamanhoDaFila = leitor.nextInt();
        
        // TODO: Crie a condição necessária para verificar quais números, de acordo com o range de entrada, são ímpares.
    for (int contar= 0;contar<=tamanhoDaFila;contar++) {
      if (contar % 2 != 0){
        pessoasNoCamarote++;
        System.out.println(pessoasNoCamarote + " pessoas no camarote");
      }
    }}}


		
    
