package genetic

public class Nucleus
{
	public EntityGenetic theEntity;
	public Nucleus(EntityGenetic par1EntityGenetic, String par2String)//construct nucleus for par1 with sequence par2
	{
		this.theEntity = par1EntityGenetic;
		this.mna = new MNA(par2String);
	}
	public Nucleus(EntityGenetic par1EntityGenetic, int par2)//construct nucleus for par1 with random sequence of length par2
	{
		this(par1EntityGenetic, new MNA(par2);
	}
	public Nucleus(EntityGenetic par1EntityGenetic)//constructs nucleus for par1 with random sequence of length 256
	{
		this(par1EntityGenetic, 256);
	}
	public String getSequence()//returns a string containing the sequence of the genome
	{
		return this.mna.getSequence();
	}
	public int getLength()//returns an integer of how long the genome is (in base pairs)
	{
		return this.mna.getLength();
	}
	public boolean mitosis()
	{
		EntityGenetic var1 = new EntityGenetic(this.theEntity.worldObj, this.mna.mutate());
		EntityGenetic var2 = new EntityGenetic(this.theEntity.worldObj, this.mna.mutate());
		var1.setLocationAndAngles(this.theEntity.posX, this.theEntity.posY, this.theEntity.posZ, this.theEntity.rotationYaw, 0.0F);
        var1.theEntity.spawnEntityInWorld(var1);
		var2.setLocationAndAngles(this.theEntity.posX, this.theEntity.posY, this.theEntity.posZ, this.theEntity.rotationYaw, 0.0F);
        var2.theEntity.spawnEntityInWorld(var2);
	}
	public String mutate(String par1)
	
}