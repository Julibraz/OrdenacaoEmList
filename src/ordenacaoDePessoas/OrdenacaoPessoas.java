package ordenacaoDePessoas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    //atributo
    private List<Pessoa> pessoaList;

    //getter para exibir a lista como ela foi criada
    public List<Pessoa> getPessoaList(){
        return pessoaList;
    }

    //constructor
    public OrdenacaoPessoas(){
        this.pessoaList = new ArrayList<>();
    }

    //adicionando pessoa
    public void addPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    //ordenando por idade
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa>pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

}
