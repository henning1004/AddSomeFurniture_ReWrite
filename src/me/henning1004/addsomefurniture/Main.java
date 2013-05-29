package me.henning1004.addsomefurniture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;

import me.henning1004.addsomefurniture.config.Configuration;
import me.henning1004.addsomefurniture.listener.CraftListener;
import me.henning1004.addsomefurniture.listener.BlockRotationListener;
import me.henning1004.addsomefurniture.listener.LampListener;
import me.henning1004.addsomefurniture.listener.PlaceListener;
import me.henning1004.addsomefurniture.listener.QuestionListener;
import me.henning1004.addsomefurniture.listener.TableListener;
import me.henning1004.addsomefurniture.listener.WorktopListener;
import me.henning1004.addsomefurniture.register.RegisterBlocks;
import me.henning1004.addsomefurniture.register.RegisterRecipes;
import me.henning1004.addsomefurniture.register.RegisterTextures;
import me.henning1004.addsomefurniture.utils.MetricsLite;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
	public static Plugin plugin = null;

	
	public void onDisable()
	{
		Bukkit.getLogger().log(Level.INFO, "\033[36m" + "[AddSomeFurniture] Disabled!" + "\033[0m");
	}
	
	public void onEnable()
	{
		Bukkit.getLogger().log(Level.INFO, "\033[33m" + "--------------------------------------------------" + "\033[0m");
		
		if (getServer().getPluginManager().getPlugin("Spout") != null) {
			
			Bukkit.getLogger().log(Level.INFO, "\033[36m" + "[AddSomeFurniture] Enabled!" + "\033[0m");
			
			Configuration.start();
			plugin = this;
			
			if(Configuration.confi.getString("HDTextures").equals("true")) {
				RegisterTextures.precacheHD(this);
				RegisterTextures.loadtexturesHD(this);
			}
			else {
				RegisterTextures.precache(this);
				RegisterTextures.loadtextures(this);
			}
			
			Bukkit.getLogger().log(Level.INFO, "\033[36m" + "[AddSomeFurniture] Register furniture..." + "\033[0m");
			RegisterBlocks.registerBlocks(this);
			
			Bukkit.getLogger().log(Level.INFO, "\033[36m" + "[AddSomeFurniture] Register recipes..." + "\033[0m");
			RegisterRecipes.registerReipes(this);
			
			Bukkit.getLogger().log(Level.INFO, "\033[36m" + "[AddSomeFurniture] Register events..." + "\033[0m");
			getServer().getPluginManager().registerEvents(new WorktopListener(this), this);
			getServer().getPluginManager().registerEvents(new QuestionListener(this), this);
			getServer().getPluginManager().registerEvents(new TableListener(this), this);
			getServer().getPluginManager().registerEvents(new BlockRotationListener(this), this);
			getServer().getPluginManager().registerEvents(new LampListener(this), this);
			getServer().getPluginManager().registerEvents(new CraftListener(this), this);
			getServer().getPluginManager().registerEvents(new PlaceListener(this), this);

			
			if (Configuration.confi.getString("NoPermissions").equals("true")){
	        	Bukkit.getLogger().log(Level.INFO,"\033[31m" + "[AddSomeFurniture] Permissions disabled" + "\033[0m");
	    	}
	        else{
	        	Bukkit.getLogger().log(Level.INFO,"\033[36m" + "[AddSomeFurniture] Permissions enabled" + "\033[0m");
	        }
			
			if (Configuration.confi.getString("CheckForUpdates").equals("true")){
				updateCheck();
				}
			else {}

			try {
			    MetricsLite metrics = new MetricsLite(this);
			    metrics.start();
			} catch (IOException e) {}

		}	
		else {
			Bukkit.getLogger().log(Level.WARNING,"\033[31m" + "[AddSomeFurniture] Spoutplugin not found, can´t load AddSomeFurniture!" + "\033[0m");
			Bukkit.getLogger().log(Level.WARNING,"\033[31m" + "[AddSomeFurniture] Please install Spout" + "\033[0m");
		}
		
		Bukkit.getLogger().log(Level.INFO, "\033[33m" + "--------------------------------------------------" + "\033[0m");
	}
	
	private void updateCheck()
    {
        Bukkit.getLogger().log(Level.INFO,"\033[36m" +  "[AddSomeFurniture] Checking for updates..." + "\033[0m");
        try
        {
        	
        	URLConnection txt = (new URL("https://dl.dropbox.com/u/62050717/AddSomeFurniture/latestVersion.txt")).openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(txt.getInputStream()));
            String latestVersion = in.readLine();
            int this_pluginversion = Integer.parseInt(getDescription().getVersion().replace(".", ""));
            int latest_pluginversion = Integer.parseInt(latestVersion.replace(".", ""));
            String msg = null;
            
            if(this_pluginversion < latest_pluginversion){
                msg = (new StringBuilder("\033[31m" + "[AddSomeFurniture] Plugin is out of date, version ")).append(latestVersion).append(" is available for download.").toString() + "\033[0m";
            }
                else{
                	if(this_pluginversion > latest_pluginversion){
                    	msg = (new StringBuilder("\033[35m" + "[AddSomeFurniture] Plugin is more than up to date! Your Version: ").toString() + getDescription().getVersion() + (" Recommended Version: ").toString() + latestVersion + "\033[0m");	
                    	}
                    	else{
                    		msg = (new StringBuilder("\033[32m" + "[AddSomeFurniture] Plugin is up to date! Your Version: ").toString() + getDescription().getVersion() + "\033[0m");	
                    	}                	}
            if(msg != null){
            	Bukkit.getLogger().log(Level.INFO, msg);
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
    	if(cmd.getName().equalsIgnoreCase("asf")){ 
    		try
            {
    			
    			URLConnection txt = (new URL("https://dl.dropbox.com/u/62050717/AddSomeFurniture/latestVersion.txt")).openConnection();
                BufferedReader in = new BufferedReader(new InputStreamReader(txt.getInputStream()));
                String latestVersion = in.readLine();
                int this_pluginversion = Integer.parseInt(getDescription().getVersion().replace(".", ""));
                int latest_pluginversion = Integer.parseInt(latestVersion.replace(".", ""));
                String msg = null;
                
                if(this_pluginversion < latest_pluginversion){
                    msg = (new StringBuilder("&4 AddSomeFurniture is out of date, version ")).append(latestVersion).append(" is available for download.").toString();
                }
                    else{
                    	if(this_pluginversion > latest_pluginversion){
                    	msg = (new StringBuilder("&4 AddSomeFurniture is more than up to date! Your Version: ").toString() + getDescription().getVersion() + (" Recommended Version: ").toString() + latestVersion);	
                    	}
                    	else{
                    		msg = (new StringBuilder("&4 AddSomeFurniture is up to date! Your Version: ").toString() + getDescription().getVersion());	
                    	}
                    }
                if(msg != null){
                	sender.sendMessage(msg);
                }
                
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
    		return true;
    	}
    	return false; 
    }

}
