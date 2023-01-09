package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/simulator.properties"})
public interface SimulatorConfig extends Config {

    String simulatorURL();
    String simulatorDevice();
    String simulatorOSVersion();
    String simulatorPlatformName();
    String simulatorLocale();
    String simulatorLanguage();
    String simulatorAppPath();
    String simulatorAppPackage();
    String simulatorAppActivity();
}
