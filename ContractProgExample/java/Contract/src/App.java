    public class App {

        public static int square(int x) {
            assert x > 0 : "Precondition failed: x should be positive";
            int result = x * x;
            assert result == x : "Postcondition failed: result should be equal to x";
            return result;
        }
    
        public static void main(String[] args) {
            int result = square(5);
            System.out.println(result);  // Output: 25
    
            result = square(-5);  // Throws AssertionError with message "Precondition failed: x should be positive"
        }
    }

