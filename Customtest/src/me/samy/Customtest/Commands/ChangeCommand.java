package me.samy.Customtest.Commands;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.samy.Customtest.items.Diapers;
import net.md_5.bungee.api.ChatColor;

public class ChangeCommand implements CommandExecutor{

	
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args) {
		
		final  Map<UUID, Integer> DiaperList = new HashMap<UUID, Integer>();
		final  Map<UUID, Integer> PullupList = new HashMap<UUID, Integer>();
		final Map<UUID, Integer> ThickdiaperList = new HashMap<UUID, Integer>();
		final  Map<UUID, Integer> UndiesList = new HashMap<UUID, Integer>();
		final  Map<UUID, Integer> SleepyDiaperList = new HashMap<UUID, Integer>();
		
if(lable.equalsIgnoreCase("Change")) {
	
	Player player = (Player) sender;
	UUID UUID = player.getUniqueId();
			if (!(sender instanceof Player)) {
				sender.sendMessage(ChatColor.RED + "You Cannout do this!");
				return true;
			}
			if (sender instanceof Player) {
				if (args.length == 0 ) {
					
					ItemStack Item1 = new ItemStack(player.getInventory().getItemInMainHand());
					
					if (Item1.equals(Diapers.Diaper())) {
						
						DiaperList.put(UUID, 1);
						player.sendMessage(ChatColor.translateAlternateColorCodes('&',
								"You powder up and change yourself into a fresh Diaper"));
						
						
						
					}
					if (Item1.equals(Diapers.Pullup())) {
						
						PullupList.put(UUID, 1);
						player.sendMessage(ChatColor.translateAlternateColorCodes('&',
								"You powder up and change yourself into a fresh Diaper"));
					}
					if (Item1.equals(Diapers.Thickdiaper())) {
						
						ThickdiaperList.put(UUID, 1);
						player.sendMessage(ChatColor.translateAlternateColorCodes('&',
								"You powder up and change yourself into a fresh Diaper"));
					}
					if (Item1.equals(Diapers.Undies())) {
						
						UndiesList.put(UUID, 1);
						player.sendMessage(ChatColor.translateAlternateColorCodes('&',
								"Youchange yourself into fresh undies"));
					}
					if (Item1.equals(Diapers.SleepyDiaper())) {
						
						SleepyDiaperList.put(UUID, 1);
						player.sendMessage(ChatColor.translateAlternateColorCodes('&',
								"You powder up and change yourself into a fresh Diaper"));
						SleepyDiaperList.put(UUID, 1);
					}
					return true;
				}
				player.sendMessage(ChatColor.translateAlternateColorCodes('&',
						"You have powdered up " + args[0] + " and changed them into a fresh " + player.getInventory().getItemInMainHand()
						.getItemMeta().getDisplayName()));
				ItemStack Item2 = new ItemStack(player.getInventory().getItemInMainHand());
				if (Item2.equals(Diapers.Pullup())) {
					
					PullupList.put(UUID, 1);
					player.sendMessage(ChatColor.translateAlternateColorCodes('&',
							"You powder up and change yourself into a fresh Diaper"));
					
						
					}
				
				if (Item2.equals(Diapers.Thickdiaper())) {
					
					ThickdiaperList.put(UUID, 1);
					player.sendMessage(ChatColor.translateAlternateColorCodes('&',
							"You powder up and change yourself into a fresh Diaper"));
				}
				if (Item2.equals(Diapers.Undies())) {
					
					UndiesList.put(UUID, 1);
					player.sendMessage(ChatColor.translateAlternateColorCodes('&',
							"you changed " + args[0] + "into fresh undies."));
				}
				if (Item2.equals(Diapers.SleepyDiaper())) {
					
					SleepyDiaperList.put(UUID, 1);
					player.sendMessage(ChatColor.translateAlternateColorCodes('&',
							"You powder up and change yourself into a fresh Diaper"));
				}
				return true;
			}
			return false;
		
		
}
return false;
	}
}
