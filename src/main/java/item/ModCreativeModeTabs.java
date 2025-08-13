package item;

import block.ModBlocks;
import net.fisacre.mod.AtlasMaruzen;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AtlasMaruzen.MOD_ID);

    public static final Supplier<CreativeModeTab> ATLASMARUZEN_ITEMS_TAB = CREATIVE_MODE_TAB.register("atlasmaruzen_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALUMINIUM.get()))
                    .title(Component.translatable("creativetab.atlasmaruzen.atlasmaruzen_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BAUXITE);
                        output.accept(ModItems.ALUMINIUM);

                    }).build());

    public static final Supplier<CreativeModeTab> ATLASMARUZEN_BLOCKS_TAB = CREATIVE_MODE_TAB.register("atlasmaruzen_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ALUMINIUM_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(AtlasMaruzen.MOD_ID, "atlasmaruzen_items_tab"))
                    .title(Component.translatable("creativetab.atlasmaruzen.atlasmaruzen_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.BAUXITE_ORE);
                        output.accept(ModBlocks.ALUMINIUM_BLOCK);
                        output.accept(ModBlocks.BAUXITE_DEEPSLATE_ORE);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
