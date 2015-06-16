
public class Diamond {

    public String isosceles_triangle(int n) {

        String triangle = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1 ; j++) {
                triangle += " ";
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                triangle += "*";
            }
            triangle += "\n";
        }
        return triangle;
    }

    public String diamond(int n) {

        String centeredDiamond = this.isosceles_triangle(n);
        for (int i = 0; i < n - 1; i++) {
            for(int j = 0; j < i + 1; j++) {
                centeredDiamond += " ";
            }
            for(int k = 0; k < 2 * (n - i) - 3; k++) {
                centeredDiamond += "*";
            }
            centeredDiamond += "\n";
        }
        return centeredDiamond;
    }

    public String diamondWithName(int n) {
        String nameDiamond = this.diamond(n);
        String middleLine = "";
        for (int i = 0; i < 2 * n - 1; i++) {
            middleLine += "*";
        }
        return nameDiamond.replace(middleLine, "DaleDu");
    }

    public static void main(String[] args) {
        Diamond diamond = new Diamond();

        System.out.println("Isosceles Triangle");
        System.out.println(diamond.isosceles_triangle(3));

        System.out.println("\nDiamond");
        System.out.println(diamond.diamond(3));

        System.out.println("\nDiamond with Name");
        System.out.println(diamond.diamondWithName(3));
    }
}
