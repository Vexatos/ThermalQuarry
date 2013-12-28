/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the ThermalQuarry Mod.
 * 
 * ThermalQuarry is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 * 
 * File Created @ [Dec 28, 2013, 6:54:13 PM (GMT)]
 */
package vazkii.tquarry.common.block;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Icon;
import thermalexpansion.block.machine.BlockMachine;
import thermalexpansion.block.machine.TileCharger;
import vazkii.tquarry.common.ThermalQuarry;
import cofh.render.IconRegistry;

public class TileQuarry extends TileCharger {

	public static final int TYPE = BlockMachine.Types.CHARGER.ordinal();
	
	@Override
	public void updateEntity() {
		super.updateEntity();
	}

	@Override
	public int getType() {
		return TYPE;
	}
	
	@Override
	public Icon getBlockTexture(int side, int pass) {
		if(pass == 0 && side != 1 && side != 0)
			return  side != this.facing ? IconRegistry.getIcon("MachineSide") : this.isActive ? BlockQuarry.sideOn : BlockQuarry.sideOff;
		
		return super.getBlockTexture(side, pass);
	}
	
	@Override
	public boolean openGui(EntityPlayer player) {
		player.openGui(ThermalQuarry.instance, 0, worldObj, xCoord, yCoord, zCoord);
		return true;
	}
	
}
