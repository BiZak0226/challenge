package kr.magpie.challenge;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerStatisticIncrementEvent;


public class Event implements Listener {
    @EventHandler
    public void increasePlayerStatistic(PlayerStatisticIncrementEvent event){
        Player player = event.getPlayer();

        player.sendMessage(event.getStatistic().getKey().toString());
        player.sendMessage(String.valueOf(event.getNewValue()));
    }

}
