package com.andyoctopus.yzljcbans;

import java.util.*;

final class BanTemplates {
    private static final Map<String, BanTemplate> TEMPLATES = new HashMap<>();

    static {
        register("cheating", "Cheating", Arrays.asList(
                "&cYou are temporarily banned for &f%DURATION% &cfrom this server!",
                "&7",
                "&7Reason: &r&fCheating through the use of unfair game advantages.",
                "&7Find out more: &b&nhttps://www.hypixel.net/appeal",
                "&7",
                "&7Ban ID: &f#%banid%",
                "&7Sharing your Ban ID may affect the processing of your appeal!"
        ));

        register("cheating_backforward", "Cheating_Backforward", Arrays.asList(
                "&cYou are permanently banned from this server!",
                "&7",
                "&7Reason: &r&fCheating through the use of unfair game advantages.",
                "&7Find out more: &b&nhttps://www.hypixel.net/appeal",
                "&7",
                "&7Ban ID: &f#%banid%",
                "&7Sharing your Ban ID may affect the processing of your appeal!"
        ));

        register("chatban", "Chatban", Arrays.asList(
                "&cYou are temporarily banned for &f%DURATION% &cfrom this server!",
                "&7",
                "&7Reason: &r&fExtreme Chat Infraction",
                "&7Find out more: &b&nhttps://www.hypixel.net/appeal",
                "&7",
                "&7Ban ID: &f#%banid%",
                "&7Sharing your Ban ID may affect the processing of your appeal!"
        ));

        register("badname", "Badname", Arrays.asList(
                "&cYou are currently blocked from joining this server!",
                "&7",
                "&7Reason: &r&fYour username, %REASON%, is not allowed on the server and is breaking our rules.",
                "&cFind out more: &bhttps://www.hypixel.net/rules",
                "&7",
                "&cPlease change your Minecraft username before trying to join again.",
                "&cIf you believe your name has been falsely blocked, contact &bhttps://www.hypixel.net/appeal"
        ));

        register("wipeban", "Wipeban", Arrays.asList(
                "&cYou are temporarily banned for &f%DURATION% &cfrom this server!",
                "&7",
                "&7Reason: &r&fBoosting detected on one or multiple SkyBlock profiles.",
                "&7Find out more: &b&nhttps://www.hypixel.net/appeal",
                "&7",
                "&7Ban ID: &f#%banid%",
                "&7Sharing your Ban ID may affect the processing of your appeal!"
        ));

        register("bug", "Bug", Arrays.asList(
                "&cYou are temporarily banned for &f%DURATION% &cfrom this server!",
                "&7",
                "&7Reason: &r&fExploiting a bug or issue within the server and using it to your advantage.",
                "&7Find out more: &b&nhttps://www.hypixel.net/appeal",
                "&7",
                "&7Ban ID: &f#%banid%",
                "&7Sharing your Ban ID may affect the processing of your appeal!"
        ));

        register("security", "Security", Arrays.asList(
                "&cYour account has been blocked.",
                "&7",
                "&7Reason: &r&fSuspicious activity has been detected on your account.",
                "&7Find out more: &b&nhttps://www.hypixel.net/security-block",
                "&7",
                "&7Ban ID: &f#%banid%",
                "&7Sharing your Ban ID may affect the processing of your appeal!"
        ));

        register("security_old", "Security_old", Arrays.asList(
                "&cYou are permanently banned from this server!",
                "&7",
                "&7Reason: &r&fYour account has a security alert, please secure it and contact appeals.",
                "&7Find out more: &b&nhttps://www.hypixel.net/appeal",
                "&7",
                "&7Ban ID: &f#%banid%",
                "&7Sharing your Ban ID may affect the processing of your appeal!"
        ));

        register("security_accept", "Security_accept", Arrays.asList(
                "&cYour account is temporarily blocked for &f%DURATION% &cfrom this server!",
                "&7",
                "&7Reason: &r&fYour accounts security appeal was processed and the account has entered a recovery phase and will be able to access the server again afterwards.",
                "&7Find out more: &b&nhttps://www.hypixel.net/security-block",
                "&7",
                "&7Ban ID: &f#%banid%",
                "&7Sharing your Ban ID may affect the processing of your appeal!"
        ));

        register("badbuilding", "Badbuilding", Arrays.asList(
                "&cYou are temporarily banned for &f%DURATION% &cfrom this server!",
                "&7",
                "&7Reason: &r&fCreating a build or drawing which is not appropriate on the server.",
                "&7Find out more: &b&nhttps://www.hypixel.net/appeal",
                "&7",
                "&7Ban ID: &f#%banid%",
                "&7Sharing your Ban ID may affect the processing of your appeal!"
        ));

        register("watchdogban", "Watchdogban", Arrays.asList(
                "&cYou are temporarily banned for &f%DURATION% &cfrom this server!",
                "&7",
                "&7Reason: &r&fWATCHDOG CHEAT DETECTION &7&o[AB-328572]",
                "&7Find out more: &b&nhttps://www.hypixel.net/appeal",
                "&7",
                "&7Ban ID: &f#%banid%",
                "&7Sharing your Ban ID may affect the processing of your appeal!"
        ));

        register("negative_behaviour", "Negative_Behaviour", Arrays.asList(
                "&cYou are temporarily banned for &f%DURATION% &cfrom this server!",
                "&7",
                "&7Reason: &r&fExtreme Negative Behaviour[F]",
                "&7Find out more: &b&nhttps://www.hypixel.net/appeal",
                "&7",
                "&7Ban ID: &f#%banid%",
                "&7Sharing your Ban ID may affect the processing of your appeal!"
        ));

        register("chargeback", "Chargeback", Arrays.asList(
                "&cYou are permanently banned from this server!",
                "&7",
                "&7Reason: &r&fChargeback: for more info and appeal, pleace visit support.hypixel.net.",
                "&7Find out more: &b&nhttps://www.hypixel.net/appeal",
                "&7",
                "&7Ban ID: &f#%banid%",
                "&7Sharing your Ban ID may affect the processing of your appeal!"
        ));

        register("cross_teaming", "Cross_teaming", Arrays.asList(
                "&cYou are temporarily banned for &f%DURATION% &cfrom this server!",
                "&7",
                "&7Reason: &r&fCross teaming with an enemy team or player.",
                "&7Find out more: &b&nhttps://www.hypixel.net/appeal",
                "&7",
                "&7Ban ID: &f#%banid%",
                "&7Sharing your Ban ID may affect the processing of your appeal!"
        ));

        register("ytban", "YtBan", Arrays.asList(
                "&cYou are permanently banned from this server!",
                "&7",
                "&7Reason: &r&fPlease contact creators@hypixel.net for assistance.",
                "&7",
                "&7Ban ID: &f#%banid%",
                "&7Sharing your Ban ID may affect the processing of your appeal!"
        ));

        register("fraud", "Fraud", Arrays.asList(
                "&cYou are permanently banned from this server!",
                "&7",
                "&7Reason: &r&fFraud: Please visit support.hypixel.net for clarifications or questions.",
                "&7Find out more: &b&nhttps://www.hypixel.net/appeal",
                "&7",
                "&7Ban ID: &f#%banid%",
                "&7Sharing your Ban ID may affect the processing of your appeal!"
        ));

        register("badskin", "BadSkin", Arrays.asList(
                "&cYou are temporarily banned for &f%DURATION% &cfrom this server!",
                "&7",
                "&7Reason: &r&fUsing inappropriate skins or capes on the server.",
                "&7Find out more: &b&nhttps://www.hypixel.net/appeal",
                "&7",
                "&7Ban ID: &f#%banid%",
                "&7Sharing your Ban ID may affect the processing of your appeal!"
        ));

        register("2015staffban", "2015staffban", Arrays.asList(
                "You are banned until 2015-03-15 10:09 AM MST Appeal at http://hypixel.net",
                "Reason: [trolling staff members] [pp]"
        ));

        register("acc_del", "acc_del", Arrays.asList(
                "&cYou are permanently banned from this server!",
                "&7",
                "&7Reason: &r&fUpon request, data for this user has been deleted.",
                "&7Find out more: &b&nhttps://support.hypixel.net",
                "&7",
                "&7Ban ID: &f#%banid%",
                "&7Sharing your Ban ID may affect the processing of your appeal!"
        ));

        register("minemen", "minemen", Arrays.asList(
                "&c&lBANNED FOR 30 DAYS",
                "&cReason: &dUnfair advantages",
                "&7Appeal at minemen.club/support"
        ));

        register("syuu", "syuu", Arrays.asList(
                "&3Your account has been suspended from syuu.net / あなたのアカウントはsyuu.netにおいて停止されています",
                "&3Reason: Unfair advantages",
                "&3Expire in: %DURATION%",
                "&9If you believe this is an error, appeal at forum.syuu.net",
                "&9もしこれが間違いだと思うなら, forum.syuu.netで異議申し建てができます。"
        ));

        register("wihar", "wihar", Arrays.asList(
                "&cYour account is temporarily banned from Wihar.",
                "&cThis punishment expires in &e%DURATION%&c.",
                "",
                "&cIf you feel this punishment is unjust, you may appeal at:",
                "&eQQ Group 934912511 or Bilibili @Wihar"
        ));

        register("coldpvp", "coldpvp", Arrays.asList(
                "&fYour account has been &4banned &ffrom &bColdNetwork&f. This ban expires in %DURATION%.",
                "&fYou can purchase an unban on our store.",
                "&6store.coldnetwork.net",
                "",
                "&7Ban Information",
                "&7» &fStaff: &bConsole",
                "&7» &fDate: &b%DATE%",
                "&7» &fReason: &b%REASON%"
        ));

        register("cn_hypixel", "cn_hypixel", Arrays.asList(
                "&c你已被从此服务器永久封禁！",
                "",
                "&7原因: &f你的账号有安全警报，请进行保护并申诉。",
                "&7了解更多: &b&nhttps://goo.gl/i662gC",
                "",
                "&7封禁ID: &f#%banid%",
                "&7Sharing your Ban ID may affect the porcessing of your appeal!"
        ));

        register("domcer", "domcer", Arrays.asList(
                "&b&lDoMCer &7&l>> &c您的账号被此服务器封禁 永久",
                "",
                "&c原因 &8>> &f使用第三方软件, 破坏游戏平衡",
                "&c封禁时间 &8>> &f%DATE%",
                "&c编号 &8>> &f封禁 #%ID%",
                "",
                "&7官方QQ群: &b831286573 806672968 1135114519",
                "&7误封申诉请到论坛: &f&nhttp://mc.netease.com/thread-613666-1-1.html",
                "&7封禁列表: &fwyban.domcer.com"
        ));

        register("bujidao", "bujidao", Arrays.asList(
                "&c%REASON% 您因 &e&l作弊 &c已被封禁 30 天.",
                "",
                "&f封禁时间: &7%DATE%",
                "&7剩余时间: &a30 天",
                "&7如有疑问，误封可前往256666201联系管理申诉！"
        ));

        register("bujidao_new", "bujidao_new", Arrays.asList(
                "&c%REASON% 您因 &e&l作弊 &c已被封禁 30 天.",
                "",
                "&7封禁时间: &f%DATE%",
                "&7剩余时间: &a30 天&7(封禁时间不代表违规时间)",
                "&7如果疑问，可重新连接进行申诉!"
        ));

        register("mmc_old", "MMC_OLD", Arrays.asList(
                "&cYou are permanently banned from Minemen Club.",
                "&cYou were banned for: &7Unfair advantages",
                "&7If you feel this ban is unjustified, fill out a support ticket at https://minemen.club/appeal.",
                "&6You may also purchase an unban at https://store.minemen.club."
        ));

        register("omygod", "omygod", Arrays.asList(
                "&c此账号已被禁止登录到服务器。&8%ID%",
                "",
                "&7详细信息: &f您因使用第三方破坏游戏环境而被封禁,如有疑问请前往官方群申诉!",
                "",
                "&7此封禁是永久性的,无法自动解除。",
                "&7若您认为封禁有误请截图发至管理申诉",
                "&c↓↓↓交流群号↓↓↓",
                "&c678715061"
        ));

        register("bmc", "bmc", Arrays.asList(
                "&cYou are banned from &a&lBlocks&e&lMC &cnetwork",
                "&cReason: &6Hacking",
                "&cYour ban ends in &4%DURATION%",
                "&aTo appeal, please go to &eappeal.blocksmc.com"
        ));

        register("wynn", "wynn", Arrays.asList(
                "&cKicked whilst connecting to WC32: &bYou have been banned",
                "&4Reason: &cUse of hacked client",
                "&3Appeal at &6https://wynncraft.com/appeals"
        ));

        register("lunar", "lunar", Arrays.asList(
                "&cYour account has been permanently suspended from &3Lunar Network&c.",
                "",
                "&fBanned on: &b%DATE%",
                "&fReason: &c%REASON%",
                "",
                "&fIf you wish to appeal this punishment, visit &b&nlunar.gg/appeal"
        ));

        register("syuu_new", "syuu_new", Arrays.asList(
                "&fBanned: Unfair advantages",
                "&fもう一度ログインすることで、処罰内容を確認することができます。",
                "&fYou can check your punishment by login again."
        ));

        register("pvpgym", "pvpgym", Arrays.asList(
                "&cYou have been banned from PvPGym",
                "",
                "Reason: Automatic Cheat Detection",
                "Remaining: forever"
        ));

        register("cubecraft", "cubecraft", Arrays.asList(
                "&4&lTemporarily Bannned!",
                "",
                "&cYou have been banned from &9CubeCraft &cfor:",
                "&6Unfair Advantage (Sentinel Automatic Cheat Detection)",
                "",
                "&7Your ban will expire in:",
                "&c%DURATION%",
                "",
                "&3You can appeal this ban at:",
                "&bappeal.cubecraft.net",
                "&3using the appeal code:",
                "&d%ID%"
        ));

        register("ghostly", "ghostly", Arrays.asList(
                "&cYou are temporarily banned for &4%DURATION% &cfrom the Ghostly Network.",
                "",
                "&7Reason: &f%REASON%",
                "",
                "&8Unfairly banned? &7You can appeal your punishment by submitting a ticket at &fdiscord.gg/ghostly&7.",
                "",
                "You can appeal your punishment at discord.gg/pvpgym"
        ));

        register("kkc", "kkc", Arrays.asList(
                "&7你被 &bSafeDog &c反作弊封禁 &f59 分钟 ！",
                "",
                "&f你是被 &dSafeDog &f处理的第%ID%个人",
                "",
                "&7玩家名称: &f%REASON%",
                "&7封禁原因: &fSafeDog / poxFLqU",
                "&7封禁执行人: &fSafeDog",
                "",
                "&7解封方法: &e&n 申诉解封/自助解封 ",
                "",
                "&7如果你认为该封禁有问题,",
                "&7请将此界面截图到官方反馈群",
                "",
                "&f玩家申诉群: &e1043804334",
                "&f玩家申诉群: &a714090379",
                "&f玩家交流群: &b386380003",
                "",
                "&7处罚编号: &f#Sd-%ID%",
                "&7封禁累计数: &f1",
                "",
                "&f如多次误判封禁请更换客户端",
                "&f请勿使用 &cBoat.Soar.CMC.LabyMod &f等视觉客户端",
                "&f过高的版本也可能造成不必要的误封!",
                "",
                "&f推荐使用&b1.8.8&f版本游玩本服!",
                "",
                "&f自助解封KOOK邀请",
                "&e&nhttps://kook.vip/fUqw0C"
        ));

        register("mineberry", "mineberry", Arrays.asList(
                "&cYou are IP banned from this server!",
                "",
                "&fReason: &c%REASON%",
                "&fBanned on: &c%DATE%",
                "&fBanned by: &c&lAntiCheat",
                "&fExpires in: &c&l%DURATION%.",
                "",
                "&fBan ID: &c%banid%",
                "&7Next ban would be longer."
        ));

        register("bjd_security", "bjd_security", Arrays.asList(
                "&c%REASON% 您因 &e&l不安全的账户 &c已被封禁 永久.",
                "",
                "&7封禁时间: &f%DATE%",
                "&4&l永久封禁",
                "&7如有疑问，可&c重新连接&7进行申诉!"
        ));
    }

    private static void register(String key, String name, List<String> lines) {
        TEMPLATES.put(key.toLowerCase(Locale.ROOT), new BanTemplate(name, lines));
    }

    static BanTemplate get(String key) {
        return TEMPLATES.get(key.toLowerCase(Locale.ROOT));
    }

    static List<String> getKeys() {
        List<String> keys = new ArrayList<>(TEMPLATES.keySet());
        Collections.sort(keys);
        return keys;
    }

    private BanTemplates() {
    }
}

