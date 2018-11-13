package com.arivas.daggerlogin.root;

import com.arivas.daggerlogin.login.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(MainActivity target);

}
