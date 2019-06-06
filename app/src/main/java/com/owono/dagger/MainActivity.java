package com.owono.dagger;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.owono.dagger.car.Car;
import com.owono.dagger.dagger.CarComponent;
import com.owono.dagger.dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();

        component.inject(this);

        car1.drive();
        car2.drive();
    }
}
