import java.util.Stack;

public class HomeWork1 {
    public static void main(String[] args) {
        // Первый вариант решения (Метод Стэка)
        Stack<String> hello = new Stack<>();
        hello.add("h");
        hello.add("e");
        hello.add("l");
        hello.add("l");
        hello.add("o");
        for (int i = 0; i < 5; i++) {
            System.out.print(hello.peek());
            hello.pop();
        }
        System.out.println();

        //Второй вариант решения (Перебор по индексу и замена букв)
        String[] array = new String[]{"h", "e", "l", "l", "o"};
         for (int i = 0; i<=array.length; i++){
             switch (i){
                 case 0:
                     System.out.print("o");
                     break;
                 case 1:
                     System.out.print("l");
                     break;
                 case 2:
                     System.out.print("l");
                     break;
                 case 3:
                     System.out.print("e");
                     break;
                 case 4:
                     System.out.print("h");
                     break;
             }
             }
         }
        }


