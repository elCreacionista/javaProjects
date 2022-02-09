package FACTORY;

import SPACES.Environment;
import SPACES.Quality;

public class EnvironmentFactory {
    Quality quality;

    public EnvironmentFactory(){
        this.quality = Quality.GOOD;
    }

    public Environment generateRandomEnvironment() {
        return generateEnvironment(quality.getRandomQuality());
    }

    public Environment generateEnvironment(Quality quality){
        return new Environment();
    }

}
