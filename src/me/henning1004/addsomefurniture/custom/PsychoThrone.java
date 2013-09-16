package me.henning1004.addsomefurniture.custom;

import me.henning1004.addsomefurniture.Main;
import me.henning1004.addsomefurniture.design.PsychoThroneDesign;
import me.henning1004.addsomefurniture.register.RegisterTextures;

import org.bukkit.Material;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class PsychoThrone extends GenericCubeCustomBlock {
	@SuppressWarnings("unused")
	private Main plugin;
	
	@SuppressWarnings("deprecation")
	public PsychoThrone(Main plugin,String name, int[] textureids) {
		super(plugin, name, Material.SMOOTH_STAIRS.getId(), new GenericCubeBlockDesign(plugin, RegisterTextures.texThrone, textureids));
		this.setBlockDesign(new PsychoThroneDesign(plugin, textureids));
		this.setBlockDesign(new PsychoThroneDesign(plugin, textureids).rotate(90), 1);
		this.setBlockDesign(new PsychoThroneDesign(plugin, textureids).rotate(180), 2);
		this.setBlockDesign(new PsychoThroneDesign(plugin, textureids).rotate(270), 3);
		this.setRotate(true);
		this.setHardness(4F);
		this.plugin = plugin;
	}
}

