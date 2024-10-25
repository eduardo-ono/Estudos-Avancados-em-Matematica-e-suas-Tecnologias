public class Main {

    // Função
    private static double f(double x) {
        double y = x * x - 5 * x + 6; // f(x) = x^2 - 5x + 6
        return y;
    }

    private static void zeros(double a, double b, double delta_x, Boolean verbose) {
        for (double x = a; x < b; x += delta_x) {
            if (verbose) {
                System.out.println(x + "\t" + f(x));
            }
            if (f(x) * f(x + delta_x) <= 0) {
                double x_medio = (2 * x + delta_x) / 2;
                System.out.println("x = " + x_medio + "\t" + "y = " + f(x_medio));
            }
        }
    }

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Os parametros devem ser x0, x1 e delta_x, onde x0 = x inicial e x1 = x final.");
            return;
        }

        double a = 0;
        double b = 0;
        double delta_x = 0;
        try {
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
            delta_x = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Parametros invalidos!");
            return;
        }

        // Verifica se o -v (verbose) foi ativado
        Boolean verbose = false;
        for (int i = 3; i < args.length; i++) {
            if (args[i].equalsIgnoreCase("-v")) {
                verbose = true;
            }
        }

        zeros(a, b, delta_x, verbose);

    }
}
