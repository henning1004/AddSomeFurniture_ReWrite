package me.henning1004.addsomefurniture.custom;

import me.henning1004.addsomefurniture.Main;
import me.henning1004.addsomefurniture.design.SimpleChairDesign;
import me.henning1004.addsomefurniture.register.RegisterTextures;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class SimpleChair extends GenericCubeCustomBlock {
	@SuppressWarnings("unused")
	private Main plugin;
	
	public SimpleChair(Main plugin,String name, int[] textureids) {
		super(plugin, name, false, new GenericCubeBlockDesign(plugin, RegisterTextures.texChair,textureids));
		this.setBlockDesign(new SimpleChairDesign(plugin, textureids));
		this.setBlockDesign(new SimpleChairDesign(plugin, textureids).rotate(90), 1);
		this.setBlockDesign(new SimpleChairDesign(plugin, textureids).rotate(180), 2);
		this.setBlockDesign(new SimpleChairDesign(plugin, textureids).rotate(270), 3);
		this.setRotate(true);
		this.setHardness(1.5F);
		this.plugin = plugin;
	}
}

