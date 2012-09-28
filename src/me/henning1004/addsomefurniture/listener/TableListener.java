package me.henning1004.addsomefurniture.listener;


import java.util.HashMap;
import java.util.Iterator;

import me.henning1004.addsomefurniture.Main;
import me.henning1004.addsomefurniture.config.Configuration;
import me.henning1004.addsomefurniture.register.RegisterBlocks;


import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.block.SpoutBlock;

public class TableListener implements Listener
{
	public Player player;
	public SpoutBlock block;
	public Location loc;
	
	public TableListener(Main plugin) 	{
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onGoldtableClicked(PlayerInteractEvent event)
	{
		player = event.getPlayer();
		block = (SpoutBlock) event.getClickedBlock();
		
		if(event.hasBlock() && block.getCustomBlock() == RegisterBlocks.goldtable  && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(player.hasPermission("asf.action.goldtable") || Configuration.confi.getString("NoPermissions").equals("true")){				
				event.setCancelled(true);				
				if(player.getInventory().contains(Material.MILK_BUCKET.getId(), 1) && player.getInventory().contains(Material.APPLE.getId(), 1) && player.getInventory().contains(Material.WHEAT.getId(), 3) && player.getInventory().contains(Material.EGG.getId(), 1)){					
					loc = block.getLocation().add(0, 1, 0);
					if(loc.getWorld().getBlockAt(loc).isEmpty()){
					loc.getWorld().getBlockAt(loc).setTypeId(Material.CAKE_BLOCK.getId());
					loc.getWorld().playEffect(loc, Effect.POTION_BREAK, 0 );
					HashMap<Integer, ? extends ItemStack> stacks = player.getInventory().all(Material.MILK_BUCKET);
					Iterator<Integer> i = stacks.keySet().iterator();
					ItemStack stack = stacks.get(i.next());
					int amount = stack.getAmount();
					if (amount == 1) {
						player.getInventory().removeItem(stack);
						}
					else {
						stack.setAmount(amount - 1);
					}
					HashMap<Integer, ? extends ItemStack> stacks1 = player.getInventory().all(Material.APPLE);
					Iterator<Integer> i1 = stacks1.keySet().iterator();
					ItemStack stack1 = stacks1.get(i1.next());
					int amount1 = stack1.getAmount();
					
					if (amount1 == 1) {
						player.getInventory().removeItem(stack1);
						}
					else {
						stack1.setAmount(amount1 - 1);
					}
					HashMap<Integer, ? extends ItemStack> stacks2 = player.getInventory().all(Material.WHEAT);
					Iterator<Integer> i2 = stacks2.keySet().iterator();
					ItemStack stack2 = stacks2.get(i2.next());
					int amount2 = stack2.getAmount();
					if (amount2 == 3) {
						player.getInventory().removeItem(stack2);
						}
					else {
						stack2.setAmount(amount2 - 3);
					}
					HashMap<Integer, ? extends ItemStack> stacks3 = player.getInventory().all(Material.EGG);
					Iterator<Integer> i3 = stacks3.keySet().iterator();
					ItemStack stack3 = stacks3.get(i3.next());
					int amount3 = stack3.getAmount();
					
					if (amount3 == 1) {
						player.getInventory().removeItem(stack3);
						}
					else {
						stack3.setAmount(amount3 - 1);
					}
					player.getInventory().addItem(new ItemStack(Material.BUCKET, 1));
					player.updateInventory();
					player.sendMessage(ChatColor.GOLD + "Yummy! Here is your cake!");
					return;
					}
					else{
						player.sendMessage(ChatColor.RED + "Make sure there is nothing on top of the table!");	
						return;
					}
				}
				else{
					player.sendMessage(ChatColor.GOLD + "To get a cake you need: " + ChatColor.GREEN + "3 wheat, 1 apple, 1 egg and 1 bucket of milk.");
					return;
				}
			
			}
			else{
				event.setCancelled(true);
				player.sendMessage(ChatColor.RED + "You are not allowed to use the goldtable!");
				return;
			}
		
		}	
	}
} 