import java.util.Arrays;

public class Problem2
{

public static Max2ndMax dcfindmax2ndmax(int[] A, int i, int j)
	{
		// Complete this method to return the index of max and 2nd max element in an array A
		// At most 3/2n-2 comparisons
		// Algorithms that make more comparisons will be scored out of 10 points
		// Note this method returns the index
		Max2ndMax result = new Max2ndMax();
		
		if (i==j)
		{
			result.max = i; // index i
			result.max2nd = i;
		}
		else if (j==(i+1))
		{
			if(A[i]<A[j])
			{
				result.max = j; // index j
				result.max2nd = i; // index i
			}
			else
			{
				result.max = i;
				result.max2nd = j;
			}
			
		}
		else
		{
			Max2ndMax left = new Max2ndMax();
			Max2ndMax right = new Max2ndMax();
			int mid = (i+j)/2;
			left = dcfindmax2ndmax(A, i, mid);
			right = dcfindmax2ndmax(A, mid+1, j); 
			
			if(A[left.max] < A[right.max])
			{
				result.max = right.max;
				
				if(A[left.max] < A[right.max2nd]&& right.max2nd!=right.max)
				{
					result.max2nd = right.max2nd;
				}
				else
					result.max2nd = left.max;
					
			}
			else
			{
				result.max = left.max;
				
				if(A[right.max] < A[left.max2nd]&&left.max2nd!=left.max)
				{
					result.max2nd = left.max2nd;
				}
				else
					result.max2nd = right.max;
					
			}
			
			
			
		}
			
		return result;
		
		
	}



	
	public static void main(String[] args) {
		// TODO Auto-generated method
		int[] givenarray = {100,2,3,4,5,6,7,67,2,32};	
		
		// Test your method
		Max2ndMax pair = new Max2ndMax();
		// Java does pass-by-value not by-reference
		// Therefore we create a class of Max2ndMax for max and 2ndmax pair
		pair = dcfindmax2ndmax(givenarray, 0, givenarray.length-1);
		int max2nd = givenarray[pair.max2nd];
		int max = givenarray[pair.max];
		System.out.println("The max and 2ndmax of the given array are "+ max + " and "+max2nd+".");
		// Your method should return 100 and 67
		
		
		
	}
	
	

	
}