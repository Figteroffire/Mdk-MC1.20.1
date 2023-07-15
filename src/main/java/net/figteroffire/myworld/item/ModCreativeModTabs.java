package net.figteroffire.myworld.item;

import net.figteroffire.myworld.MyWorld;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MyWorld.MOD_ID);


    public static final RegistryObject<CreativeModeTab> MYWORLD_TAB = CREATIVE_MODE_TABS.register("myworld",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RATIO.get()))
                    .title(Component.translatable("creativetab.myworld_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.RATIO.get());
                        pOutput.accept(ModItems.BANANE.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
