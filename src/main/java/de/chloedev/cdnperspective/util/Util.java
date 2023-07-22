package de.chloedev.cdnperspective.util;

import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.LogManager;

/**
 * @author ChloeCDN
 */
public class Util {

    public static void debug(String s) {
        if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
            LogManager.getLogger("CDN-Perspective").info(s);
        }
    }
}
