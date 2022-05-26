import java.util.ArrayList;

public class Practice {
    public static ArrayList<Integer> primeNumberCounter(Integer number) {
        if (number==null){
            throw new IllegalArgumentException();
        }
        if (number > 0) {
            ArrayList<Integer> result = new ArrayList<>();
            for (int i = 1; i <= number; i++) {
                int dividers = 0;
                for (int j = i; j>0 ;j--){
                    if (i % j == 0) {
                        dividers++;
                    }

                }
                if (dividers<3){
                    result.add(i);
                }

            }
            return result;
        }else {
            throw new IllegalArgumentException();
        }

    }

    public static void main(String[] args) {
        int number=1000;
        System.out.println(Practice.primeNumberCounter(number));
    }
}
