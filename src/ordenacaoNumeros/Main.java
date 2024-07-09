package ordenacaoNumeros;

public class Main {

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.addNumero(5);
        ordenacaoNumeros.addNumero(2);
        ordenacaoNumeros.addNumero(8);
        ordenacaoNumeros.addNumero(1);
        ordenacaoNumeros.addNumero(3);

        System.out.println("Lista inicial: ");
        System.out.println(ordenacaoNumeros.getNumList());
        System.out.println();

        System.out.println("Ordenando em ordem ascendente: ");
        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println();

        System.out.println("Ordenando em ordem descendente: ");
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}
