package arrays;

public class multiplicationmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		       
		        int[][] A = {
		            {1, 2, 3},
		            {4, 5, 6}
		        };

	
		        int[][] B = {
		            {7, 8},
		            {9, 10},
		            {11, 12}
		        };

		       
		        int[][] result = new int[2][2];

		       
		        for (int i = 0; i < A.length; i++) {             
		            for (int j = 0; j < B[0].length; j++) {        
		                for (int k = 0; k < B.length; k++) {      
		                    result[i][j] += A[i][k] * B[k][j];
		                }
		            }
		        }

		        		        System.out.println("Resultant Matrix:");
		        for (int i = 0; i < result.length; i++) {
		            for (int j = 0; j < result[0].length; j++) {
		                System.out.print(result[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }
		}
