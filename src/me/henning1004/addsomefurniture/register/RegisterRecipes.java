package me.henning1004.addsomefurniture.register;

import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;
import org.getspout.spoutapi.inventory.SpoutShapelessRecipe;
import org.getspout.spoutapi.material.MaterialData;

import me.henning1004.addsomefurniture.Main;

public class RegisterRecipes {

	private static SpoutShapedRecipe recipe;
	private static SpoutShapedRecipe recipe1;
	private static SpoutShapedRecipe recipe2;
	private static SpoutShapedRecipe recipe3;
	private static SpoutShapelessRecipe recipel;
	
	public static ItemStack recwoodtable;
	public static ItemStack recirontable;
    public static ItemStack recgoldtable;
    public static ItemStack recstonetable;
    public static ItemStack recobsidiantable;
    
    public static ItemStack recwoodchair;
    public static ItemStack recironchair;
    public static ItemStack recgoldchair;
    
    public static ItemStack recwoodthrone;
    public static ItemStack recironthrone;
    public static ItemStack recgoldthrone;
     public static ItemStack recleatherthrone;
     
    public static ItemStack recwoodenbarstool;
    public static ItemStack recstonebarstool;
    
    public static ItemStack recstonesimplechair;
    public static ItemStack recwoodsimplechair;
    
    public static ItemStack recstonesimpletable;
    public static ItemStack recwoodsimpletable;
    
    public static ItemStack recobsidianworktop;
    public static ItemStack recironworktop;
    public static ItemStack recgoldworktop;
    public static ItemStack recstoneworktop;
    public static ItemStack reccraftingworktop;
    public static ItemStack recwoodenworktop;
    
    public static ItemStack rectv;
    
    public static ItemStack reclamp;
    public static ItemStack recneonlamp;
    public static ItemStack recneonlampred;
    public static ItemStack recneonlampblue;
    public static ItemStack recneonlampgreen;
    /*
    public static ItemStack reccarpetblack;
	public static ItemStack reccarpetred;
	public static ItemStack reccarpetdarkgreen;
	public static ItemStack reccarpetbrown;
	public static ItemStack reccarpetblue;
	public static ItemStack reccarpetpurple;
	public static ItemStack reccarpetcyan;
	public static ItemStack reccarpetlightgrey;
	public static ItemStack reccarpetgrey;
	public static ItemStack reccarpetpink;
	public static ItemStack reccarpetlightgreen;
	public static ItemStack reccarpetyellow;
	public static ItemStack reccarpetlightblue;
	public static ItemStack reccarpetmagenta;
	public static ItemStack reccarpetorange;
	public static ItemStack reccarpetwhite;
	*/
	public static ItemStack recflowerbox;
	/*
	public static ItemStack recblueflower;
	public static ItemStack recwhiterose;
	*/
	public static ItemStack recquestionmark;
	
