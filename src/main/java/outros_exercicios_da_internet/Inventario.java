package outros_exercicios_da_internet;

public class Inventario {
    private int id;
    private boolean listarItens = true;

    public Inventario(){}
    public Inventario(int id){
        this.id = id;
    }

    public boolean isListarItens(){
        return this.listarItens;
    }

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Inventario inventario2 = new Inventario(1);
        System.out.println(inventario.isListarItens());
        System.out.println(inventario2.isListarItens());
    }
}
