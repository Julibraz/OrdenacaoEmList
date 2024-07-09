package ordenacaoNumeros;

import ordenacaoDePessoas.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<Integer>{
    //atributo
    private List<Integer> numList;

    //construtor para a criação de um arrayList vazio
    public OrdenacaoNumeros(){
        this.numList = new ArrayList<>();
    }

    //getter para permitir a exibição da lista
    public List<Integer> getNumList(){
        return numList;
    }

    @Override
    public String toString() {
        return "Ordenacao: "+ numList + "\n";
    }

    //adicionando um numero
    public void addNumero(int numero){
        numList.add(numero);
    }

    @Override
    public int compareTo(Integer n) {
        return Integer.compare(numList.get(0), n);
    }

    //Ordena os numeros em ordem ascendente utilizando a interface comparable e a class collections
    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendentes = new ArrayList<>(numList);
        Collections.sort(numerosAscendentes);
        return numerosAscendentes;
    }

    //ordena os numeros em ordem descentente usando um Comparable e a class Collections.
    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendentes = new ArrayList<>(numList);
        Collections.sort(numerosDescendentes, Collections.reverseOrder());
        return numerosDescendentes;
    }


}
