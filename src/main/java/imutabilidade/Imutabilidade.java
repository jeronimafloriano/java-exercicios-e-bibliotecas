package imutabilidade;

import java.math.BigDecimal;

public final class Imutabilidade {

    private final String titular;
    private final BigDecimal valor;

    private final ImutabilidadeAgenciaTeste agencia;

    public Imutabilidade(final String titular, final BigDecimal valor,
                          final ImutabilidadeAgenciaTeste agencia){
        this.titular = titular;
        this.valor = valor;
        this.agencia = new ImutabilidadeAgenciaTeste(agencia.getNumero());
    }

    public ImutabilidadeAgenciaTeste getAgencia() {
        return new ImutabilidadeAgenciaTeste(agencia.getNumero());
    }

    public String getTitular() {
        return titular;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
