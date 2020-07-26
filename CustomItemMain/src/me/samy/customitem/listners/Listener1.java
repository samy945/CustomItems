package me.samy.customitem.listners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class Listener1 implements Listener {

	
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerItemConsume(PlayerItemConsumeEvent event) {
		if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasLore()){
			Player player = (Player) event.getPlayer();
			
			
			player.getInventory().remove(Material.GLASS_BOTTLE);
			player.updateInventory();
            ItemStack air = new ItemStack(Material.AIR);
            player.getInventory().setItemInMainHand(air);
			
			
			
	     }
	}
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerCowClickEvent(PlayerInteractEntityEvent event) {
		if (event.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.BOWL))
		if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasLore())
		if (event.getRightClicked() instanceof Cow) {
			
			Player player = (Player) event.getPlayer();
			

					player.getInventory().setItemInMainHand(me.samy.customitem.items.PinkBottle.getEmptyPinkBottleMilk());
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
						player.getInventory().contains(me.samy.customitem.items.PinkBottle.getEmptyPinkBottle());
							player.getInventory().setItemInMainHand(me.samy.customitem.items.PinkBottle.getPinkBottle());
							player.updateInventory();
							
					 }
				}
			}
				
			
	
				
			}
	@EventHandler(priority = EventPriority.LOWEST)
	public void onPlayerItemConsume2(PlayerItemConsumeEvent event) {
		if (event.getPlayer().getInventory().getItemInOffHand().getItemMeta().hasLore()){
			Player player = (Player) event.getPlayer();
			
			player.getInventory().remove(Material.GLASS_BOTTLE);
			player.updateInventory();	
			
	     }
	}
			
			@EventHandler(priority = EventPriority.LOWEST)
			public void onPlayerItemConsume1(PlayerItemConsumeEvent event) {
				if (event.getPlayer().getInventory().getItemInOffHand().getItemMeta().hasLore()){
					Player player = (Player) event.getPlayer();
					
					player.getInventory().remove(Material.GLASS_BOTTLE);
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
								player.getInventory().contains(me.samy.customitem.items.PinkBottle.getEmptyPinkBottle());
									player.getInventory().setItemInOffHand(me.samy.customitem.items.PinkBottle.getPinkBottle());
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
		                    event.getPlayer().getInventory().setItemInMainHand(new ItemStack(me.samy.customitem.items.PinkBottle.getEmptyPinkBottle()));
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
			                    event.getPlayer().getInventory().setItemInOffHand(new ItemStack(me.samy.customitem.items.PinkBottle.getEmptyPinkBottle()));
			                }
			            }, 1L);
			        }
			  }
}