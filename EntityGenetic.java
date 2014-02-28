package genetic

public class EntityGenetic extends EntityLiving
{
	public Nucleus nucleus;//the nucleus of this entity
	public EntityGenetic(World par1World, String par2)//the constructor for an entity with specified MNA
	{
		super(par1World);
		this.nucleus = new Nucleus(this, String par2);//creates a nucleus instance with specified code
	}
	public EntityGenetic(World par1World)
	{
		this(par1World, new Nucleus(this));
	}
	
}