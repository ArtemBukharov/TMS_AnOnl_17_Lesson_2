import java.util.Scanner;

public class ScannerSimple {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

String nameuser  = scanner.nextLine();
String Greeting = "Hello" + nameuser;
System.out.print(Greeting);
    }
}
