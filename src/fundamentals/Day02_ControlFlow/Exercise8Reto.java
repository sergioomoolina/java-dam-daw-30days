public class Exercise8Reto {
    public static void main(String[] args){
        int nota = 0;
        int aprobados = 0;
        for (int i = 1; i <=5; i++) {
            if (i == 1) {
                nota = 4;
            } else if (i == 2) {
                nota = 8;
            } else if (i == 3) {
                nota = 2;
            } else if (i == 4) {
                nota = 9;
            } else {
                nota = 1;
            }
            System.out.println("Alumno " + i + " tiene un: " + nota);

            if (nota >= 5) {
                aprobados++;
            }
        }
        System.out.println("El número total de aprobados es: " + aprobados);
    }
}