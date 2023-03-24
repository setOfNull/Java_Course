import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> integerss = new ArrayList<>();
        int lower = 0, upper = 10;


        for (int i =0; i<20; i++){
            int r = (int) (Math.random() * (upper - lower)) + lower;
            integerss.add(r);
        }
        System.out.println(integerss);


        Set<Integer> unique = new HashSet<>();
        List<Integer> garbage = new ArrayList<>();
        for (int in: integerss){
            if (!unique.add(in)){
                garbage.add(in);
            }
        }
        System.out.println(unique);
        System.out.println("количество " + garbage.size() + garbage);


    }
}
