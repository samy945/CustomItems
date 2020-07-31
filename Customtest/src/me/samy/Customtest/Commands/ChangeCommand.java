package me.samy.Customtest.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.samy.Customtest.items.Diapers;
import net.md_5.bungee.api.ChatColor;

public class ChangeCommand implements CommandExecutor{

	
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args) {
if(lable.equalsIgnoreCase("Change")) {
			
	Player player = (Player) sender;
			
			if (!(sender instanceof Player)) {
				sender.sendMessage(ChatColor.RED + "You Cannout do this!");
				return true;
			}
			if (sender instanceof Player) {
				if (args.length == 0 ) {
					player.sendMessage(ChatColor.translateAlternateColorCodes('&',
							"You powder up and change yourself into a fresh " + player.getInventory().getItemInMainHand()
									.getItemMeta().getDisplayName()));
					ItemStack Item1 = new ItemStack(player.getInventory().getItemInMainHand());
					if (Item1.equals(Diapers.Diaper())) {
						
						
						
					}
					if (Item1.equals(Diapers.Pullup())) {
						
						
					}
					if (Item1.equals(Diapers.Thickdiaper())) {
						
						
					}
					if (Item1.equals(Diapers.Undies())) {
						
						
					}
					if (Item1.equals(Diapers.SleepyDiaper())) {
						
						
						
					}
					return true;
				}
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',
						"You have powdered up " + args[0] + " and changed them into a fresh " + player.getInventory().getItemInMainHand()
						.getItemMeta().getDisplayName()));
				ItemStack Item2 = new ItemStack(player.getInventory().getItemInMainHand());
				if (Item2.equals(Diapers.Diaper())) {
					
					
					
				}
				if (Item2.equals(Diapers.Pullup())) {
					
					
				}
				if (Item2.equals(Diapers.Thickdiaper())) {
					
					
				}
				if (Item2.equals(Diapers.Undies())) {
					
					
				}
				if (Item2.equals(Diapers.SleepyDiaper())) {
					
					
					
				}
				return true;
			}
			return false;
		
		
}
return false;
	}
}
