import java.lang.Math.*;
import java.util.ArrayList;
public class studentadvance extends advance
{
	private int daysleft;
	public studentadvance()
	{
		super();
		daysleft = 0;
	}
	
	public studentadvance(int dl)
	{
		super();
		daysleft = dl;
	}
	
	public double getprice()
	{
		return super.getprice()/2;
	}
	
	public String toString()
	{
		return super.toString() + "\n(STUDENT ID REQUIRED)";
	}
}