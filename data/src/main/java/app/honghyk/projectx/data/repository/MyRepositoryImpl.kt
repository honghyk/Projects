package app.honghyk.projectx.data.repository

import app.honghyk.projectx.domain.model.MyModel
import app.honghyk.projectx.domain.repository.MyRepository
import javax.inject.Inject

internal class MyRepositoryImpl @Inject constructor() : MyRepository {

    override fun func(): MyModel {
        TODO("Not yet implemented")
    }
}
