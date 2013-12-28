/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the ThermalQuarry Mod.
 * 
 * ThermalQuarry is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 * 
 * File Created @ [Dec 28, 2013, 6:27:38 PM (GMT)]
 */
package vazkii.tquarry.common;

import net.minecraft.block.Block;
import vazkii.tquarry.common.block.BlockQuarry;
import vazkii.tquarry.common.block.TileQuarry;
import vazkii.tquarry.common.core.ConfigHandler;
import vazkii.tquarry.common.core.GuiHandler;
import vazkii.tquarry.common.lib.LibIDs;
import vazkii.tquarry.common.lib.LibMisc;
import vazkii.tquarry.common.lib.LibNames;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = LibMisc.MOD_ID, name = LibMisc.MOD_NAME, version = LibMisc.MOD_VERSION, dependencies = LibMisc.DEPENDENCIES)
@NetworkMod(clientSideRequired = true)
public class ThermalQuarry {
	
	@Instance(LibMisc.MOD_ID)
	public static ThermalQuarry instance;
	
	public static Block quarry;
	
	@EventHandler
	public void onPreInit(FMLPreInitializationEvent event) {
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		
		quarry = new BlockQuarry(LibIDs.quarryBlockID).setUnlocalizedName(LibNames.BLOCK_QUARRY);
		
		GameRegistry.registerBlock(quarry, LibNames.BLOCK_QUARRY);
		GameRegistry.registerTileEntity(TileQuarry.class, LibNames.BLOCK_QUARRY);
		
		NetworkRegistry.instance().registerGuiHandler(this, new GuiHandler());
	}

}
