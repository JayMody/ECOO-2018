//import java.io.File;
//import java.util.Scanner;
//
//public class P4
//{
//	static Scanner in;
//	static String line;
//
//	static final String fileName = "DATA41.txt";
//
//	public static void main(String[] args) 
//	{
//		try 
//		{
//			in = new Scanner(new File(fileName));
//		}
//		catch (Exception e)
//		{
//			System.out.println("File Error");
//		}
//
//		long[] fib = new long[100];
//
//		fib[0] = -1;
//		fib [1] = 1;
//		fib[2] = 1;
//		for (int i = 3; i < 47; i++)
//		{
//			fib[i] = fib[i - 1] + fib[i - 2];
////			System.out.println(i + ":    "  + fib[i]);
//		}
//
//
//		for (int count = 0; count < 10; count++)
//		{
//			String[] lineArr = in.nextLine().split(" ");
//			int inputX = Integer.parseInt(lineArr[0]);
//			int inputY = Integer.parseInt(lineArr[1]);
//
//
//
//			int squareX = 1;
//			int squareY = 1;
//
//			int xCord;
//			int yCord;
//
//			int x = 0, y = 0;
//
//			if (inputX > 0)
//			{
//				xCord = 1;
//
//				while (inputX > xCord)
//				{
//					xCord += fib[(4 * x) + 4];
//					x++;
//				}
//
//				x--;
//				squareX = (4 * x) + 4;
//			}
//			else if (inputX < 0)
//			{
//				xCord = -1;
//
//				while (inputX < xCord)
//				{
//					xCord -= fib[(4 * x) + 6];
//					x++;
//				}
//
//				x--;
//				squareX = (4 * x) + 6;
//			}
//
//
//			if (inputY > 0)
//			{
//				yCord = 1;
//
//				while (inputY > yCord)
//				{
//					yCord += fib[(4 * y) + 3];
//					y++;
//				}
//
//				y--;
//				squareY = (4 * y) + 3;
//			}
//			else if (inputY < 0)
//			{
//				yCord = 0;
//
//				while (inputY < yCord)
//				{
//					yCord -= fib[(4 * y) + 5];   ///////  CHECK THIS ONE
//					y++;
//				}
//
//				y--;
//				squareY = (4 * y) + 5;
//			}
//			
////			System.out.println(squareX + " " + squareY);
//
//			
//			if (squareX > squareY)
//			{
//				System.out.println(squareX);
//			}
//			else
//			{
//				System.out.println(squareY);
//			}
//		}
//
//		// Code here
//
//	}
//}
