# Power Options

An Android application that provides a simple, on-screen power menu for users whose physical power button may be broken or hard to access.

[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)
[![Platform](https://img.shields.io/badge/Platform-Android-green.svg)](https://www.android.com/)
[![Kotlin](https://img.shields.io/badge/Kotlin-100%25-purple.svg)](https://kotlinlang.org/)

## Overview

Power Options is a straightforward utility that uses Android's Accessibility Service to display a power menu on your screen. It is a lightweight solution for extending the life of a device with a faulty power button.

## Features

- **Simple Power Menu:** Access essential power options without physical buttons.
- **Core Functions:**
    - Power Off
    - Standard Reboot
- **Advanced Options (Root may be required):**
    - Soft Reboot
    - Reboot to Recovery
    - Reboot to Bootloader
- **Accessibility Driven:** Designed as an alternative to physical button input.

## Sponsorship

If you find this project useful, please consider sponsoring:

[![Sponsor](https://img.shields.io/badge/Sponsor-%E2%9D%A4-red.svg)](https://github.com/sponsors/vinithreddybanda)

## How It Works

The app uses an Accessibility Service to display an overlay with power options. To use the app, you must first enable the "Power Options" service in your device's Accessibility settings.

**Note:** Advanced reboot options (like Recovery and Bootloader) may require your device to be rooted.

## Installation

You can download the latest APK from the releases section on GitHub.

## License

This project is licensed under the GNU General Public License v3.0. See the `LICENSE` file for details.

## Disclaimer

This application is provided "as is" without warranty of any kind. Some features may require special permissions (Accessibility Service) or device modifications (root). Please use it at your own risk.
