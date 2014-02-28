package genetic

public class MNA
{
	public MNA(String par1)
	{
		this(par1.length());
		this.sequence = par1;
	}
	public MNA(int par1)
	{
		this.length = par1;
		this.sequence = this.randSequence(this.length);
	}
	private Random random;
	public String randSequence(int par1)
	{
		String[] var1 = new String[par1];
		for(var2 = 0; var2 <= par1 + 1; var2++)
		{
			if(random.nextBoolean())
			{
				var1[var2] = "1";
			}
			else
			{
				var1[var2] = "0";
			}
		}
		return StringUtils.join(var1);
	}
}