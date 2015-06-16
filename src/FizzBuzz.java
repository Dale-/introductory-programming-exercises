
public class FizzBuzz {

    public String fizzBuzz (int n) {
        String output = "";
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0 ) {
                    output += "FizzBuzz\n";
                } else {
                    output += "Fizz\n";
                }
            } else if (i % 5 == 0) {
                output += "Buzz\n";
            } else {
                output += i + "\n";
            }
        }
        return output;
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.fizzBuzz(15));
    }

}
