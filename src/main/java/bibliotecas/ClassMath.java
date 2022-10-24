package bibliotecas;

public class ClassMath {

    public static void main(String[] args) {
        System.out.println("Calcula raiz quadrada positiva: " + Math.sqrt(25));
        System.out.println("Calcula potência: " + Math.pow(2,2));
        System.out.println("Traz o mais próximo de um inteiro: " + Math.round(2.3694));
        System.out.println("Gera aleatório entre 0.0 e 1.0: " + Math.random());
        System.out.println("Soma: " + Math.addExact(10,5));
        System.out.println("Subtrai: " + Math.subtractExact(8,2));
        System.out.println("Multiplica: " + Math.multiplyExact(8,2));
        System.out.println("Incrementa 1: " + Math.incrementExact(2));
        System.out.println("Decrementa 1: " + Math.decrementExact(2));
        System.out.println("Retorna negação: " + Math.negateExact(2));
        System.out.println("Retorna o inteiro do long: " + Math.toIntExact(369455));
        System.out.println("Retorna o maior inteiro da divisão : " + Math.floorDiv(8,2));
        System.out.println("Retorna o maior de dois números: " + Math.max(1052, 1900));
        System.out.println("Retorna o menor de dois números: " + Math.min(1052, 1900));
        System.out.println("Retorna o double anterior: " + Math.nextDown(1));
        System.out.println("Retorna o próximo double: " + Math.nextUp(1));
    }
}
