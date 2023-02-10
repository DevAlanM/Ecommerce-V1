package Pagamentos;

import java.util.List;

public interface SeletorDeFormaDePagamento {

    FormaDePagamento selecionarMeioDePagamento(List<FormaDePagamento> pagamentos);

}
