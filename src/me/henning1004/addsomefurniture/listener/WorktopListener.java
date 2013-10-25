package me.henning1004.addsomefurniture.listener;


import me.henning1004.addsomefurniture.Main;
import me.henning1004.addsomefurniture.config.Configuration;
import me.henning1004.addsomefurniture.utils.Methods;


import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.getspout.spoutapi.block.SpoutBlock;

public class WorktopListener implements Listener
{
	public Player player;
	public SpoutBlock block;
	
	public WorktopListener(Main plugin) 
	{
	}
	
	@EventHandler
	public void onWorktopClicked(PlayerInteractEvent event)
	{
		player = event.getPlayer();
		block = (SpoutBlock) event.getClickedBlock();
		
		if(event.hasBlock() && Methods.isWorktop(block)  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.worktop") || player.isOp() || Configuration.confi.getString("NoPermissions").equals("true")){
				event.setCancelled(true);
				player.openWorkbench(null, true);
			return;
			}
			else{
				event.setCancelled(true);
				player.sendMessage(ChatColor.RED + "You are not allowed to use wortops!");
				return;
			}
		
		}	
	}
}
