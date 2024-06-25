import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Clase scanner
        Scanner scanner = new Scanner(System.in);

        //Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        //Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");
            System.out.println("Introduce una letra, por favor");
            char letra = Character.toLowerCase(scanner.next().charAt(0));
            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra ) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                    System.out.println("genial ! adivinaste una letra, sigue así!");
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("¡Letra Incorrecta! te quedan "+ (intentosMaximos - intentos) +" intentos");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Felicidades, adivinaste la palabra secreta! "+ palabraSecreta);
            }

        }
        System.out.println("Te quedaste sin intentos :( GAME OVER !!");
        scanner.close();

    }
}
