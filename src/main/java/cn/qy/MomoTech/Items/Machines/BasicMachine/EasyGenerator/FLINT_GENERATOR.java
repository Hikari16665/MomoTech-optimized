package cn.qy.MomoTech.Items.Machines.BasicMachine.EasyGenerator;

import cn.qy.MomoTech.GUI.AbstractEasyGeneratorGUI;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class FLINT_GENERATOR extends AbstractEasyGeneratorGUI {
    public FLINT_GENERATOR(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, id, it, recipeType, recipe);
    }
    ItemStack output=new ItemStack(Material.FLINT, 4);
    @Override
    public ItemStack getOut() {
        return output;
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_FLINT_GENERATOR";
    }
}
