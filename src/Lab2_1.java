import java.util.Scanner;

public class Lab2_1 {
    public static int Factorial(int n){
        int res = 1;
            if (n>=0 && n<15){
                for(int i = 1;i <= n;i++){
                    res = res*i;
                }
            } else {
                System.out.println("Число должно быть больше или равно 0, но меньше 15.Попробуйте снова.\nВведите число: ");
            }
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        while(!in.hasNext("close")){
            if(in.hasNextInt()){
                System.out.println("Факториал: " + Factorial(in.nextInt()));
            } else {
                System.out.println("Ошибка!Нужно целое число.Поробуйте ешё раз.\nВведите число: ");
                in.next();
            }
        }
        in.close();
    }
}
/*не получается убрать вывод факториал:1 после ввода целого числа не из заданного промежутка.подскажите,пожалуйста,как это сделать. 
а если добавить System.exit(1),то программа просто завершиться, но зато не будет выводить факториал 1
*/
