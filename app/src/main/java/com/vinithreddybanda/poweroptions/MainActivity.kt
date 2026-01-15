package com.vinithreddybanda.poweroptions
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Step 1: Check if our Accessibility Service is currently connected and running.
        // We access the 'instance' we created in the PowerMenuService.
        val service = PowerMenuService.instance

        if (service != null) {
            // Step 2: The service is active.
            // We can now safely call its public method to open the power dialog.
            service.openPowerMenu()

            // Step 3: Immediately close this "invisible" activity.
            // The user only sees the power menu appear, not the app opening and closing.
            finish()

        } else {
            // Step 4: The service is not running.
            // We must guide the user to the Accessibility settings screen to enable it.
            Toast.makeText(
                this,
                "Please enable the Power Options service",
                Toast.LENGTH_LONG
            ).show()

            // Create an intent that opens the system's Accessibility settings screen.
            val intent = Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS)
            startActivity(intent)

            // We finish the activity here as well, so the user lands in the Settings.
            // When they press "Back," they will return to their home screen, not a blank app.
            finish()
        }
    }
}
