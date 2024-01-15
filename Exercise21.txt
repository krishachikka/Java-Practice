public class TryMathCube {
    public int cube(int n) {
        return n * n * n;
    }

    public static void main(String[] args) {
        TryMathCube tc = new TryMathCube();

        try {
            if (args.length == 0) {
                throw new IllegalArgumentException("Please provide an integer as a command-line argument");
            }

            int num = Integer.parseInt(args[0]);
            System.out.println(tc.cube(num));
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid input. Please provide a valid integer.");
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}