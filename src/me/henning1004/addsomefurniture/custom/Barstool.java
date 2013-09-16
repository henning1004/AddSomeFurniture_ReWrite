package me.henning1004.addsomefurniture.custom;

import me.henning1004.addsomefurniture.Main;
import me.henning1004.addsomefurniture.design.BarstoolDesign;
import me.henning1004.addsomefurniture.register.RegisterTextures;

import org.bukkit.Material;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;



public class Barstool extends GenericCubeCustomBlock {
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	@SuppressWarnings("deprecation")
	public Barstool(Main plugin,String name, int[] textureids) {
		super(plugin, name, Material.JUNGLE_WOOD_STAIRS.getId(), new GenericCubeBlockDesign(plugin, RegisterTextures.texChair,textureids));
		this.setBlockDesign(new BarstoolDesign(plugin, textureids));
		this.setBlockDesign(new BarstoolDesign(plugin, textureids).rotate(90), 1);
		this.setBlockDesign(new BarstoolDesign(plugin, textureids).rotate(180), 2);
		this.setBlockDesign(new BarstoolDesign(plugin, textureids).rotate(270), 3);
		this.setRotate(true);
		this.setHardness(1.5F);
		this.plugin = plugin;
	}
	
}

