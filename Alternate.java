
public class Alternate {
	// Alternatively add elements in third array 
	// add remaning element
	static void alternateMerge(int a1[], int a2[],  int n1, int n2, int a3[])
	{
		int i = 0, j = 0, k=0;
	    while (i < n1 && j < n2)
	     {
	    	a3[k++] = a1[i++];//a3[0]=a1[0]  a3[2]=a1[1]  a3[4]=a1[2]  a3[6]=a1[3]  a3[8]=a1[4]
	        a3[k++] = a2[j++];//a3[1]=a2[0]  a3[3]=a1[1]  a3[5]=a1[2]  a3[7]=a1[3]  a3[9]=a1[4]
	     }
	     // adding remaining elements of a1
	        while (i < n1)
	            a3[k++] = a1[i++];
	        // adding remaining elements of a2
	        while (j < n2)
	            a3[k++] = a2[j++];
	    }
	
	public class Alt_Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Alternate a=new Alternate();
		        int a1[] = {0,2,4,6,8,10};
		        int n1 = a1.length;
		        int a2[] = {1,3,5,7,9};
		        int n2 = a2.length;
		        int a3[] = new int[n1+n2];
		        a.alternateMerge(a1, a2, n1, n2, a3);
		        System.out.println("Array after merging");
		        for (int i = 0; i < n1 + n2; i++)
		            System.out.print( a3[i] + " ");
		    }
		}

	}
		 
