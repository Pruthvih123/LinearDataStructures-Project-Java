package Selenium;

public class MotheshApp {

	
	public static void main(String[] args) {
		FresherBatch fb=new FresherBatch();
		display(fb);
		ExpBatch eb=new ExpBatch();
		display(eb);
	}

	private static void display(Student A) 
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
