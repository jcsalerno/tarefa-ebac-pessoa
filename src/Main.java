
public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("João Silva", "Rua A, 123", "123.456.789-00", "01/01/1980");
        PessoaJuridica pj = new PessoaJuridica("Empresa X", "Avenida B, 456", "12.345.678/0001-99", "Empresa X Ltda");

        pf.exibirInformacoes();
        System.out.println();
        pj.exibirInformacoes();
    }
}
