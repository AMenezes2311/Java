/**
 * Complete the methods below. A series of exercises that focus on 2D arrays of
 * primitives. You may assume that any 2D array will be rectangular i.e all rows
 * in the 2D array have the same length.
 *
 * @author Andre Menezes
 * @version 1.5
 *
 */
public class JU24V
{
  // Declare and initialize constants here. Make sure you name them in
  // a way that makes the grader happy.

  /**
   * A 1D array review problem. Given an array of coinFlips, count the number
   * of heads and return it. Assume heads == true, and tails == false. You must
   * do this with a FOREACH loop. Examples:
   * 
   * <pre>
   * countHeadsUsingFOREACH({true, true, false}) -> 2
   * countHeadsUsingFOREACH({false, false, true, true, true}) -> 3
   * </pre>
   * 
   * @param coinFlips
   *          != null
   * @return number of heads.
   */
  public static int countHeadsUsingFOREACH(boolean[] coinFlips)
  {
    // TODO: Use a FOREACH loop to solve.
    // I've given you the complete solution using a regular FOR loop, however
    // you need to use a FOREACH loop to solve this. Any time you have a
    // situation
    // with a 1D array where you (1) need to access all values of an array, (2)
    // will
    // not change any value of the array, (3) don't care about indexes, it's
    // time to use
    // a FOREACH loop. FOREACH loops are introduced on page 233 in the EText.
    // FOREACH loops are often called "enhanced for loops".
    // Please use Google too and type in "Java For Each loops" for more
    // examples.

    int headCount = 0;
    for (boolean element : coinFlips) // CONVERT TO FOREACH
    {
      if (element == true)
      {
        headCount++;
      }
    }
    return headCount;

  }

  /**
   * Returns the number of columns that matrix contains.
   *
   * PRECONDITION: matrix has at least one row.
   *
   * @param arr
   *          is not null.
   * @return number of columns that arr contains.
   */
  public static int getNumberOfColumns(int[][] matrix)
  {
    // TODO: Complete and pass the test associated with this.
    return matrix[0].length; // you probably want to change this.
  }

  /**
   * Returns the number of rows that matrix contains.
   *
   * PRECONDITION: matrix has at least one row.
   *
   * @param arr
   *          is not null.
   * @return
   */
  public static int getNumberOfRows(int[][] matrix)
  {
    // TODO: Complete and pass the test associated with this.
    return matrix.length; // you probably want to change this.
  }

  /**
   * Returns the dimensions of the matrix in a nice human format.
   *
   * <pre>
   * if arr1 is:
   * 8 9
   * 2 0
   * 3 3
   * getDimensions(arr1) -> "3x2"
   *
   * if arr2 is:
   * 8 9 4 4 1
   * 2 0 3 3 1
   * 3 3 3 3 2
   * 3 3 3 3 2
   * getDimensions(arr2) -> "4x5"
   * </pre>
   *
   * @param matrix
   * @return
   */
  public static String getDimensions(int[][] matrix)
  {
    // TODO: Complete and pass the test associated with this.
    int row = matrix.length;
    int column = matrix[0].length;
    return row + "x" + column;
  }

