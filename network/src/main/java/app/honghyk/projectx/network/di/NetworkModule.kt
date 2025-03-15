package app.honghyk.projectx.network.di

import app.honghyk.projectx.network.api.MyApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal object NetworkModule {

    @Provides
    fun provideMyApi(): MyApi {
        TODO("Not implemented yet")
    }
}
