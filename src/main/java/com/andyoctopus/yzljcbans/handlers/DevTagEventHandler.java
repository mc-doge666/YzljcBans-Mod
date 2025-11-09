/**
 二创用户可以给开发者留点颜面吗QAQ
 二创用户可以给开发者留点颜面吗QAQ
 二创用户可以给开发者留点颜面吗QAQ */

package com.andyoctopus.yzljcbans.handlers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SideOnly(Side.CLIENT)
public class DevTagEventHandler {
    private static final Set<String> DEV_USERNAMES = new HashSet<>(Arrays.asList("AndyOctopus", "CuteGirlLjc"));
    private final String DEV_PREFIX_FORMATTED = EnumChatFormatting.DARK_PURPLE + "[Dev] ";

    @SubscribeEvent
    public void onNameFormat(PlayerEvent.NameFormat event) {
        if (DEV_USERNAMES.contains(event.username)) {
            event.displayname = DEV_PREFIX_FORMATTED + EnumChatFormatting.RESET + event.displayname;
        }
    }

    @SubscribeEvent
    public void onRenderPlayerList(RenderGameOverlayEvent.Pre event) {
        if (event.type == RenderGameOverlayEvent.ElementType.PLAYER_LIST) {
            if (Minecraft.getMinecraft().getNetHandler() != null) {
                for (NetworkPlayerInfo playerInfo : Minecraft.getMinecraft().getNetHandler().getPlayerInfoMap()) {
                    String username = playerInfo.getGameProfile().getName();

                    if (DEV_USERNAMES.contains(username)) {
                        IChatComponent currentDisplayName = playerInfo.getDisplayName();
                        String formattedName = currentDisplayName != null ? currentDisplayName.getFormattedText() : "";

                        if (!formattedName.startsWith(DEV_PREFIX_FORMATTED)) {
                            ChatComponentText newDisplayName = new ChatComponentText(DEV_PREFIX_FORMATTED);

                            if (currentDisplayName != null) {
                                newDisplayName.appendSibling(currentDisplayName);
                            } else {
                                newDisplayName.appendSibling(new ChatComponentText(username));
                            }
                            playerInfo.setDisplayName(newDisplayName);
                        }
                    }
                }
            }
        }
    }
}