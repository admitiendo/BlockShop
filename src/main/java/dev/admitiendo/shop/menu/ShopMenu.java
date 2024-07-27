package dev.admitiendo.shop.menu;

import dev.admitiendo.shop.SShop;
import dev.admitiendo.shop.utils.chat.CC;
import dev.admitiendo.shop.utils.menus.InventoryGui;
import dev.admitiendo.shop.utils.menus.StaticGuiElement;
import dev.admitiendo.shop.utils.player.Skull;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("deprecation")
public class ShopMenu {

    private final ItemStack blank = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 6);
    private final String backValue = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWQwYTE0MjA4NDRjZTIzN2E0NWQyZTdlNTQ0ZDEzNTg0MWU5ZjgyZDA5ZTIwMzI2N2NmODg5NmM4NTE1ZTM2MCJ9fX0=";

    public void openMain(Player player) {
        String[] set = {
                "b   C   b",
                "b  G L  b",
                "b   M   b"
        };

        InventoryGui inv = new InventoryGui(SShop.getShop(), CC.translate("&cTienda"), set);

        inv.addElement(new StaticGuiElement('b', blank));

        inv.addElement(new StaticGuiElement('G', new ItemStack(Material.GLASS), click -> {
            inv.close();
            openGlass(player);
            return true;
        }));

        inv.addElement(new StaticGuiElement('C', new ItemStack(Material.STAINED_CLAY), click -> {
            inv.close();
            openClay(player);
            return true;
        }));

        inv.addElement(new StaticGuiElement('L', new ItemStack(Material.WOOL), click -> {
            inv.close();
            openWool(player);
            return true;
        }));

        inv.addElement(new StaticGuiElement('M', new ItemStack(Material.WOOD), click -> {
            inv.close();
            openWood(player);
            return true;
        }));

        inv.show(player);
    }

    public void openGlass(Player player) {
        String[] set = {
                "b twomu b",
                "bjylNphxb",
                "b vibkq s"
        };

        InventoryGui inv = new InventoryGui(SShop.getShop(), CC.translate("&cTienda"), set);

        inv.addElement(new StaticGuiElement('b', blank));

        inv.addElement(new StaticGuiElement('s', Skull.getSkullFromGameprofile(backValue, CC.translate("&cVolver."), Arrays.asList("", "")), click -> {
            inv.close();
            openMain(player);
            return true;
        }));

        inv.addElement(new StaticGuiElement('w', new ItemStack(Material.STAINED_GLASS), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_GLASS, 32));
            return true;
        }));

        inv.addElement(new StaticGuiElement('o', new ItemStack(Material.STAINED_GLASS, 1, (short) 1), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_GLASS, 32, (short) 1));
            return true;
        }));

        inv.addElement(new StaticGuiElement('m', new ItemStack(Material.STAINED_GLASS, 1, (short) 2), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_GLASS, 32, (short) 2));
            return true;
        }));

        inv.addElement(new StaticGuiElement('l', new ItemStack(Material.STAINED_GLASS, 1, (short) 3), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_GLASS, 32, (short) 3));
            return true;
        }));

        inv.addElement(new StaticGuiElement('y', new ItemStack(Material.STAINED_GLASS, 1, (short) 4), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_GLASS, 32, (short) 4));
            return true;
        }));

        inv.addElement(new StaticGuiElement('h', new ItemStack(Material.STAINED_GLASS, 1, (short) 5), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_GLASS, 32, (short) 5));
            return true;
        }));

        inv.addElement(new StaticGuiElement('b', new ItemStack(Material.STAINED_GLASS, 1, (short) 6), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_GLASS, 32, (short) 6));
            return true;
        }));

        inv.addElement(new StaticGuiElement('u', new ItemStack(Material.STAINED_GLASS, 1, (short) 7), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_GLASS, 32, (short) 7));
            return true;
        }));

        inv.addElement(new StaticGuiElement('t', new ItemStack(Material.STAINED_GLASS, 1, (short) 8), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_GLASS, 32, (short) 8));
            return true;
        }));

        inv.addElement(new StaticGuiElement('x', new ItemStack(Material.STAINED_GLASS, 1, (short) 9), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_GLASS, 32, (short) 9));
            return true;
        }));


        inv.addElement(new StaticGuiElement('p', new ItemStack(Material.STAINED_GLASS, 1, (short) 10), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_GLASS, 32, (short) 10));
            return true;
        }));

        inv.addElement(new StaticGuiElement('g', new ItemStack(Material.STAINED_GLASS, 1, (short) 11), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_GLASS, 32, (short) 11));
            return true;
        }));

        inv.addElement(new StaticGuiElement('i', new ItemStack(Material.STAINED_GLASS, 1, (short) 12), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_GLASS, 32, (short) 12));
            return true;
        }));

        inv.addElement(new StaticGuiElement('v', new ItemStack(Material.STAINED_GLASS, 1, (short) 13), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_GLASS, 32, (short) 13));
            return true;
        }));

        inv.addElement(new StaticGuiElement('k', new ItemStack(Material.STAINED_GLASS, 1, (short) 14), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_GLASS, 32, (short) 14));
            return true;
        }));

        inv.addElement(new StaticGuiElement('j', new ItemStack(Material.STAINED_GLASS, 1, (short) 15), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_GLASS, 32, (short) 15));
            return true;
        }));

        inv.addElement(new StaticGuiElement('N', new ItemStack(Material.GLASS), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.GLASS, 32));
            return true;
        }));

        inv.show(player);
    }

    public void openClay(Player player) {
        String[] set = {
                "b twomu b",
                "bjylNphxb",
                "b vibkq s"
        };

        InventoryGui inv = new InventoryGui(SShop.getShop(), CC.translate("&cTienda"), set);

        inv.addElement(new StaticGuiElement('b', blank));

        inv.addElement(new StaticGuiElement('s', Skull.getSkullFromGameprofile(backValue, CC.translate("&cVolver."), Arrays.asList("", "")), click -> {
            inv.close();
            openMain(player);
            return true;
        }));

        inv.addElement(new StaticGuiElement('w', new ItemStack(Material.STAINED_CLAY), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_CLAY, 32));
            return true;
        }));

        inv.addElement(new StaticGuiElement('o', new ItemStack(Material.STAINED_CLAY, 1, (short) 1), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_CLAY, 32, (short) 1));
            return true;
        }));

        inv.addElement(new StaticGuiElement('m', new ItemStack(Material.STAINED_CLAY, 1, (short) 2), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_CLAY, 32, (short) 2));
            return true;
        }));

        inv.addElement(new StaticGuiElement('l', new ItemStack(Material.STAINED_CLAY, 1, (short) 3), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_CLAY, 32, (short) 3));
            return true;
        }));

        inv.addElement(new StaticGuiElement('y', new ItemStack(Material.STAINED_CLAY, 1, (short) 4), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_CLAY, 32, (short) 4));
            return true;
        }));

        inv.addElement(new StaticGuiElement('h', new ItemStack(Material.STAINED_CLAY, 1, (short) 5), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_CLAY, 32, (short) 5));
            return true;
        }));

        inv.addElement(new StaticGuiElement('b', new ItemStack(Material.STAINED_CLAY, 1, (short) 6), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_CLAY, 32, (short) 6));
            return true;
        }));

        inv.addElement(new StaticGuiElement('u', new ItemStack(Material.STAINED_CLAY, 1, (short) 7), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_CLAY, 32, (short) 7));
            return true;
        }));

        inv.addElement(new StaticGuiElement('t', new ItemStack(Material.STAINED_CLAY, 1, (short) 8), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_CLAY, 32, (short) 8));
            return true;
        }));

        inv.addElement(new StaticGuiElement('x', new ItemStack(Material.STAINED_CLAY, 1, (short) 9), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_CLAY, 32, (short) 9));
            return true;
        }));


        inv.addElement(new StaticGuiElement('p', new ItemStack(Material.STAINED_CLAY, 1, (short) 10), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_CLAY, 32, (short) 10));
            return true;
        }));

        inv.addElement(new StaticGuiElement('g', new ItemStack(Material.STAINED_CLAY, 1, (short) 11), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_CLAY, 32, (short) 11));
            return true;
        }));

        inv.addElement(new StaticGuiElement('i', new ItemStack(Material.STAINED_CLAY, 1, (short) 12), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_CLAY, 32, (short) 12));
            return true;
        }));

        inv.addElement(new StaticGuiElement('v', new ItemStack(Material.STAINED_CLAY, 1, (short) 13), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_CLAY, 32, (short) 13));
            return true;
        }));

        inv.addElement(new StaticGuiElement('k', new ItemStack(Material.STAINED_CLAY, 1, (short) 14), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_CLAY, 32, (short) 14));
            return true;
        }));

        inv.addElement(new StaticGuiElement('j', new ItemStack(Material.STAINED_CLAY, 1, (short) 15), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.STAINED_CLAY, 32, (short) 15));
            return true;
        }));

        inv.addElement(new StaticGuiElement('N', new ItemStack(Material.CLAY), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.CLAY, 32));
            return true;
        }));

        inv.show(player);
    }

    public void openWool(Player player) {
        String[] set = {
                "b twomu b",
                "bjylNphxb",
                "b vibkq s"
        };

        InventoryGui inv = new InventoryGui(SShop.getShop(), CC.translate("&cTienda"), set);

        inv.addElement(new StaticGuiElement('b', blank));

        inv.addElement(new StaticGuiElement('w', new ItemStack(Material.WOOL), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.WOOL, 32));
            return true;
        }));

        inv.addElement(new StaticGuiElement('s', Skull.getSkullFromGameprofile(backValue, CC.translate("&cVolver."), Arrays.asList("", "")), click -> {
            inv.close();
            openMain(player);
            return true;
        }));

        inv.addElement(new StaticGuiElement('o', new ItemStack(Material.WOOL, 1, (short) 1), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.WOOL, 32, (short) 1));
            return true;
        }));

        inv.addElement(new StaticGuiElement('m', new ItemStack(Material.WOOL, 1, (short) 2), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.WOOL, 32, (short) 2));
            return true;
        }));

        inv.addElement(new StaticGuiElement('l', new ItemStack(Material.WOOL, 1, (short) 3), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.WOOL, 32, (short) 3));
            return true;
        }));

        inv.addElement(new StaticGuiElement('y', new ItemStack(Material.WOOL, 1, (short) 4), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.WOOL, 32, (short) 4));
            return true;
        }));

        inv.addElement(new StaticGuiElement('h', new ItemStack(Material.WOOL, 1, (short) 5), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.WOOL, 32, (short) 5));
            return true;
        }));

        inv.addElement(new StaticGuiElement('b', new ItemStack(Material.WOOL, 1, (short) 6), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.WOOL, 32, (short) 6));
            return true;
        }));

        inv.addElement(new StaticGuiElement('u', new ItemStack(Material.WOOL, 1, (short) 7), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.WOOL, 32, (short) 7));
            return true;
        }));

        inv.addElement(new StaticGuiElement('t', new ItemStack(Material.WOOL, 1, (short) 8), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.WOOL, 32, (short) 8));
            return true;
        }));

        inv.addElement(new StaticGuiElement('x', new ItemStack(Material.WOOL, 1, (short) 9), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.WOOL, 32, (short) 9));
            return true;
        }));


        inv.addElement(new StaticGuiElement('p', new ItemStack(Material.WOOL, 1, (short) 10), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.WOOL, 32, (short) 10));
            return true;
        }));

        inv.addElement(new StaticGuiElement('g', new ItemStack(Material.WOOL, 1, (short) 11), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.WOOL, 32, (short) 11));
            return true;
        }));

        inv.addElement(new StaticGuiElement('i', new ItemStack(Material.WOOL, 1, (short) 12), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.WOOL, 32, (short) 12));
            return true;
        }));

        inv.addElement(new StaticGuiElement('v', new ItemStack(Material.WOOL, 1, (short) 13), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.WOOL, 32, (short) 13));
            return true;
        }));

        inv.addElement(new StaticGuiElement('k', new ItemStack(Material.WOOL, 1, (short) 14), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.WOOL, 32, (short) 14));
            return true;
        }));

        inv.addElement(new StaticGuiElement('j', new ItemStack(Material.WOOL, 1, (short) 15), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.WOOL, 32, (short) 15));
            return true;
        }));

        inv.show(player);
    }

    public void openWood(Player player) {
        String[] set = {
                "bb o s bb",
                "b  j d  b",
                "bb b a  s"
        };

        InventoryGui inv = new InventoryGui(SShop.getShop(), CC.translate("&cTienda"), set);

        inv.addElement(new StaticGuiElement('b', blank));

        inv.addElement(new StaticGuiElement('o', new ItemStack(Material.WOOD), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.WOOD, 32));
            return true;
        }));

        inv.addElement(new StaticGuiElement('s', new ItemStack(Material.WOOD, 1, (short) 1), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.WOOD, 32, (short) 1));
            return true;
        }));

        inv.addElement(new StaticGuiElement('b', new ItemStack(Material.WOOD, 1, (short) 2), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.WOOD, 32, (short) 2));
            return true;
        }));

        inv.addElement(new StaticGuiElement('j', new ItemStack(Material.WOOD, 1, (short) 3), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(Material.WOOD, 32, (short) 3));
            return true;
        }));

        inv.addElement(new StaticGuiElement('a', new ItemStack(162, 1), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(162, 32));
            return true;
        }));

        inv.addElement(new StaticGuiElement('a', new ItemStack(162, 1, (short) 1), click -> {
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 1, 2);
            player.getInventory().addItem(new ItemStack(162, 32, (short) 1));
            return true;
        }));

        inv.show(player);
    }
}
