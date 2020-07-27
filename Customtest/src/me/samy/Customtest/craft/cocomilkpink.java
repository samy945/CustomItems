package me.samy.Customtest.craft;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.Plugin;

import me.samy.Customtest.test;

public class cocomilkpink {

	private static Plugin plugin = test.getPlugin(test.class);
    public static ShapelessRecipe Pinkcoco() {
        ItemStack item = (ItemStack) test.getEmptyPinkBottlecocoMilk();//Custom Item

        NamespacedKey key = new NamespacedKey((plugin), "pink_bottle");
      
        ShapelessRecipe Pinkcoco = new ShapelessRecipe(key, item);
        
        Pinkcoco.addIngredient(test.getEmptyPinkBottleMilk().getData());//Cutsom Item
        Pinkcoco.addIngredient(Material.COCOA_BEANS);
        return Pinkcoco;
    	}
    
    
	}