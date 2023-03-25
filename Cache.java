import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cache {
    static String getCacheKey(int first, int second, String operation){
        StringBuilder builder = new StringBuilder();
        builder.append(first);
        builder.append(operation);
        builder.append(second);
        return builder.toString();
    }


    public static void main(String[] args) {
        Map <String, Integer> map = new HashMap<>();

        for (int i=0; i<100; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number: ");
            int userFirst = sc.nextInt();
            System.out.println("Enter operation: ");
            String userOperation = sc.next();
            System.out.println("Enter second number: ");
            int userSecond = sc.nextInt();

            int total = 0;

            if (map.containsKey(getCacheKey(userFirst, userSecond, userOperation))&& map.containsValue(total)){
                System.out.println(map);
            }


            if (userOperation.equals("+")){
                total = userFirst + userSecond;
            } else if (userOperation.equals("-")) {
                total = userFirst - userSecond;
            } else if (userOperation.equals("*")) {
                total = userFirst * userSecond;
            } else if (userOperation.equals("/")) {
                total =  userFirst / userSecond;
            }


            map.put(getCacheKey(userFirst, userSecond, userOperation), total);

            System.out.println(map);

        }




    }
}
