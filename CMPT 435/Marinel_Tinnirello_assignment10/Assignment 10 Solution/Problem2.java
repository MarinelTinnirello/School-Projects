public class Problem2 {
	
	
	
	
	public static void commonelements(double[] s1, double[] s2)
	{
		// complete the commonelements() method to find out
		// elements that occur in both s1 and s2
		// feel free to change method type and parameters
		// Full credit will awarded to algorithms O(n)
		
		int prev = -1;
		
		int i = 0, j = 0;
		
		while (i<s1.length && j<s2.length)
		{
			if(s1[i] == s2[j] && (prev==-1 || s1[i] != s1[prev]))
			{
				System.out.println(s1[i]);
				prev = i;
				i++;
				j++;
			}
			else if(s1[i]<s2[j])
				i++;
			else
				j++;
			
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test your commonelements() method here
		double[] testarray1 = {0, 0, 0, 1, 2, 3, 97, 98};
		double[] testarray2 = {0, 1, 2, 3, 4, 4, 10, 98, 100, 100};

		
		System.out.println("Elements that occur in both arrays: ");
		commonelements(testarray1,testarray2);
		//should output 0, 1, 2, 3, 98
		
	}

}
