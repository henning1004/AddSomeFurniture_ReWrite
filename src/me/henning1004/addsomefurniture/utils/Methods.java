package me.henning1004.addsomefurniture.utils;

import me.henning1004.addsomefurniture.register.RegisterBlocks;

import org.getspout.spoutapi.block.SpoutBlock;

public class Methods {

	public static boolean isWorktopID(short id) {
		if (	id == RegisterBlocks.woodenworktop.getCustomId() || 
				id == RegisterBlocks.stoneworktop.getCustomId() ||
				id == RegisterBlocks.goldworktop.getCustomId() || 
				id == RegisterBlocks.ironworktop.getCustomId() ||
				id == RegisterBlocks.craftingworktop.getCustomId() || 
				id == RegisterBlocks.obsidianworktop.getCustomId() )
		{return true;} else {return false;}
	}
	
	public static boolean isChairID(short id) {
		if (	id == RegisterBlocks.goldchair.getCustomId() || 
				id == RegisterBlocks.woodchair.getCustomId() ||
				id == RegisterBlocks.ironchair.getCustomId() ||
				id == RegisterBlocks.stonesimplechair.getCustomId() || 
				id == RegisterBlocks.woodsimplechair.getCustomId() )
		{return true;} else {return false;}
	}
	
	public static boolean isThroneID(short id) {
		if (	id == RegisterBlocks.goldthrone.getCustomId() || 
				id == RegisterBlocks.woodthrone.getCustomId() ||
				id == RegisterBlocks.leatherthrone.getCustomId() ||
				id == RegisterBlocks.ironthrone.getCustomId() )
		{return true;} else {return false;}
	}
	
	public static boolean isTableID(short id) {
		if (	id == RegisterBlocks.woodtable.getCustomId() || 
				id == RegisterBlocks.stonetable.getCustomId() ||
				id == RegisterBlocks.goldtable.getCustomId() || 
				id == RegisterBlocks.irontable.getCustomId() ||
				id == RegisterBlocks.obsidiantable.getCustomId() || 
				id == RegisterBlocks.woodsimpletable.getCustomId() || 
				id == RegisterBlocks.stonesimpletable.getCustomId() )
		{return true;} else {return false;}
	}
	
	public static boolean isFlowerboxID(short id) {
		if (	id == RegisterBlocks.flowerbox1E.getCustomId() || 
				id == RegisterBlocks.flowerbox1N.getCustomId() ||
				id == RegisterBlocks.flowerbox1W.getCustomId() ||
				id == RegisterBlocks.flowerbox1S.getCustomId() )
		{return true;} else {return false;}
	}
	
	public static boolean isFlowerID(short id) {
		if (	id == RegisterBlocks.blueflower.getCustomId() || 
				id == RegisterBlocks.whiterose.getCustomId() )
		{return true;} else {return false;}
	}
	
	public static boolean isCarpetID(short id) {
		if (	id == RegisterBlocks.carpetblack.getCustomId() || 
				id == RegisterBlocks.carpetblue.getCustomId() ||
				id == RegisterBlocks.carpetbrown.getCustomId() ||
				id == RegisterBlocks.carpetcyan.getCustomId() ||
				id == RegisterBlocks.carpetdarkgreen.getCustomId() ||
				id == RegisterBlocks.carpetgrey.getCustomId() ||
				id == RegisterBlocks.carpetlightblue.getCustomId() ||
				id == RegisterBlocks.carpetlightgreen.getCustomId() ||
				id == RegisterBlocks.carpetlightgrey.getCustomId() ||
				id == RegisterBlocks.carpetmagenta.getCustomId() ||
				id == RegisterBlocks.carpetorange.getCustomId() ||
				id == RegisterBlocks.carpetpink.getCustomId() ||
				id == RegisterBlocks.carpetpurple.getCustomId() ||
				id == RegisterBlocks.carpetred.getCustomId() ||
				id == RegisterBlocks.carpetwhite.getCustomId() ||
				id == RegisterBlocks.carpetyellow.getCustomId())
		{return true;} else {return false;}
	}
	
