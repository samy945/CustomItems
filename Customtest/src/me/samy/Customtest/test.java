package me.samy.Customtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import me.samy.Customtest.craft.cocomilkpink;

public class test extends JavaPlugin implements Listener  {
	public static List<String> list = new ArrayList<String>(); 
	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);
		Bukkit.addRecipe(cocomilkpink.Pinkcoco());
	}
	
	@Override
	public void onDisable() {
	}
	
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
				world.dropItemNaturally(loc, getPinkBottle());
				player.sendMessage(ChatColor.GOLD + "You Got A Bottle But It Is On The Ground!");
				return true;
	}
			player.getInventory().addItem(getPinkBottle());
			player.sendMessage(ChatColor.GOLD + "You Got A Bottle");
			return true;
	}
		
		return false;
	} 
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
		
		ItemStack PinkEmptyBottleMilk = new ItemStack(Material.MILK_BUCKET);
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
	public static ItemStack getEmptyPinkBottlecocoMilk() {
		
		ItemStack PinkEmptyBottlecocoMilk = new ItemStack(Material.POTION);
		ItemMeta meta = PinkEmptyBottlecocoMilk.getItemMeta();
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
		PinkEmptyBottlecocoMilk.setItemMeta(meta);
		return PinkEmptyBottlecocoMilk;
	}	
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerItemConsume(PlayerItemConsumeEvent event) {
		if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasLore()){
			Player player = (Player) event.getPlayer();
			player.getInventory().setItemInMainHand(getPinkBottle());
			player.updateInventory();
 	     }
	}
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerCowClickEvent(PlayerInteractEntityEvent event) {
		if (event.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.BOWL))
		if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasLore())
		if (event.getRightClicked() instanceof Cow) {
			
			Player player = (Player) event.getPlayer();	
					player.getInventory().setItemInMainHand(getEmptyPinkBottleMilk());
					player.updateInventory();		
	     }
	}
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onClick(PlayerInteractEvent event) {
		if (event.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.BOWL))
			if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasLore()) {
				Player player = (Player) event.getPlayer();
				
				if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
					 if(event.getClickedBlock().getRelative(event.getBlockFace()).getType() == Material.WATER) {
						player.getInventory().contains(getEmptyPinkBottle());
						player.getInventory().setItemInMainHand(getPinkBottle());
						player.updateInventory();
					 }
				}
			}
		}
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerItemConsume2(PlayerItemConsumeEvent event) {
		if (event.getPlayer().getInventory().getItemInOffHand().getItemMeta().hasLore()){
			Player player = (Player) event.getPlayer();
			player.getInventory().remove(Material.GLASS_BOTTLE);
			player.getInventory().setItemInOffHand(getEmptyPinkBottle());
			player.updateInventory();	
	     }
	}
			@EventHandler(priority = EventPriority.HIGHEST)
			public void onClick1(PlayerInteractEvent event) {
				if (event.getPlayer().getInventory().getItemInOffHand().getType().equals(Material.BOWL))
					if (event.getPlayer().getInventory().getItemInOffHand().getItemMeta().hasLore()) {
						Player player = (Player) event.getPlayer();
						
						if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
							 if(event.getClickedBlock().getRelative(event.getBlockFace()).getType() == Material.WATER) {
								player.getInventory().contains(getEmptyPinkBottle());
									player.getInventory().setItemInOffHand(getPinkBottle());
									player.updateInventory();
						}
					}	
				}
			}
			@EventHandler
		    public void onConsume(PlayerItemConsumeEvent event) {
		        if (event.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.POTION))
		        if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasLore()) {
		        	Bukkit.getServer().getScheduler().runTaskLaterAsynchronously((Plugin) this, (Runnable)new Runnable() {
		                @Override
		                public void run() {
		                    event.getPlayer().getInventory().setItemInMainHand(new ItemStack(getEmptyPinkBottle()));
		                }
		            }, 1L);
		        }
			}
				@EventHandler
			    public void onConsume1(PlayerItemConsumeEvent event) {
			        if (event.getPlayer().getInventory().getItemInOffHand().getType().equals(Material.POTION))
			        if (event.getPlayer().getInventory().getItemInOffHand().getItemMeta().hasLore()){
			        	Bukkit.getServer().getScheduler().runTaskLaterAsynchronously((Plugin) this, (Runnable)new Runnable() {
			                @Override
			                public void run() {
			                    event.getPlayer().getInventory().setItemInOffHand(new ItemStack(getEmptyPinkBottle()));
			                }
			            }, 1L);
			        }
			  }
				@EventHandler
			    public void onConsume2(PlayerItemConsumeEvent event) {
			        if (event.getPlayer().getInventory().getItemInOffHand().getType().equals(Material.MILK_BUCKET))
			        if (event.getPlayer().getInventory().getItemInOffHand().getItemMeta().hasLore()){
			        	Bukkit.getServer().getScheduler().runTaskLaterAsynchronously((Plugin) this, (Runnable)new Runnable() {
			                @Override
			                public void run() {
			                    event.getPlayer().getInventory().setItemInOffHand(new ItemStack(getEmptyPinkBottle()));
			                }
			            }, 1L);
			        }
			  }
				@EventHandler
			    public void onConsume3(PlayerItemConsumeEvent event) {
			        if (event.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.MILK_BUCKET))
			        if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasLore()) {
			        	Bukkit.getServer().getScheduler().runTaskLaterAsynchronously((Plugin) this, (Runnable)new Runnable() {
			                @Override
			                public void run() {
			                    event.getPlayer().getInventory().setItemInMainHand(new ItemStack(getEmptyPinkBottle()));
			                }
			            }, 1L);
			        }
				}
                
                @EventHandler
                public void onCraft(CraftItemEvent event) {
                    if (event.getRecipe().getResult().isSimilar(cocomilkpink.Pinkcoco().getResult())) {
                        Player player = (Player) event.getWhoClicked();
                        new BukkitRunnable() {
                            @Override
                            public void run() {
                                InventoryView inv = player.getOpenInventory();
                                for (int slot : Arrays.asList(1,2,3,4,5,6,7,8,9)) {
                                    if (inv.getItem(slot).isSimilar(new ItemStack(Material.BUCKET)))
                                        inv.setItem(slot, null);
                                }
                            }
                        }.runTaskLater(this, 0L);
                    }
                }
}

			
			
				
				
				
				
				

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
