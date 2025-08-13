package net.fisacre.mod.datagen;

import item.ModItems;
import net.fisacre.mod.AtlasMaruzen;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AtlasMaruzen.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.BAUXITE.get());
        basicItem(ModItems.ALUMINA.get());
        basicItem(ModItems.ALUMINIUM.get());

    }
}
