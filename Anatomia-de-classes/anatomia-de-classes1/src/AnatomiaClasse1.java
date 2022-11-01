public class AnatomiaClasse1 {

public static void main (String[] args) {
 String primeiroNome = "José";
 String segundoNome = "Neto";

 String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
    System.out.print(nomeCompleto);
}
public static String nomeCompleto (String primeiroNome, String segundoNome){
    return primeiroNome.concat(" ").concat(segundoNome);
} 
}
