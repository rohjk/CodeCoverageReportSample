package com.jake.codecoveragereport.auth

import com.jake.codecoveragereport.auth.data.UserProfile
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.mockito.MockitoAnnotations

class JakeAuthTest {

    private lateinit var jakeAuth: JakeAuth

    val testUserProfile = UserProfile("testUser", "testPwd")

    @Before
    fun init() {
        MockitoAnnotations.initMocks(this)
        jakeAuth = JakeAuth(testUserProfile)
    }

    @Test
    fun setUserProfile() {
        val userProfile = UserProfile("testUser2", "testPwd")

        jakeAuth.setUserProfile(userProfile)

        assertEquals(jakeAuth.profile, userProfile)
    }

    @Test
    fun getUserProfile() {
        val userProfile = jakeAuth.getUserProfile()
        assertEquals(userProfile, testUserProfile)
    }
}