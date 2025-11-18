package HW1;

public class ArrayHWAdvanced {

	public static void main(String[] args) {
		//PROBLEM 1.1
		System.out.println("PROBLEM 1.1");
		int[] beforeTarget = {5,2,8,2,9,2,1,7,2};
		int target = 2;
		System.out.print("Test Array: ");
		printArray(beforeTarget);
		System.out.println(", Target: " + target);
		System.out.print("Result: ");
		printArray(findAllOccurrences(beforeTarget, target));
		System.out.println("\n");
		
		//PROBLEM 1.2
		System.out.println("PROBLEM 1.2");
		int[] arrEq1 = {1,2,3,4,5};
		int[] arrEq2 = {1,3,2,4,5};
		System.out.print("Test Arrays: ");
		printArray(arrEq1);
		System.out.print(" and ");
		printArray(arrEq2);
		System.out.print("\nResult: ");
		System.out.println(arraysEqual(arrEq1, arrEq2));
		
		int[] arrEq3 = {4,5,6};
		int[] arrEq4 = {4,5,6};
		System.out.print("Test Arrays: ");
		printArray(arrEq3);
		System.out.print(" and ");
		printArray(arrEq4);
		System.out.print("\nResult: ");
		System.out.println(arraysEqual(arrEq3, arrEq4));
		
		int[] arrEq5 = {7,8,9,0};
		int[] arrEq6 = {7,8,9};
		System.out.print("Test Arrays: ");
		printArray(arrEq5);
		System.out.print(" and ");
		printArray(arrEq6);
		System.out.print("\nResult: ");
		System.out.println(arraysEqual(arrEq5, arrEq6)+"\n");
		
		//PROBLEM 1.3
		System.out.println("PROBLEM 1.3");
		int[] subArrayMain = {1,2,3,4,5};
		int[] subsequence1 = {1,3,5};
		int[] subsequence2 = {1,5,3};
		int[] subsequence3 = {1,5,3,4};
		int[] subsequence4 = {2,3,4,5};
		System.out.print("Test Array: ");
		printArray(subArrayMain);
		System.out.println("");
		System.out.print("Test Subsequence 1: ");
		printArray(subsequence1);
		System.out.print("\nResult: ");
		System.out.println(isSubsequence(subArrayMain, subsequence1));
		System.out.print("Test Subsequence 2: ");
		printArray(subsequence2);
		System.out.print("\nResult: ");
		System.out.println(isSubsequence(subArrayMain, subsequence2));
		System.out.print("Test Subsequence 3: ");
		printArray(subsequence3);
		System.out.print("\nResult: ");
		System.out.println(isSubsequence(subArrayMain, subsequence3));
		System.out.print("Test Subsequence 4: ");
		printArray(subsequence4);
		System.out.print("\nResult: ");
		System.out.println(isSubsequence(subArrayMain, subsequence4)+"\n");
		
		//PROBLEM 2.1
		System.out.println("PROBLEM 2.1");
		int[] mergeArr1 = {1,3,5,7};
		int[] mergeArr2 = {2,4,6,8};
		System.out.print("Test Arrays: ");
		printArray(mergeArr1);
		System.out.print(" and ");
		printArray(mergeArr2);
		System.out.print("\nResult: ");
		printArray(mergeSorted(mergeArr1, mergeArr2));
		System.out.println();
		
		int[] mergeArr3 = {2,3,9,14};
		int[] mergeArr4 = {7,9,11,16};
		System.out.print("Test Arrays: ");
		printArray(mergeArr3);
		System.out.print(" and ");
		printArray(mergeArr4);
		System.out.print("\nResult: ");
		printArray(mergeSorted(mergeArr3, mergeArr4));
		System.out.println("\n");

		//PROBLEM 2.2
		System.out.println("PROBLEM 2.2");
		int[] testPartArr1 = {7,2,9,1,5,3,8,4};
		int pivot1 = 5;
		System.out.print("Test Array: ");
		printArray(testPartArr1);
		System.out.println(", Pivot: " + pivot1);
		System.out.print(", Return index: " + partitionArray(testPartArr1, pivot1));
		System.out.println();
		
		int[] testPartArr2 = {7,2,9,1,5,3,8,4};
		int pivot2 = 7;
		System.out.print("Test Array: ");
		printArray(testPartArr2);
		System.out.println(", Pivot: " + pivot2);
		System.out.print(", Return index: " + partitionArray(testPartArr2, pivot2));
		System.out.println("\n");
		
		//PROBLEM 2.3
		System.out.println("PROBLEM 2.3");
		int[] testIL1 = {1,2,3};
		int[] testIL2 = {4,5,6};
		System.out.print("Example: ");
		printArray(testIL1);
		System.out.print(" and ");
		printArray(testIL2);
		System.out.print("\nResult: ");
		printArray(interleave(testIL1, testIL2));
		System.out.println("\n");
		
		int[] testIL3 = {1,2,3};
		int[] testIL4 = {4,5,6,7,8,9};
		System.out.print("Example: ");
		printArray(testIL3);
		System.out.print(" and ");
		printArray(testIL4);
		System.out.print("\nResult: ");
		printArray(interleave(testIL3, testIL4));
		System.out.println("\n");

		//PROBLEM 3.1
		System.out.println("PROBLEM 3.1");
		int spiralNum1 = 3;
		System.out.print("Example for n = " + spiralNum1);
		System.out.println();
		printMatrix(generateSpiral(spiralNum1));
		
		int spiralNum2 = 5;
		System.out.print("\nExample for n = " + spiralNum2);
		System.out.println();
		printMatrix(generateSpiral(spiralNum2));
		System.out.println("\n");
		
		//PROBLEM 3.2
		System.out.println("PROBLEM 3.2");
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println("Example Matrix: ");
		printMatrix(matrix);
		System.out.println();
		System.out.println("Transposed Matrix: ");
		printMatrix(transpose(matrix));
		System.out.println("\n");
		
		//PROBLEM 3.3
		System.out.println("PROBLEM 3.3");
		int[][] islands1 = {{1,1,0,0,0},{1,0,0,1,1},{0,0,0,0,0},{0,0,1,1,0}};
		System.out.println("Test Grid:");
		printMatrix(islands1);
		System.out.print("\nResult: " + countIslands(islands1) + " islands");
		System.out.println("\n");
		int[][] islands2 = {{0,1,0,0,1},{0,1,0,0,0},{0,0,1,0,0},{1,0,0,0,0}};
		System.out.println("Test Grid:");
		printMatrix(islands2);
		System.out.print("\nResult: " + countIslands(islands2) + " islands");

	}
	
