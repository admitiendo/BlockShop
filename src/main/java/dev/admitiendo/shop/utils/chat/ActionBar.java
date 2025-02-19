package dev.admitiendo.shop.utils.chat;

import net.minecraft.server.v1_8_R3.ChatComponentText;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class ActionBar {
    public static void sendActionBar(Player p, String message) {
        try {
            PacketPlayOutChat packet = new PacketPlayOutChat(new ChatComponentText(CC.translate(message)), (byte) 2);
            ((CraftPlayer) p).getHandle().playerConnection.sendPacket(packet);
        } catch (NoClassDefFoundError error) {
            CC.log("&c---------------------------");
            error.printStackTrace();
            CC.log("&c---------------------------");
        }
    }
}
