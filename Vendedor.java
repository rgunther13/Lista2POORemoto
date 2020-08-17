public class Vendedor {
    
    private String nome;
    private int numeroproduto;
    private Double valortotal;

    public Vendedor(String nome, int numeroproduto, Double valortotal) {
        this.nome = nome;
        this.numeroproduto = numeroproduto;
        this.valortotal = valortotal;
    }
    
    //Métodos GET
    public String getNome(){
        return nome;
    }

    public int getNumero(){
        return numeroproduto;
    }

    public Double getTotal(){
        return valortotal;
    }

}