import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class ExercicioSet {
    public static void main(String[] args) {
        
        System.out.println("Crie um conjunto e adicione as notas:!");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        System.out.println(notas);

        //System.out.println("Exiba a posição da nota 5.0:"); nao e possivel exibir pois o set apresenta os itens do array de forma aleatoria
    
        //System.out.println("Adicione na lista a nota 8.0 na posição 4.0:"); mais uma vez nao e possivel trabalhar com posicoes no HashSet

        //System.out.println("Substitua a nota 5.0 pela nota 6.0: "); tambem nao e possivel substituir com set

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        //System.out.println("Exiba a terceira nota adicionada: "); como ja sabemos, nao e possivel pois no HashSet nao se pode utilizar o get

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);
        
        System.out.println("Exiba a media das notas: " + (soma/notas.size()));
        
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next<7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);

        System.out.println(notas2);

        System.out.println("Exiba todas as notas em ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto: ");
        notas.clear();

        System.out.println("Confira de o conjunto esta vazio: " + notas.isEmpty());
        System.out.println("Confira de o conjunto 2 esta vazio: " + notas2.isEmpty());
        System.out.println("Confira de o conjunto 3 esta vazio: " + notas3.isEmpty());



    }
}
