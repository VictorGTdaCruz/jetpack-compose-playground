package com.example.settings

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class SettingsViewModel: ViewModel() {

    val state = MutableStateFlow(SettingsState())

    fun toggleNotificationSetting() {
        state.value = state.value.copy(isNotificationsEnabled = !state.value.isNotificationsEnabled)
    }

    fun toggleHintSetting() {
        state.value = state.value.copy(isHintsEnabled = !state.value.isHintsEnabled)
    }

    fun toggleHintSetting(marketingOption: MarketingOption) {
        state.value = state.value.copy(marketingOption = marketingOption)
    }

    fun toggleHintSetting(theme: Theme) {
        state.value = state.value.copy(theme = theme)
    }

}