import java.util.*;

public class EratosthenSieve2
{

	public int nthElement(int n)
	{

		int[] n1 = new int[1000];
		for(int i = 0; i < 1000; i++)
		{
			n1[i] = i + 1;
		}

		for(int i = 2; i < 11; i++)
		{
			delete(i, n1);
			//System.out.println(Arrays.toString(n1));
		}

		return getN(n, n1);

	}

	public void delete(int del, int[] n1)
	{
		int at = 0;
		for(int i = 0; i < 1000; i++)
		{
			if(n1[i] == 0)
				continue;

			at++;

			if( at % del == 0 )
				n1[i] = 0;
		}
	}

	public int getN(int n, int[] n1)
	{
		int at = 0;
		for(int i = 0; i < 1000; i++)
		{
			if(n1[i] != 0)
				at++;

			if(at == n)
				return n1[i];
		}

		return -1;
	}

}
