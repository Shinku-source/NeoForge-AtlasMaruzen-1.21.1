package net.fisacre.mod.datagen;

import block.ModBlocks;
import net.fisacre.mod.AtlasMaruzen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, AtlasMaruzen.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ALUMINIUM_BLOCK.get())
                .add(ModBlocks.BAUXITE_ORE.get())
                .add(ModBlocks.BAUXITE_DEEPSLATE_ORE.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.ALUMINIUM_BLOCK.get())
                .add(ModBlocks.BAUXITE_ORE.get())
                .add(ModBlocks.BAUXITE_DEEPSLATE_ORE.get());

    }
}
