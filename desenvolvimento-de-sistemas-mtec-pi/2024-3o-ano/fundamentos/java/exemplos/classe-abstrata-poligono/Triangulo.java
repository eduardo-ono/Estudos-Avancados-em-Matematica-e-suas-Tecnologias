public class Triangulo extends Poligono {

    // Construtor
    Triangulo(double a, double b, double c) {
        lados = new double[3];
        lados[0] = a > 0 ? a : 0;
        lados[1] = b > 0 ? b : 0;
        lados[2] = c > 0 ? c : 0;
        numLados = lados.length;
    }

    // Cálculo da área pela Fórmula de Heron
    @Override
    double getArea() {
        double s = getPerimetro() / 2; // s: semiperímetro
        double area = Math.sqrt(s * (s - lados[0]) * (s - lados[1]) * (s - lados[2]));
        return area;
    }

}
