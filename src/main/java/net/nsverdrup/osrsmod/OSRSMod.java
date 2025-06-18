package net.nsverdrup.osrsmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.nsverdrup.osrsmod.block.ModBlocks;
import net.nsverdrup.osrsmod.item.ModItemGroups;
import net.nsverdrup.osrsmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// not a very important comment, can be deleted
public class OSRSMod implements ModInitializer {
	public static final String MOD_ID = "osrsmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 600);
	}
}