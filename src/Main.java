public class Main {
    public static void main(String[] args) {
        PessoaFactory pessoaFactory = new PessoaFactory();

        Pessoa pessoa1 = pessoaFactory.criarPessoa("caio", 17);
        Pessoa pessoa2 = pessoaFactory.criarPessoa("calvo", 17);
        Pessoa pessoa3 = pessoaFactory.criarPessoa("kauan", 17);

        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);
    }
}
