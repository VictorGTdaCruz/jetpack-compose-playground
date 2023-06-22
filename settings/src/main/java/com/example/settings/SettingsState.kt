package com.example.settings

import androidx.annotation.StringRes

data class SettingsState(
    val isNotificationsEnabled: Boolean = false,
    val isHintsEnabled: Boolean = false,
    val marketingOption: MarketingOption = MarketingOption.NOT_ALLOWED,
    val theme: Theme = Theme.SYSTEM,
)

enum class MarketingOption {
    ALLOWED, NOT_ALLOWED
}

enum class Theme(@StringRes val label: Int) {
    LIGHT(R.string.theme_light),
    DARK(R.string.theme_dark),
    SYSTEM(R.string.theme_system)
}

