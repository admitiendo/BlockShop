package dev.admitiendo.shop.utils.player;

import lombok.experimental.*;
import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.inventory.*;

import java.io.*;
import java.net.*;

@UtilityClass
public class PlayerUtil {

    public int getPing(Player player) {
        try {
            String a = Bukkit.getServer().getClass().getPackage().getName().substring(23);
            Class<?> b = Class.forName("org.bukkit.craftbukkit." + a + ".entity.CraftPlayer");
            Object c = b.getMethod("getHandle").invoke(player);
            return (int) c.getClass().getDeclaredField("ping").get(c);
        } catch (Exception e) {
            return 0;
        }
    }

    public String getCountry(String IP) {
        URL url;
        BufferedReader in;
        String country = "";

        try {
            url = new URL("http://ip-api.com/json/" + IP + "?fields=country");
            in = new BufferedReader(new InputStreamReader(url.openStream()));
            country = in.readLine().trim();
            if (country.length() <= 0)
                try {
                    InetAddress ip = InetAddress.getLocalHost();
                    System.out.println(ip.getHostAddress().trim());
                    country = ip.getHostAddress().trim();
                } catch (Exception exp) {
                    country = "Not Found";
                }
        } catch (Exception ignored) {
        }
        return country
                .replace("{", "")
                .replace("}", "")
                .replace("\"\"", "")
                .replace(":", "");
    }

    public boolean isInventoryFull(Player player) {
        return player.getInventory().firstEmpty() < 0;
    }

    public void decrement(Player player, ItemStack itemStack, boolean sound, boolean cursor) {
        if (sound) player.playSound(player.getLocation(), Sound.ANVIL_BREAK, 1F, 1F);

        if (itemStack.getAmount() <= 1) {
            if (cursor) player.setItemOnCursor(null);
            else player.setItemInHand(null);
        } else itemStack.setAmount(itemStack.getAmount() - 1);

        player.updateInventory();
    }
}
