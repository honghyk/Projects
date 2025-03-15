package app.honghyk.projectx.data.di

import app.honghyk.projectx.data.repository.MyRepositoryImpl
import app.honghyk.projectx.domain.repository.MyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal interface RepositoryModule {

    @Binds
    fun bindsMyRepository(impl: MyRepositoryImpl): MyRepository
}
