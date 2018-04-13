//import java.io.File;
//import java.util.Scanner;
//
//public class P1 
//{
//	static Scanner in;
//	static String line;
//	
//	static final String fileName = "DATA11.txt";
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
//		
//		for (int i = 0; i < 10; i++)
//		{
//			line = in.nextLine();
//			String[] arr = line.split(" ");
//			
//			int t = Integer.parseInt(arr[0]);
//			int n = Integer.parseInt(arr[1]);
//			
//			String[] input = new String[n];
//			
//			for (int j = 0; j < n; j++)
//			{
//				line = in.nextLine();
//				input[j] = line;
//			}
//			
//			int dPlay = 0;
//			for (int j = 0; j < n; j++)
//			{
//				if (input[j].equals("B"))
//				{
//					dPlay += t;
//				}
//				
//				if (dPlay > 0)
//				{
//					dPlay -= 1;
//				}
//				
//			}
//			System.out.println(dPlay);
//			
//			
////			System.out.println(t);
////			System.out.println(n);
////			
////			for (int j = 0; j < n; j++)
////			{
////				System.out.println(input[j]);
////			}
//		}
//
//		// Code here
//		
//	}
//}
