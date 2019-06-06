package com.owono.dagger.dagger;

import com.owono.dagger.car.Engine;
import com.owono.dagger.car.PetrolEngine;

import javax.inject.Inject;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);

}
