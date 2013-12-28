/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the ThermalQuarry Mod.
 * 
 * ThermalQuarry is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 * 
 * File Created @ [Dec 28, 2013, 6:44:33 PM (GMT)]
 */
package vazkii.tquarry.common.core;

import java.io.File;

import vazkii.tquarry.common.lib.LibIDs;
import vazkii.tquarry.common.lib.LibNames;
import net.minecraftforge.common.Configuration;

public final class ConfigHandler {

	public static Configuration config;
	
	public static void init(File file) {
		config = new Configuration(file);
		
		config.load();
		
		LibIDs.quarryBlockID = loadBlock(LibNames.BLOCK_QUARRY, LibIDs.quarryBlockID);
		
		config.save();
	}
	
	private static int loadItem(String label, int defaultID) {
		return config.getItem(label, defaultID).getInt(defaultID);
	}
	
	private static int loadBlock(String label, int defaultID) {
		return config.getBlock(label, defaultID).getInt(defaultID);
	}
}
