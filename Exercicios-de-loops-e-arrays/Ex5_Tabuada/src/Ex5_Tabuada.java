import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        
        System.out.println("Tabuada de:"+ tabuada);
        
        for (int count=1;count<=10;count++) {
            System.out.println(tabuada + "X" + count + "=" + (tabuada*count));
        }
    }
}
