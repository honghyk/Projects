package app.honghyk.projectx.database.model

import app.honghyk.projectx.data.model.MyModelModel

class MyModelEntity

fun MyModelEntity.toData() = MyModelModel()

fun MyModelModel.toEntity() = MyModelEntity()
