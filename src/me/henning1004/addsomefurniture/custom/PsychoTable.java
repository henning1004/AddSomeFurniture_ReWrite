package me.henning1004.addsomefurniture.custom;

import me.henning1004.addsomefurniture.Main;
import me.henning1004.addsomefurniture.design.PsychoTableDesign;
import me.henning1004.addsomefurniture.register.RegisterTextures;

import org.bukkit.Material;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class PsychoTable extends GenericCubeCustomBlock {
	@SuppressWarnings("unused")
	private Main plugin;
	
	@SuppressWarnings("deprecation")
	public PsychoTable(Main plugin, String name, int[] textureids)
	{
		super(plugin, name, Material.PISTON_BASE.getId(), new GenericCubeBlockDesign(plugin, RegisterTextures.texTable,textureids));
		this.setBlockDesign(new PsychoTableDesign(plugin, textureids));
		this.setHardness(3F);
		this.plugin = plugin;
	}
}









