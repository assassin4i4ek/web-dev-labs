package com.ruslanb.dao

open class ListContainerImpl<T>(
    init: Iterable<T>? = null
): Container<T> {
    private val models = mutableListOf<T>()

    init {
        init?.forEach(models::add)
    }

    override fun append(model: T) {
        models.add(model)
    }

    override fun remove(index: Int): T {
        return models.removeAt(index)
    }

    override fun get(index: Int): T {
        return models[index]
    }

    override fun getAll(): List<T> {
        return models.toList()
    }

    override fun update(model: T, index: Int) {
        models[index] = model
    }
}