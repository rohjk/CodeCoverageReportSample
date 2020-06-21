package com.jake.codecoveragereport.auth

import com.jake.codecoveragereport.auth.data.UserProfile

class JakeAuth constructor(
    private var profile : UserProfile? = null
){
    fun setUserProfile(profile: UserProfile) {
        this.profile = profile
    }

    fun getUserProfile() = profile
}