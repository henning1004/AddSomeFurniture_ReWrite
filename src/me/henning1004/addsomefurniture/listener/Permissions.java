package me.henning1004.addsomefurniture.listener;

import me.henning1004.addsomefurniture.Main;
import net.milkbowl.vault.permission.Permission;

import org.bukkit.entity.Player;
import org.bukkit.plugin.RegisteredServiceProvider;

public class Permissions {

	public static Permission permission = null;

	 public static boolean setupPermissions(Main plugin)
	    {
			@SuppressWarnings("rawtypes")
			RegisteredServiceProvider permissionProvider = plugin.getServer().getServicesManager().getRegistration(net.milkbowl.vault.permission.Permission.class);
	        if(permissionProvider != null)
	            permission = (Permission)permissionProvider.getProvider();
	        return (permission != null);
	    }
	      
	    
	    public static boolean hasPermission(Player player, String permissionNode)
	    {
	        if(permission != null)
	            return permission.has(player, permissionNode);
	        else
	            return player.hasPermission(permissionNode);
	    }
}
