package com.jpa.pbc.system;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
/*
 *  Written by Joelparkin Achankeng 
 *  Created December 2012
 *  
 *  A simple class to simplify the use of writing system.out and system.in
 *  Used only for I/O
 */

	public class sys {
		static Scanner e = new Scanner(System.in);

		public static void print(String obj)
		{
			System.out.print(obj);
		}
		
		public static void print(boolean obj)
		{
			System.out.print(obj);
		}
		
		public static void print(ArrayList<?> obj )
		{
			System.out.print(obj);
		}

		public static void print(int obj)
		{
			System.out.print(obj);
		}
		
		public static void print(double obj)
		{
			System.out.print(obj);
		}
		public static void print(Object obj)
		{
			System.out.print(obj);
		}
		public static void newLine()
		{
			System.out.println();
			
		}
		
		public static void newLine(int lines)
		{
			for (int i = 0; i < lines; i++)
			{sys.newLine();}
		}
		
		public static int randomNum(int Start, int End){
		    if ( Start > End ) {
		      throw new IllegalArgumentException("Start cannot exceed End.");
		    }
		    long range = (long)End - (long)Start + 1;
		    Random aRandom = new Random();
			long fraction = (long)(range * aRandom.nextDouble());
		    int randomNumber =  (int)(fraction + Start);    
		    return randomNumber;
		}

		@SuppressWarnings("unchecked")
		public static <T> T nextline(String Datatype) {
			String dt = Datatype.toLowerCase();
			
			if ( dt == "int" ){
				int x = e.nextInt();
				return (T) Integer.valueOf(x);
				}
			else if ( dt == "string"){
				String x = e.nextLine();
				return (T) String.valueOf(x);
				}
			else if ( dt == "boolean"){
				boolean x = e.nextBoolean();
				return (T) Boolean.valueOf(x);
				}
			else if ( dt == "double"){
				Double x = e.nextDouble();
				return (T) Double.valueOf(x);
				}
			else if (dt == "long"){
				Long x = e.nextLong();
				return (T) Long.valueOf(x);
				}
				return (T) String.valueOf("Data Type not set.");
		}
		
		public static String nextline(){
			String x = e.nextLine();
			return x;
			
		}
		public static boolean isInteger(String s) {
		    try { 
		        Integer.parseInt(s); 
		    } catch(NumberFormatException e) { 
		        return false; 
		    }
		    return true;
		}
		

	}
