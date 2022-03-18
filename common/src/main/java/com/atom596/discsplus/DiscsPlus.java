package com.atom596.discsplus;

import com.atom596.discsplus.modThings.MusicDiscPlus;

public class DiscsPlus {
    public static final String MOD_ID = "discsplus";
    
    public static void init() {
        MusicDiscPlus.DISCREGISTER.register();
        MusicDiscPlus.initDiscs();
    }
}
