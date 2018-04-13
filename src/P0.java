import java.io.File;
import java.util.Scanner;

public class P0 
{
	static Scanner in;
	static String line;
	
	static final String fileName = "DATA01.txt";
	
	public static void main(String[] args) 
	{
		try 
		{
			in = new Scanner(new File(fileName));
		}
		catch (Exception e)
		{
			System.out.println("File Error");
		}
		
		// Code here
		for (int i = 0; i<5; i++) {
			String line = in.nextLine();
			String[]insects = line.split(" ");
			int []numFriends = new int[3];
			int []numPests = new int[3];
			
			numFriends[0] = 0;
			numFriends[1] = 0;
			numFriends[2] = 0;
			numPests[0] = 0;
			numPests[1] = 0;
			numPests[2] = 0;
			
			for (int j = 0; j<20; j++) {
				if (insects[j].equals("LADYBUG")) {
					numFriends[0]++;
				}
				else if (insects[j].equals("SPIDER")) {
					numFriends[1]++;
				}
				else if (insects[j].equals("CENTIPEDE")) {
					numFriends[2]++;
				}
				else if (insects[j].equals("COCKROACH")) {
					numPests[0]++;
				}
				else if (insects[j].equals("ANT")) {
					numPests[1]++;
				}
				else if (insects[j].equals("BEDBUG")) {
					numPests[2]++;
				}
			}
			
			int n = numFriends.length;
			
			for (int j = 1 ; j < n ; j++)
			{
			    int key = numFriends [j];
			    int x = j - 1;
			    while ((x > -1) && (numFriends [x] > key))
			    {
			    	numFriends [x + 1] = numFriends [x];
				x--;
			    }
			    numFriends [x + 1] = key;
			}
		
			n = numPests.length;
			
			for (int j = 1 ; j < n ; j++)
			{
			    int key = numPests [j];
			    int x = j - 1;
			    while ((x > -1) && (numPests [x] > key))
			    {
			    	numPests [x + 1] = numPests [x];
				x--;
			    }
			    numPests [x + 1] = key;
			}
			
			if (numFriends[2]>numPests[2]) {
				System.out.println("FRIEND");
			}
			else {
				System.out.println("PEST");
			}
		}
		
	}
}


//public class MyInsertionSort
//{
//
//    public static void main (String[] args)
//    {
//
//	int[] input = {4, 2, 9, 6, 23, 12, 34, 0, 1};
//	insertionSort (input);
//    }
//
//
//    private static void printNumbers (int[] input)
//    {
//
//	for (int i = 0 ; i < input.length ; i++)
//	{
//	    System.out.print (input [i] + ", ");
//	}
//	System.out.println ("\n");
//    }
//
//
//    public static void insertionSort (int array[])
//    {
//	int n = array.length;
//	for (int j = 1 ; j < n ; j++)
//	{
//	    int key = array [j];
//	    int i = j - 1;
//	    while ((i > -1) && (array [i] > key))
//	    {
//		array [i + 1] = array [i];
//		i--;
//	    }
//	    array [i + 1] = key;
//	    printNumbers (array);
//	}
//    }
//}
