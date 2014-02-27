package genetic

public class EntityGenetic extends EntityLiving
{
	public Nucleus nucleus;
	public EntityGenetic(World par1World, String par2)
	{
		super(par1World);
		this.nucleus = new Nucleus(this, String par2);
	}
	public EntityGenetic(World par1World)
	{
		super(par1World);
		this.nucleus = new Nucleus(this);
	}
	
}