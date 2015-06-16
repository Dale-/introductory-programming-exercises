import java.util.ArrayList;

public class Factors {

    public ArrayList<Integer> generate(int n) {
        ArrayList<Integer> factorArrayList = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
           while (n % i == 0) {
               factorArrayList.add(i);
               n = n / i;
           }
        }
        return factorArrayList;
    }

    public static void main(String[] args) {
        Factors factors = new Factors();
        String output = "";
        ArrayList<Integer> factorArrayList = factors.generate(30);
        for (int i: factorArrayList) {
            output += i + ",";
        }
        System.out.println(output.substring(0, output.length() - 1));
    }

}
