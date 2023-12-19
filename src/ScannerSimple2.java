import java.util.Scanner;

public class ScannerSimple2  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer name1 = scanner.nextInt();
        Integer name2 = scanner.nextInt();
        System.out.println(name1 / name2);
    }
    }
