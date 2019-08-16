package be.isach.ultracosmetics.v1_8_R1;

import be.isach.ultracosmetics.version.IItemGlower;
import org.bukkit.inventory.ItemStack;

/**
 * @author RadBuilder
 */
public class ItemGlower implements IItemGlower {

    @Override
    public ItemStack glow(ItemStack item) {
        net.minecraft.server.v1_8_R1.ItemStack asNMSCopy = org.bukkit.craftbukkit.v1_8_R1.inventory.CraftItemStack.asNMSCopy(item);
        net.minecraft.server.v1_8_R1.NBTTagCompound tagCompound = null;
        if (!asNMSCopy.hasTag()) {
            tagCompound = new net.minecraft.server.v1_8_R1.NBTTagCompound();
            asNMSCopy.setTag(tagCompound);
        }
        if (tagCompound == null) tagCompound = asNMSCopy.getTag();
        net.minecraft.server.v1_8_R1.NBTTagList enchantmen = new net.minecraft.server.v1_8_R1.NBTTagList();
        tagCompound.set("ench", enchantmen);
        asNMSCopy.setTag(tagCompound);
        return org.bukkit.craftbukkit.v1_8_R1.inventory.CraftItemStack.asCraftMirror(asNMSCopy);
    }
}
