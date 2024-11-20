package com.example.dicodingevent

data class Event(
    val imageLogo: String?,
    val name: String,
    val ownerName: String?,
    val beginTime: String?,
    val quota: Int?,
    val registrant: Int?,
    val description: String?,
    val link: String?
)
