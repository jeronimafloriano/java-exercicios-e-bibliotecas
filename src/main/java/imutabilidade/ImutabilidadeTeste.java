package imutabilidade;

import java.math.BigDecimal;

public class ImutabilidadeTeste  {

    public static void main(String[] args) {
        ImutabilidadeAgenciaTeste agencia = new ImutabilidadeAgenciaTeste(1);

        Imutabilidade imutabilidade = new Imutabilidade("Maria", BigDecimal.TEN, agencia);

        System.out.println(imutabilidade.getAgencia());

        var a = imutabilidade.getAgencia();
        a.setNumero(22);

        System.out.println(imutabilidade.getAgencia());
    }

}
