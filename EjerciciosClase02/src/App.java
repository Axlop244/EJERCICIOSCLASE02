import java.util.Scanner;
public class App {
    public static void main(String[] args){

        //ejercicio1(); //6 / 2 ( 1 + 2 )
        //ejercicio2(); // ¿Ves algún error en el precio?
        //ejercicio3(); //¿Cuántos peces hay en el acuario?
        //ejercicio4(); // ¿Cuánto se ha gastado Carmen?
        //ejercicio5(); //¿Cuánto te ha costado el ordenador?
        //ejercicio6(); //¿Qué precio tenían antes del descuento?
        //ejercicio7(); //Ejercicio 7: Calculadora Básica
        //ejercicio8(); //Área y Perímetro de un Rectángulo
        //ejercicio9(); //Conversión de Temperaturas
        ejercicio10();  //Media Aritmética

    }
    public static void ejercicio1(){
        var num1 = 6 / 2;
        var num2 = (1 + 2);
        var num3 = num1 / num2; 
        System.out.println(num3);
    }
    public static void ejercicio2(){
        var precio100g = 5.95;
        var precioPorKilo = precio100g * 10; 
        System.out.println("El precio por kilo es: " + precioPorKilo);
    }
    public static void ejercicio3(){
        var peces = 284 + 163;
        System.out.println(peces);
    }
    public static void ejercicio4(){
        int dineroInicial = 23;
        double dineroRestante = 12.75;
        var resultado = dineroInicial - dineroRestante;
        System.out.println(resultado);
    }
    public static void ejercicio5(){
        var valorComputador = 660;
        double descuento = 0.10;
        var valorDescuento = valorComputador * descuento;
        System.out.println(valorDescuento);
        var resta = 660 - 66;
        System.out.println(resta);
    }
    public static void ejercicio6(){
        int precioPagado = 34;
        double descuentoInicial = 0.85;
        System.out.println(precioPagado / descuentoInicial);
    }
    public static void ejercicio7(){
        var scanner = new Scanner (System.in);

        System.out.print("Ingrese un Número 1: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese un Número 2: ");
        double numero2 = scanner.nextDouble();

        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;

        System.out.printf("La suma es: %.2f%n", suma);
        System.out.printf("La resta es: %.2f%n", resta);
        System.out.printf("La multiplicación es: %.2f%n", multiplicacion);
        System.out.printf("La división es: %.2f%n", division);


        scanner.close();
    }
    public static void ejercicio8(){
        var scanner = new Scanner (System.in);

        System.out.print("Ingrese longitud: ");
        double alto = scanner.nextDouble();

        System.out.print("Ingrese ancho: ");
        double ancho = scanner.nextDouble();

        double area = ancho * alto;
        double perimetro = 2 * (ancho + alto);

        System.out.printf("El área del rectángulo es: %.2f%n", area);
        System.out.printf("El perímetro del rectángulo es: %.2f%n", perimetro);

        scanner.close();
    }
    public static void ejercicio9(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 9 / 5 + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("La temperatura en Fahrenheit es: %.2f°F%n", fahrenheit);
        System.out.printf("La temperatura en Kelvin es: %.2f K%n", kelvin);

        scanner.close();
    }
    public static void ejercicio10(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numer1 = scanner.nextInt();

        System.out.print("Ingrese un segundo número: ");
        int numer2 = scanner.nextInt();

        System.out.print("Ingrese un tercer número: ");
        int numer3 = scanner.nextInt();

        int suma = numer1 + numer2 + numer3;
        System.out.printf("La suma es: %d%n", suma);

        double mediaaritmetica = suma / 3;
        System.out.printf("La media aritmética es: %f%n", mediaaritmetica);

    }
}
