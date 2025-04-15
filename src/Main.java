import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadDeNotas = 0;
        double totalNotas = 0;
        System.out.println("Digite la cantidad de notas del estudiante:");
        cantidadDeNotas = scanner.nextInt();

        if (cantidadDeNotas <= 0){
            System.out.println("No se ingresaron notas, debe haber por lo menos 1 nota para realizar el calculo");
        }else {
            for (int i = 0; i < cantidadDeNotas; i++) {
                System.out.print("Ingrese la nota número " + (i + 1) + ": ");
                double notaEstudiante = scanner.nextDouble();
                totalNotas += notaEstudiante;
            }

            double promedioEstudiante = Math.round((totalNotas / cantidadDeNotas) * 10.0) / 10.0;

            if (promedioEstudiante >= 7.0){
                System.out.println("El estudiante tuvo un promedio de "+ promedioEstudiante + " y fue aprobado.");
            } else if (promedioEstudiante >= 5.0 && promedioEstudiante <= 6.9 ) {
                System.out.println("El estudiante tuvo un promedio de " + promedioEstudiante + " y está en recuperación.");
            }else {
                System.out.println("El estudiante tuvo un promedio de " + promedioEstudiante + " y fue reprobado.");
            }
        }

    }
}