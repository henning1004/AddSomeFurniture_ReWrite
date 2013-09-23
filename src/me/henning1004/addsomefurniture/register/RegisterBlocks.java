package me.henning1004.addsomefurniture.register;

import me.henning1004.addsomefurniture.Main;
import me.henning1004.addsomefurniture.custom.Barstool;
import me.henning1004.addsomefurniture.custom.CoffeeTable;
import me.henning1004.addsomefurniture.custom.FlowerBox;
import me.henning1004.addsomefurniture.custom.Lamp;
import me.henning1004.addsomefurniture.custom.LampOn;
import me.henning1004.addsomefurniture.custom.NeonLamp;
import me.henning1004.addsomefurniture.custom.NeonLamp2;
import me.henning1004.addsomefurniture.custom.NeonLampOn;
import me.henning1004.addsomefurniture.custom.NeonLampOn2;
import me.henning1004.addsomefurniture.custom.PsychoChair;
import me.henning1004.addsomefurniture.custom.PsychoTable;
import me.henning1004.addsomefurniture.custom.PsychoThrone;
import me.henning1004.addsomefurniture.custom.QuestionMark;
import me.henning1004.addsomefurniture.custom.SimpleChair;
import me.henning1004.addsomefurniture.custom.SimpleTable;
import me.henning1004.addsomefurniture.custom.Tv;
import me.henning1004.addsomefurniture.custom.Worktop;

public class RegisterBlocks {
	
	public static Barstool woodenbarstool;
	public static Barstool stonebarstool;
	
	public static SimpleChair woodsimplechair;
	public static SimpleChair stonesimplechair;
	
	public static SimpleTable woodsimpletable;
	public static SimpleTable stonesimpletable;
	
	public static PsychoTable woodtable;
	public static PsychoTable irontable;
	public static PsychoTable goldtable;
	public static PsychoTable obsidiantable;
	public static PsychoTable stonetable;
	
	public static PsychoChair woodchair;
	public static PsychoChair ironchair;
	public static PsychoChair goldchair;

	public static PsychoThrone woodthrone;
	public static PsychoThrone ironthrone;
	public static PsychoThrone goldthrone;
	public static PsychoThrone leatherthrone;
	
	public static Tv tv;
	
	public static Worktop obsidianworktop;
	public static Worktop ironworktop;
	public static Worktop goldworktop;
	public static Worktop stoneworktop;
	public static Worktop craftingworktop;
	public static Worktop woodenworktop;
	
	public static Lamp lamp;
	public static LampOn lampon;
	
	public static NeonLamp neonlamp;
	public static NeonLampOn neonlampon;
	public static NeonLamp2 neonlamp2;
	public static NeonLampOn2 neonlampon2;
	public static NeonLamp neonlampred;
	public static NeonLampOn neonlamponred;
	public static NeonLamp2 neonlampred2;
	public static NeonLampOn2 neonlamponred2;
	public static NeonLamp neonlampblue;
	public static NeonLampOn neonlamponblue;
	public static NeonLamp2 neonlampblue2;
	public static NeonLampOn2 neonlamponblue2;
	public static NeonLamp neonlampgreen;
	public static NeonLampOn neonlampongreen;
	public static NeonLamp2 neonlampgreen2;
	public static NeonLampOn2 neonlampongreen2;

	public static FlowerBox flowerbox1N;
	public static FlowerBox flowerbox1S;
	public static FlowerBox flowerbox1W;
	public static FlowerBox flowerbox1E;
	
	public static QuestionMark qmark;
	
	public static CoffeeTable coffeetable;

	

