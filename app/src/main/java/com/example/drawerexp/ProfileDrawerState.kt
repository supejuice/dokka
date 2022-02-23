package com.example.drawerexp

import androidx.compose.material.DrawerState
import androidx.compose.material.DrawerValue
import androidx.compose.material.rememberDrawerState
import androidx.compose.runtime.Composable

object ProfileDrawerState {
    private lateinit var drawerState: DrawerState

    @Composable
    fun createOrGet(): DrawerState {
        if (!::drawerState.isInitialized) {
            drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
        }
        return drawerState
    }
}