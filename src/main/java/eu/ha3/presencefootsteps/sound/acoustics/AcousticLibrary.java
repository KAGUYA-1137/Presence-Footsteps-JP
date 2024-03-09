package eu.ha3.presencefootsteps.sound.acoustics;

import eu.ha3.presencefootsteps.sound.Options;
import eu.ha3.presencefootsteps.sound.State;
import net.minecraft.entity.LivingEntity;

public interface AcousticLibrary {
    /**
     * Adds an acoustic to the library.
     */
    void addAcoustic(String name, Acoustic acoustic);

    void playAcoustic(LivingEntity location, String acousticName, State event, Options options);
}