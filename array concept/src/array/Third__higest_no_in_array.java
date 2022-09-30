package array;

public class Third__higest_no_in_array 
{
public static void main(String[] args) 
{
	int s[]= {20,60,690,6,55,40};
	for (int i=0;i<s.length;i++)
	{
		for (int j=i+1;j<s.length;j++)
		{
			int rushi = 0;
			if (s[i]<s[j])
			{
			
				rushi= s[i];
				s[i]=s[j];
				s[j]=rushi;
				
			}
			
			System.out.println(" sencond largest no is" +s[2]);
		}
			
		
		
	}
}
}
