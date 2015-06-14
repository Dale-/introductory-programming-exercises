public class Triangle {

    public String easy() {
        return "*";
    }

    public String horizontal(int n) {
        String line = "";
        for(int i = 0; i < n; i++) {
            line += "*";
        }
        return line;
    }

    public String vertical(int n) {
        String line = "";
        for(int i = 0; i < n; i++) {
            line += "*\n";
        }
        return line;
    }

    public String rightTriangle(int n) {
        String triangle = "";
        for(int i = 0; i < n; i++) {
            triangle += this.horizontal(i + 1) + "\n";
        }
        return triangle;
    }

    public static void main(String[] args) {

        Triangle triangle = new Triangle();

        System.out.println("Easiest exercise ever");
        System.out.println(triangle.easy());

        System.out.println("\nDraw a horizontal line");
        System.out.println(triangle.horizontal(8));

        System.out.println("\nDraw a vertical line");
        System.out.println(triangle.vertical(3));

        System.out.println("Draw a right triangle");
        System.out.println(triangle.rightTriangle(3));
    }
}