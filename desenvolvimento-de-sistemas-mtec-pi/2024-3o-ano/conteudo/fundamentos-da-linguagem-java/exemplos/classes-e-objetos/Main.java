public class Main {

    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(3, 4, 5);
        Triangulo triangulo2 = new Triangulo(new double[] {2, 2, 2});

        System.out.println("Perimetro do triangolo 1 = " + triangulo1.getPerimetro());
        System.out.println("Perimetro do triangulo 2 = " + triangulo2.getPerimetro());
        System.out.println("Area do triangolo 1 = " + triangulo1.getArea());
        System.out.println("Area do triangulo 2 = " + triangulo2.getArea());
    }
}
