/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the ThermalQuarry Mod.
 * 
 * ThermalQuarry is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 * 
 * File Created @ [Dec 28, 2013, 6:42:04 PM (GMT)]
 */
package vazkii.tquarry.common.block;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import thermalexpansion.block.machine.BlockMachine;

public class BlockQuarry extends BlockMachine {

	static Icon sideOff, sideOn;
	
	public BlockQuarry(int id) {
		super(id);
	}
	
	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		super.registerIcons(par1IconRegister);
		
		sideOff = par1IconRegister.registerIcon("tquarry:quarryOff");
		sideOn = par1IconRegister.registerIcon("tquarry:quarryOn");
	}
	
	@Override
	public TileEntity createTileEntity(World world, int metadata) {
		return new TileQuarry();
	}

}
