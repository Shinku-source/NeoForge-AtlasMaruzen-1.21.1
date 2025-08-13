package net.fisacre.mod.datagen;

import block.ModBlocks;
import item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        List<ItemLike> ALUMINIUM_SMELTABLES = List.of(ModItems.BAUXITE,
                ModBlocks.BAUXITE_ORE, ModBlocks.BAUXITE_DEEPSLATE_ORE);

        List<ItemLike> ALUMINIUM_BLASTABLES = List.of(ModItems.ALUMINA.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALUMINIUM_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ALUMINIUM.get())
                .unlockedBy("has_aluminium", has(ModItems.ALUMINIUM)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALUMINIUM.get(), 9)
                .requires(ModBlocks.ALUMINIUM_BLOCK)
                .unlockedBy("has_aluminium_block", has(ModBlocks.ALUMINIUM_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, ALUMINIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ALUMINA.get(), 0.25f, 200, "aluminium");
        oreBlasting(recipeOutput, ALUMINIUM_BLASTABLES, RecipeCategory.MISC, ModItems.ALUMINIUM.get(), 0.45f, 100, "aluminium");

    }
}
