package Oops;



public class july9_1 {

	
	public july9_1() {
	System.out.println("<<<<<<<<<< Constructor Call >>>>>>>>>>>>");	
	}
	
	{
		System.out.println("<<<<<<<<<< Initialize block >>>>........1");	
	}
	
	
	{
		System.out.println("<<<<<<<<<< Init block >>>>........2");	
	}
	
	static 
		{
			System.out.println("<<<<<<<<<< static block >>>>........1");	
		}
		
	

	static 
		{
			System.out.println("<<<<<<<<<< static block >>>>........2");	
		}
	
	public static void main(String[] args) {
		

				System.out.println("<<<<<<<<<< main starts >>>>>>>>>>>........");	
				
				july9_1 b1 = new july9_1();
				july9_1 b2 = new july9_1();

				{
					System.out.println("<<<<<<<<<< local block >>>>........1");	
				}

				{
					System.out.println("<<<<<<<<<< local block >>>>........2");	
				}
				System.out.println("<<<<<<<<<< main ends >>>>>>>>>>>........");	
		
		
		
	}
	

	
}
