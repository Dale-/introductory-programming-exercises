import java.util.ArrayList;

public class Factors {

    public ArrayList<Integer> generate(int n) {
        ArrayList<Integer> factorArrayList = new ArrayList<Integer>();
        for (int i = 2; i < n; i++) {
            if(n % i == 0) {
                factorArrayList.add(i);
            }
        }
        return factorArrayList;
    }

    
}
