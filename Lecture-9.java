package corejava;
class shape{
	double pi = 3.14;               // parent class, Base class, Super class
	double getSquare(int r)
	{
		return r*r;
	}
}
class circle extends shape{       //Child class , Derived class, Sub class
	void area(int r) {
		System.out.println(pi*getSquare(r));
	}
}

public class inheritance {
	public static void main (String[] args) {
		circle c = new circle();
		c.area(6);
	}

}
