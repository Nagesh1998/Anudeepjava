
interface Shape 
{
	abstract void RectangleArea(int length,int width); 
	abstract void SquareArea(int area);
	abstract void CircleArea(int radius);
}

class Area implements Shape
{
	public void RectangleArea(int length,int width) 
	{
		int area=length*width;
		System.out.println("Area of Rectangle is : "+area);
	} 
	public void SquareArea(int side) 
	{
		int area=side*side;
		System.out.println("Area of Square is : "+area);
	}
	public void CircleArea(int radius) 
	{
		float area=3.142f*(radius*radius);
		System.out.println("Area of Circle is : "+area);
	}
}

class AreaMain
{
	public static void main(String []args) 
	{
		Area a = new Area();
		a.RectangleArea(4, 5);
		a.SquareArea(6);
		a.CircleArea(3);
	}
}