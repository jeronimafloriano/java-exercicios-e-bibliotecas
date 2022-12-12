package imutabilidade;

public class ImutabilidadeAgenciaTeste {

    private Integer numero;

    public ImutabilidadeAgenciaTeste(Integer numero){
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "numero: " + numero;
    }
}
