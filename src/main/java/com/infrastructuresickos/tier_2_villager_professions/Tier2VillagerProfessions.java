package com.infrastructuresickos.tier_2_villager_professions;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Tier2VillagerProfessions.MOD_ID)
public class Tier2VillagerProfessions {
    public static final String MOD_ID = "tier_2_villager_professions";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public Tier2VillagerProfessions() {
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("Tier2VillagerProfessions initialized");
    }
}
