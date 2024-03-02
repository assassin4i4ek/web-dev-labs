package com.ruslanb.dao

open class ListContainerImpl<T>(
    init: Iterable<T>? = null
): Container<T> {
    private val models = mutableListOf<T>()

    init {
        // fills `models` list with initial models
        init?.forEach(models::add)
    }

    override fun append(model: T) {
        // adds model instance to the `models` list
        models.add(model)
    }

    override fun remove(index: Int): T {
        // removes model instance from the `models` list by its index
        return models.removeAt(index)
    }

    override fun get(index: Int): T {
        // retrieves model instance from the `models` list by its index
        return models[index]
    }

    override fun getAll(): List<T> {
        // returns the copy of `models` list
        return models.toList()
    }

    override fun update(model: T, index: Int) {
        // updates model instance at index in the `models` list
        models[index] = model
    }
}