
package actfuncionesrecursivas;
public class ActFuncionesRecursivas {
    
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcd(b, a % b);
    }
    
    public static int count(Object datos[], int n, Object o) {
        if (n == 0) {
            return 0;
        }
        if (datos[n - 1].equals(o)) {
            return 1 + count(datos, n - 1, o);
        } else {
            return count(datos, n - 1, o);
        }
    }
    
    public static void reverse(Object datos[], int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }
        Object temporal = datos[inicio];
        datos[inicio] = datos[fin];
        datos[fin] = temporal;
        
        reverse(datos, inicio + 1, fin - 1);
    }
    
    public static void mostrarArreglo(Object datos[]) {
        System.out.println("[ ");
        
        for (int i = 0; i < datos.length; i++) {
            System.out.println(datos[i]);
            
            if (i < datos.length - 1) {
                System.out.println(", ");
            }
        }
        System.out.println("]");
    }
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Fibonacci de 5: " + fibonacci(5));
        System.out.println("Fibonacci de 40: " + fibonacci(40));
        System.out.println();
        System.out.println("MCD de 45 y 75: " + mcd(45, 75));
        System.out.println("MCD de 47 y 91: " + mcd(47, 91));
        System.out.println();
        Object numeros[] = {
            1, 2, 3, 6, 7, 9, 1
        };
        System.out.println("Arreglo de numeros: ");
        mostrarArreglo(numeros);
        System.out.println("Veces que aparece el 3: " + count(numeros, numeros.length, 3));
        System.out.println("Veces que aparece el 1: " + count(numeros, numeros.length, 1));
        System.out.println();
        Object letras[] = {
            'A', 'B', 'C', 'B', 'A', 'B', 'D'
        };
        System.out.println("Arreglo letras: ");
        mostrarArreglo(letras);
        System.out.println("Veces que aparece la letra C: " +  count(letras, letras.length, 'C'));
        System.out.println("Veces que aparece la letra E: " + count(letras, letras.length, 'E'));
        System.out.println();
        Object numeros2[] = {
            1, 2, 3, 4, 5
        };
        System.out.println("Arreglo original: ");
        mostrarArreglo(numeros2);
        reverse(numeros2, 0, numeros2.length - 1);
        System.out.println("Arreglo invertido: ");
        mostrarArreglo(numeros2);
        System.out.println();
        Object letras2[] = {
            'A', 'B', 'C', 'D'
        };
        System.out.println("Arreglo original: ");
        mostrarArreglo(letras2);
        reverse(letras2, 0, letras2.length - 1);
        System.out.println("Arreglo invertido: ");
        mostrarArreglo(letras2);
        
    }
    
}