    public static void printArray(int[] arr) {
        System.out.print("{ ");
    	for (int i=0; i<arr.length; i++) {
        	System.out.print(arr[i]+" ");
        }
        System.out.print("}");
    }
	
	////PART 1: Array Searching and Comparison

	////PROBLEM 1.1: Linear Search with Position Tracking
	//finds all occurrences of a value
	
	//first use count to find out how many of the target value there are
	//then use that number to define the length of the list
	//and add each value to the list by each index 0 -> length-1 (j++ each time
    //IF the value is not the target value)
	public static int[] findAllOccurrences(int[] arr, int target) {
		int count = 0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]==target) {
				count++;
			}
		}
		int[] afterTarget = new int[count];
		
//		if (count == 0) {
//			
//		}
		
		int j = 0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]==target) {
				afterTarget[j]=i;
				j++;
			}
		}
		return afterTarget;
	}
	
	
	////PROBLEM 1.2: Array Equality Checker
	//determines if two arrays are identical (same length, same elements, same order)
	public static boolean arraysEqual(int[] arr1, int[] arr2) {
		boolean equal = false;
		if (arr1.length > arr2.length) {
			equal=false;
		}
		else if (arr2.length > arr1.length) {
			equal=false;
		}
		else {
			for (int i=0; i<arr1.length; i++) {
				if (arr1[i] == arr2[i]) {
					equal = true;
				}
				else {
					equal = false;
					break;
				}
			}
		}
		return equal;
	}
	
	
	////PROBLEM 1.3: Subsequence Finder
	public static boolean isSubsequence(int[] main, int[] sub) {
		boolean isSub = false;
		int count = 0;
		int j=0;
		for (int i=0; i<main.length; i++) {
			if (main[i]==sub[j]) {
				count++;
				j++;
			}
		}
		if (count == sub.length) {
			isSub = true;
		}
		return isSub;
	}
	
	
	
	
	////Part 2: Array Manipulation
	
	////PROBLEM 2.1: Merge Sorted Arrays
	public static int[] mergeSorted(int[] arr1, int[] arr2) {
		int[] newArr = new int[arr1.length + arr2.length];
		int[] lastArr;
		//figure out which array has the last index (biggest value at end) to know when to end while loop
		//by using last index (length-1) of each array
		if (arr1[arr1.length-1] >= arr2[arr2.length-1]) {
			lastArr = arr1;
		}
		else {
			lastArr = arr2;
		}
		
		int i=0; //index of arr1
		int j=0; //index of arr2
		int k=0; //index of newArr
		
		// go through each index while the index of newArr is less than the last index of newArr
		while (k<(newArr.length-1)) {
			if (arr1[i]<=arr2[j]) {
				newArr[k]=arr1[i];
				k++;
				i++;
			}
			else {
				newArr[k]=arr2[j];
				k++;
				j++;
			}
		}
		newArr[newArr.length-1] = lastArr[lastArr.length-1];
		
		return newArr;
	}
	
	////PROBLEM 2.2: Array Partitioning
	public static int partitionArray(int[] arr, int pivot) {
		//values before the pivot value are < the pivot value
		//values after the pivot value are > than the pivot value
		int[] newArr = new int[arr.length];
		
		int i=0; //index of arr
		int j=0; //index of newArr from front (starting from first index)
		int k=(newArr.length-1); //index of newArr from back (starting from last index)
		
		// go through each index while the index of newArr is less than the last index of newArr
		//if arr[i]<pivot, add to next index of newArr from the front (j)
		//if arr[i]>pivot, add to next index of newArr from the back (k)
		//add pivot value last (just next index from the front)
		while (i<arr.length) {
			if (arr[i]<pivot) {
				newArr[j]=arr[i];
				i++;
				j++;
			}
			else if (arr[i]>pivot) {
				newArr[k]=arr[i];
				i++;
				k--;
			}
			else {
				i++;
			}
		}
		newArr[j] = pivot;
		
		System.out.print("Example Result: ");
		printArray(newArr);
		
		return j; //index of pivot

	}

	////PROBLEM 2.3: Interleave Arrays
	public static int[] interleave(int[] arr1, int[] arr2) {
		int[] newArr = new int[arr1.length + arr2.length];
		int[] longArr;
		int[] shortArr;
		//figure out which array is longer
		if (arr1.length >= arr2.length) {
			longArr = arr1;
			shortArr = arr2;
		}
		else {
			longArr = arr2;
			shortArr = arr1;
		}
		
		int i=0; //index of arr1 & arr2
		int k=0; //index of newArr
		
		//add index i of arr1 and arr2 to newArr[k] until the list is the length of arr1+arr2
		//only add arr1/arr2[i] when the index is less than / equal to shortArr's last index
		while (k<=(newArr.length-1)) {
			if (i<=(shortArr.length-1)) {
				newArr[k]=arr1[i];
				k++;
				newArr[k]=arr2[i];
				k++;
				i++;
			}
			else {
				//i=i-1 below to set it back to the last index for calculation:
				int extraIndex = (longArr.length-1) - (i-1); //last index of longArr - (i-1) to figure out how many extra values should be appended
				for (int j=0; j<extraIndex; j++) {
					newArr[k]=longArr[i+j];
					k++;
				}
			}
		}
		return newArr;
	}
	
	
	
	
	////PART 3: 2D Arrays and Patterns
	
	////PROBLEM 3.1: Spiral Matrix Generator
	public static int[][] generateSpiral(int n) {
		int[][] matrix = new int[n][n]; //the new matrix that's being created
		int lastIndex = n-1;
		
		//dimensions/limits of matrix (where they start and end (basically corners))
		int top = 0;
		int left = 0;
		int right = lastIndex;
		int bottom = lastIndex;
		
		int num = 1; //number being added to matrix
		int lastNum = n*n; //highest/last number to be added
		
		while (num <= lastNum) {
			for (int i=left; i<=right && num<=lastNum; i++) {
				//fill first row (l->r)
				matrix[top][i] = num++;
			}
			top++; //decrease limit of top (clockwise motion)
			
			for (int j=top; j<=bottom && num<=lastNum; j++) {
				//fill rightmost column (t->b)
				matrix[j][right] = num++;
			}
			right--;
			
			for (int i=right; i>=left && num<=lastNum; i--) {
				//fill bottom row (r->l)
				matrix[bottom][i] = num++;
			}
			bottom--;
			
			for (int j=bottom; j>=top && num<=lastNum; j--) {
				//fill leftmost column (b->t)
				matrix[j][left] = num++;
			}
			left++;
		}
		return matrix;
	}
	
	////PROBLEM 3.2: Matrix Transpose
	public static int[][] transpose(int[][] matrix) {
		//swap rows and columns
		int[][] newMatrix = new int[matrix.length][matrix.length];
		
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix.length; j++) {
				newMatrix[j][i] = matrix[i][j];
			}
		}
		
		return newMatrix;
	}
	
	public static void printMatrix(int[][] n) {
		for (int i=0; i<n.length; i++) {
			int columns = n[i].length;
			for(int j=0; j<columns; j++) {
				int value = n[i][j]; //value at spot
				System.out.printf("%4d", value);
			}
			System.out.println();
		}
	}
	
	////PROBLEM 3.3: Island Counter (Challenge)
	public static int countIslands(int[][] grid) {
		int count = 0;
		for (int i=0; i<grid.length; i++) {
			for (int j=0; j<grid.length+1; j++) { //grid.length+1 for j bc there are 5 columns (vs 4 rows)
				if (grid[i][j] == 1) {
					count++;
					//check to see if there are other 1s next to the ones that were already counted
					if ((i>0 && (grid[i-1][j] == 1)) || (j>0 && (grid[i][j-1] == 1))) {
						count--;
					}
				}
			}
		}
		return count;
	}

}
