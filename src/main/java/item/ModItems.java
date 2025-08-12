package item;

import net.fisacre.mod.AtlasMaruzen;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AtlasMaruzen.MOD_ID);

    public static final DeferredItem<Item> ALUMINIUM = ITEMS.register("aluminium",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BAUXITE = ITEMS.register("bauxite",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
