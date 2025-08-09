package net.bitbylogic.citizensScale.trait;

import net.citizensnpcs.api.persistence.Persist;
import net.citizensnpcs.api.trait.Trait;
import net.citizensnpcs.api.trait.TraitName;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.LivingEntity;

@TraitName("scale")
public class ScaleTrait extends Trait {

    @Persist private double scale = 1.0;

    protected ScaleTrait() {
        super("scale");
    }

    public double getScale() {
        return scale;
    }

    @Override
    public void run() {
        if(npc.isSpawned() && npc.getEntity() instanceof LivingEntity livingEntity) {
            livingEntity.getAttribute(Attribute.SCALE).setBaseValue(scale);
        }
    }

}
