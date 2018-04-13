//import java.io.File;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class P2
//{
//	static Scanner in;
//	//static String line;
//	
//	static final String fileName = "DATA22.txt";
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
//		// Code here
//		int N;
//		
//		for (int count = 0; count < 10; count++)
//		{
//			N = Integer.parseInt(in.nextLine());
//			
//			int dataset[][] = new int[N][2];
//			for (int i = 0; i < N; i++)
//			{
//				String lineIn = in.nextLine();
//				String lineInArr[] = lineIn.split(" ");
//				
//				int line[] = new int [lineInArr.length - 2];
//				
//				
//				
//				for (int z = 2; z < lineInArr.length; z++)
//				{
//					line[z - 2] = Integer.parseInt(lineInArr[z]);
//				}
//				
//				
//				
//				int n = line.length;
//				
//				for (int j = 1 ; j < n ; j++)
//				{
//				    int key = line [j];
//				    int x = j - 1;
//				    while ((x > -1) && (line [x] > key))
//				    {
//				    	line [x + 1] = line [x];
//					x--;
//				    }
//				    line [x + 1] = key;
//				}
////				
////				for (int y = 0 ; y < line.length ; y++)
////				{
////				    System.out.print (line [y] + ", ");
////				}
////				System.out.println ("\n");
//				
//				dataset[i][0] = Integer.parseInt(lineInArr[0]);
//				dataset[i][1] = line[0];
//			}
//				int lowest = 70010;
//				ArrayList<Integer> low = new ArrayList<Integer>();
//				
//				for (int k = 0; k < dataset.length; k++)
//				{
//					if (dataset[k][1] < lowest)
//					{
//						lowest = dataset[k][1];
//						low.clear();
//						low.add(dataset[k][0]);
//					}
//					else if (dataset[k][1] == lowest)
//					{
//						low.add(dataset[k][0]);
//					}
//				}
//				
//				int n = low.size();
//				
//				for (int j = 1 ; j < n ; j++)
//				{
//				    int key = low.get(j);
//				    int x = j - 1;
//				    while ((x > -1) && (low.get(x) > key))
//				    {
//				    	low.set(x + 1, low.get(x));
//					x--;
//				    }
//				    low.set(x + 1, key);
//				}	
//
//				
//				System.out.print(lowest + " {");
//				for (int f = 0; f < low.size(); f++)
//				{
//					if (f > 0)
//						System.out.print(",");
//					System.out.print(low.get(f));
//				}
//				System.out.println("}");
//				
//				
//				
//
//			
//				
//		}
//		
//	}
//}
