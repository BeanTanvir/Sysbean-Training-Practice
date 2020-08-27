package com.sysbean.training;

import java.util.Scanner;

public class Control_Statement_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Press 1 for If-Else Example");
		int a=s.nextInt();
		switch(a) {
		case 1: System.out.println("class If-Else");
				System.out.println("{");
				System.out.println("    public static void main(String[] args)");
				System.out.println("         {");
				System.out.println("           int a=10;");
				System.out.println("             if (a>5)");
				System.out.println("	      {");
				System.out.println("		System.out.println(\"True\");");
				System.out.println("		}");
				System.out.println("	    else");
				System.out.println("		{");
				System.out.println("			System.out.println(\"False\");");
				System.out.println("		}");
				System.out.println("	}");
				System.out.println("   }");
				//System.out.println("}");
		}
		
		
	}

}
