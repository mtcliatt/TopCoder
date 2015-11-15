public class CCipher
{
	public String decode(String cipherText, int shift)
	{
		String ret = "";
		String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		for(int i = 0; i < cipherText.length(); i++)
		{
			int index = a.indexOf(cipherText.charAt(i)) - shift;
			while (index < 0)
			{
				index += 26;
			}
			ret += a.charAt(index);
		}

		return ret;
	}
}
