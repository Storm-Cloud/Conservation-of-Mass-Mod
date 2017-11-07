package StormCloud.recipesfordestruction.item;

import StormCloud.recipesfordestruction.MainLib;
import StormCloud.recipesfordestruction.item.Enums.OreChunkTypes;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;

public class ItemOreChunk extends Item {
	public ItemOreChunk(String unlocalizedName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(MainLib.MODID,unlocalizedName));
		this.setHasSubtypes(true);
	}
	
	
	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		for(int i = 0; i < OreChunkTypes.values().length;i++){
			items.add(new  ItemStack(this,1,i));
		}
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		/*if(stack.getItemDamage() < MetalDebrisTypes.values().length){
			return this.getUnlocalizedName() + "." + MetalDebrisTypes.values()[stack.getItemDamage()].getName();
		}else{
			return this.getUnlocalizedName() + "." + MetalDebrisTypes.BROKEN.getName();
		}*/
		return this.getUnlocalizedName() + "." + OreChunkTypes.values()[stack.getItemDamage()].getName();
	}
}
