package me.samy.customitem.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PinkBottle {

	public static ItemStack getPinkBottle() {
		
		ItemStack PinkBottle = new ItemStack(Material.POTION);
		ItemMeta meta = PinkBottle.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Pink Bottle");
		

		meta.setCustomModelData(11);
		List<String> lore = new ArrayList<String>();
		lore.add("");
		meta.setLore(lore);	
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_DESTROYS);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_PLACED_ON);

		PinkBottle.setItemMeta(meta);
		return PinkBottle;
	}

	


	public static ItemStack getEmptyPinkBottle() {
		
		ItemStack PinkEmptyBottle = new ItemStack(Material.BOWL);
		ItemMeta meta = PinkEmptyBottle.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Pink Bottle");
		List<String> lore = new ArrayList<String>();
		lore.add("");
		meta.setCustomModelData(11);
		meta.setLore(lore);	
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_DESTROYS);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
		meta.setUnbreakable(true);
		
		
		PinkEmptyBottle.setItemMeta(meta);
		
		return PinkEmptyBottle;
	}
	public static ItemStack getEmptyPinkBottleMilk() {
		
		ItemStack PinkEmptyBottleMilk = new ItemStack(Material.POTION);
		ItemMeta meta = PinkEmptyBottleMilk.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Pink Bottle");
		List<String> lore = new ArrayList<String>();
		lore.add("");
		meta.setCustomModelData(12);
		meta.setLore(lore);	
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_DESTROYS);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
		meta.setUnbreakable(true);
		
		
		PinkEmptyBottleMilk.setItemMeta(meta);
		
		return PinkEmptyBottleMilk;
	}
	public static ItemStack getEmptyPinkBottlechocoMilk() {
		
		ItemStack PinkEmptyBottleMilk = new ItemStack(Material.POTION);
		ItemMeta meta = PinkEmptyBottleMilk.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Pink Bottle");
		List<String> lore = new ArrayList<String>();
		lore.add("");
		meta.setCustomModelData(13);
		meta.setLore(lore);	
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_DESTROYS);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
		meta.setUnbreakable(true);
		
		
		PinkEmptyBottleMilk.setItemMeta(meta);
		
		return PinkEmptyBottleMilk;
	}
	
	
	
	
}
