/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the ThermalQuarry Mod.
 * 
 * ThermalQuarry is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 * 
 * File Created @ [Dec 28, 2013, 7:30:11 PM (GMT)]
 */
package vazkii.tquarry.common.core;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import thermalexpansion.gui.container.machine.ContainerCharger;
import vazkii.tquarry.client.gui.GuiQuarry;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == 0)
			return new ContainerCharger(player.inventory, world.getBlockTileEntity(x, y, z));
		else return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == 0)
			return new GuiQuarry(player.inventory, world.getBlockTileEntity(x, y, z));
		else return null;
	}

}
