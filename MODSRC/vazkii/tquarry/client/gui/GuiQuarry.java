/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the ThermalQuarry Mod.
 * 
 * ThermalQuarry is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 * 
 * File Created @ [Dec 28, 2013, 7:21:07 PM (GMT)]
 */
package vazkii.tquarry.client.gui;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.StatCollector;
import thermalexpansion.gui.client.machine.GuiCharger;
import vazkii.tquarry.common.ThermalQuarry;
import cofh.core.CoFHProps;
import cofh.gui.element.TabBase;
import cofh.gui.element.TabInfo;
import cofh.gui.element.TabTutorial;
import cpw.mods.fml.relauncher.ReflectionHelper;

public class GuiQuarry extends GuiCharger {

	public GuiQuarry(InventoryPlayer inventory, TileEntity theTile) {
		super(inventory, theTile);
		name = ThermalQuarry.quarry.getLocalizedName();
	}
	
	@Override
	public void initGui() {
		super.initGui();
		
		for(TabBase tab : tabs)
			if(tab instanceof TabInfo) {
				ReflectionHelper.setPrivateValue(TabInfo.class, (TabInfo) tab, "Digs a hole in the ground, a fairly large one, even.", "myInfo");
				tab.maxHeight -= 35;
			} else if(tab instanceof TabTutorial) {
				ReflectionHelper.setPrivateValue(TabTutorial.class, (TabTutorial) tab, "The Mining Area tab configures what area the block should mine in.\n\nAn upgrade case can be put on the left slot to upgrade the block. Dug blocks come out of the output side.", "myInfo");
				tab.maxHeight += 55;
			}
	}


}
