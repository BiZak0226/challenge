package kr.magpie.challenge;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class MainGUI implements Listener {
    private final Inventory inventory;

    public MainGUI() {
        this.inventory = Bukkit.createInventory(null, 6 * 9, "Main");
        ItemStack itemstack = new ItemStack(Material.IRON_SWORD);
        inventory.addItem(itemstack);
    }

    public void openMainGUI(Player player) {
        player.openInventory(inventory);
    }

    @EventHandler
    public void inClickedGUI(InventoryClickEvent event){
        if(event.getView().getTitle().equals("Main")){
            event.setCancelled(true);
        }
    }
}
