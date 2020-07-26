package me.samy.customitem;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.samy.customitem.commands.Commands;
import me.samy.customitem.listners.Listener1;

public class CustomItemMain extends JavaPlugin{
	public static List<String> list = new ArrayList<String>(); 
	
	public static CustomItemMain plugin;
	@Override
	public void onEnable() {


        plugin = this;
        this.getServer().getPluginManager().registerEvents(new Listener1(), this);
		this.getCommand("getbottle").setExecutor(new Commands());
		Bukkit.addRecipe(me.samy.customitem.customres.PinkBotChockoMilkRes.Pinkcoco());
	
		
		
	}

	@Override
	public void onDisable() {

	}



}
