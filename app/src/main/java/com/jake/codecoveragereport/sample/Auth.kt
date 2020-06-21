package com.jake.codecoveragereport.sample

import com.jake.codecoveragereport.auth.JakeAuth
import com.jake.codecoveragereport.auth.data.UserProfile

class Auth constructor(
    private val jakeAuth: JakeAuth
) {
    fun setUserProfile(userProfile: UserProfile) {
        jakeAuth.setUserProfile(userProfile)
    }

    fun getUserName(): String =
        jakeAuth.getUserProfile()?.let {
            return it.name
        } ?: ""
}