package Selenium;

public class ExpBatch extends Student{
	/*public void subject()
	{
		System.out.println("Subject method inside the experienced batch");
	}*/
	public void extraSkill()
	{
		System.out.println("extraSkill method inside the experienced batch");
	}


	public static void main(String[] args) {
		FresherBatch fb=new FresherBatch();
		display(fb);
		ExpBatch eb=new ExpBatch();
		display(eb);
	}	

	public static void display(Student A) 
	{
	A.subject();
	if(A instanceof FresherBatch)
	{
		FresherBatch fb=(FresherBatch)A;
		fb.extraSkill();
	}
	else
	{
		ExpBatch eb=(ExpBatch)A;
		eb.extraSkill();
	}
		
	}

}
