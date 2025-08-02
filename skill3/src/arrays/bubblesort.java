package arrays;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] arr = {5, 2, 8, 1, 3};  

		        System.out.println("Original array:");
		        printArray(arr);

		        bubbleSort(arr);

		        System.out.println("Sorted array:");
		        printArray(arr);
		    }

		   
		    public static void bubbleSort(int[] array) {
		        int n = array.length;
		        boolean swapped;

		        for (int i = 0; i < n - 1; i++) {
		            swapped = false;

		            for (int j = 0; j < n - i - 1; j++) {
		                if (array[j] > array[j + 1]) {
		                    // Swap array[j] and array[j + 1]
		                    int temp = array[j];
		                    array[j] = array[j + 1];
		                    array[j + 1] = temp;

		                    swapped = true;
		                }
		            }

		            
		            if (!swapped) break;
		        }
		    }

		    
		    public static void printArray(int[] array) {
		        for (int value : array) {
		            System.out.print(value + " ");
		        }
		        System.out.println();
		    }
		}

	