	public static void registerReipes(Main main) {
		
		recwoodtable = new SpoutItemStack(RegisterBlocks.woodtable, 1);
		recipe = new SpoutShapedRecipe(recwoodtable);
		recipe1 = new SpoutShapedRecipe(recwoodtable);
		recipe2 = new SpoutShapedRecipe(recwoodtable);
		recipe3 = new SpoutShapedRecipe(recwoodtable);
		recipe.shape("AAA", "B B", "B B");
		recipe1.shape("AAA", "B B", "B B");
		recipe2.shape("AAA", "B B", "B B");
		recipe3.shape("AAA", "B B", "B B");
		recipe.setIngredient('A', MaterialData.wood);
		recipe1.setIngredient('A', MaterialData.birchWood);
		recipe2.setIngredient('A', MaterialData.jungleWood);
		recipe3.setIngredient('A', MaterialData.spruceWood);
		recipe.setIngredient('B', MaterialData.stick);
		recipe1.setIngredient('B', MaterialData.stick);
		recipe2.setIngredient('B', MaterialData.stick);
		recipe3.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe1);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe3);
		
		recirontable = new SpoutItemStack(RegisterBlocks.irontable, 1);
		recipe = new SpoutShapedRecipe(recirontable);
		recipe.shape("AAA", "B B", "B B");
		recipe.setIngredient('A', MaterialData.ironIngot);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		recgoldtable = new SpoutItemStack(RegisterBlocks.goldtable, 1);
		recipe = new SpoutShapedRecipe(recgoldtable);
		recipe.shape("AAA", "B B", "B B");
		recipe.setIngredient('A', MaterialData.goldIngot);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		recstonetable = new SpoutItemStack(RegisterBlocks.stonetable, 1);
		recipe = new SpoutShapedRecipe(recstonetable);
		recipe.shape("AAA", "B B", "B B");
		recipe.setIngredient('A', MaterialData.stone);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		recobsidiantable = new SpoutItemStack(RegisterBlocks.obsidiantable, 1);
		recipe = new SpoutShapedRecipe(recobsidiantable);
		recipe.shape("AAA", "B B", "B B");
		recipe.setIngredient('A', MaterialData.obsidian);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		//
		//
		recwoodchair = new SpoutItemStack(RegisterBlocks.woodchair, 1);
		recipe = new SpoutShapedRecipe(recwoodchair);
		recipe1 = new SpoutShapedRecipe(recwoodchair);
		recipe2 = new SpoutShapedRecipe(recwoodchair);
		recipe3 = new SpoutShapedRecipe(recwoodchair);
		recipe.shape("A  ", "AAA", "B B");
		recipe1.shape("A  ", "AAA", "B B");
		recipe2.shape("A  ", "AAA", "B B");
		recipe3.shape("A  ", "AAA", "B B");
		recipe.setIngredient('A', MaterialData.wood);
		recipe1.setIngredient('A', MaterialData.birchWood);
		recipe2.setIngredient('A', MaterialData.spruceWood);
		recipe3.setIngredient('A', MaterialData.jungleWood);
		recipe.setIngredient('B', MaterialData.stick);
		recipe1.setIngredient('B', MaterialData.stick);
		recipe2.setIngredient('B', MaterialData.stick);
		recipe3.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe1);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe3);
		
		recironchair = new SpoutItemStack(RegisterBlocks.ironchair, 1);
		recipe = new SpoutShapedRecipe(recironchair);
		recipe.shape("A  ", "AAA", "B B");
		recipe.setIngredient('A', MaterialData.ironIngot);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		recgoldchair = new SpoutItemStack(RegisterBlocks.goldchair, 1);
		recipe = new SpoutShapedRecipe(recgoldchair);
		recipe.shape("A  ", "AAA", "B B");
		recipe.setIngredient('A', MaterialData.goldIngot);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		//
		//
		recwoodthrone = new SpoutItemStack(RegisterBlocks.woodthrone, 1);
		recipe = new SpoutShapedRecipe(recwoodthrone);
		recipe1 = new SpoutShapedRecipe(recwoodthrone);
		recipe2 = new SpoutShapedRecipe(recwoodthrone);
		recipe3 = new SpoutShapedRecipe(recwoodthrone);
		recipe.shape("ABB", "AAA", "B B");
		recipe1.shape("ABB", "AAA", "B B");
		recipe2.shape("ABB", "AAA", "B B");
		recipe3.shape("ABB", "AAA", "B B");
		recipe.setIngredient('A', MaterialData.wood);
		recipe1.setIngredient('A', MaterialData.jungleWood);
		recipe2.setIngredient('A', MaterialData.spruceWood);
		recipe3.setIngredient('A', MaterialData.birchWood);
		recipe.setIngredient('B', MaterialData.stick);
		recipe1.setIngredient('B', MaterialData.stick);
		recipe2.setIngredient('B', MaterialData.stick);
		recipe3.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe1);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe3);
		
		recironthrone = new SpoutItemStack(RegisterBlocks.ironthrone, 1);
		recipe = new SpoutShapedRecipe(recironthrone);
		recipe.shape("ABB", "AAA", "B B");
		recipe.setIngredient('A', MaterialData.ironIngot);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		recgoldthrone = new SpoutItemStack(RegisterBlocks.goldthrone, 1);
		recipe = new SpoutShapedRecipe(recgoldthrone);
		recipe.shape("ABB", "AAA", "B B");
		recipe.setIngredient('A', MaterialData.goldIngot);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		recleatherthrone = new SpoutItemStack(RegisterBlocks.leatherthrone, 1);
		recipe = new SpoutShapedRecipe(recleatherthrone);
		recipe.shape("ABB", "AAA", "B B");
		recipe.setIngredient('A', MaterialData.leather);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		//
		//
		recwoodenbarstool = new SpoutItemStack(RegisterBlocks.woodenbarstool, 1);
		recipe = new SpoutShapedRecipe(recwoodenbarstool);
		recipe1 = new SpoutShapedRecipe(recwoodenbarstool);
		recipe2 = new SpoutShapedRecipe(recwoodenbarstool);
		recipe3 = new SpoutShapedRecipe(recwoodenbarstool);
		recipe.shape("AAA", " B ");
		recipe1.shape("AAA", " B ");
		recipe2.shape("AAA", " B ");
		recipe3.shape("AAA", " B ");
		recipe.setIngredient('A', MaterialData.wood);
		recipe1.setIngredient('A', MaterialData.spruceWood);
		recipe2.setIngredient('A', MaterialData.birchWood);
		recipe3.setIngredient('A', MaterialData.jungleWood);
		recipe.setIngredient('B', MaterialData.stick);
		recipe1.setIngredient('B', MaterialData.stick);
		recipe2.setIngredient('B', MaterialData.stick);
		recipe3.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe1);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe3);
		
		recstonebarstool = new SpoutItemStack(RegisterBlocks.stonebarstool, 1);
		recipe = new SpoutShapedRecipe(recstonebarstool);
		recipe.shape("AAA", " B ");
		recipe.setIngredient('A', MaterialData.stone);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		recwoodsimplechair = new SpoutItemStack(RegisterBlocks.woodsimplechair, 1);
		recipe = new SpoutShapedRecipe(recwoodsimplechair);
		recipe1 = new SpoutShapedRecipe(recwoodsimplechair);
		recipe2 = new SpoutShapedRecipe(recwoodsimplechair);
		recipe3 = new SpoutShapedRecipe(recwoodsimplechair);
		recipe.shape("AAA", " B ", "B B");
		recipe1.shape("AAA", " B ", "B B");
		recipe2.shape("AAA", " B ", "B B");
		recipe3.shape("AAA", " B ", "B B");
		recipe.setIngredient('A', MaterialData.wood);
		recipe1.setIngredient('A', MaterialData.spruceWood);
		recipe2.setIngredient('A', MaterialData.birchWood);
		recipe3.setIngredient('A', MaterialData.jungleWood);
		recipe.setIngredient('B', MaterialData.stick);
		recipe1.setIngredient('B', MaterialData.stick);
		recipe2.setIngredient('B', MaterialData.stick);
		recipe3.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe1);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe3);
		
		recstonesimplechair = new SpoutItemStack(RegisterBlocks.stonesimplechair, 1);
		recipe = new SpoutShapedRecipe(recstonesimplechair);
		recipe.shape("AAA", " B ", "B B");
		recipe.setIngredient('A', MaterialData.stone);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		recwoodsimpletable = new SpoutItemStack(RegisterBlocks.woodsimpletable, 1);
		recipe = new SpoutShapedRecipe(recwoodsimpletable);
		recipe1 = new SpoutShapedRecipe(recwoodsimpletable);
		recipe2 = new SpoutShapedRecipe(recwoodsimpletable);
		recipe3 = new SpoutShapedRecipe(recwoodsimpletable);
		recipe.shape("AAA", " B ");
		recipe1.shape("AAA", " B ");
		recipe2.shape("AAA", " B ");
		recipe3.shape("AAA", " B ");
		recipe.setIngredient('A', MaterialData.wood);
		recipe1.setIngredient('A', MaterialData.birchWood);
		recipe2.setIngredient('A', MaterialData.jungleWood);
		recipe3.setIngredient('A', MaterialData.spruceWood);
		recipe.setIngredient('B', MaterialData.fence);
		recipe1.setIngredient('B', MaterialData.fence);
		recipe2.setIngredient('B', MaterialData.fence);
		recipe3.setIngredient('B', MaterialData.fence);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe1);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe3);
		
		recstonesimpletable = new SpoutItemStack(RegisterBlocks.stonesimpletable, 1);
		recipe = new SpoutShapedRecipe(recstonesimpletable);
		recipe.shape("AAA", " B ", " B ");
		recipe.setIngredient('A', MaterialData.stone);
		recipe.setIngredient('B', MaterialData.stick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		//
		//
		recobsidianworktop = new SpoutItemStack(RegisterBlocks.obsidianworktop, 3);
		recipe = new SpoutShapedRecipe(recobsidianworktop);
		recipe1 = new SpoutShapedRecipe(recobsidianworktop);
		recipe2 = new SpoutShapedRecipe(recobsidianworktop);
		recipe3 = new SpoutShapedRecipe(recobsidianworktop);
		recipe.shape("AAA", "BBB");
		recipe1.shape("AAA", "BBB");
		recipe2.shape("AAA", "BBB");
		recipe3.shape("AAA", "BBB");
		recipe.setIngredient('A', MaterialData.obsidian);
		recipe1.setIngredient('A', MaterialData.obsidian);
		recipe2.setIngredient('A', MaterialData.obsidian);
		recipe3.setIngredient('A', MaterialData.obsidian);
		recipe.setIngredient('B', MaterialData.wood);
		recipe1.setIngredient('B', MaterialData.spruceWood);
		recipe2.setIngredient('B', MaterialData.birchWood);
		recipe3.setIngredient('B', MaterialData.jungleWood);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe1);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe3);
		
		recironworktop = new SpoutItemStack(RegisterBlocks.ironworktop, 3);
		recipe = new SpoutShapedRecipe(recironworktop);
		recipe1 = new SpoutShapedRecipe(recironworktop);
		recipe2 = new SpoutShapedRecipe(recironworktop);
		recipe3 = new SpoutShapedRecipe(recironworktop);
		recipe.shape("AAA", "BBB");
		recipe1.shape("AAA", "BBB");
		recipe2.shape("AAA", "BBB");
		recipe3.shape("AAA", "BBB");
		recipe.setIngredient('A', MaterialData.ironBlock);
		recipe1.setIngredient('A', MaterialData.ironBlock);
		recipe2.setIngredient('A', MaterialData.ironBlock);
		recipe3.setIngredient('A', MaterialData.ironBlock);
		recipe.setIngredient('B', MaterialData.wood);
		recipe1.setIngredient('B', MaterialData.spruceWood);
		recipe2.setIngredient('B', MaterialData.birchWood);
		recipe3.setIngredient('B', MaterialData.jungleWood);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe1);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe3);

		recgoldworktop = new SpoutItemStack(RegisterBlocks.goldworktop, 3);
		recipe = new SpoutShapedRecipe(recgoldworktop);
		recipe1 = new SpoutShapedRecipe(recgoldworktop);
		recipe2 = new SpoutShapedRecipe(recgoldworktop);
		recipe3 = new SpoutShapedRecipe(recgoldworktop);
		recipe.shape("AAA", "BBB");
		recipe1.shape("AAA", "BBB");
		recipe2.shape("AAA", "BBB");
		recipe3.shape("AAA", "BBB");
		recipe.setIngredient('A', MaterialData.goldBlock);
		recipe1.setIngredient('A', MaterialData.goldBlock);
		recipe2.setIngredient('A', MaterialData.goldBlock);
		recipe3.setIngredient('A', MaterialData.goldBlock);
		recipe.setIngredient('B', MaterialData.wood);
		recipe1.setIngredient('B', MaterialData.spruceWood);
		recipe2.setIngredient('B', MaterialData.birchWood);
		recipe3.setIngredient('B', MaterialData.jungleWood);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe1);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe3);
		
		recstoneworktop = new SpoutItemStack(RegisterBlocks.stoneworktop, 3);
		recipe = new SpoutShapedRecipe(recstoneworktop);
		recipe1 = new SpoutShapedRecipe(recstoneworktop);
		recipe2 = new SpoutShapedRecipe(recstoneworktop);
		recipe3 = new SpoutShapedRecipe(recstoneworktop);
		recipe.shape("AAA", "BBB");
		recipe1.shape("AAA", "BBB");
		recipe2.shape("AAA", "BBB");
		recipe3.shape("AAA", "BBB");
		recipe.setIngredient('A', MaterialData.stone);
		recipe1.setIngredient('A', MaterialData.stone);
		recipe2.setIngredient('A', MaterialData.stone);
		recipe3.setIngredient('A', MaterialData.stone);
		recipe.setIngredient('B', MaterialData.wood);
		recipe1.setIngredient('B', MaterialData.spruceWood);
		recipe2.setIngredient('B', MaterialData.birchWood);
		recipe3.setIngredient('B', MaterialData.jungleWood);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe1);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe3);
	
		reccraftingworktop = new SpoutItemStack(RegisterBlocks.craftingworktop, 3);
		recipe = new SpoutShapedRecipe(reccraftingworktop);
		recipe1 = new SpoutShapedRecipe(reccraftingworktop);
		recipe2 = new SpoutShapedRecipe(reccraftingworktop);
		recipe3 = new SpoutShapedRecipe(reccraftingworktop);
		recipe.shape("AAA", "BBB");
		recipe1.shape("AAA", "BBB");
		recipe2.shape("AAA", "BBB");
		recipe3.shape("AAA", "BBB");
		recipe.setIngredient('A', MaterialData.craftingTable);
		recipe1.setIngredient('A', MaterialData.craftingTable);
		recipe2.setIngredient('A', MaterialData.craftingTable);
		recipe3.setIngredient('A', MaterialData.craftingTable);
		recipe.setIngredient('B', MaterialData.wood);
		recipe1.setIngredient('B', MaterialData.spruceWood);
		recipe2.setIngredient('B', MaterialData.birchWood);
		recipe3.setIngredient('B', MaterialData.jungleWood);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe1);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe3);
		
		recwoodenworktop = new SpoutItemStack(RegisterBlocks.woodenworktop, 3);
		recipe = new SpoutShapedRecipe(recwoodenworktop);
		recipe1 = new SpoutShapedRecipe(recwoodenworktop);
		recipe2 = new SpoutShapedRecipe(recwoodenworktop);
		recipe3 = new SpoutShapedRecipe(recwoodenworktop);
		recipe.shape("AAA", "BBB");
		recipe1.shape("AAA", "BBB");
		recipe2.shape("AAA", "BBB");
		recipe3.shape("AAA", "BBB");
		recipe.setIngredient('A', MaterialData.log);
		recipe1.setIngredient('A', MaterialData.spruceLog);
		recipe2.setIngredient('A', MaterialData.birchLog);
		recipe3.setIngredient('A', MaterialData.jungleLog);
		recipe.setIngredient('B', MaterialData.wood);
		recipe1.setIngredient('B', MaterialData.spruceWood);
		recipe2.setIngredient('B', MaterialData.birchWood);
		recipe3.setIngredient('B', MaterialData.jungleWood);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe1);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe3);
		//
		//
		rectv = new SpoutItemStack(RegisterBlocks.tv, 1);
		recipe = new SpoutShapedRecipe(rectv);
		recipe.shape("AAA", "ABA", "ACA");
		recipe.setIngredient('A', MaterialData.ironIngot);
		recipe.setIngredient('B', MaterialData.paintings);
		recipe.setIngredient('C', MaterialData.redstone);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		recflowerbox = new SpoutItemStack(RegisterBlocks.flowerbox1N, 1);
		recipe = new SpoutShapedRecipe(recflowerbox);
		recipe.shape("AB", "CC");
		recipe.setIngredient('A', MaterialData.rose);
		recipe.setIngredient('B', MaterialData.dandelion);
		recipe.setIngredient('C', MaterialData.clayBrick);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		/*
		recblueflower = new SpoutItemStack(RegisterBlocks.blueflower);
		recipel = new SpoutShapelessRecipe(recblueflower);
		recipel.addIngredient(MaterialData.dandelion);
		recipel.addIngredient(MaterialData.lapisLazuli);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipel);
		
		recwhiterose = new SpoutItemStack(RegisterBlocks.whiterose);
		recipel = new SpoutShapelessRecipe(recwhiterose);
		recipel.addIngredient(MaterialData.rose);
		recipel.addIngredient(MaterialData.boneMeal);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipel);
		*/
		//
		//
		reclamp = new SpoutItemStack(RegisterBlocks.lamp, 2);
		recipe = new SpoutShapedRecipe(reclamp);
		recipe1 = new SpoutShapedRecipe(reclamp);
		recipe2 = new SpoutShapedRecipe(reclamp);
		recipe3 = new SpoutShapedRecipe(reclamp);
		recipe.shape(" A ", " B ", "BCB");
		recipe1.shape(" A ", " B ", "BCB");
		recipe2.shape(" A ", " B ", "BCB");
		recipe3.shape(" A ", " B ", "BCB");
		recipe.setIngredient('A', MaterialData.stick);
		recipe1.setIngredient('A', MaterialData.stick);
		recipe2.setIngredient('A', MaterialData.stick);
		recipe3.setIngredient('A', MaterialData.stick);
		recipe.setIngredient('B', MaterialData.log);
		recipe1.setIngredient('B', MaterialData.birchLog);
		recipe2.setIngredient('B', MaterialData.spruceLog);
		recipe3.setIngredient('B', MaterialData.jungleLog);
		recipe.setIngredient('C', MaterialData.torch);
		recipe1.setIngredient('C', MaterialData.torch);
		recipe2.setIngredient('C', MaterialData.torch);
		recipe3.setIngredient('C', MaterialData.torch);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe1);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe3);
		
		recneonlamp = new SpoutItemStack(RegisterBlocks.neonlamp, 2);
		recipe = new SpoutShapedRecipe(recneonlamp);
		recipe.shape("BAB", "BBB");
		recipe.setIngredient('A', MaterialData.torch);
		recipe.setIngredient('B', MaterialData.glass);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		recneonlampred = new SpoutItemStack(RegisterBlocks.neonlampred);
		recipel = new SpoutShapelessRecipe(recneonlampred);
		recipel.addIngredient(MaterialData.roseRed);
		recipel.addIngredient(RegisterBlocks.neonlamp);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipel);
		
		recneonlampblue = new SpoutItemStack(RegisterBlocks.neonlampblue);
		recipel = new SpoutShapelessRecipe(recneonlampblue);
		recipel.addIngredient(MaterialData.lapisLazuli);
		recipel.addIngredient(RegisterBlocks.neonlamp);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipel);
		
		recneonlampgreen = new SpoutItemStack(RegisterBlocks.neonlampgreen);
		recipel = new SpoutShapelessRecipe(recneonlampgreen);
		recipel.addIngredient(MaterialData.cactusGreen);
		recipel.addIngredient(RegisterBlocks.neonlamp);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipel);
		//
		//
		/*
		reccarpetblack = new SpoutItemStack(RegisterBlocks.carpetblack, 6);
		recipe = new SpoutShapedRecipe(reccarpetblack);
		recipe.shape("AAA");
		recipe.setIngredient('A', MaterialData.blackWool);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		
		reccarpetred = new SpoutItemStack(RegisterBlocks.carpetred, 6);
		recipe = new SpoutShapedRecipe(reccarpetred);
		recipe.shape("AAA");
		recipe.setIngredient('A', MaterialData.redWool);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		reccarpetdarkgreen = new SpoutItemStack(RegisterBlocks.carpetdarkgreen, 6);
		recipe = new SpoutShapedRecipe(reccarpetdarkgreen);
		recipe.shape("AAA");
		recipe.setIngredient('A', MaterialData.greenWool);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		reccarpetbrown = new SpoutItemStack(RegisterBlocks.carpetbrown, 6);
		recipe = new SpoutShapedRecipe(reccarpetbrown);
		recipe.shape("AAA");
		recipe.setIngredient('A', MaterialData.brownWool);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		reccarpetblue = new SpoutItemStack(RegisterBlocks.carpetblue, 6);
		recipe = new SpoutShapedRecipe(reccarpetblue);
		recipe.shape("AAA");
		recipe.setIngredient('A', MaterialData.blueWool);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		reccarpetpurple = new SpoutItemStack(RegisterBlocks.carpetpurple, 6);
		recipe = new SpoutShapedRecipe(reccarpetpurple);
		recipe.shape("AAA");
		recipe.setIngredient('A', MaterialData.purpleWool);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		reccarpetcyan = new SpoutItemStack(RegisterBlocks.carpetcyan, 6);
		recipe = new SpoutShapedRecipe(reccarpetcyan);
		recipe.shape("AAA");
		recipe.setIngredient('A', MaterialData.cyanWool);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		reccarpetlightgrey = new SpoutItemStack(RegisterBlocks.carpetlightgrey, 6);
		recipe = new SpoutShapedRecipe(reccarpetlightgrey);
		recipe.shape("AAA");
		recipe.setIngredient('A', MaterialData.lightGreyWool);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		reccarpetgrey = new SpoutItemStack(RegisterBlocks.carpetgrey, 6);
		recipe = new SpoutShapedRecipe(reccarpetgrey);
		recipe.shape("AAA");
		recipe.setIngredient('A', MaterialData.greyWool);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		reccarpetpink = new SpoutItemStack(RegisterBlocks.carpetpink, 6);
		recipe = new SpoutShapedRecipe(reccarpetpink);
		recipe.shape("AAA");
		recipe.setIngredient('A', MaterialData.pinkWool);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		reccarpetlightgreen = new SpoutItemStack(RegisterBlocks.carpetlightgreen, 6);
		recipe = new SpoutShapedRecipe(reccarpetlightgreen);
		recipe.shape("AAA");
		recipe.setIngredient('A', MaterialData.limeWool);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		reccarpetyellow = new SpoutItemStack(RegisterBlocks.carpetyellow, 6);
		recipe = new SpoutShapedRecipe(reccarpetyellow);
		recipe.shape("AAA");
		recipe.setIngredient('A', MaterialData.yellowWool);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		reccarpetlightblue = new SpoutItemStack(RegisterBlocks.carpetlightblue, 6);
		recipe = new SpoutShapedRecipe(reccarpetlightblue);
		recipe.shape("AAA");
		recipe.setIngredient('A', MaterialData.lightBlueWool);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		reccarpetmagenta = new SpoutItemStack(RegisterBlocks.carpetmagenta, 6);
		recipe = new SpoutShapedRecipe(reccarpetmagenta);
		recipe.shape("AAA");
		recipe.setIngredient('A', MaterialData.magentaWool);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		reccarpetorange = new SpoutItemStack(RegisterBlocks.carpetorange, 6);
		recipe = new SpoutShapedRecipe(reccarpetorange);
		recipe.shape("AAA");
		recipe.setIngredient('A', MaterialData.orangeWool);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		
		reccarpetwhite = new SpoutItemStack(RegisterBlocks.carpetwhite, 6);
		recipe = new SpoutShapedRecipe(reccarpetwhite);
		recipe.shape("AAA");
		recipe.setIngredient('A', MaterialData.whiteWool);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		*/
		
	}
}
