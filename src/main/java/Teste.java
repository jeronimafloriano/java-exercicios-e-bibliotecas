public class Teste {

    public static void main(String[] args) {
        int i = 10;
        int n = i++%5;
        System.out.println("Valor de 10, incrementado: " + i);
        System.out.println("Valor do resto da divisão após dividir 10 por 5 e incrementar o 10: " + n);

        int j = 10;
        int o = ++j%5;
        System.out.println("Valor de 10, incrementado: " + j);
        System.out.println("Valor do resto da divisão após " +
                "incrementar o 10 primeiro e depois dividé-lo por 5: " + o);

        int[] numbers = {1,2,3,4,5};

        search:
        for (int x = 0; x <10; x++) {
            System.out.println("teste");

            for (int num : numbers) {
                System.out.println(num);


                if (num == 3)
                    break search;
            }
        }


        for(int y = 0; y <= 2; y++){
            System.out.println("Valor de y: " + y);
            if(y == 1){
                continue;
            }
            System.out.println("teste");
        }

        int aNumber = 3;
        if (aNumber >= 0) {
            if (aNumber == 0) {
                System.out.println("first string");
            } else {
                System.out.println("segunda string");
            }
            System.out.println("terceira string");
        }


        ////////////////////////////////
        String[] students = new String[10];
        String studentName = "Peter Parker";
        students[0] = studentName;
        studentName = null;
        System.out.println(students[0]);

        ////////////////////////////////

       // Aninhada aninhada = new Aninhada(); NÃO FUNCIONA!
        ClasseDelimitadora classeDelimitadora = new ClasseDelimitadora();
        ClasseDelimitadora.Aninhada classeAninhada = classeDelimitadora.new Aninhada();


    }
}

class Circle{

    private int x, y, radius;

    public Circle(){}

    public Circle(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void moveCircle(Circle circle, int deltaX, int deltaY){
        circle.setX(circle.getX() + deltaX);
        circle.setY(circle.getY() + deltaY);

        circle = new Circle(0, 0);
        //Essa reatribuição não tem permanência, no entanto, porque a referência foi passada
        // por valor e não pode ser alterada. Dentro do método, o objeto apontado por circle mudou,
        // mas, quando o método retorna, myCircle ainda referencia o mesmo Circle objeto de antes
        // do método ser chamado.
    }
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.moveCircle(myCircle, 23,56);
        System.out.println(myCircle.getX() + " , " + myCircle.getY());
    }
}


class Medidas{

    private int altura;
    private int largura;
    private int profundidade;

    //EXEMPLO DE UM CONSTRUTOR CHAMANDO OUTRO.
    public Medidas(int altura, int largura, int profundidade){
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    public Medidas(int profundidade){
        //System.out.println("teste 1 "); NÃO FUNCIONA PQ se presente, a invocação de outro construtor deve ser a primeira linha no construtor.
        this(0,0,profundidade);
        System.out.println("teste 2 ");
    }


}