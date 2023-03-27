package kr.magpie.challenge;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class MainGUI implements Listener {
    private final Inventory inventory;

    public MainGUI() {
        this.inventory = Bukkit.createInventory(null, 6 * 9, "Main");
        /*
         *   □ □ □ □ □ □ □ □ □
         *   □ □ □ □ □ □ □ □ □
         *   □ □ □ □ □ □ □ □ □
         *   □ □ □ □ □ □ □ □ □
         *   □ □ □ □ □ □ □ □ □
         *   □ □ □ □ □ □ □ □ □
         * */
        Main.getPlugin(Main.class).getConfig().getString("");

        /* frame icon setitem */
        /*row*/
        for (int row = 0; row < 6; row++) {
            /*col*/
            for (int col = 0; col < 9; col++) {
                int slot = (row * 9) + col;
                /* 맨 윗줄과 5번째 줄 */
                if ((row == 0) || (row == 4 )){
                    inventory.setItem(slot, new Icon().setIcon(Material.BLACK_STAINED_GLASS_PANE));
                }else{
                    /* 좌우 사이드 */
                    if ( (slot % 9 == 0) || (slot % 9 == 8) ){
                        inventory.setItem(slot, new Icon().setIcon(Material.BLACK_STAINED_GLASS_PANE));
                    }
                }
            }
        }

        /* select icon item set */
        inventory.setItem(46, new Icon().setIcon(Material.PLAYER_HEAD, "§fInfo","§fInfo"));
        inventory.setItem(47, new Icon().setIcon(Material.GRASS_BLOCK, "§6Basic","§fBasic"));
        inventory.setItem(48, new Icon().setIcon(Material.IRON_SWORD, "§6Survival","§fSurvival"));
        inventory.setItem(49, new Icon().setIcon(Material.DIAMOND_SWORD, "§6Challenge","§fChallenge"));


    }

//    private ItemStack setIcon(Material icon, String name, String lore) {
//        ItemStack itemstack = new ItemStack(icon);
//        ItemMeta itemMeta = itemstack.getItemMeta(); // itemMeta 변수를 초기화
//        List<String> itemLore = new ArrayList<>();
//
//        itemMeta.setDisplayName(name);
//        itemLore.add(lore);
//        itemMeta.setLore(itemLore);
//        itemstack.setItemMeta(itemMeta);
//
//        return itemstack;
//    }

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
