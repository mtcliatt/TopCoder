import java.util.*;


public class Planks
{

	public int makeSimilar(int[] lengths, int costPerCut, int woodValue)
	{

		Arrays.sort(lengths);
		int max = 0;

		for(int size = lengths[lengths.length -1]; size > 0; size--)
		{
			int pieces = 0;
			int cuts = 0;
			for(int j = 0; j < lengths.length; j++)
			{
				if(lengths[j] % size != 0)
				{
					if(lengths[j] / size * woodValue * size < (lengths[j] / size) * costPerCut) continue;
					cuts += (lengths[j]/size);
					pieces += lengths[j]/size;
				}
				else if(lengths[j] / size > 1)
				{
					if(lengths[j] / size * woodValue * size < ((lengths[j] / size) -1 ) * costPerCut) continue;
					cuts += (lengths[j]/size) - 1;
					pieces += lengths[j]/size;
				}
				else
				{
					pieces++;
				}

			}

			if( ((size * woodValue * pieces) - (cuts * costPerCut)) > max )
			{
				max = ((size * woodValue * pieces) - (cuts * costPerCut));
			}


		}

		return max;

	}

}
