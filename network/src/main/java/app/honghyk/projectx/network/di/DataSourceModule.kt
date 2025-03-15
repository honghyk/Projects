package app.honghyk.projectx.network.di

import app.honghyk.projectx.data.datasource.remote.MyRemoteDataSource
import app.honghyk.projectx.network.datasource.MyRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal interface DataSourceModule {

    @Binds
    fun bindsMyRemoteDataSource(impl: MyRemoteDataSourceImpl): MyRemoteDataSource
}
