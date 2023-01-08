public class Main {
    public static void main(String[] args) {
        //ejercicio 1

        int valor = suma(2, 5, 7);

        System.out.println("ejercicio 1: "+valor);

        //ejercicio 2

        System.out.println("ejercicio 2:");

        auto miAuto = new auto();
        System.out.println(miAuto.puertas);
        miAuto.agregarPuerta();
        miAuto.agregarPuerta();
        System.out.println(miAuto.puertas);
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }

}
class auto {
     public int puertas = 4;

    public void agregarPuerta() {
        this.puertas++;
    }
}

