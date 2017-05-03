package world;

public class Pair {
	double x1,x2;
	/*public Pair()
	{
		x1=Double.NaN;
		x2=Double.NaN;
	}*/
	public Pair(double newx1,double newx2)
	{
		x1=newx1;
		x2=newx2;
	}
	public void setPair(double newx1,double newx2)
	{
		x1=newx1;
		x2=newx2;
	}
	public double getx()
	{
		return x1;
	}
	public double gety()
	{
		return x2;
	}
	


}
