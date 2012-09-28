package me.henning1004.addsomefurniture.custom;

import me.henning1004.addsomefurniture.Main;
import me.henning1004.addsomefurniture.design.CarpetDesign;
import me.henning1004.addsomefurniture.register.RegisterTextures;

import org.bukkit.Material;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class Carpet extends GenericCubeCustomBlock {
	@SuppressWarnings("unused")
	private Main plugin;
	
	public Carpet(Main plugin,String name, int[] textureids) {
		super(plugin, name, Material.RAILS.getId(), new GenericCubeBlockDesign(plugin, RegisterTextures.texCarpet, textureids));
		this.setBlockDesign(new CarpetDesign(plugin, textureids));
		this.setHardness(3F);
		this.plugin = plugin;
	}
}









