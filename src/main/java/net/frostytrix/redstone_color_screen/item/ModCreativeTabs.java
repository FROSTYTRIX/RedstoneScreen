package net.frostytrix.redstone_color_screen.item;

import net.frostytrix.redstone_color_screen.RedstoneScreen;
import net.frostytrix.redstone_color_screen.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RedstoneScreen.MOD_ID);

    public static final RegistryObject<CreativeModeTab> REDSTONE_SCREEN = CREATIVE_MOD_TABS.register("redstone_color_lamp_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetab.redstone_color_lamp_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        ModBlocks.REDSTONE_COLOR_LAMP.get();
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
