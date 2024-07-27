package dev.admitiendo.shop;

import dev.admitiendo.shop.command.ShopCommand;
import dev.admitiendo.shop.menu.ShopMenu;
import dev.admitiendo.shop.utils.chat.CC;
import dev.admitiendo.shop.utils.commands.Command;
import dev.admitiendo.shop.utils.commands.CommandArgs;
import dev.admitiendo.shop.utils.commands.CommandFramework;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class SShop extends JavaPlugin {

    @Override
    public void onEnable() {
        CC.log("&e" + CC.normalLine());
        CC.log("&cShop &7| &eHas been enabled");
        CC.log("&e" + CC.normalLine());

        CommandFramework framework = new CommandFramework(this);
        framework.registerCommands(new ShopCommand());
    }

    @Override
    public void onDisable() {
        CC.log("&e" + CC.normalLine());
        CC.log("&cShop &7| &cHas been disabled");
        CC.log("&e" + CC.normalLine());
    }

    public static SShop getShop() {
        return getPlugin(SShop.class);
    }
}
