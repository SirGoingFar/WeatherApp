package com.sirgoingfar.navigation

private val classMap = mutableMapOf<String, Class<*>>()

inline fun <reified T : Any> Any.castOrNull() = this as? T

fun <T> loadOrNull(id: String): Class<out T>? = classMap.getOrPut(id) {
    try {
        Class.forName(id)
    } catch (ex: ClassNotFoundException) {
        return null
    }
}.castOrNull()
