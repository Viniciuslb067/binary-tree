public class ABB extends AB {

    public boolean temEsquera(No no) {
        return no.getFilhoEsq() != null;
    }

    public boolean temDireita(No no) {
        return no.getFilhoDir != null;
    }

    public No buscaPai(int elemento) {
        if (ehVazia()) return null;
        No no = getRaiz();

        boolean achou = false;

        while (!achou) {
            if (elemento > no.getElement())
                if (temDireita(no))
                    no = no.getFilhoDir();
                else achou = true;
        }
    }

}
