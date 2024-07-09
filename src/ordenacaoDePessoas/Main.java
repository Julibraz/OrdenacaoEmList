package ordenacaoDePessoas;

public class Main {
    public static void main(String[] args) {

        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.addPessoa("Joao", 20, 1.81);
        ordenacaoPessoas.addPessoa("Maria", 25, 1.65);
        ordenacaoPessoas.addPessoa("Pedro", 30, 1.93);
        ordenacaoPessoas.addPessoa("Ana", 22, 1.62);

        System.out.println("Lista inicial: ");
        System.out.println(ordenacaoPessoas.getPessoaList());
        System.out.println();

        System.out.println("Ordenando por idade: ");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println();
        
        System.out.println("Ordenando por altura: ");
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}