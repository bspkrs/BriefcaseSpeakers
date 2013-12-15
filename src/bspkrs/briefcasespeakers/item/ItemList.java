package bspkrs.briefcasespeakers.item;

import net.minecraft.item.Item;
import bspkrs.briefcasespeakers.config.ConfigHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ItemList
{
    public static Item     speaker;
    public static Item     remote;
    
    private static boolean isInitialized = false;
    
    public static void preInit(FMLPreInitializationEvent e)
    {
        if (!isInitialized)
        {
            // TODO: set creative tabs
            speaker = new ItemBase(ConfigHandler.idSpeaker).setUnlocalizedName("briefcasespeakers.speakers");
            remote = new ItemRemote(ConfigHandler.idRemote).setUnlocalizedName("briefcasespeakers.remote");
        }
    }
}
