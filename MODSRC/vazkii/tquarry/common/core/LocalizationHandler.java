/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the ThermalQuarry Mod.
 * 
 * ThermalQuarry is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 * 
 * File Created @ [Dec 28, 2013, 7:51:58 PM (GMT)]
 */
package vazkii.tquarry.common.core;

import cpw.mods.fml.common.registry.LanguageRegistry;

public final class LocalizationHandler {

	public static final String PREFIX_LANG = "/assets/tquarry/lang/";
	public static final String[] LANGS = new String[] {
		"en_US"
	};

	public static void loadLocalizations() {
		for(String locale : LANGS)
			LanguageRegistry.instance().loadLocalization(PREFIX_LANG + locale + ".lang", locale, false);
	}

}