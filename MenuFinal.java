import java.util.Scanner;

public class menufinal {

    public static void main(String[] args) {
        String opcion = "0";

        while (!opcion.equals("6")) {
            // Limpiar consola usando secuencias de escape ANSI
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("""
                ==========================================================
                Proyecto Final de la materia Fundamentos de computación 1
                Desarrollado por Victoria Vargas Encinas
                Versión 0.2
                ==========================================================
                Menú principal
                1. if - Triángulos
                2. for - Padovan
                3. while - Sumatoria 1/1 + 1/2...
                4. do - Conjetura de Collatz
                5. Arreglos - Rotar un arreglo a la derecha
                6. Salir
                ==========================================================
                """);

            // Lectura por consola (o respaldo con Scanner si se ejecuta en IDE)
            if (System.console() != null) {
                opcion = System.console().readLine("¿Qué quieres hacer?: ");
            } else {
                Scanner scanner = new Scanner(System.in);
                System.out.print("¿Qué quieres hacer?: ");
                opcion = scanner.nextLine();
            }

            switch (opcion) {
                case "1" -> {
                    limpiarPantalla();
                    System.out.println("--- 1. Triángulos ---");
                    trainn();
                    pausar();
                }
                case "2" -> {
                    limpiarPantalla();
                    System.out.println("--- 2. Secuencia de Padovan ---");
                    padwhile();
                    pausar();
                }
                case "3" -> {
                    limpiarPantalla();
                    System.out.println("--- 3. Sumatoria de 1/1 + 1/2 ... hasta 1/50 ---");
                    sumatoria();
                    pausar();
                }
                case "4" -> {
                    limpiarPantalla();
                    System.out.println("--- 4. Conjetura de Collatz ---");
                    collatz();
                    pausar();
                }
                case "5" -> {
                    limpiarPantalla();
                    System.out.println("--- 5. Rotar un arreglo a la derecha ---");
                    rotarArreglo();
                    pausar();
                }
                case "6" -> System.out.println("\n¡Saliendo del programa... Bye bye!");
                default -> {
                    System.out.println("\nOpción no válida. Intenta de nuevo.");
                    pausar();
                }
            }
        }
    }

    // Métodos Auxiliares e Implementación de los Algoritmos

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void pausar() {
        System.out.println("\nPresiona Enter para continuar...");
        try {
            System.in.read();
        } catch (Exception ignored) {}
    }

    // 1. Clasificación de Triángulos
    public static void trainn() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el lado A: ");
        double a = sc.nextDouble();
        System.out.print("Ingresa el lado B: ");
        double b = sc.nextDouble();
        System.out.print("Ingresa el lado C: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("El triángulo es Equilátero.");
            } else if (a == b || a == c || b == c) {
                System.out.println("El triángulo es Isósceles.");
            } else {
                System.out.println("El triángulo es Escaleno.");
            }
        } else {
            System.out.println("Los lados ingresados no forman un triángulo válido.");
        }
    }

    // 2. Secuencia de Padovan
    public static void padwhile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de términos a generar: ");
        int n = sc.nextInt();

        int p0 = 1, p1 = 1, p2 = 1;
        System.out.print("Secuencia: ");
        
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1 || i == 2) {
                System.out.print("1 ");
            } else {
                int pNext = p0 + p1;
                System.out.print(pNext + " ");
                p0 = p1;
                p1 = p2;
                p2 = pNext;
            }
        }
        System.out.println();
    }

    // 3. Sumatoria 1/1 + 1/2 ... 1/50
    public static void sumatoria() {
        double suma = 0.0;
        int i = 1;
        while (i <= 50) {
            suma += 1.0 / i;
            i++;
        }
        System.out.printf("El resultado de la sumatoria es: %.4f%n", suma);
    }

    // 4. Conjetura de Collatz
    public static void collatz() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número entero positivo: ");
        int n = sc.nextInt();

        System.out.print("Sucesión: " + n);
        do {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.print(" -> " + n);
        } while (n != 1);
        System.out.println();
    }

    // 5. Rotar Arreglo a la Derecha
    public static void rotarArreglo() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Arreglo original: ");
        for (int num : arr) System.out.print(num + " ");

        int ultimo = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = ultimo;

        System.out.print("\nArreglo rotado a la derecha: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}
