//import java.io.File;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class P3
//{
//	static Scanner in;
//	static String line;
//
//	static final String fileName = "DATA31.txt";
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
//		for (int i=0; i<10; i++) {
//
//			String []arr = in.nextLine().split(" ");
//			int N = Integer.parseInt(arr[0]);
//			int x = Integer.parseInt(arr[1]);
//			int y = Integer.parseInt(arr[2]);
//			int z = Integer.parseInt(arr[3]);
//
//			String[]codes = new String [N];
//			String[]answers = new String [N];
//
//			for (int j=0; j<N; j++) {
//				codes[j] = in.nextLine();
//			}
//
//			in.nextLine();
//
//			for (int j=0; j<N; j++) {
//				answers[j] = in.nextLine();
//			}
//
//			//int[]numFails = new int[N];
//			//int numOfFails = 0;
//			
//			
//			boolean match = true;
//			ArrayList <Integer> fails = new ArrayList<Integer>();
//			for (int j=0; j<N; j++) {
//				int length = codes[j].length();
//				int[]nums = new int[length];
//				String temp;
//
//				for (int k = 0; k<length; k++) {
//					temp = codes[j].charAt(k) + "";
//					nums[k] = Integer.parseInt(temp);
//				}
//
//				for (int k = 0; k<length; k++) {
//					if (nums[k]==0) {
//						nums[k] = z;
//					}
//					else if (ifEven(nums[k])) {
//						nums[k] += x;
//					}
//					else {
//						nums[k] -= y;
//						if (nums[k] < 0) {
//							nums[k] = 0;
//						}
//					}
//
//					codes[j] = ("");
//
//					for (int q = 0; q<length; q++) {
//						String tempSt = nums[q] + "";
//						codes[j] += tempSt;
//					}
//
//					
//				}
//				if (!codes[j].equals(answers[j])){
//					
//										
//					//System.out.println("Code: " + codes[j]);
//					//System.out.println("Answer: " + answers[j]);
//					
//					match = false;
//					fails.add(j);
//					//numFails[numOfFails] = j;
//					//numOfFails ++;
//				}
//				
//			}
//			if (match) {
//				System.out.println("MATCH");
//			}
//			else {
//				System.out.print("FAIL: ");
//				for (int k = 0; k<fails.size(); k++) {
//					if (k==0) {
//						System.out.print((fails.get(k)+1));
//					}
//					else {
//						System.out.print(", " + (fails.get(k)+1));
//					}
//				}
//				System.out.println();
//			}
//			//System.out.println();
//			match = true;
//			in.nextLine();
//
//		}//I
//
//		// Code here
//
//	}
//
//	public static boolean ifEven (int a) {
//		double b = a;
//		if (b/2 > a/2) {
//			return false;
//		}
//		return true;
//
//	}
//}
