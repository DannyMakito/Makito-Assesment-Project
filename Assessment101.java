import java.util.Scanner;

public class Assessment101{
	
	public static final double CT = 690;
	
	
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		
		String [] code = {"MA8001", "B5001", "PY909", "CH002", "CE922" , "CS9005"};
		String [] module = {"Mathematics \t", "Biology \t","Phsyics \t","Chemistry \t","Communication English","Programing 101 \t"};
		int [] creditValue = {120 ,120, 130, 110, 90, 120}; 
		int [] studentA_Fm = {60 ,74 ,54 ,80 ,62 ,45};
		int [] studentB_Fm = {78 ,54 ,84 ,70 ,72 ,60};
		int [] studentC_Fm = {66 ,54 ,50 ,60 ,70 ,49};
		
		
		System.out.println("Select a student : \n 1. StudentA \n 2. StudentB \n 3. Student A :");
		int userInput = sc.nextInt();
		
		while( userInput >=4 || userInput <= 0)
		{
			System.out.print("Invalid option !! please choose from 1-3\n ");
			System.out.println("Select a student : \n 1. StudentA \n 2. StudentB \n 3. Student A :");
			userInput = sc.nextInt();
			
			userInput++;
		}
		
	
			double gpa = commulative_pass(userInput, studentA_Fm,studentB_Fm,studentC_Fm,creditValue);
		
			show(userInput, studentA_Fm,studentB_Fm,studentC_Fm,code,module,creditValue, gpa);
	
