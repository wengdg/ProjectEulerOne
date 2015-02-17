/**
 * E23: ProjectEulerOne Test
 * Created by Weng on 2/2/2015.
 */
public class ProjectEulerOne {

  /**
   * Computes sum of multiples of 3 or 5 below 1000.
   * @param args Invalid.
   */
  public static void main(String[] args) {

    System.out.print(sumMult(1000));
  }

  /**
   * Computes sum of multiples of 3 or 5 below a maximum number.
   * @param max Upper bound number.
   * @return The sum of the multiples.
   */
  public static int sumMult(int max) {
    int sum;
    sum = 0;

    for (int i = 0; i < max; i++) {
      if (i % 5 == 0) {
        sum = sum + i;
      }
      else if (i % 3 == 0) {
        sum = sum + i;
      }
    }
    return sum;
  }

}
