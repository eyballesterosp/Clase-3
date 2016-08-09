package clase.pkg3;

/**
 *
 * @author Estudiante
 */
public class CLASE3 {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int a = 3;
        while (a > 0) {
            if (a > 2) {
                System.out.print("a");
            }
            if (a == 2) {
                System.out.print("b c");
            }
            if (a == 1) {
                System.out.print("d");
                a = a - 1;
            }
            a = a - 1;
            System.out.print("-");
        }
        while (x < 5) {
            if (y < 5) {
                x = x + 1;
                if (y < 3) {
                    x = x - 1;
                }
            }
            y = y + 2;
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}