		System.out.println ("\n\n Thank you Goodbye");

	}
	
	
	
	public static double commulative_pass( int input ,int [] A_finalMark,int [] B_finalMark, int [] C_finalMark, int [] cv )
	{
		
		double value = 0;
		double sum = 0;
		double total = 0 ;
		
		if(input == 1)
		{
			for( int x = 0 ; x < A_finalMark.length; x++)
			{
				sum += A_finalMark[x]*cv[x];
			}
			
			total = sum/CT;	
			
				if(total >=0 && total <= 39)
				{
					value= 0.1;
				}
				else if(total >= 40 && total <= 49)
				{
					value= 1.0;
				}
				else if(total >= 50 && total <= 59)
				{
					value= 2.0;
				}
				else if(total >= 60 && total <= 79)
				{
					value= 3.0;
				}
				else 
				{
					value= 4.0;
				}
			
		}
		else if(input == 2)
		{
			for( int x = 0 ; x < B_finalMark.length; x++)
			{
				sum += B_finalMark[x]*cv[x];
			}
			
			total = sum/CT;	
			
				if(total >=0 && total <= 39)
				{
					value= 0.1;
				}
				else if(total >= 40 && total <= 49)
				{
					value= 1.0;
				}
				else if(total >= 50 && total <= 59)
				{
					value= 2.0;
				}
				else if(total >= 60 && total <= 79)
				{
					value= 3.0;
				}
				else 
				{
					value= 4.0;
				}
		
		
		}	

		else if(input == 3)
		{
			for( int x = 0 ; x < C_finalMark.length; x++)
			{
				sum += C_finalMark[x]*cv[x];
			}
			
			total = sum/CT;	
			
				if(total >=0 && total <= 39)
				{
					value= 0.1;
				}
				else if(total >= 40 && total <= 49)
				{
					value= 1.0;
				}
				else if(total >= 50 && total <= 59)
				{
					value= 2.0;
				}
				else if(total >= 60 && total <= 79)
				{
					value= 3.0;
				}
				else 
				{
					value= 4.0;
				}
		}		
		
		return value;
	}
	
	public static void show(int input, int [] A_finalMark,int [] B_finalMark, int [] C_finalMark ,String [] c_array, String [] m_array, int [] cc, double grade )
	{
		
		if(input == 1)
		{  
			System.out.print("Code \t module \t\t credict value \t finalMark \n");
			for(int x = 0 ; x < A_finalMark.length; x++)
			{
				System.out.println(c_array[x]+"\t"+m_array[x]+"\t"+cc[x] +"\t\t"+A_finalMark[x]);
			}
			
			System.out.print ("================================================================");
			if( grade >= 2.5 && grade <=4)
			{
				System.out.println ("\n Congratulations!!!! You qaulify for yale Univeriy");
				
				if( (grade >=3.5 || grade >=2.9)&&( A_finalMark[0] >= 75 || A_finalMark[2] >= 75))
				{
					System.out.println ("You meet the reqiuments for : \n Actuarial sceince \n  Faculty of Science \n Art department \n Economics");
				}
				else if( grade >=2.8 || grade <=3.5 )
				{
					System.out.print (" You meet the reqiuments for : \n  Faculty of Science \n Economics \n Art department");
				}
				else if(grade >=2.5 || grade <=2.7 )
				{
	
					System.out.print (" You meet the reqiuments for : \n Economics \n  Faculty of Science");
				}
				else if( grade >=2 || grade <= 3 || A_finalMark[0] >= 75 )
				{
	
					System.out.print (" You meet the reqiuments for : \n Economics \n  Faculty of Science \n Art department");
				}
			}
			
		}
		else if(input ==2)
		{ 
			System.out.print("Code \t module \t\t credict value \t finalMark \n");
			for(int x = 0 ; x < A_finalMark.length; x++)
			{
				System.out.println(c_array[x]+"\t"+m_array[x]+"\t"+cc[x] +"\t\t"+B_finalMark[x]);
			}
			
			System.out.print ("================================================================");
			if( grade >= 2.5 && grade <=4)
			{
				System.out.println ("\n Congratulations!!!! You qaulify for yale Univeriy");
				
				if( (grade >=3.5 || grade >=2.9)&&( B_finalMark[0] >= 75 || B_finalMark[2] >= 75))
				{
					System.out.println ("You meet the reqiuments for : \n Actuarinal sceince \n  Faculty of Science \n Art department \n Economics");
				}
				else if( grade >=2.8  && grade <=3.5 )
				{
	
					System.out.print (" You meet the reqiuments for : \n  Faculty of Science \n Economics \n Art department");
				}
				else if( grade >=2.5  && grade <=2.7 )
				{
	
					System.out.print (" You meet the reqiuments for : \n Economics \n  Faculty of Science");
				}
				else if( grade >=2 || grade <= 3 || B_finalMark[0] >= 75 )
				{
	
					System.out.print (" You meet the reqiuments for : \n Economics \n  Faculty of Science \n Art department");
				}
			}
		}
		
		else if(input == 3)
		{ 
			System.out.print("Code \t module \t\t credict value \t finalMark \n");
			for(int x = 0 ; x < C_finalMark.length; x++)
			{
				System.out.println(c_array[x]+"\t"+m_array[x]+"\t"+cc[x] +"\t\t"+C_finalMark[x]);
			}
			
			System.out.print ("================================================================");
			if( grade >= 2.5 || grade <=4)
			{
				System.out.println ("\n Congratulations!!!! You qaulify for yale Univeriy");
				
				if( (grade >=3.5 || grade >=2.9)&&( C_finalMark[0] >= 75 || C_finalMark[2] >= 75))
				{
					System.out.println ("You meet the reqiuments for : \n Actuaral sceince \n  Faculty of Science \n Art department \n Economics");
				}
				else if( grade >=2.8  || grade <=3.5 )
				{
	
					System.out.print (" You meet the reqiuments for : \n  Faculty of Science \n Economics \n Art department");
				}
				else if( grade >=2.5  || grade <=2.7 )
				{
	
					System.out.print (" You meet the reqiuments for : \n Economics \n  Faculty of Science");
				}
				else if( grade >=2 || grade <= 3 || C_finalMark[0] >= 75 )
				{
	
					System.out.print (" You meet the reqiuments for : \n Economics \n  Faculty of Science \n Art department");
				}
				
				
			}
		}
		
		
	}


}