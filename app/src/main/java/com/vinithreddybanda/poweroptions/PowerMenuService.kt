package com.vinithreddybanda.poweroptions

import android.accessibilityservice.AccessibilityService
import android.content.Intent
import android.view.accessibility.AccessibilityEvent
import android.widget.Toast

class PowerMenuService : AccessibilityService() {

    // This 'companion object' is a key part. It holds a reference to the running service
    // so the MainActivity can easily access it without complex binding.
    companion object {
        var instance: PowerMenuService? = null
    }

    override fun onServiceConnected() {
        super.onServiceConnected()
        // When the user enables the service in Settings, we set the static 'instance'
        // so other parts of our app know that the service is active.
        instance = this
        Toast.makeText(this, "Power Options Service is now active", Toast.LENGTH_SHORT).show()
    }

    override fun onUnbind(intent: Intent?): Boolean {
        // When the service is turned off, we clear the instance.
        instance = null
        return super.onUnbind(intent)
    }

    // This is the most important function. It performs the action we want.
    fun openPowerMenu() {
        // GLOBAL_ACTION_POWER_DIALOG is the system command to show the power menu.
        // This only works because this is an AccessibilityService.
        performGlobalAction(GLOBAL_ACTION_POWER_DIALOG)
    }

    // These two methods are required by the AccessibilityService class,
    // but we don't need to do anything inside them for this app.
    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        // Not needed for this specific function.
    }

    override fun onInterrupt() {
        // Not needed.
    }
}
