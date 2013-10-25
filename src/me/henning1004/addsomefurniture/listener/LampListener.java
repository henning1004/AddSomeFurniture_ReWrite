package me.henning1004.addsomefurniture.listener;


import me.henning1004.addsomefurniture.Main;
import me.henning1004.addsomefurniture.config.Configuration;
import me.henning1004.addsomefurniture.register.RegisterBlocks;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.getspout.spoutapi.block.SpoutBlock;

public class LampListener implements Listener
{
	public Player player;
	public SpoutBlock block;
	public SpoutBlock oldblock;
	public SpoutBlock newblock;
	
	public LampListener(Main plugin) 
	{
	}
	
	@EventHandler
	public void refesh (PlayerJoinEvent event)
	{

	}
	
	@EventHandler
	public void onLampClicked(PlayerInteractEvent event)
	{
		player = event.getPlayer();
		block = (SpoutBlock) event.getClickedBlock();
		
		if(event.hasBlock() && (block.getCustomBlock() == RegisterBlocks.lamp || block.getCustomBlock() == RegisterBlocks.lampon)  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.lamp") || player.isOp() || Configuration.confi.getString("NoPermissions").equals("true")){
			if(block.getCustomBlock() == RegisterBlocks.lamp)
			{
				event.setCancelled(true);
				block.setCustomBlock(RegisterBlocks.lampon);
				return;
			}
			else
			{
				event.setCancelled(true);
				block.setCustomBlock(RegisterBlocks.lamp);
				return;
			}
			}
			else{
				event.setCancelled(true);
				player.sendMessage(ChatColor.RED + "You are not allowed to switch lamps!");
				return;
			}
		}
		
		
		if(event.hasBlock() && (block.getCustomBlock() == RegisterBlocks.neonlamp || block.getCustomBlock() == RegisterBlocks.neonlampon)  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.lamp") || player.isOp() || Configuration.confi.getString("NoPermissions").equals("true")){
			if(block.getCustomBlock() == RegisterBlocks.neonlamp)
			{
				event.setCancelled(true);
				block.setCustomBlock(RegisterBlocks.neonlampon);
				return;
			}
			else
			{
				event.setCancelled(true);
				block.setCustomBlock(RegisterBlocks.neonlamp);
				return;
			}
			}
			else{
				event.setCancelled(true);
				player.sendMessage(ChatColor.RED + "You are not allowed to switch lamps!");
				return;
			}
		}
		
		if(event.hasBlock() && (block.getCustomBlock() == RegisterBlocks.neonlamp2 || block.getCustomBlock() == RegisterBlocks.neonlampon2)  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.lamp") || player.isOp() || Configuration.confi.getString("NoPermissions").equals("true")){
			if(block.getCustomBlock() == RegisterBlocks.neonlamp2)
			{
				event.setCancelled(true);
				block.setCustomBlock(RegisterBlocks.neonlampon2);
				return;
			}
			else
			{
				event.setCancelled(true);
				block.setCustomBlock(RegisterBlocks.neonlamp2);
				return;
			}
			}
			else{
				event.setCancelled(true);
				player.sendMessage(ChatColor.RED + "You are not allowed to switch lamps!");
				return;
			}
		}
		
		
		
		if(event.hasBlock() && (block.getCustomBlock() == RegisterBlocks.neonlampred || block.getCustomBlock() == RegisterBlocks.neonlamponred)  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.lamp") || player.isOp() || Configuration.confi.getString("NoPermissions").equals("true")){
			if(block.getCustomBlock() == RegisterBlocks.neonlampred)
			{
				event.setCancelled(true);
				block.setCustomBlock(RegisterBlocks.neonlamponred);
				return;
			}
			else
			{
				event.setCancelled(true);
				block.setCustomBlock(RegisterBlocks.neonlampred);
				return;
			}
			}
			else{
				event.setCancelled(true);
				player.sendMessage(ChatColor.RED + "You are not allowed to switch lamps!");
				return;
			}
		}
		
		if(event.hasBlock() && (block.getCustomBlock() == RegisterBlocks.neonlampred2 || block.getCustomBlock() == RegisterBlocks.neonlamponred2)  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.lamp") || player.isOp() || Configuration.confi.getString("NoPermissions").equals("true")){
			if(block.getCustomBlock() == RegisterBlocks.neonlampred2)
			{
				event.setCancelled(true);
				block.setCustomBlock(RegisterBlocks.neonlamponred2);
				return;
			}
			else
			{
				event.setCancelled(true);
				block.setCustomBlock(RegisterBlocks.neonlampred2);
				return;
			}
			}
			else{
				event.setCancelled(true);
				player.sendMessage(ChatColor.RED + "You are not allowed to switch lamps!");
				return;
			}
		}
		
		if(event.hasBlock() && (block.getCustomBlock() == RegisterBlocks.neonlampblue || block.getCustomBlock() == RegisterBlocks.neonlamponblue)  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.lamp") || player.isOp() || Configuration.confi.getString("NoPermissions").equals("true")){
			if(block.getCustomBlock() == RegisterBlocks.neonlampblue)
			{
				event.setCancelled(true);
				block.setCustomBlock(RegisterBlocks.neonlamponblue);
				return;
			}
			else
			{
				event.setCancelled(true);
				block.setCustomBlock(RegisterBlocks.neonlampblue);
				return;
			}
			}
			else{
				event.setCancelled(true);
				player.sendMessage(ChatColor.RED + "You are not allowed to switch lamps!");
				return;
			}
		}
		
		if(event.hasBlock() && (block.getCustomBlock() == RegisterBlocks.neonlampblue2 || block.getCustomBlock() == RegisterBlocks.neonlamponblue2)  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.lamp") || player.isOp() || Configuration.confi.getString("NoPermissions").equals("true")){
			if(block.getCustomBlock() == RegisterBlocks.neonlampblue2)
			{
				event.setCancelled(true);
				block.setCustomBlock(RegisterBlocks.neonlamponblue2);
				return;
			}
			else
			{
				event.setCancelled(true);
				block.setCustomBlock(RegisterBlocks.neonlampblue2);
				return;
			}
			}
			else{
				event.setCancelled(true);
				player.sendMessage(ChatColor.RED + "You are not allowed to switch lamps!");
				return;
			}
		}
		
		if(event.hasBlock() && (block.getCustomBlock() == RegisterBlocks.neonlampgreen  || block.getCustomBlock() == RegisterBlocks.neonlampongreen )  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.lamp") || player.isOp() || Configuration.confi.getString("NoPermissions").equals("true")){
			if(block.getCustomBlock() == RegisterBlocks.neonlampgreen )
			{
				event.setCancelled(true);
				block.setCustomBlock(RegisterBlocks.neonlampongreen );
				return;
			}
			else
			{
				event.setCancelled(true);
				block.setCustomBlock(RegisterBlocks.neonlampgreen );
				return;
			}
			}
			else{
				event.setCancelled(true);
				player.sendMessage(ChatColor.RED + "You are not allowed to switch lamps!");
				return;
			}
		}
		
		if(event.hasBlock() && (block.getCustomBlock() == RegisterBlocks.neonlampgreen2  || block.getCustomBlock() == RegisterBlocks.neonlampongreen2 )  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.lamp") || player.isOp() || Configuration.confi.getString("NoPermissions").equals("true")){
			if(block.getCustomBlock() == RegisterBlocks.neonlampgreen2 )
			{
				event.setCancelled(true);
				block.setCustomBlock(RegisterBlocks.neonlampongreen2 );
				return;
			}
			else
			{
				event.setCancelled(true);
				block.setCustomBlock(RegisterBlocks.neonlampgreen2 );
				return;
			}
			}
			else{
				event.setCancelled(true);
				player.sendMessage(ChatColor.RED + "You are not allowed to switch lamps!");
				return;
			}
		}
	}
	
		
}

