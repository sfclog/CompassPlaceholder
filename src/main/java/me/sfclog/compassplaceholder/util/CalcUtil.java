// 
// Decompiled by Procyon v0.5.36
// 

package me.sfclog.compassplaceholder.util;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class CalcUtil
{
    public static float calcYaw(final Player player) {
        final Location playerLoc = player.getLocation();
        float calcYaw = playerLoc.getYaw();
        if (calcYaw < 0.0f) {
            calcYaw += 360.0f;
        }
        return calcYaw;
    }
}
