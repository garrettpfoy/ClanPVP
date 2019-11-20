package org.edgegamers.picklez.main;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerEvent;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.plugin.SimplePlugin;

public class ClansPVP extends SimplePlugin {

    @Override
    public void onPluginStart() {
        getLogger().info("ClansPVP has successfully been enabled!");
        getLogger().info("Made by PickleZ");
    }

    @EventHandler
    public void onHit(final EntityDamageByEntityEvent event) {
        if(event.getEntity() instanceof Player && event.getDamager() instanceof Player) {
            Player whoWasHit = (Player) event.getEntity();
            Player whoHit = (Player) event.getDamager();

            if(whoWasHit.hasPermission("clanspvp.bypass")) {
                event.setCancelled(true);
                Common.tell(whoHit, "&c&lWhoops! &7That player can not be damaged by other players!");
            }
            else if(whoWasHit.hasPermission("clan.dwarf") && whoHit.hasPermission("clan.dwarf")) {
                event.setCancelled(true);
                Common.tell(whoHit, "&c&lWhoops! &7That player is in your clan!");
            }
            else if(whoWasHit.hasPermission("clan.reaper") && whoHit.hasPermission("clan.reaper")) {
                event.setCancelled(true);
                Common.tell(whoHit, "&c&lWhoops! &7That player is in your clan!");
            }
            else if(whoWasHit.hasPermission("clan.wizard") && whoHit.hasPermission("clan.wizard")) {
                event.setCancelled(true);
                Common.tell(whoHit, "&c&lWhoops! &7That player is in your clan!");
            }
        }
    }

}
