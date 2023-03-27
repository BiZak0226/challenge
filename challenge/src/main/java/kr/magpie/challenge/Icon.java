package kr.magpie.challenge;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Icon {
    ItemStack setIcon(Material icon, String name, String lore) {
        ItemStack itemstack = new ItemStack(icon);
        ItemMeta itemMeta = itemstack.getItemMeta(); // itemMeta 변수를 초기화
        List<String> itemLore = new ArrayList<>();

        itemMeta.setDisplayName(name);
        itemLore.add(lore);
        itemMeta.setLore(itemLore);
        itemstack.setItemMeta(itemMeta);

        return itemstack;
    }
    ItemStack setIcon(Material icon, String name) {
        ItemStack itemstack = new ItemStack(icon);
        ItemMeta itemMeta = itemstack.getItemMeta(); // itemMeta 변수를 초기화

        itemMeta.setDisplayName(name);
        itemstack.setItemMeta(itemMeta);

        return itemstack;
    }
    ItemStack setIcon(Material icon) {
        ItemStack itemstack = new ItemStack(icon);
        ItemMeta itemMeta = itemstack.getItemMeta(); // itemMeta 변수를 초기화

        itemMeta.setDisplayName(" ");
        itemstack.setItemMeta(itemMeta);

        return itemstack;
    }
}
