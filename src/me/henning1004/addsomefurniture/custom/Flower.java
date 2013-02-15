package me.henning1004.addsomefurniture.custom;

import me.henning1004.addsomefurniture.Main;
import me.henning1004.addsomefurniture.design.FlowerDesign;
import me.henning1004.addsomefurniture.register.RegisterTextures;

import org.bukkit.Material;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class Flower extends GenericCubeCustomBlock {
	@SuppressWarnings("unused")
	private Main plugin;
	
	public Flower(Main plugin,String name, int[] textureids) {
		super(plugin, name, Material.WEB.getId(), new GenericCubeBlockDesign(plugin, RegisterTextures.texOther, textureids));
		this.setBlockDesign(new FlowerDesign(plugin, textureids));
		this.setHardness(1F);
		this.plugin = plugin;
	}
}









