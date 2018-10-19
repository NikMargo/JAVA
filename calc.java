import java.util.Scanner;

 public class calc {

	public static Scanner scanner = new Scanner(System.in);

 public static void main(String[] args) {
        int n1 = getNum();
        int n2 = getNum();
        char oper = getOper();
        int result = calc(n1,n2,oper);
        System.out.println("Результат операции: "+result);
    }

public static int getNum(){
        System.out.println("Введите число:");
        int n;
        if(scanner.hasNextInt()){
            n = scanner.nextInt();
        } else {
            System.out.println("ОШИБКА!!! Попробуйте еще раз.");
            scanner.next();
            n = getNum();
        }
        return n;
    }
 
    public static char getOper(){
        System.out.println("Введите операцию:");
        char oper;
        if(scanner.hasNext()){
            oper = scanner.next().charAt(0);
        } else {
            System.out.println("ОШИБКА!!! Попробуйте еще раз.");
            scanner.next();
            oper = getOper();
        }
        return oper;
    }


public static int calc(int n1, int n2, char oper){
        int result;
        switch (oper){
            case '+':
                result = n1+n2;
                break;
            case '-':
                result = n1-n2;
                break;
            case '*':
                result = n1*n2;
                break;
            case '/':
     			if (n2 == 0) {
    			System.exit(1);
  				}
                result = n1/n2;
                break;
            default:
                System.out.println("НЕ РАБОТАЕТ!!!! Повторите ввод.");
                result = calc(n1, n2, getOper());

 
        }
        return result;
    }
}