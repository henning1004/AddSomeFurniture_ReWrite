package me.henning1004.addsomefurniture.custom;

import me.henning1004.addsomefurniture.Main;
import me.henning1004.addsomefurniture.design.BlockDesign;
import me.henning1004.addsomefurniture.register.RegisterTextures;

import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class QuestionMark extends GenericCubeCustomBlock 
{
	@SuppressWarnings("unused")
	private Main plugin;
	
	public QuestionMark(Main plugin,String name, int[] textureids) {
		super(plugin, name, false, new GenericCubeBlockDesign(plugin, RegisterTextures.texOther, textureids));
		this.setBlockDesign(new BlockDesign(plugin, textureids));
		this.setHardness(2F);
		this.plugin = plugin;
	}
}









