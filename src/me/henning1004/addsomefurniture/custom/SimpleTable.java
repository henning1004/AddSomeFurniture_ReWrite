package me.henning1004.addsomefurniture.custom;

import me.henning1004.addsomefurniture.Main;
import me.henning1004.addsomefurniture.design.SimpleTableDesign;
import me.henning1004.addsomefurniture.register.RegisterTextures;

import org.bukkit.Material;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;

public class SimpleTable extends GenericCubeCustomBlock {
	@SuppressWarnings("unused")
	private Main plugin;
	
	public SimpleTable(Main plugin,String name, int[] textureids) {
		super(plugin, name, Material.FENCE.getId(), new GenericCubeBlockDesign(plugin, RegisterTextures.texTable,textureids));
		this.setBlockDesign(new SimpleTableDesign(plugin, textureids));
		this.setHardness(1.5F);
		this.plugin = plugin;
	}
}

