package me.henning1004.addsomefurniture.listener;

import java.util.Iterator;
import java.util.List;

import me.henning1004.addsomefurniture.Main;
import me.henning1004.addsomefurniture.config.Configuration;
import me.henning1004.addsomefurniture.register.RegisterBlocks;
import me.henning1004.addsomefurniture.utils.Methods;

import org.bukkit.ChatColor;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.Inventory;

public class CraftListener implements Listener {

	public CraftListener(Main plugin) 
	{
	}
	
	@EventHandler(priority=org.bukkit.event.EventPriority.HIGH)
	public void onItemCraft (CraftItemEvent event){
		
		if(event.isCancelled()){ return;}
			Inventory inv = event.getInventory(); 
			@SuppressWarnings("rawtypes")
			List viewers = event.getViewers();
	        Player player = null;
	        short craftedItemID = event.getRecipe().getResult().getDurability();
	 
			if(!(inv instanceof CraftingInventory) || !event.getSlotType().equals(org.bukkit.event.inventory.InventoryType.SlotType.RESULT)){
	            return;}
	        if(viewers.size() == 0){
	            return; }

	        for(@SuppressWarnings("rawtypes")
			Iterator iterator = event.getViewers().iterator(); iterator.hasNext();)
	        {
	            HumanEntity viewer = (HumanEntity)iterator.next();
	            if(viewer instanceof Player)
	            {
	                player = (Player)viewer;
	                break;
	            }
	        }
	        
	        if(player == null){
	            return;}
	        
	       //
	        if (Methods.isTableID(craftedItemID))
	        {
	        	if (player.hasPermission("asf.craft.table") || Configuration.confi.getString("NoPermissions").equals("true")){
	        		return;}
	        	else{
	        		player.sendMessage(ChatColor.RED + "You are not allowed to craft tables!");
	                event.setCancelled(true);
	        	}
	        }
	        
	        if (Methods.isChairID(craftedItemID))
	        {
	        	if (player.hasPermission("asf.craft.chair") || Configuration.confi.getString("NoPermissions").equals("true")){
	        		return;}
	        	else{
	        		player.sendMessage(ChatColor.RED + "You are not allowed to craft chairs!");
	                event.setCancelled(true);
	        	}
	        }
	        
	        if (Methods.isThroneID(craftedItemID))
	        {
	        	if (player.hasPermission("asf.craft.throne") || Configuration.confi.getString("NoPermissions").equals("true")){
	        		return;}
	        	else{
	        		player.sendMessage(ChatColor.RED + "You are not allowed to craft thrones!");
	                event.setCancelled(true);
	        	}
	        }
	        
	        if (Methods.isWorktopID(craftedItemID))
	        {
	        	if (player.hasPermission("asf.craft.worktop") || Configuration.confi.getString("NoPermissions").equals("true")){
	        		return;}
	        	else{
	        		player.sendMessage(ChatColor.RED + "You are not allowed to craft worktops!");
	                event.setCancelled(true);
	        	}
	        }
	        
	        if (Methods.isFlowerboxID(craftedItemID) || Methods.isFlowerID(craftedItemID))
	        {
	        	if (player.hasPermission("asf.craft.flower") || Configuration.confi.getString("NoPermissions").equals("true")){
	        		return;}
	        	else{
	        		player.sendMessage(ChatColor.RED + "You are not allowed to craft flowers!");
	                event.setCancelled(true);
	        	}
	        }
	        
	        if (Methods.isLampID(craftedItemID))
	        {
	        	if (player.hasPermission("asf.craft.lamp") || Configuration.confi.getString("NoPermissions").equals("true")){
	        		return;}
	        	else{
	        		player.sendMessage(ChatColor.RED + "You are not allowed to craft lamps!");
	                event.setCancelled(true);
	        	}
	        }
	        
	        if (Methods.isCarpetID(craftedItemID))
	        {
	        	if (player.hasPermission("asf.craft.carpet") || Configuration.confi.getString("NoPermissions").equals("true")){
	        		return;}
	        	else{
	        		player.sendMessage(ChatColor.RED + "You are not allowed to craft carpets!");
	                event.setCancelled(true);
	        	}
	        }
	        
	        if (craftedItemID == RegisterBlocks.tv.getCustomId())
	        {
	        	if (player.hasPermission("asf.craft.tv") || Configuration.confi.getString("NoPermissions").equals("true")){
	        		return;}
	        	else{
	        		player.sendMessage(ChatColor.RED + "You are not allowed to craft the tv!");
	                event.setCancelled(true);
	        	}
	        }
	        
	        if (craftedItemID == RegisterBlocks.qmark.getCustomId())
	        {
	        	if (player.hasPermission("asf.craft.qmark") || Configuration.confi.getString("NoPermissions").equals("true")){
	        		return;}
	        	else{
	        		player.sendMessage(ChatColor.RED + "You are not allowed to craft the question mark!");
	                event.setCancelled(true);
	        	}
	        }

	}
}
