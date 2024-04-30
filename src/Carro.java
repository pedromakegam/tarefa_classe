public class Carro {

    private String fabricante;
    private String modelo;
    private String tipoCombustivel;
    private int ano;
    private String condicao;



   public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

   public void exibirDadosDoCarro(){
       System.out.println(fabricante);
       System.out.println(modelo);
       System.out.println(tipoCombustivel);
       System.out.println(ano);
       System.out.println(condicao);
    }
}
