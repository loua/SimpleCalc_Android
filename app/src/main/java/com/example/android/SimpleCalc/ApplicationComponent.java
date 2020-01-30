package com.example.android.SimpleCalc;

import dagger.Component;

@Component
public interface ApplicationComponent {
    // This tells Dagger that MainActivity requests injection so the graph needs to
    // satisfy all the dependencies of the fields that MainActivity is injecting.
    void inject(MainActivity mainActivity);
}