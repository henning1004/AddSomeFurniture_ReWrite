package me.henning1004.addsomefurniture.listener;


import me.henning1004.addsomefurniture.Main;
import me.henning1004.addsomefurniture.config.Configuration;
import me.henning1004.addsomefurniture.register.RegisterBlocks;
import me.henning1004.addsomefurniture.utils.Methods;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.getspout.spoutapi.block.SpoutBlock;

public class PlaceListener implements Listener {

	public PlaceListener(Main plugin) 
	{
	}
	
	public Player player;
	public SpoutBlock block;
	
	@EventHandler(priority=org.bukkit.event.EventPriority.HIGH)
	public void onBlockPlace (BlockPlaceEvent event){
		
		if(event.isCancelled()){ return;}
			block = (SpoutBlock) event.getBlock();
			player = event.getPlayer();
	        
	        if(player == null){
	            return;}
	        
	       //
	        if (Methods.isTable(block))
	        {
	        	if (player.hasPermission("asf.place.table") || Configuration.confi.getString("NoPermissions").equals("true")){
	        		return;}
	        	else{
	        		player.sendMessage(ChatColor.RED + "You are not allowed to place tables!");
	                event.setCancelled(true);
	        	}
	        }
	        
	        if (Methods.isChair(block))
	        {
	        	if (player.hasPermission("asf.place.chair") || Configuration.confi.getString("NoPermissions").equals("true")){
	        		return;}
	        	else{
	        		player.sendMessage(ChatColor.RED + "You are not allowed to place chairs!");
	                event.setCancelled(true);
	        	}
	        }
	        
	        if (Methods.isThrone(block))
	        {
	        	if (player.hasPermission("asf.place.throne") || Configuration.confi.getString("NoPermissions").equals("true")){
	        		return;}
	        	else{
	        		player.sendMessage(ChatColor.RED + "You are not allowed to place thrones!");
	                event.setCancelled(true);
	        	}
	        }
	        
	        if (Methods.isWorktop(block))
	        {
	        	if (player.hasPermission("asf.place.worktop") || Configuration.confi.getString("NoPermissions").equals("true")){
	        		return;}
	        	else{
	        		player.sendMessage(ChatColor.RED + "You are not allowed to place worktops!");
	                event.setCancelled(true);
	        	}
	        }
	        
	        if (Methods.isFlowerbox(block) || Methods.isFlower(block))
	        {
	        	if (player.hasPermission("asf.place.flower") || Configuration.confi.getString("NoPermissions").equals("true")){
	        		return;}
	        	else{
	        		player.sendMessage(ChatColor.RED + "You are not allowed to place flowers!");
	                event.setCancelled(true);
	        	}
	        }
	        
	        if (Methods.isLamp(block))
	        {
	        	if (player.hasPermission("asf.place.lamp") || Configuration.confi.getString("NoPermissions").equals("true")){
	        		return;}
	        	else{
	        		player.sendMessage(ChatColor.RED + "You are not allowed to place lamps!");
	                event.setCancelled(true);
	        	}
	        }
	        
	        if (Methods.isCarpet(block))
	        {
	        	if (player.hasPermission("asf.place.carpet") || Configuration.confi.getString("NoPermissions").equals("true")){
	        		return;}
	        	else{
	        		player.sendMessage(ChatColor.RED + "You are not allowed to place carpets!");
	                event.setCancelled(true);
	        	}
	        }
	        
	        if (block == RegisterBlocks.tv)
	        {
	        	if (player.hasPermission("asf.place.tv") || Configuration.confi.getString("NoPermissions").equals("true")){
	        		return;}
	        	else{
	        		player.sendMessage(ChatColor.RED + "You are not allowed to place the tv!");
	                event.setCancelled(true);
	        	}
	        }
	        
	        if (block == RegisterBlocks.qmark)
	        {
	        	if (player.hasPermission("asf.place.qmark") || Configuration.confi.getString("NoPermissions").equals("true")){
	        		return;}
	        	else{
	        		player.sendMessage(ChatColor.RED + "You are not allowed to place the question mark!");
	                event.setCancelled(true);
	        	}
	        }

	}
}
