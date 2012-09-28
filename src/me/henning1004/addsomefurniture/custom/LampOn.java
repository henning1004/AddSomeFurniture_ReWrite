package me.henning1004.addsomefurniture.custom;

import me.henning1004.addsomefurniture.Main;
import me.henning1004.addsomefurniture.design.LampDesign;
import me.henning1004.addsomefurniture.register.RegisterTextures;

import org.bukkit.Material;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class LampOn extends GenericCubeCustomBlock {
	@SuppressWarnings("unused")
	private Main plugin;
	
	public LampOn(Main plugin,String name, int[] textureids) {
		super(plugin, name, Material.GLASS.getId(), new GenericCubeBlockDesign(plugin, RegisterTextures.texOther, textureids));
		this.setBlockDesign(new LampDesign(plugin, textureids));
		this.setHardness(4F);
		this.setLightLevel(15);
		this.plugin = plugin;
	}
}









