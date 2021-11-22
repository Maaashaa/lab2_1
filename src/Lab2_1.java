import java.util.Scanner;

public class Lab2_1 {
    public static int Factorial(int n){
        int res = 1;
            if (n>=0 && n<15){
                for(int i = 1;i <= n;i++){
                    res = res*i;
                }
            } else {
                System.out.println("Число должно быть больше или равно 0, но меньше 15.");
            }
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        while(!in.hasNext("close")){
            if(in.hasNextInt()){
                System.out.println("Факториал: " + Factorial(in.nextInt()));
                System.out.println("Если хотите завершить, введите close, иначе введите число: ");
            } else {
                System.out.println("Ошибка!Нужно целое число.\nЕсли хотите завершить, введите close, иначе можете попробовать снова ввести число: ");
                in.next();
            }
        }
        in.close();
    }
}
/*не получается убрать вывод факториал:1 после ввода целого числа не из заданного промежутка.подскажите,пожалуйста,как это сделать. 
а то я уже всю голову сломала
*/
