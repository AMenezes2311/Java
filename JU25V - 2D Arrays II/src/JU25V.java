/**
 * Complete the methods below. A series of exercises that focus on 2D arrays of
 * primitives. You may assume that any 2D array will be rectangular i.e all rows
 * in the 2D array have the same length.
 *
 * @author Andre Menezes
 * @version 2.0
 *
 */
public class JU25V
{
  // Declare and initialize constants here. Make sure you name them in
  // a way that makes the grader happy.

  /**
   * Inputs three references to 1D arrays and builds and returns a 2D array that
   * consists of just those rows. If you remember that a 2D array is just an
   * array of arrays, this will be rather simple. (no loops required)
   *
   * <pre>
   * PRECONDITION: All three rows are the same length and are not null.
   * </pre>
   *
   * @param row0
   *          not null
   * @param row1
   *          not null
   * @param row2
   *          not null
   * @return
   */
  public static int[][] build2DArrayWithRows(int[] row0, int[] row1, int[] row2)
  {
    // TODO: Complete and pass the test associated with this.
    int[][] array = new int[3][row0.length];
    array[0] = row0;
    array[1] = row1;
    array[2] = row2;

    return array;
  }

  /**
   * Returns the reference to the last row in the matrix. If you remember that a
   * 2D array is just an array of arrays, this will be rather simple. (no loops
   * required)
   *
   * <pre>
   * If the matrix is
   * 2, 9, 2, 1, 3
   * 9, 9, 2, 9, 9
   * 8, 2, 2, 2, 2
   *
   *then
   *returnLastRowOf2DArray returns a 1D array reference
   * 8, 2, 2, 2, 2
   * </pre>
   *
   * @param matrix
   * @return
   */
  public static int[] returnLastRowOf2DArray(int[][] matrix)
  {
    // TODO: Complete and pass the test associated with this.
    return matrix[matrix.length - 1];
  }

  /**
   * Creates a new 2D array that contains the sum of the values
   * of the two 2D arrays sent to it.
   * If the two matrices are not the same dimensions, then
   * return null. Example
   * 
   * <pre>
   * {{1, 3}   +  {{2, 2}   =  {{3, 5}
   *  {2, 5}}      {1, 1}}      {3, 6}}
   * </pre>
   * 
   * @param a
   * @param b
   * @return
   */
  public static int[][] addTwoMatrices(int[][] a, int[][] b)
  {
    if (a[0].length != b[0].length || a.length != b.length)
    {
      return null;
    }
    else
    {
      int[][] array = new int[a.length][a[0].length];
      for (int row = 0; row < a.length; row++)
      {
        for (int column = 0; column < a[0].length; column++)
        {
          array[row][column] = a[row][column] + b[row][column];
        }
      }
      return array;
    }
  }

  /**
   * (Lesson 17.2 Focus on has a huge hint) Return
   * the sum total of all numbers in any 2D array.
   * 
   * @param gridOfNumbers
   * @return
   */
  public static int sumOfAllElementsIn2DArray(int[][] gridOfNumbers)
  {
    // TODO:
    int sum = 0;
    for (int row = 0; row < gridOfNumbers.length; row++)
    {
      for (int column = 0; column < gridOfNumbers[0].length; column++)
      {
        sum += gridOfNumbers[row][column];
      }
    }
    return sum;
  }

  /**
   * See page 274 for hints and full description.
   * Given the responses from students and the solution key,
   * this will return a grade report showing how many points
   * each student got. The number of students and number
   * of questions can vary for each exam.
   * 
   * <pre>
   * If a student responses were {"A", "C", "C", "B"}
   * and the key was             {"C", "C", "C", "B"}
   * then the student missed only the first question.
   * The report would have
   * Student #2's correct count is 3 out of 4
   * </pre>
   * 
   * @param answers
   * @param key
   * @return
   */
  public static String gradeExam(String[][] answers, String[] key)
  {
    // TODO:
    // remember that "==" doesn't really work like it does for primtives
    String string = "";
    for (int i = 0; i < answers.length; i++)
    {
      int correctCount = 0;
      for (int j = 0; j < answers[i].length; j++)
      {
        if (answers[i][j].equals(key[j]))
        {
          correctCount++;
        }
      }
      string +=
        "Student #" + i + "'s correct count is " + correctCount + " out of "
          + key.length + "\n";
    }
    return string;
  }

}