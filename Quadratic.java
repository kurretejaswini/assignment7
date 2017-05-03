package world;

public class Quadratic implements IQuadratic {
	public Pair solveQuadratic(double a,double b,double c)
	{
	double x1,x2;
	x1=((-b+Math.sqrt((b*b)-4*a*c))/2*a);
	x2=((-b-Math.sqrt((b*b)-4*a*c))/2*a);
	Pair p=new Pair(x1,x2);
	return p;
		
	}


}
