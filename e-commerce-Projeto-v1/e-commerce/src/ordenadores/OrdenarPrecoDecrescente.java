package ordenadores;
import itens.Produto;

import java.util.Comparator;

public class OrdenarPrecoDecrescente implements Comparator<Produto> {


    @Override
    public int compare(Produto o1, Produto o2) {
        if (o1.getPreco().compareTo(o2.getPreco()) > 0) {
            return -1;
        }
        return 1;
    }
}
