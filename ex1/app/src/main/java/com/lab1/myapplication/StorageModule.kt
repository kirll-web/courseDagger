package com.lab1.myapplication

import dagger.Module
import dagger.Provides

@Module
class StorageModule {

    @Provides
    fun provideDatabaseHelder(): DatabaseHelper {
        return DatabaseHelper()
    }

}