  /**
   * The client will send you a 2D array reference that is constructed where all
   * elements are zero. Your job is to set three of the elements to different
   * values. Sets three of the numbers in the 2D array to 42, -2, and -3. The
   * top left corner element is 42. The 3rd row, 3rd column is -2. The 4th row
   * 6th
   * column is -3
   *
   * <pre>
   * For example:
   * if arr is this:
   * [0, 0, 0, 0, 0, 0, 0]
   * [0, 0, 0, 0, 0, 0, 0]
   * [0, 0, 0, 0, 0, 0, 0]
   * [0, 0, 0, 0, 0, 0, 0]
   * [0, 0, 0, 0, 0, 0, 0]
   *
   * Then after the method call to setThreeNumbers, it will look like this:
   * [42, 0, 0, 0, 0, 0, 0]
   * [0, 0, 0, 0, 0, 0, 0]
   * [0, 0, -2, 0, 0, 0, 0]
   * [0, 0, 0, 0, 0, -3, 0]
   * [0, 0, 0, 0, 0, 0, 0]
   *
   * The values are set the same in every 2d array that's sent.
   * the one in the top left corner
   * is 42, etc.
   * </pre>
   *
   * @param arr
   *          is already constructed but may not have enough space to store all
   *          the numbers
   */
  public static void setThreeNumbers(int[][] arr)
  {
    // TODO: Complete and pass the test associated with this.
    arr[0][0] = 42;
    if (arr.length >= 2 && arr[0].length >= 2)
    {
      arr[2][2] = -2;
    }
    if (arr.length >= 4 && arr[0].length >= 6)
    {
      arr[3][5] = -3;
    }
  }

  /**
   * Sets the corner elements of a 2D array to the same value given by the
   * client.
   * 
   * <pre>
   * 0 0 0 
   * 0 0 0
   * 0 0 0
   *
   * after a call to setTheCorners(arr, 4), the 2D array will look like this.
   *
   * 4 0 4
   * 0 0 0
   * 4 0 4
   * </pre>
   * 
   * @param arr
   *          non null.
   * @param value
   *          any integer
   */
  public static void setTheCorners(int[][] arr, int value)
  {
    // TODO: Complete and pass the test associated with this.
    arr[0][0] = value;
    arr[0][arr[0].length - 1] = value;
    arr[arr.length - 1][0] = value;
    arr[arr.length - 1][arr[0].length - 1] = value;
  }

  /**
   * Creates a 2x2 2D array filled with the fillValue sent by the client.
   *
   * @param fillValue
   * @return
   */
  public static int[][] buildASmallSquare(int fillValue)
  {
    // TODO: Complete and pass the test associated with this.
    int[][] array = new int[2][2];
    for (int row = 0; row < array.length; row++)
    {
      for (int column = 0; column < array[0].length; column++)
      {
        array[row][column] = fillValue;
      }
    }

    return array;
  }

  /**
   * Returns the capacity of the array arr. Determines the maximum number of
   * elements that this array can store. Return zero if the array has not been
   * constructed.
   *
   * <pre>
   * getCapacity(null) -> 0
   * getCapacity({1, 2, 4},
   *             {5, 2, 9}) - > 6
   * </pre>
   *
   * @param arr
   *          can be null so watch for that.
   * @return zero if the array was null.
   */
  public static int getCapacity(int[][] arr)
  {
    // TODO: Finish
    if (arr == null)
    {
      return 0;
    }
    else
    {
      return arr.length * arr[0].length;
    }
  }

