public class Frequency_Of_Each_Number_inArray {

	public static void main(String[] args) {
		int[] a= {1,5,2,5,4,8,1,8,4,5,8,5,2,4,8,1,5,4,4,5};
		
		for(int i=0;i<a.length;i++) 
		{
			int count =0;
			
			if (a[i]==-1) {
				continue;
			}
			else {
				for (int j = i+1; j < a.length; j++) {
					
					if (a[i]==a[j]) {
						count ++;
						a[j]=-1;
					}
					
				}
			}
			System.out.println(a[i]+"have frequeny of"+(count+1));
		}
	}
}
