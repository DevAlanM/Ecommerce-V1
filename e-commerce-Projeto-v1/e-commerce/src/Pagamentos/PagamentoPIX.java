package Pagamentos;

public class PagamentoPIX implements FormaDePagamento {

    @Override
    public void pagar() {
        System.out.println("Pagando via PIX");
    }

}
