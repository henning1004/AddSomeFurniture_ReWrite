package me.henning1004.addsomefurniture.custom;

import me.henning1004.addsomefurniture.Main;
import me.henning1004.addsomefurniture.design.NeonLampDesign;
import me.henning1004.addsomefurniture.register.RegisterTextures;

import org.bukkit.Material;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class NeonLampOn extends GenericCubeCustomBlock {
	@SuppressWarnings("unused")
	private Main plugin;
	
	public NeonLampOn(Main plugin,String name, int[] textureids) {
		super(plugin, name, Material.GLASS.getId(), new GenericCubeBlockDesign(plugin, RegisterTextures.texOther, textureids));
		this.setBlockDesign(new NeonLampDesign(plugin, textureids));
		this.setBlockDesign(new NeonLampDesign(plugin, textureids).rotate(90), 1);
		this.setBlockDesign(new NeonLampDesign(plugin, textureids).rotate(180), 2);
		this.setBlockDesign(new NeonLampDesign(plugin, textureids).rotate(270), 3);
		this.setRotate(true);
		this.setHardness(4F);
		this.setLightLevel(15);
		this.plugin = plugin;
	}
}









