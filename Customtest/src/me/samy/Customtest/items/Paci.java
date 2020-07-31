package me.samy.Customtest.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Paci {

	public static ItemStack PinkPaci() {
		
		ItemStack PinkPaci = new ItemStack(Material.CARROT_ON_A_STICK);
		ItemMeta meta = PinkPaci.getItemMeta();
		List<String> lore = new ArrayList<String>();
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Pink Paci");
		lore.add("");
		meta.setCustomModelData(1);
		meta.setLore(lore);	
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_DESTROYS);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
		meta.setUnbreakable(true);
		
		PinkPaci.setItemMeta(meta);
		return PinkPaci;
		
		
	}
	
	
}
