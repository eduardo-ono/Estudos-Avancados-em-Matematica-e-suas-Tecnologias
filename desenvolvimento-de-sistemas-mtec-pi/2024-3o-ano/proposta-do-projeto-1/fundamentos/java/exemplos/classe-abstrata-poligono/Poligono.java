public abstract class Poligono {

    int numLados;
    double[] lados;
    double perimetro;
    double area;

    double getPerimetro() {
        double perimetro = 0;
        for (double lado : lados) {
            perimetro += lado;
        }
        return perimetro;
    };

    abstract double getArea();

}
