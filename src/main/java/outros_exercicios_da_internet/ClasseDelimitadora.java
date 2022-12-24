package outros_exercicios_da_internet;

public class ClasseDelimitadora {

    String outerField = "Campo externo";
    static String staticOuterField = "Campo externo estático";

    class Aninhada {
        void accessMembers() {
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }

    static class AninhadaEstatica {
        void accessMembers(ClasseDelimitadora outer) {
            // Erro do compilador: Não é possível fazer uma referência estática ao
            // campo não estático outerField
            // System.out.println(outerField);
            System.out.println(outer.outerField);
            System.out.println(staticOuterField);
        }
    }


    public static void main(String[] args) {
        System.out.println("Classe interna:");
        System.out.println("------------");
        ClasseDelimitadora outerObject = new ClasseDelimitadora();
        ClasseDelimitadora.Aninhada innerObject = outerObject.new Aninhada();
        innerObject.accessMembers();

        System.out.println("\nClasse aninhada estática:");
        System.out.println("--------------------");
        AninhadaEstatica staticNestedObject = new AninhadaEstatica();
        staticNestedObject.accessMembers(outerObject);

        System.out.println("\nClasse de nível superior:");
        TopLevelClass topLevelObject = new TopLevelClass();
        topLevelObject.accessMembers(outerObject);
    }



}


class TopLevelClass {

    void accessMembers(ClasseDelimitadora outer) {
        // Erro do compilador: Não é possível fazer uma referência estática ao
        // campo não estático OuterClass.outerField
        // System.out.println(OuterClass.outerField);
        System.out.println(outer.outerField);
        System.out.println(ClasseDelimitadora.staticOuterField);
    }
}

