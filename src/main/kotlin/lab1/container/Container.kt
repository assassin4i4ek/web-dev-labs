package lab1.container

interface Container<T> {
    /**
     * Inserts a new model instance into the container.
     *
     * @param model The model instance to be inserted.
     */
    fun append(model: T)

    /**
     * Removes a model instance from the container by its index.
     *
     * @param index The index of the model to be removed.
     * @return The recently removed model instance.
     */
    fun remove(index: Int): T

    /**
     * Updates an existing model instance in the container by its index.
     *
     * @param model The model instance with updated fields that should replace the existing one.
     * @param index The index of the model to be updated.
     */
    fun update(model: T, index: Int)

    /**
     * Retrieves a model instance in the container by its index.
     *
     * @param index The index of the model to get.
     * @return The retrieved model instance.
     */
    fun get(index: Int): T

    /**
     * Retrieves all model instances in the container.
     *
     * @return The list of model instances in the container.
     */
    fun getAll(): List<T>
}