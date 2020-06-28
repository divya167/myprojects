import java.util.Random;

import java.util.Scanner;

class Matrix
{
 public static void main (String[]args)
{

    Scanner in = new Scanner (System.in);

    String choice;

    do
      {

	System.out.println (" Enter the dimension for matrix: ");

	int n = in.nextInt ();

	while (n > 100)
	  {

	    System.out.println (" The dimension you enter is Invalid.");

	    System.out.println (" Enter the dimension for matrix: ");

	    n = in.nextInt ();

	  }

	int box1[][] = new int[n][n];

	int box2[][] = new int[n][n];

	int result[][] = new int[n][n];

	Random r = new Random ();

	for (int y = 0; y < n; y++)
	  {

	    for (int z = 0; z < n; z++)
	      {

		box1[y][z] = r.nextInt (100);

		box2[y][z] = r.nextInt (100);

	      }

	  }

	System.out.println (" Matrix 1:");

	print (box1);
	System.out.println ();
	System.out.println (" Matrix 2:");

	print (box2);
	System.out.println ();


	int sum = 0;

	for (int a = 0; a < n; a++)
	  {

	    for (int b = 0; b < n; b++)
	      {

		for (int c = 0; c < n; c++)
		  {

		    sum = sum + box1[a][b] * box2[c][b];

		  }

		result[a][b] = sum;

		sum = 0;

	      }

	  }

	System.out.println (" Result: ");

	print (result);


  choice = in.next();

  }
  while (choice.equalsIgnoreCase ("next"));

  }


  public static void print (int box[][])
 
  {

    int n = box.length;

    System.out.print ("[");

    for (int y = 0; y < n; y++)
      {

	System.out.print ("[");

	for (int z = 0; z < n; z++)
	  {

	    System.out.print (box[y][z]);

	    if (z != n - 1)

	      System.out.print (", ");

	  }

	System.out.print ("]");

	if (y != n - 1)

	  System.out.println (",");

      }

    System.out.print ("]");

  }

}