package me.henning1004.addsomefurniture.custom;

import me.henning1004.addsomefurniture.Main;
import me.henning1004.addsomefurniture.design.WorktopDesign;
import me.henning1004.addsomefurniture.register.RegisterTextures;

import org.bukkit.Material;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class Worktop extends GenericCubeCustomBlock {
	@SuppressWarnings("unused")
	private Main plugin;
	
	@SuppressWarnings("deprecation")
	public Worktop(Main plugin,String name, int[] textureids) {
		super(plugin, name, Material.STEP.getId(), new GenericCubeBlockDesign(plugin, RegisterTextures.texWorktop, textureids));
		this.setBlockDesign(new WorktopDesign(plugin, textureids));
		this.setHardness(6F);
		this.plugin = plugin;
	}
}









