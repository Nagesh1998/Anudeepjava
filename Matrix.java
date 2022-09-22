
public class Matrix {

	//method for multiplication of two matrix
	static void multiply(int[][] a1, int[][] a2,  int[][] a3)

    {
		for(int i=0;i<a1.length;i++)  ///number of rows
	    {
	    	for(int j=0;j<a1[i].length;j++)//number of columns
	    	{
	    		 a3[i][j] =a1[i][j] *a2[i][j];//logic
	    		System.out.print(a3[i][j]+" ");//printing third array
	    	}	  
	    	System.out.println("");
	    }
		}
	
	public class Mat_Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Matrix a=new Matrix();
			int [] [] a1= {{10,20,30},{40,50,60}};//first two dimentional array
			int [] [] a2= {{10,20,30},{40,50,60}};//second two dimentional array
		      
		        int[] []a3=new int[a1.length][a1[0].length];//assigning length of array
		        a.multiply(a1, a2,  a3);    //method for multiplication of two matrix
		    }
	}

}
