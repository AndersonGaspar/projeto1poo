package poo;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Ola!");

        Contador c = new Contador();
        Contador d = new Contador();

        int i, j;
        i = 10;
        j = 2;
        int h = i + j;

        System.out.println(++h);
        System.out.println(i++);

        System.out.println("Valor atual: " + c.getValorAtual());

        c.incrementa();

        System.out.println("Valor atual: " + c.getValorAtual());

        Batedeira bat = new Batedeira();


    }
}