	public static boolean isLampID(short id) {
		if (	id == RegisterBlocks.lamp.getCustomId() || 
				id == RegisterBlocks.lampon.getCustomId() ||
				id == RegisterBlocks.neonlamp.getCustomId() || 
				id == RegisterBlocks.neonlampon.getCustomId() ||
				id == RegisterBlocks.neonlampblue.getCustomId() || 
				id == RegisterBlocks.neonlamponblue.getCustomId() || 
				id == RegisterBlocks.neonlampgreen.getCustomId() ||
				id == RegisterBlocks.neonlampongreen.getCustomId() ||
				id == RegisterBlocks.neonlampred.getCustomId() ||
				id == RegisterBlocks.neonlamponred.getCustomId())
		{return true;} else {return false;}
	}
	
	public static boolean isOtherID(short id) {
		if (	id == RegisterBlocks.tv.getCustomId() || 
				id == RegisterBlocks.qmark.getCustomId() )
		{return true;} else {return false;}
	}
	//
	
	//
	public static boolean isWorktop(SpoutBlock block) {
		if (	block.getCustomBlock() == RegisterBlocks.woodenworktop || 
				block.getCustomBlock() == RegisterBlocks.stoneworktop ||
				block.getCustomBlock() == RegisterBlocks.goldworktop || 
				block.getCustomBlock() == RegisterBlocks.ironworktop ||
				block.getCustomBlock() == RegisterBlocks.craftingworktop || 
				block.getCustomBlock() == RegisterBlocks.obsidianworktop )
		{return true;} else {return false;}
	}
	
	public static boolean isChair(SpoutBlock block) {
		if (	block.getCustomBlock() == RegisterBlocks.goldchair || 
				block.getCustomBlock() == RegisterBlocks.woodchair ||
				block.getCustomBlock() == RegisterBlocks.ironchair ||
				block.getCustomBlock() == RegisterBlocks.stonesimplechair || 
				block.getCustomBlock() == RegisterBlocks.woodsimplechair )
		{return true;} else {return false;}
	}
	
	public static boolean isThrone(SpoutBlock block) {
		if (	block.getCustomBlock() == RegisterBlocks.goldthrone || 
				block.getCustomBlock() == RegisterBlocks.woodthrone ||
				block.getCustomBlock() == RegisterBlocks.leatherthrone ||
				block.getCustomBlock() == RegisterBlocks.ironthrone )
		{return true;} else {return false;}
	}
	
	public static boolean isTable(SpoutBlock block) {
		if (	block.getCustomBlock() == RegisterBlocks.woodtable || 
				block.getCustomBlock() == RegisterBlocks.stonetable ||
				block.getCustomBlock() == RegisterBlocks.goldtable || 
				block.getCustomBlock() == RegisterBlocks.irontable ||
				block.getCustomBlock() == RegisterBlocks.obsidiantable || 
				block.getCustomBlock() == RegisterBlocks.woodsimpletable || 
				block.getCustomBlock() == RegisterBlocks.stonesimpletable )
		{return true;} else {return false;}
	}
	
	public static boolean isFlowerbox(SpoutBlock block) {
		if (	block.getCustomBlock() == RegisterBlocks.flowerbox1E || 
				block.getCustomBlock() == RegisterBlocks.flowerbox1N ||
				block.getCustomBlock() == RegisterBlocks.flowerbox1W ||
				block.getCustomBlock() == RegisterBlocks.flowerbox1S )
		{return true;} else {return false;}
	}
	
	public static boolean isFlower(SpoutBlock block) {
		if (	block.getCustomBlock() == RegisterBlocks.blueflower || 
				block.getCustomBlock() == RegisterBlocks.whiterose )
		{return true;} else {return false;}
	}
	
