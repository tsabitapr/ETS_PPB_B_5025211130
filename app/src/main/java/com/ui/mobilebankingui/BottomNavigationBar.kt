package com.ui.mobilebankingui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ui.mobilebankingui.data.BottomNavigation

val items = listOf(
    BottomNavigation(
        title = "Beranda",
        icon = Icons.Rounded.Home
    ),
    BottomNavigation(
        title = "Kirim",
        icon = Icons.Rounded.Wallet
    ),
    BottomNavigation(
        title = "Notifikasi",
        icon = Icons.Rounded.Notifications
    ),
    BottomNavigation(
        title = "Akun",
        icon = Icons.Rounded.AccountCircle
    )
)

@Preview
@Composable
fun BottomNavigationBar() {
    NavigationBar {
        Row (
            modifier = Modifier.background(MaterialTheme.colorScheme.secondary)
        ) {

            items.forEachIndexed { index, item ->
                NavigationBarItem(
                    selected = index == 0,
                    onClick = {  },
                    icon = {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.title,
                            tint = MaterialTheme.colorScheme.background
                        )
                    },
                    label = {
                        Text(
                            text = item.title,
                            color = MaterialTheme.colorScheme.background
                        )
                    }
                )
            }
        }
    }
}