public class AB {

    private No raiz = null;
    private int tamanho = 0;

    public boolean ehVazia() {
        return tamanho == 0;
    }

    public No inserirRaiz(int elemento) throws Exception {
        if (this.raiz == null)
            this.raiz = new No(elemento);
        else
            throw new Exception("Já há raiz");

        tamanho = 1;
    }
}
