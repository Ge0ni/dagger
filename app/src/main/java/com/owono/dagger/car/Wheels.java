package com.owono.dagger.car;

import javax.inject.Inject;

public class Wheels {
    private static final String TAG = "Wheels";

    private Rims rims;
    private Tires tires;

    @Inject
    public Wheels(Rims rims, Tires tires) {
    }
}
