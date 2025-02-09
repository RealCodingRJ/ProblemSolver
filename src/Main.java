import RandomSelectedNumbers.RandomRangeNumber;
import com.Problem.Names.Names1;
import com.Problem.Names.Names2;

public class Main {
    public static ThreadLocal<String> local
            = ThreadLocal.withInitial(() -> null);

    public static void main(String[] args) {

        int num1 = RandomRangeNumber.Numbers(1, 10);
        int num2 = RandomRangeNumber.Numbers(5, 10);

        String name1 = Names1.getName();
        String name2 = Names2.getName();

        if (num1 instanceof Integer) {
            System.out.println("Number 1: " + num1);
            System.out.println("Number 2: " + num2);
        }

        if (name1 instanceof String name
                && name != "") {

            Thread thread = new Thread(() -> {
                local.set(name1);
                GetNameMessage();
            });
            thread.start();

            Thread thread1 = new Thread(() -> {
                local.set(name2);
                GetNameTwoMessage();
            });

            thread1.start();

        }


    }


    static void GetNameTwoMessage() {
        System.out.println("Name 2: " + local.get());
    }

    static void GetNameMessage() {
        System.out.println("Name 1: " + local.get());
    }

    static void printMessage() {
        System.out.println("Hello: " + local.get());
    }


}