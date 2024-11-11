package TRAVELS;

public class BUS {
	private int no;
	private boolean AC;
	private int sts;
	
	BUS(int a,boolean b,int c){
		this.no =a;
		this.AC =b;
		this.sts =c;
		
	}
	
	public int getbno() {
		return no;
		
	}
	public boolean getAC() {
		return AC;
		
	}
	public int getsts() {
		return sts;
		
	}
	public void display()
	{
		System.out.println("--------------");
		System.out.println("Enter the bus no"+no);
		System.out.println("Enter y/n:"+AC);
		System.out.println("Capacity:"+sts);
		
		
	}


}
