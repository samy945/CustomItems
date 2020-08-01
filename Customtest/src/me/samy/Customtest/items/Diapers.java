package me.samy.Customtest.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Diapers {

	
		public static ItemStack Diaper() {

	ItemStack Diaper = new ItemStack(Material.CARROT_ON_A_STICK);
	ItemMeta meta = Diaper.getItemMeta();
	meta.setDisplayName("Diaper");
	List<String> lore = new ArrayList<String>();
	lore.add("");
	meta.setCustomModelData(20);
	meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
	meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
	meta.addItemFlags(ItemFlag.HIDE_DESTROYS);
	meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
	meta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
	meta.setUnbreakable(true);
	
	Diaper.setItemMeta(meta);
	
	
	return Diaper;
			}
			
	
		public static ItemStack Pullup() {
	ItemStack Pullup = new ItemStack(Material.CARROT_ON_A_STICK);
	ItemMeta meta = Pullup.getItemMeta();
	meta.setDisplayName("Pullup");
	List<String> lore = new ArrayList<String>();
	lore.add("");
	meta.setCustomModelData(21);
	meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
	meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
	meta.addItemFlags(ItemFlag.HIDE_DESTROYS);
	meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
	meta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
	meta.setUnbreakable(true);
	
	Pullup.setItemMeta(meta);
	
	return Pullup;
		}
	
		public static ItemStack Thickdiaper() {
	ItemStack Thickdiaper = new ItemStack(Material.CARROT_ON_A_STICK);
	ItemMeta meta = Thickdiaper.getItemMeta();
	meta.setDisplayName("Thick Diaper");
	List<String> lore = new ArrayList<String>();
	lore.add("");
	meta.setCustomModelData(22);
	meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
	meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
	meta.addItemFlags(ItemFlag.HIDE_DESTROYS);
	meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
	meta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
	meta.setUnbreakable(true);
	
	Thickdiaper.setItemMeta(meta);	
	return Thickdiaper();
		
		
		}
	
		public static ItemStack Undies() {
	ItemStack Undies = new ItemStack(Material.CARROT_ON_A_STICK);
	ItemMeta meta = Undies.getItemMeta();
	meta.setDisplayName("Undies");
	List<String> lore = new ArrayList<String>();
	lore.add("");
	meta.setCustomModelData(23);
	meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
	meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
	meta.addItemFlags(ItemFlag.HIDE_DESTROYS);
	meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
	meta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
	meta.setUnbreakable(true);
	
	Undies.setItemMeta(meta);
	
	return Undies;
		}
	
		public static ItemStack SleepyDiaper() {
	ItemStack SleepyDiaper = new ItemStack(Material.CARROT_ON_A_STICK);
	ItemMeta meta = SleepyDiaper.getItemMeta();
	meta.setDisplayName("Sleepy Diaper");
	List<String> lore = new ArrayList<String>();
	lore.add("");
	meta.setCustomModelData(24);
	meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
	meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
	meta.addItemFlags(ItemFlag.HIDE_DESTROYS);
	meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
	meta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
	meta.setUnbreakable(true);
	
	SleepyDiaper.setItemMeta(meta);
	return SleepyDiaper;
		}
	
	
	
}
