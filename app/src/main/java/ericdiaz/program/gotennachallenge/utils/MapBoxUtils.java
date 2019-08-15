package ericdiaz.program.gotennachallenge.utils;

import androidx.annotation.NonNull;

/**
 * A utility class for the MapBox API
 * <p>
 * Created 8/13/19
 *
 * @author Eric Diaz
 */

public final class MapBoxUtils {

    public static final String ACCESS_KEY = "pk.eyJ1IjoiZXJpY2RpYXoiLCJhIjoiY2p6OThqZzJiMDRxaDNkcGo0Y3E4Z3M3ZyJ9.X9WoMdw49Am8iQSUdVWL4w";
    public static final String ICON_NAME = "pin-marker-icon";
    private static final String SOURCE_ID = "source-id";
    private static final String LAYER_ID = "layer-id";

    public static String getLayerId(@NonNull final String iD) {
        return LAYER_ID + ": " + iD;
    }

    public static String getSourceId(@NonNull final String iD) {
        return SOURCE_ID + ": " + iD;
    }
}
