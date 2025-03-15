package app.honghyk.projectx.data.model

import app.honghyk.projectx.domain.model.MyModel

class MyModelModel

fun MyModelModel.toDomain() = MyModel()

fun MyModel.toData() = MyModelModel()
