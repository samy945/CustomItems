package me.samy.customitem.customres;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.Plugin;

import me.samy.customitem.CustomItemMain;

public class PinkBotChockoMilkRes implements Listener{
	

	private static Plugin plugin = CustomItemMain.getPlugin(CustomItemMain.class);

	
	public static ShapelessRecipe Pinkcoco() {
		   
		   
		   ItemStack item = me.samy.customitem.items.PinkBottle.getEmptyPinkBottlechocoMilk();
		   
		   NamespacedKey key = new NamespacedKey((plugin), ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Pink Bottle");
		   
		   ShapelessRecipe Pinkcoco = new ShapelessRecipe(key, item);
		   
		   Pinkcoco.addIngredient(Material.POTION);
		   Pinkcoco.addIngredient(Material.COCOA_BEANS);
		  
		   return Pinkcoco;
	
	}
	@EventHandler
    public void craft(CraftItemEvent e){
        if(e.getInventory() instanceof CraftingInventory){
        if(e.getRecipe().equals(Pinkcoco())){
            org.bukkit.inventory.ItemStack item = me.samy.customitem.items.PinkBottle.getEmptyPinkBottleMilk();
            if(item.hasItemMeta()){
                if(item.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Pink Bottle")){
                    //done.
                } else{
                    e.setCancelled(true);
                }
            } else {
                e.setCancelled(true);
            }
        }
    }
}
	
	
	

}
