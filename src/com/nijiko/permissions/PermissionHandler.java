package com.nijiko.permissions;

import org.bukkit.entity.Player;

import com.nijikokun.bukkit.Permissions.Permissions;

public class PermissionHandler{
	Permissions p;
	public PermissionHandler(Permissions p){
		this.p=p;
	}
	public boolean permission(Player player, String permission){
		return p.permission(player, permission);
	}
	public boolean has(Player player, String permission) {
		return p.permission(player, permission);
	}
	public boolean inGroup(String name,String group){
		return p.inGroup(name,group);
	}
	public boolean inGroup(String world,String name,String group){
		return p.inGroup(name,group);
	}
}