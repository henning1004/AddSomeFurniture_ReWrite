package me.henning1004.addsomefurniture.custom;

import me.henning1004.addsomefurniture.Main;
import me.henning1004.addsomefurniture.design.CoffeeTableDesign;
import me.henning1004.addsomefurniture.register.RegisterTextures;

import org.bukkit.Material;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class CoffeeTable extends GenericCubeCustomBlock {
	@SuppressWarnings("unused")
	private Main plugin;
	
	@SuppressWarnings("deprecation")
	public CoffeeTable(Main plugin, String name, int[] textureids)
	{
		super(plugin, name, Material.GLASS.getId(), new GenericCubeBlockDesign(plugin, RegisterTextures.texTable,textureids));
		this.setBlockDesign(new CoffeeTableDesign(plugin, textureids));
		this.setHardness(4F);
		this.plugin = plugin;
	}
}









