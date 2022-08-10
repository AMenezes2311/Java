import java.util.Scanner;

// Modified by Andre Menezes

public class LightboardRunner
{
  public static void main(String[] args)
  {
    System.out.println("======= PROBLEM 1 ========\n");
    // Problem 1 - Open page 268 in the book
    // and create a 2D array of doubles
    // you see in the distance table.
    // Then display all these values
    // using the code on page 271 in
    // #3 printing arrays.

    double[][] distances =
      {{0, 983, 787, 714, 1375, 967, 1087},
       {983, 0, 214, 1102, 1763, 1723, 1842},
       {787, 214, 0, 888, 1549, 1548, 1627}, {714, 1102, 888, 0, 661, 781, 810},
       {1375, 1763, 1549, 661, 0, 1426, 1187},
       {967, 1723, 1548, 781, 1426, 0, 239},
       {1087, 1842, 1627, 810, 1187, 239, 0},};

    for (int row = 0; row < distances.length; row++)
    {
      for (int column = 0; column < distances[row].length; column++)
      {
        System.out.print(distances[row][column] + " ");
      }
      System.out.println();
    }

    System.out.println("\n======= PROBLEM 2 ========\n");
    // Problem 2 - Create the 5X5 2D array matrix
    // seen in figure 8.1 on page 269
    // Print it, then
    // then change the element to 7
    // print the matrix again to
    // show that it changed.
    int[][] matrix;
    matrix = new int[5][5];

    // printing out array matrix
    for (int row = 0; row < matrix.length; row++)
    {
      for (int column = 0; column < matrix[row].length; column++)
      {
        System.out.print(matrix[row][column] + " ");
      }
      System.out.println();
    }
    System.out.println();

    // setting the element in the third column, second row, to 7
    matrix[2][1] = 7;

    // printing out array matrix
    for (int row = 0; row < matrix.length; row++)
    {
      for (int column = 0; column < matrix[row].length; column++)
      {
        System.out.print(matrix[row][column] + " ");
      }
      System.out.println();
    }

    System.out.println("\n======= PROBLEM 3 ========\n");
    // Problem 3 - Create a 3X3 tic tac toe 2D array.
    // Fill it with "-" to start.
    // Pretend you are two people taking
    // turns playing the game with "X", and "O"
    // print the board every time someone
    // enters an "X" or "O".
    // put a blank line between boards.

    String[][] board;
    board = new String[3][3];

    for (int row = 0; row < board.length; row++)
    {
      for (int column = 0; column < board[row].length; column++)
      {
        board[row][column] = "-";
      }
    }

    java.util.Scanner input = new Scanner(System.in);
    for (int row = 0; row < board.length; row++)
    {
      for (int column = 0; column < board[row].length; column++)
      {
        System.out.print("\nEnter X or O: ");
        board[row][column] = input.next();
        System.out.println();

        for (int row1 = 0; row1 < board.length; row1++)
        {
          for (int column1 = 0; column1 < board[row].length; column1++)
          {
            System.out.print(board[row1][column1] + " ");
          }
          System.out.println();
        }
      }
    }

    System.out.println("\n======= PROBLEM 4 ========\n");
    // Problem 4 - Create a 10 by 20 2D array of boolean
    // values. Each element has a 25% chance of being a
    // true.
    // Print all of the values using the
    // printing arrays code in page 271.
    boolean[][] array;
    array = new boolean[10][20];

    for (int row = 0; row < array.length; row++)
    {
      for (int column = 0; column < array[row].length; column++)
      {
        int nextInt = (int) (Math.random() * 100);
        if (nextInt <= 25)
        {
          array[row][column] = true;
        }
        else
        {
          array[row][column] = false;
        }
      }
    }
    for (int row = 0; row < array.length; row++)
    {
      for (int column = 0; column < array[row].length; column++)
      {
        System.out.print(array[row][column] + " ");
      }
      System.out.println();
    }

  }

}
