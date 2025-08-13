package net.fisacre.mod.datagen;

import item.ModItems;
import net.fisacre.mod.AtlasMaruzen;
import net.fisacre.mod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static com.ibm.icu.util.LocalePriorityList.add;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, AtlasMaruzen.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.METALWORKS_ITEMS)
        .add(ModItems.BAUXITE.get())
        .add(ModItems.ALUMINA.get())
        .add(ModItems.ALUMINIUM.get());
    }
}
