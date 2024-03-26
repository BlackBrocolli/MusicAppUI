package com.example.musicappui

import androidx.annotation.DrawableRes

sealed class Screen(val title: String, val route: String) {

    sealed class DrawerScreen(
        val drawerTitle: String,
        val drawerRoute: String,
        @DrawableRes val icon: Int
    ) : Screen(drawerTitle, drawerRoute) {
        object Account : DrawerScreen("Account", "account", R.drawable.baseline_account_box_24)
        object Subscription :
            DrawerScreen("Subscription", "subscribe", R.drawable.baseline_library_music_24)

        object AddAccount :
            DrawerScreen("Add Account", "add_account", R.drawable.baseline_person_add_alt_1_24)
    }
}