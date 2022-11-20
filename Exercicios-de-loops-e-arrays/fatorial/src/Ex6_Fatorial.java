import java.util.Scanner;
public class Ex6_Fatorial {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();
        int multiplicacao = 1;
       
        System.out.println(fatorial + "! = ");

        for(int count = fatorial; count >=1 ; count--){
            multiplicacao = multiplicacao * count;
        }
        System.out.println(multiplicacao);
    }
}
