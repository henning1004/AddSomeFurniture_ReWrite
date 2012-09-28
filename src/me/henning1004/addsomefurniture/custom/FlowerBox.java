package me.henning1004.addsomefurniture.custom;

import me.henning1004.addsomefurniture.Main;
import me.henning1004.addsomefurniture.design.FlowerBoxDesign;
import me.henning1004.addsomefurniture.register.RegisterTextures;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class FlowerBox extends GenericCubeCustomBlock {
	@SuppressWarnings("unused")
	private Main plugin;
	
	public FlowerBox(Main plugin,String name, int[] textureids, String dir) {
		super(plugin, name, false, new GenericCubeBlockDesign(plugin, RegisterTextures.texOther, textureids));
		this.setBlockDesign(new FlowerBoxDesign(plugin, textureids, dir));
		this.setHardness(3.5F);
		this.plugin = plugin;
	}
}









