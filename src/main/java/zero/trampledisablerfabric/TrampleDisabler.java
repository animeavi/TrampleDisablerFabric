package zero.trampledisablerfabric;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TrampleDisabler implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("trample-disabler");

    @Override
    public void onInitialize() {
        LOGGER.info("TrampleDisabler enabled!");
    }
}
