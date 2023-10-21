package me.sfclog.compassplaceholder.placeholder;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import me.sfclog.compassplaceholder.util.CalcUtil;
import me.sfclog.compassplaceholder.util.CompasUtil;
import org.bukkit.entity.Player;

public class CompassHolder extends PlaceholderExpansion {

    public String onPlaceholderRequest(Player p, String identifier) {
        if(p != null) {
            final float yaw = CalcUtil.calcYaw(p);
            return CompasUtil.getCompassDisplay(yaw);
        }
        return null;
    }
    /*
    The identifier, shouldn't contain any _ or %
     */
    public String getIdentifier() {
        return "compassplaceholder";
    }
    /*
     The author of the Placeholder
     This cannot be null
     */
    public String getAuthor() {
        return "SFC_Log";
    }
    /*
     Same with #getAuthor() but for versioon
     This cannot be null
     */
    public String getVersion() {
        return "CompassPlaceHolder";
    }


}

