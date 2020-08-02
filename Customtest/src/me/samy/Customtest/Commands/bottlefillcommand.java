package me.samy.Customtest.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.samy.Customtest.test;
import net.md_5.bungee.api.ChatColor;

public class bottlefillcommand implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args) {
		Player player = (Player) sender;
		if(lable.equalsIgnoreCase("//fill")) {
			if (args.length == 0) {
				sender.sendMessage(ChatColor.RED + "You use this command like this: [ ///fill coco, milk, water ]"
						+ " while holding a bottle");
			}
			if (!(sender instanceof Player)) {
				sender.sendMessage(ChatColor.RED + "Console cannot use this command!");
				return true;
			}
			if (!player.hasPermission("bottlefill.use")) {
				player.sendMessage(ChatColor.RED + "you do not have permission to use this command");
				return  true;
			}
			if (!player.getInventory().getItemInMainHand().getItemMeta().hasLore()) {
				if (!player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Pink Bottle"));
				player.sendMessage(ChatColor.RED + "You use this command like this: [ ///fill coco, milk, water ]"
						+ " while holding a bottle");
			}else {
				if (args[0].equalsIgnoreCase("coco")) {
						player.getInventory().setItemInMainHand(test.getEmptyPinkBottlecocoMilk());
					}
				if (args[0].equalsIgnoreCase("milk")) {
						player.getInventory().setItemInMainHand(test.getEmptyPinkBottleMilk());
					}
				if (args[0].equalsIgnoreCase("water")) {
						player.getInventory().setItemInMainHand(test.getPinkBottle());
				}
				if (args[0].equalsIgnoreCase("empty")) {
					player.getInventory().setItemInMainHand(test.getEmptyPinkBottle());
				}
				return true;
				}
			}
			return false;
		}
	}
