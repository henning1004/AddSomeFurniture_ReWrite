package me.henning1004.addsomefurniture.custom;

import me.henning1004.addsomefurniture.Main;
import me.henning1004.addsomefurniture.design.TvDesign;
import me.henning1004.addsomefurniture.register.RegisterTextures;

import org.bukkit.Material;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class Tv extends GenericCubeCustomBlock {
	@SuppressWarnings("unused")
	private Main plugin;
	
	public Tv(Main plugin,String name, int[] textureids) {
		super(plugin, name, Material.CAULDRON.getId(), new GenericCubeBlockDesign(plugin, RegisterTextures.texOther, textureids));
		this.setBlockDesign(new TvDesign(plugin, textureids));
		this.setBlockDesign(new TvDesign(plugin, textureids).rotate(90), 1);
		this.setBlockDesign(new TvDesign(plugin, textureids).rotate(180), 2);
		this.setBlockDesign(new TvDesign(plugin, textureids).rotate(270), 3);
		this.setRotate(true);
		this.setHardness(5F);
		this.plugin = plugin;
	}
}









