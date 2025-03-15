package app.honghyk.projectx.database.di

import app.honghyk.projectx.database.dao.MyDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal object DaoModule {

    @Provides
    fun providesMyDao(): MyDao {
        TODO("Not implemented yet")
    }
}