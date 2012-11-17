package me.henning1004.addsomefurniture.listener;


import me.henning1004.addsomefurniture.Main;
import me.henning1004.addsomefurniture.register.RegisterBlocks;
import me.henning1004.addsomefurniture.utils.Methods;


import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.getspout.spoutapi.block.SpoutBlock;

public class BlockRotationListener implements Listener
{
	public Player player;
	public SpoutBlock block;
	public float yaw;
	
	public BlockRotationListener(Main plugin) 
	{
	}
	
	@EventHandler
	public void onFlowerboxPlace(BlockPlaceEvent event)
	{
		player = event.getPlayer();
		block = (SpoutBlock) event.getBlock();
		yaw = player.getLocation().getYaw();
		if (yaw < 0) yaw = yaw+360;
		
		if (block.getCustomBlock() == null){ 
			return;
			}
		else{
		if (Methods.isFlowerbox(block)) 
		{
			if (yaw >= 225 && yaw < 315) {
				block.setCustomBlock(RegisterBlocks.flowerbox1E);
				return;
			}
			if (yaw >= 315 || yaw < 45) {				
				block.setCustomBlock(RegisterBlocks.flowerbox1N);
				return;
			}
			if (yaw >= 45 && yaw < 135) {				
				block.setCustomBlock(RegisterBlocks.flowerbox1W);
				return;
			}
			if (yaw >= 135 && yaw < 225) {				
				block.setCustomBlock(RegisterBlocks.flowerbox1S);
				return;
			}
			
		}
		
		if (Methods.isNeonlamp(block)) 
		{
			if ((yaw >= 225 && yaw < 315) || (yaw >= 45 && yaw < 135)) {
				block.setCustomBlock(RegisterBlocks.neonlamp);
				return;
			}
			if ((yaw >= 315 || yaw < 45) || (yaw >= 135 && yaw < 225)) {				
				block.setCustomBlock(RegisterBlocks.neonlamp2);
				return;
			}
			
		}
		
		if (Methods.isNeonlampred(block)) 
		{
			if ((yaw >= 225 && yaw < 315) || (yaw >= 45 && yaw < 135)) {
				block.setCustomBlock(RegisterBlocks.neonlampred);
				return;
			}
			if ((yaw >= 315 || yaw < 45) || (yaw >= 135 && yaw < 225)) {				
				block.setCustomBlock(RegisterBlocks.neonlampred2);
				return;
			}
			
		}
		
		if (Methods.isNeonlampgreen(block)) 
		{
			if ((yaw >= 225 && yaw < 315) || (yaw >= 45 && yaw < 135)) {
				block.setCustomBlock(RegisterBlocks.neonlampgreen);
				return;
			}
			if ((yaw >= 315 || yaw < 45) || (yaw >= 135 && yaw < 225)) {				
				block.setCustomBlock(RegisterBlocks.neonlampgreen2);
				return;
			}
			
		}
		
		if (Methods.isNeonlampblue(block)) 
		{
			if ((yaw >= 225 && yaw < 315) || (yaw >= 45 && yaw < 135)) {
				block.setCustomBlock(RegisterBlocks.neonlampblue);
				return;
			}
			if ((yaw >= 315 || yaw < 45) || (yaw >= 135 && yaw < 225)) {				
				block.setCustomBlock(RegisterBlocks.neonlampblue2);
				return;
			}
			
		}
		}
	}
}
