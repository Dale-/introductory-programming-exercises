
public class Diamond {

    public String isosceles_triangle(int n) {
        String triangle = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i ; j++) {
                triangle += " ";
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                triangle += "*";
            }
            triangle += "\n";
        }
        return triangle;
    }

    public static void main(String[] args) {
        Diamond diamond = new Diamond();
        System.out.println(diamond.isosceles_triangle(3));
    }
}