	public static void registerBlocks (Main plugin) {
		
		woodtable = new PsychoTable(plugin, "WoodTable", new int[]{0,2,2,2,2,2});
		irontable = new PsychoTable(plugin, "IronTable", new int[]{16,17,18,0,0,0});
		goldtable = new PsychoTable(plugin, "GoldTable", new int[]{32,33,34,0,0,0});
		obsidiantable = new PsychoTable(plugin, "ObsidianTable", new int[]{80,81,82,0,0,0});
		stonetable = new PsychoTable(plugin, "StoneTable", new int[]{48,49,50,0,0,0});
		
		woodchair = new PsychoChair(plugin, "WoodChair", new int[]{0,1,2,3,4,5});
		ironchair = new PsychoChair(plugin, "IronChair", new int[]{16,17,18,19,20,21});
		goldchair = new PsychoChair(plugin, "GoldChair", new int[]{32,33,34,35,36,37});
		
		woodthrone = new PsychoThrone(plugin, "WoodThrone", new int[]{0,1,2,3,4,5});
		ironthrone = new PsychoThrone(plugin, "IronThrone", new int[]{16,17,18,19,20,21});
		goldthrone = new PsychoThrone(plugin, "GoldThrone", new int[]{32,33,34,35,36,37});		
		leatherthrone = new PsychoThrone(plugin, "LeatherThrone", new int[]{96,97,98,99,100,101});
		
		stonesimplechair = new SimpleChair(plugin, "Simple StoneChair", new int[] {48,49,50,0,0,0});
		woodsimplechair = new SimpleChair(plugin, "Simple WoodChair", new int[] {0,1,2,0,0,0});
		
		woodenbarstool = new Barstool(plugin, "WoodenBarstool", new int[]{0,1,2,0,0,0});
		stonebarstool = new Barstool(plugin, "StoneBarstool", new int[]{48,49,50,0,0,0});
		
		woodsimpletable = new SimpleTable(plugin, "Simple WoodTable", new int[] {0,2,2,0,0,0});
		stonesimpletable = new SimpleTable(plugin, "Simple StoneTable", new int[] {48,49,50,0,0,0});
		
		craftingworktop = new Worktop(plugin, "CraftingWorktop", new int[]{0,1,0,0,0,0});
		ironworktop = new Worktop(plugin, "IronWorktop", new int[]{16,17,0,0,0,0});
		goldworktop = new Worktop(plugin, "GoldWorktop", new int[]{32,33,0,0,0,0});
		stoneworktop = new Worktop(plugin, "StoneWorktop", new int[]{48,49,0,0,0,0});
		woodenworktop = new Worktop(plugin, "WoodenWorktop", new int[]{64,65,0,0,0,0});
		obsidianworktop = new Worktop(plugin, "ObsidianWorktop", new int[]{80,81,0,0,0,0});
		
		tv = new Tv(plugin, "Tv", new int[]{0,1,2,0,0,0});
		
		lamp = new Lamp(plugin, "Lamp", new int[]{16,17,18,0,0,0});
		lampon = new LampOn(plugin, "LampOn", new int[]{16,17,18,0,0,0});
		
		neonlamp = new NeonLamp(plugin, "Neon Lamp", new int[]{32,33,0,0,0,0});
		neonlampon = new NeonLampOn(plugin, "Neon Lamp.on", new int[]{32,33,0,0,0,0});
		neonlamp2 = new NeonLamp2(plugin, "Neon Lamp.", new int[]{32,33,0,0,0,0});
		neonlampon2 = new NeonLampOn2(plugin, "Neon Lamp.on.", new int[]{32,33,0,0,0,0});
		neonlampred = new NeonLamp(plugin, "Red Neon Lamp", new int[]{36,37,0,0,0,0});
		neonlamponred = new NeonLampOn(plugin, "Red Neon Lamp.on", new int[]{36,37,0,0,0,0});
		neonlampred2 = new NeonLamp2(plugin, "Red Neon Lamp.", new int[]{36,37,0,0,0,0});
		neonlamponred2 = new NeonLampOn2(plugin, "Red Neon Lamp.on.", new int[]{36,37,0,0,0,0});
		neonlampblue = new NeonLamp(plugin, "Blue Neon Lamp", new int[]{38,39,0,0,0,0});
		neonlamponblue = new NeonLampOn(plugin, "Blue Neon Lamp.on", new int[]{38,39,0,0,0,0});
		neonlampblue2 = new NeonLamp2(plugin, "Blue Neon Lamp.", new int[]{38,39,0,0,0,0});
		neonlamponblue2 = new NeonLampOn2(plugin, "Blue Neon Lamp.on.", new int[]{38,39,0,0,0,0});
		neonlampgreen = new NeonLamp(plugin, "Green Neon Lamp", new int[]{34,35,0,0,0,0});
		neonlampongreen = new NeonLampOn(plugin, "Green Neon Lamp.on", new int[]{34,35,0,0,0,0});
		neonlampgreen2 = new NeonLamp2(plugin, "Green Neon Lamp.", new int[]{34,35,0,0,0,0});
		neonlampongreen2 = new NeonLampOn2(plugin, "Green Neon Lamp.on.", new int[]{34,35,0,0,0,0});
		
		flowerbox1N = new FlowerBox(plugin, "Flower Box.n", new int[]{48,49,50,53,54,0}, "N");
		flowerbox1S = new FlowerBox(plugin, "Flower Box.s", new int[]{48,49,50,51,52,0}, "S");
		flowerbox1W = new FlowerBox(plugin, "Flower Box.w", new int[]{48,49,50,51,53,0}, "W");
		flowerbox1E = new FlowerBox(plugin, "Flower Box.e", new int[]{48,49,50,52,54,0}, "E");
		
		qmark = new QuestionMark(plugin, "Question mark", new int[]{65,65,64,64,64,64});
		
		coffeetable = new CoffeeTable(plugin, "CoffeeTable", new int[]{96,97,98,0,0,0});
		
		
		
	}
}
