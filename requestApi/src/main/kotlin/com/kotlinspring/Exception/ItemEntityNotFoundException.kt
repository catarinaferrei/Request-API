package com.kotlinspring.Exception

import org.springframework.http.HttpStatus

class ItemEntityNotFoundException(val statusCode: HttpStatus, val reason: String) : Exception()


