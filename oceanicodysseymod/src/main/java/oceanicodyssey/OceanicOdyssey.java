package oceanicodyssey;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(OceanicOdyssey.MODID)
public class OceanicOdyssey {
    public static final String MODID = "oceanicodyssey";

    public OceanicOdyssey()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
    }

    private void setup(FMLCommonSetupEvent e)
    {


    }

    private void clientSetup(FMLClientSetupEvent e)
    {

    }
}
