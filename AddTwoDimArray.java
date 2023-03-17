package javaprogram;

//Add  two integer using 2D Array 
public class AddTwoDimArray{
	public static void main(String args[]){
	
		//creating 2D Array(matrices)  
		int n1[][]={{8,5,4},{8,7,6},{1,4,3}};  
		int n2[][]={{9,2,1},{7,8,6},{1,4,3}};  
  
		//creating another 2D array to store the sum of 2D array  
		int n3[][]=new int[3][3];  //3 rows and 3 columns
  
		//adding and printing addition of 2D array 
		for(int i=0;i<3;i++){  
			for(int j=0;j<3;j++){  
				n3[i][j]=n1[i][j]+n2[i][j];
				System.out.print(n3[i][j]+" ");  
			}
			//new line
			System.out.println();  
		}  
	}
}