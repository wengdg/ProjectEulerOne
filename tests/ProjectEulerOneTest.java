import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests ProjectEulerOne class with smaller numbers.
 */
public class ProjectEulerOneTest {

  /**
   * Tests sumMult method with param 10 and 20.
   * @throws Exception If test fails.
   */
  @Test
  public void testSumMult() throws Exception {
    assertEquals("mult of 10", 23, ProjectEulerOne.sumMult(10));
    assertEquals("mult of 20", 78, ProjectEulerOne.sumMult(20));
  }
}