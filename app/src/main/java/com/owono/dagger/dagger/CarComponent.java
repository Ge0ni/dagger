package com.owono.dagger.dagger;

import com.owono.dagger.MainActivity;
import com.owono.dagger.car.Car;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component (modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    public Car getCar();

    public void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse_power") int horsePower); // Builder class as a return for chain calls

        @BindsInstance
        Builder engineCapacity(@Named("engine_capacity") int engineCapacity);

        CarComponent build(); // Dagger will implement this method automatically

    }
}
