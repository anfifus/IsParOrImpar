import java.util.Scanner;

public class Main {
    private static final int PRIMITIVEPAR = 2;

    public static void main(String[] args) {
	int number = writeANumber();
    String resultIsParOrImpar = isParOrImpar(number);
    showResultParOrImpar(number,resultIsParOrImpar);
    }

    private static void showResultParOrImpar(int number,String resultIsParOrImpar) {
        System.out.println("The number "+ number+" is "+resultIsParOrImpar);
    }

    private static String isParOrImpar(int number) {
        return IsPar(number);
    }

    private static String IsPar(int number) {
        int result;
        result = number%2;
        if(result == 0)
            return "par";

        return "impar";
    }

    private static int writeANumber() {
        System.out.println("Write the number");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}
