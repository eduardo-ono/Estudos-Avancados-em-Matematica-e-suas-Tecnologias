public class Main {

    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(3, 4, 5);
        var perimetro = triangulo.getPerimetro();
        System.out.println("Perimetro = " + perimetro);
        var area = triangulo.getArea();
        System.out.println("Area = " + area);

    }

}
