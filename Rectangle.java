public class Rectangle {
	
	static int length;
	static int width;
	static int area;
	
	Rectangle(){
		length=0;
		width=1;	
	}
	
	Rectangle(int l,int w){
		length=w;
		width=w;
	}
	
	static void calulatearea(){
		System.out.println("Area of rectangle is : "+length*width);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("using parameterized  Construcor!!! ");
		Rectangle r=new Rectangle(4,8);
		r.calulatearea();
		
		System.out.println("using Default Construcor!!! ");
		Rectangle r1=new Rectangle();
		r1.length=3;
		r1.width=4;
		r1.calulatearea();
	}
}