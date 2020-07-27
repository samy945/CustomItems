package me.samy.Customtest.craft;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.Plugin;

import me.samy.Customtest.test;

public class cocomilkpink {

	
	 
	
	private static Plugin plugin = test.getPlugin(test.class);
	public static ShapelessRecipe Pinkcoco() {
		
		ShapelessRecipe Pinkcoco = new ShapelessRecipe(new NamespacedKey(plugin, "Pink Bottle"), test.getEmptyPinkBottlecocoMilk());
		Pinkcoco.addIngredient(test.getEmptyPinkBottleMilk().getData());
		Pinkcoco.addIngredient(Material.COCOA_BEANS);
		
		return Pinkcoco;
		
		
	}
	

}
