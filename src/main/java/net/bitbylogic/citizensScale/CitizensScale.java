package net.bitbylogic.citizensScale;

import net.bitbylogic.citizensScale.trait.ScaleTrait;
import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.trait.TraitInfo;
import org.bukkit.plugin.java.JavaPlugin;

public final class CitizensScale extends JavaPlugin {

    @Override
    public void onEnable() {
        CitizensAPI.getTraitFactory().registerTrait(TraitInfo.create(ScaleTrait.class));
    }

}
