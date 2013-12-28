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

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
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
	public Icon getIcon(int par1, int par2) {
		return par1 == 3 ? sideOff : super.getIcon(par1, par2);
	}
	
	@Override
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List) {
		par3List.add(new ItemStack(par1, 1, 0));
	}
	
	@Override
	public TileEntity createTileEntity(World world, int metadata) {
		return new TileQuarry();
	}

}
