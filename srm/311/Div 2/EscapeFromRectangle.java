import java.util.*;

public class EscapeFromRectangle
{

	public int shortest(int x, int y, int w, int h)
	{
		int[] dir = new int[4];
		dir[0] = x;
		dir[1] = w - x;
		dir[2] = y;
		dir[3] = h - y;

		Arrays.sort(dir);

		return dir[0];
	}

}
