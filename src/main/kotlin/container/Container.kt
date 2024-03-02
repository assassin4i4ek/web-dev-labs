package com.ruslanb.dao

interface Container<T> {
    fun append(model: T)
    fun remove(index: Int): T
    fun update(model: T, index: Int)
    fun get(index: Int): T
    fun getAll(): List<T>
}