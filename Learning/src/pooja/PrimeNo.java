package pooja;

public class PrimeNo {

	public static void main(String[] args) {
		int x,y,flag;
		int n=45;
		for(x=1;x<=n;x++)
		{
			if(x==1||x==0)
			
				continue;
			flag=0;
			
			
				for(y=2;y<=x/2;y++)
				{
					if(x%y==0)
					{
						flag=1;
						break;
					}
					
						
				}
				if(flag==0)
				{
					System.out.println(x);
				}
			}
		}

	}


