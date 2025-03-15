package app.honghyk.projectx.database.di

import app.honghyk.projectx.data.datasource.local.MyLocalDataSource
import app.honghyk.projectx.database.datasource.MyLocalDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal interface DataSourceModule {

    @Binds
    fun bindsMyLocalDataSource(impl: MyLocalDataSourceImpl): MyLocalDataSource
}
