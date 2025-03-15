package app.honghyk.projectx.network.model

import app.honghyk.projectx.data.model.MyModelModel

class MyModelResponse

fun MyModelResponse.toData() = MyModelModel()

fun MyModelModel.toResponse() = MyModelResponse()