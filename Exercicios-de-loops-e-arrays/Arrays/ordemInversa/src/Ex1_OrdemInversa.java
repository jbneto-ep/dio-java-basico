public class Ex1_OrdemInversa {
    public static void main(String[] args) throws Exception {
        int [] vetor = {-5,-6,15,50,8,4};
        
        System.out.println("Vetor: ");
        
        int count = 0;
        while(count < (vetor.length)) {
            System.out.println(vetor[count] + " ");
            count++;
        }
        System.out.print("Vetor: ");
        for (int i = (vetor.length -1); i >= 0; i--){
        System.out.println(vetor[i] + " ");
        }
        
    }
}
