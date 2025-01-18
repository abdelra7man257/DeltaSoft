package com.example.deltasoftandroidtask.common.exepctions

class ServerError(private val serverMessage: String) : Exception(serverMessage)