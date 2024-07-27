package dev.admitiendo.shop.command;

import dev.admitiendo.shop.menu.ShopMenu;
import dev.admitiendo.shop.utils.commands.Command;
import dev.admitiendo.shop.utils.commands.CommandArgs;
import org.bukkit.entity.Player;

public class ShopCommand {

    @Command(name = "shop", aliases = {"blockshop"}, permission = "command.default.blockshop", inGameOnly = true)
    public void perform(CommandArgs args) {
        Player player = (Player) args.getSender();
        new ShopMenu().openMain(player);
    }
}
