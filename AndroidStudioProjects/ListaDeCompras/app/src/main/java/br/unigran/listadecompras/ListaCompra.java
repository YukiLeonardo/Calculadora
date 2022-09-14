package br.unigran.listadecompras;

public class ListaCompra {
    String Nome;
    String Marca;
    String Quant;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getQuant() {
        return Quant;
    }

    public void setQuant(String quant) {
        Quant = quant;
    }

    @Override
    public String toString() {
        return Nome + " / " + Marca + " / " + Quant;
    }
}
