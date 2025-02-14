package com.lab1.myapplication

import dagger.Component

@Component(modules = [StorageModule::class, NetworkModule::class])
interface AppComponent {
   fun injectMainActivity(mainActivity: MainActivity)

}