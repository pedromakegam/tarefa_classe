/**
 * @since version 1.0
 * classe principal
 */
public static void main(String[] args) {

    /**
     * Criando o objeto carroCadastro instanciando da classe carro
     */
    Carro carroCadastrado = new Carro();

    carroCadastrado.setFabricante("Ford");
    carroCadastrado.setModelo("FordKA");
    carroCadastrado.setTipoCombustivel("Flex");
    carroCadastrado.setAno(2023);
    carroCadastrado.setCondicao("Novo");
    carroCadastrado.exibirDadosDoCarro();



}