public class Main {
  public static void main(String[] args) {
    int result = sum(3);
    System.out.println(result);
  }
  public static int sum(int e) {
    if (e > 0) {
      return e + sum(e - 1);
    } else {
      return 0;
      //What is it's purpose? When the sum() function is called, it adds parameter "e" to the sum of all numbers smaller than "e" and returns the result. When "e" becomes 0, the function just returns 0. When running, the program follows these steps:
    // 3 + sum(2)
    // 3 + sum(2 + sum(1))
    // 3 + sum(2 +(1 + sum(0)))
    // 3 + 2 + 1 + sum(0)

    }
  }
}
