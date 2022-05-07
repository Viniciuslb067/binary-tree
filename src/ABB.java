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

        while (true) {
            if (no.getElement() == elemento) {
                return no.getPai();
            }
            if (elemento > no.getElemento()) {
                if (temDireita(no))
                    no = no.getFilhoDir();
                else {
                    return no;
                }
            } else {
                if (temEsquera(no)) {
                    no = no.getFilhoDir();
                } else {
                    return no;
                }
            }
        }
    }

    public No buscaElemento(int elemento) {
        No pai = buscaPai(elemento);

        if (pai == null) return null;

        if (pai.getElemento() > elemento)
            return pai.getFilhoEsq();

        return pai.getFilhoDir();

    }

}
