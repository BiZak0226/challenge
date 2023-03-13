package kr.magpie.challenge;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Command implements CommandExecutor {

    private final MainGUI mainGUI;

    public Command() {
        this.mainGUI = new MainGUI();
    }

    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String s, String[] args) {
        /* 플레이어가 아니라면 중단 */
        if (!(sender instanceof Player)){
            return true;
        }
        /* 플레이어(인게임)라면 계속 진행 */
        Player player = ((Player) sender).getPlayer();
        if (args.length == 1 && args[0].equals("open")) {
            /* 메인 GUI 오픈*/
            mainGUI.openMainGUI(player);
//            Inventory inventory = Bukkit.createInventory(null, 6 * 9, "Main");
//            ItemStack itemstack = new ItemStack(Material.IRON_SWORD);
//            inventory.addItem(itemstack);
//
//            player.openInventory(inventory);
            return true;
        }

        return false;
    }
}