  /**
   * Determines if the non-null matrix has a square shape.
   * 
   * <pre>
   * isSquare({1, 2}, {3, 4}) -> true
   * isSquare({1, 2}, {3, 4}, {4, 5}) -> false
   * </pre>
   * 
   * @param arr
   *          non null
   * @return true if the
   */
  public static boolean isSquare(int[][] matrix)
  {
    // TODO: Finish
    if (matrix.length == matrix[0].length)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  /**
   * Create an array that copies the values from the first column of the
   * non-null matrix.
   * 
   * <pre>
   * So if the matrix is
   *     1, 5, 9
   *     12, 41, 2
   *     4, 9, 8
   *     8, 8, 8
   *     
   * Then the returned value would be
   *    {1, 12, 4, 8}
   * </pre>
   * 
   * @param matrix
   * @return
   */
  public static int[] getFirstColumn(int[][] matrix)
  {
    // TODO: Fix this.
    // Note: Getting the first row is really easy because you could just
    // return the reference matrix[0] which contains the address
    // of the first row of a 2d array. However, getting the first column
    // is a bit tougher because you'll have to create a 1D array long
    // enough to store all of the values, and then copy them in with a loop.
    int[] arr = new int[matrix.length];
    for (int i = 0; i < arr.length; i++)
    {
      arr[i] = matrix[i][0];
    }
    return arr;
  }

  /**
   * Given a length of a square 2D array of integers, build that 2D array, then
   * fill it with the value 13 in all of the elements, except where the row
   * number is the same as the column number, fill those with 42's. Return that
   * array.
   * 
   * <pre>
   * buildAndFillSquare(5) ->
   * 42 13 13 13 13
   * 13 42 13 13 13
   * 13 13 42 13 13
   * 13 13 13 42 13
   * 13 13 13 13 42
   * </pre>
   * 
   * @param sideLength
   *          > 0
   * @return a 2D array.
   */
  public static int[][] buildAndFillSquare(int sideLength)
  {
    // TODO: Complete and pass the test associated with this.
    int[][] array = new int[sideLength][sideLength];
    for (int row = 0; row < array.length; row++)
    {
      for (int column = 0; column < array[0].length; column++)
      {
        if (array[row] == array[column])
        {
          array[row][column] = 42;
        }
        else
        {
          array[row][column] = 13;
        }
      }
    }
    return array; // you probably want to change this.
  }

  /**
   * Bumps all of the values in a particular row by +1. If it's NOT a valid row
   * number, then the array is not changed.
   *
   * @param arr
   *          non null
   * @param rowNum
   *          may be invalid.
   */
  public static void increaseValuesOfARowByOne(int[][] arr, int rowNum)
  {
    // TODO: Complete and pass the test associated with this.
    if (rowNum < arr.length)
    {
      for (int row = 0; row < arr.length; row++)
      {
        for (int col = 0; col < arr[row].length; col++)
        {
          if (row == rowNum)
          {
            arr[rowNum][col] = arr[rowNum][col] + 1;
          }
        }
      }
    }
  }

  /**
   * Othello is a board game. You find out who wins by counting the number of
   * white discs (player 1 true) and black discs (player 2 false). A two
   * dimensional array is passed to this method. There are three possible
   * responses: "Player 1 Wins!", "Player 2 Wins!", "It's a Tie!"
   *
   * <pre>
   * if aBoard is:
   * true false
   * false true
   * whoWonOthello(aBoard) -> "It's a Tie!"
   *
   * if bBoard is:
   * true true true true
   * false false true true
   * whoWonOthello(bBoard) -> "Player 1 Wins!"
   * </pre>
   *
   *
   * @param board
   *          non null
   * @return see above.
   */
  public static String whoWonOthello(boolean[][] board)
  {
    // TODO: Complete and pass the test associated with this.
    int numFalse = 0;
    int numTrue = 0;

    for (int row = 0; row < board.length; row++)
    {
      for (int column = 0; column < board[0].length; column++)
      {
        if (board[row][column] == true)
        {
          numTrue++;
        }
        else
        {
          numFalse++;
        }
      }
    }

    if (numTrue > numFalse)
    {
      return "Player 1 Wins!";
    }
    else if (numFalse > numTrue)
    {
      return "Player 2 Wins!";
    }
    else
    {
      return "It's a Tie!";
    }
  }

  /**
   * Tallies each column in a total at the bottom of the 2d array. Any values in
   * the last row are overwritten with these subtotals. The 2D array can have
   * any dimensions, but the last row will always start out as zeros.
   *
   * <pre>
   * 1 2 3 1 2
   * 1 3 1 0 2
   * 0 0 0 0 0
   *
   * after the call to fillTotals
   *
   * 1 2 3 1 2
   * 1 3 1 0 2
   * 2 5 4 1 4
   * </pre>
   *
   * @param scores
   *          non null
   */
  public static void fillTotals(int[][] scores)
  {
    int sum = 0;
    for (int col = 0; col < scores[0].length; col++)
    {
      for (int row = 0; row < scores.length; row++)
      {
        sum += scores[row][col];
      }
      scores[scores.length - 1][col] = sum;
      sum = 0;
    }
  }

  /**
   * Searches for the value searchValue in a 2D matrix. There's a message if you
   * can't find the value and one if you do find the value. Examples:
   *
   * <pre>
   * if arr2D is
   * 8 3 2
   * 9 3 1
   * locateValue(arr2D, 10) ->
   * "The value 10 is not in this array."
   *
   * if arr2DB is
   * 8 2 2 2 1
   * 9 9 9 2 1
   * 0 0 2 2 1
   * 0 1 1 8 1
   * locateValue(arr2DB, 8) ->
   * "The value 8 was found at row 3, column 3."
   * </pre>
   *
   * @param arr
   *          is not null.
   * @param searchValue
   *          a value that may or may not exist in the matrix.
   * @return see the message format above.
   */
  public static String locateValue(int[][] matrix, int searchValue)
  {
    // TODO: Complete and pass the test associated with this.
    for (int row = 0; row < matrix.length; row++)
    {
      for (int column = 0; column < matrix[row].length; column++)
      {
        if (matrix[row][column] == searchValue)
        {
          return "The value " + searchValue + " was found at row " + row
            + ", column " + column + ".";
        }
      }
    }
    return "The value " + searchValue + " is not in this array.";
  }

  /**
   * Given the exact coordinates in the 2D array, Creates a plus sign with the
   * intersection on the array using the number 3.
   *
   * <pre>
   * 0 0 0 0
   * 0 0 0 0
   * 0 0 0 0
   *
   * After makePlus(arr, 2, 1)
   *
   * 0 3 0 0
   * 0 3 0 0
   * 3 3 3 3
   * 0 3 0 0
   * </pre>
   *
   * @param arr
   *          non null array filled with zeroes
   * @param x
   *          a valid subscript
   * @param y
   *          a valid subscript
   */
  public static void makePlus(int[][] arr, int x, int y)
  {
    // TODO: Complete and pass the test associated with this.
    for (int col = 0; col < arr[0].length; col++)
    {
      arr[x][col] = 3;
    }
    for (int row = 0; row < arr.length; row++)
    {
      arr[row][y] = 3;
    }
  }

  /**
   * Creates a 1D array of Strings from a 2D array. Stitch each row together
   * into a 1D array of Strings.
   *
   * <pre>
   *
   * 2 3 4 1
   * 8 1 1 2
   *
   * returns
   *
   * [2341, 8112]
   * </pre>
   *
   * @param arr
   * @return
   */
  public static String[] stichEachRow(int[][] matrix)
  {
    // TODO: Complete and pass the test associated with this.
    String[] arr = new String[matrix.length];
    String str = "";
    for (int row = 0; row < matrix.length; row++)
    {
      for (int column = 0; column < matrix[0].length; column++)
      {
        str += matrix[row][column];
      }
      arr[row] = str;
      str = "";
    }
    return arr; // you probably want to change this.
  }

  /**
   * Finds the row that contains the largest sum total of values. For example,
   * if arr is a 2D array filled with the values below:
   *
   * <pre>
   * 3 4 1
   * 5 5 6
   * 4 1 0
   * 7 0 1
   * 4 5 1
   * </pre>
   *
   * getBigRow() returns 1 because 5 + 5 + 6 is 16 and it's larger than any
   * other row value sum.
   *
   * @param arr
   *          is not null.
   * @return the row subscript containing the largest row sum.
   */
  public static int getBigRow(int[][] arr)
  {
    // TODO: Complete and pass the test associated with this.
    int maxValue = 0;
    int sumRow = 0;
    int index = 0;

    for (int row = 0; row < arr.length; row++)
    {
      for (int column = 0; column < arr[0].length; column++)
      {
        sumRow += arr[row][column];
        if (sumRow > maxValue)
        {
          maxValue = sumRow;
          index = row;
        }
      }
      sumRow = 0;
    }
    return index;
  }
}