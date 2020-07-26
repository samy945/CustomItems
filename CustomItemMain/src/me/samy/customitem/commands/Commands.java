package me.samy.customitem.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args) {
		Player player = (Player) sender;

			
		
		
		
		if (!player.hasPermission("getBottle.use")) {
			player.sendMessage(ChatColor.RED + "you do not have permission to use this command");
			return  true;
	}
		
		if (lable.equalsIgnoreCase("getBottle")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage(ChatColor.RED + "You cannot use this command!");
				return true;
	}	
			
			if (player.getInventory().firstEmpty() == -1) {
				
				Location loc = player.getLocation();
				World world = player.getWorld();
				
				world.dropItemNaturally(loc, me.samy.customitem.items.PinkBottle.getPinkBottle());
				player.sendMessage(ChatColor.GOLD + "You Got A Bottle But It Is On The Ground!");
				return true;
				
	}
			player.getInventory().addItem(me.samy.customitem.items.PinkBottle.getPinkBottle());
			player.sendMessage(ChatColor.GOLD + "You Got A Bottle");
			return true;
	}
		
		return false;
	} 
	
	
	
}
