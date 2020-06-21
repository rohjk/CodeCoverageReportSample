package com.jake.codecoveragereport.sample

import com.jake.codecoveragereport.auth.JakeAuth
import com.jake.codecoveragereport.auth.data.UserProfile
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations

class AuthTest {
    lateinit var auth: Auth

    @Mock
    lateinit var jakeAuth: JakeAuth

    @Before
    fun init() {
        MockitoAnnotations.initMocks(this)
        auth = Auth(jakeAuth)
    }

    @Test
    fun setUserProfile() {
        val userProfile = UserProfile("testUser", "testPwd")
        auth.setUserProfile(userProfile)

        verify(jakeAuth).setUserProfile(userProfile)
    }

    @Test
    fun getUserName_profile_null() {
        val expectedName = ""
        val userName = auth.getUserName()

        assertEquals(expectedName, userName)
    }

    @Test
    fun getUserName_profile_nonNull() {
        val userProfile = UserProfile("testUser", "testPwd")

        Mockito.`when`(jakeAuth.getUserProfile()).thenReturn(userProfile)

        val expectedName = userProfile.name
        val userName = auth.getUserName()

        assertEquals(expectedName, userName)
    }
}