	public static boolean isCarpet(SpoutBlock block) {
		if (	block.getCustomBlock() == RegisterBlocks.carpetblack || 
				block.getCustomBlock() == RegisterBlocks.carpetblue ||
				block.getCustomBlock() == RegisterBlocks.carpetbrown ||
				block.getCustomBlock() == RegisterBlocks.carpetcyan ||
				block.getCustomBlock() == RegisterBlocks.carpetdarkgreen ||
				block.getCustomBlock() == RegisterBlocks.carpetgrey ||
				block.getCustomBlock() == RegisterBlocks.carpetlightblue ||
				block.getCustomBlock() == RegisterBlocks.carpetlightgreen ||
				block.getCustomBlock() == RegisterBlocks.carpetlightgrey ||
				block.getCustomBlock() == RegisterBlocks.carpetmagenta ||
				block.getCustomBlock() == RegisterBlocks.carpetorange ||
				block.getCustomBlock() == RegisterBlocks.carpetpink ||
				block.getCustomBlock() == RegisterBlocks.carpetpurple ||
				block.getCustomBlock() == RegisterBlocks.carpetred ||
				block.getCustomBlock() == RegisterBlocks.carpetwhite ||
				block.getCustomBlock() == RegisterBlocks.carpetyellow)
		{return true;} else {return false;}
	}
	
	public static boolean isLamp(SpoutBlock block) {
		if (	block.getCustomBlock() == RegisterBlocks.lamp || 
				block.getCustomBlock() == RegisterBlocks.lampon ||
				block.getCustomBlock() == RegisterBlocks.neonlamp || 
				block.getCustomBlock() == RegisterBlocks.neonlampon ||
				block.getCustomBlock() == RegisterBlocks.neonlampblue || 
				block.getCustomBlock() == RegisterBlocks.neonlamponblue || 
				block.getCustomBlock() == RegisterBlocks.neonlampgreen ||
				block.getCustomBlock() == RegisterBlocks.neonlampongreen ||
				block.getCustomBlock() == RegisterBlocks.neonlampred ||
				block.getCustomBlock() == RegisterBlocks.neonlamponred)
		{return true;} else {return false;}
	}
	
	public static boolean isOther(SpoutBlock block) {
		if (	block.getCustomBlock() == RegisterBlocks.tv || 
				block.getCustomBlock() == RegisterBlocks.qmark )
		{return true;} else {return false;}
	}
	
	public static boolean isNeonlamp(SpoutBlock block) {
		if (	block.getCustomBlock() == RegisterBlocks.neonlamp || 
				block.getCustomBlock() == RegisterBlocks.neonlamp2 ||
				block.getCustomBlock() == RegisterBlocks.neonlampon ||
				block.getCustomBlock() == RegisterBlocks.neonlampon2 )
		{return true;} else {return false;}
	}
	
	public static boolean isNeonlampred(SpoutBlock block) {
		if (	block.getCustomBlock() == RegisterBlocks.neonlampred || 
				block.getCustomBlock() == RegisterBlocks.neonlampred2 ||
				block.getCustomBlock() == RegisterBlocks.neonlamponred ||
				block.getCustomBlock() == RegisterBlocks.neonlamponred2 )
		{return true;} else {return false;}
	}
	
	public static boolean isNeonlampgreen(SpoutBlock block) {
		if (	block.getCustomBlock() == RegisterBlocks.neonlampgreen || 
				block.getCustomBlock() == RegisterBlocks.neonlampgreen2 ||
				block.getCustomBlock() == RegisterBlocks.neonlampongreen ||
				block.getCustomBlock() == RegisterBlocks.neonlampongreen2 )
		{return true;} else {return false;}
	}
	
	public static boolean isNeonlampblue(SpoutBlock block) {
		if (	block.getCustomBlock() == RegisterBlocks.neonlampblue || 
				block.getCustomBlock() == RegisterBlocks.neonlampblue2 ||
				block.getCustomBlock() == RegisterBlocks.neonlamponblue ||
				block.getCustomBlock() == RegisterBlocks.neonlamponblue2 )
		{return true;} else {return false;}
	}
}
