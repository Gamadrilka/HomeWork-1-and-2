import java.util.Scanner;

public class HomeWork2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Введите скобочки");
        String skobki = sc.nextLine();
        boolean b = true;

        //Условие для одинаковых скобок
        if (skobki.equals("{}") || skobki.equals("[]") || skobki.equals("()")) {
            System.out.println(b);
        }
        //Условие для правильного порядка скобок
          else if (skobki.equals("()[]{}")) {
            System.out.println(b);
        } else {
            System.out.println(!b);
        }
          sc.close();
    }
}