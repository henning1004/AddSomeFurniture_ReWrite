package me.henning1004.addsomefurniture.register;

import java.util.logging.Level;

import me.henning1004.addsomefurniture.Main;
import me.henning1004.addsomefurniture.config.Configuration;

import org.bukkit.Bukkit;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.block.design.Texture;

public class RegisterTextures {
	
	public static Texture texChair;
	public static Texture texTable;
	public static Texture texThrone;
	public static Texture texWorktop;
	public static Texture texOther;
	public static Texture texCarpet;
	
	public static void precache(Main plugin) {
		SpoutManager.getFileManager().addToPreLoginCache(plugin, Configuration.texture.getString("Table Texture"));
		SpoutManager.getFileManager().addToPreLoginCache(plugin, Configuration.texture.getString("Chair Texture"));
		SpoutManager.getFileManager().addToPreLoginCache(plugin, Configuration.texture.getString("Throne Texture"));
		SpoutManager.getFileManager().addToPreLoginCache(plugin, Configuration.texture.getString("Worktop Texture"));
		SpoutManager.getFileManager().addToPreLoginCache(plugin, Configuration.texture.getString("Other Texture"));
		SpoutManager.getFileManager().addToPreLoginCache(plugin, Configuration.texture.getString("Carpet Texture"));
	}
	
	public static void precacheHD(Main plugin) {
		SpoutManager.getFileManager().addToPreLoginCache(plugin, Configuration.textureHD.getString("Table HD Texture"));
		SpoutManager.getFileManager().addToPreLoginCache(plugin, Configuration.textureHD.getString("Chair HD Texture"));
		SpoutManager.getFileManager().addToPreLoginCache(plugin, Configuration.textureHD.getString("Throne HD Texture"));
		SpoutManager.getFileManager().addToPreLoginCache(plugin, Configuration.textureHD.getString("Worktop HD Texture"));
		SpoutManager.getFileManager().addToPreLoginCache(plugin, Configuration.textureHD.getString("Other HD Texture"));
		SpoutManager.getFileManager().addToPreLoginCache(plugin, Configuration.textureHD.getString("Carpet HD Texture"));
	}
			
	public static void loadtextures(Main plugin) {
		texTable = new Texture(plugin, Configuration.texture.getString("Table Texture"), 256, 256, 16);
		texChair = new Texture(plugin, Configuration.texture.getString("Chair Texture"), 256, 256, 16);
		texThrone = new Texture(plugin, Configuration.texture.getString("Throne Texture"), 256, 256, 16);
		texWorktop = new Texture(plugin, Configuration.texture.getString("Worktop Texture"), 256, 256, 16);
		texOther = new Texture(plugin, Configuration.texture.getString("Other Texture"), 256, 256, 16);
		//texCarpet = new Texture(plugin, Configuration.texture.getString("Carpet Texture"), 256, 256, 16);
		Bukkit.getLogger().log(Level.INFO, "\033[36m" + "[AddSomeFurniture] Normal Textures loaded!" + "\033[0m");	
	}
	
	public static void loadtexturesHD(Main plugin) {
		texTable = new Texture(plugin, Configuration.textureHD.getString("Table HD Texture"), 1024, 1024, 64);
		texChair = new Texture(plugin, Configuration.textureHD.getString("Chair HD Texture"), 1024, 1024, 64);
		texThrone = new Texture(plugin, Configuration.textureHD.getString("Throne HD Texture"), 1024, 1024, 64);
		texWorktop = new Texture(plugin, Configuration.textureHD.getString("Worktop HD Texture"), 1024, 1024, 64);
		texOther = new Texture(plugin, Configuration.textureHD.getString("Other HD Texture"), 1024, 1024, 64);
		//texCarpet = new Texture(plugin, Configuration.textureHD.getString("Carpet HD Texture"), 1024, 1024, 64);	
		Bukkit.getLogger().log(Level.INFO,"\033[36m" + "[AddSomeFurniture] HD Textures loaded!" + "\033[0m");
	}
}
