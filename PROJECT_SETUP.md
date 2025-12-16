# Synapse Android Project - Setup Guide

## Project Overview

This is a complete Android application implementing the **Synapse Splash Screen** following Clean Architecture principles. The project is fully configured and ready to build once the Android SDK is set up.

## Project Structure

```
Synapse/
├── app/                                    # Main application module
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/synapse/app/
│   │   │   │   ├── SynapseApplication.kt  # Application class with Hilt
│   │   │   │   └── ui/
│   │   │   │       └── splash/
│   │   │   │           └── SplashScreenActivity.kt
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   └── activity_splash_screen.xml
│   │   │   │   ├── drawable/
│   │   │   │   │   ├── bg_logo_circle.xml
│   │   │   │   │   ├── splash_background.xml
│   │   │   │   │   ├── ic_synapse_logo.xml
│   │   │   │   │   ├── ic_launcher_background.xml
│   │   │   │   │   └── ic_launcher_foreground.xml
│   │   │   │   ├── values/
│   │   │   │   │   ├── strings.xml
│   │   │   │   │   ├── colors.xml
│   │   │   │   │   └── themes.xml
│   │   │   │   ├── xml/
│   │   │   │   │   ├── backup_rules.xml
│   │   │   │   │   └── data_extraction_rules.xml
│   │   │   │   └── mipmap-anydpi-v26/
│   │   │   │       ├── ic_launcher.xml
│   │   │   │       └── ic_launcher_round.xml
│   │   │   └── AndroidManifest.xml
│   │   ├── test/                          # Unit tests
│   │   └── androidTest/                   # Instrumented tests
│   └── build.gradle.kts
│
├── core/                                   # Core module with base classes
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/synapse/core/
│   │   │   │   ├── bases/
│   │   │   │   │   ├── activity/
│   │   │   │   │   │   ├── BaseActivity.kt
│   │   │   │   │   │   └── BaseActivityWithVM.kt
│   │   │   │   │   └── viewmodel/
│   │   │   │   │       └── BaseViewModel.kt
│   │   │   │   ├── extensions/
│   │   │   │   │   └── ViewExtensions.kt
│   │   │   │   └── utils/
│   │   │   │       └── Resource.kt
│   │   │   └── AndroidManifest.xml
│   │   └── test/
│   └── build.gradle.kts
│
├── gradle/
│   ├── libs.versions.toml                 # Centralized dependency management
│   └── wrapper/
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
│
├── build.gradle.kts                        # Root build file
├── settings.gradle.kts                     # Project settings
├── gradle.properties                       # Gradle configuration
├── gradlew                                 # Gradle wrapper (Unix)
├── gradlew.bat                             # Gradle wrapper (Windows)
├── local.properties                        # Local SDK configuration (not in VCS)
├── .gitignore
└── README.md
```

## Key Features Implemented

### 1. Splash Screen Activity
- **Location**: `app/src/main/java/com/synapse/app/ui/splash/SplashScreenActivity.kt`
- **Features**:
  - Clean, modern UI with logo and tagline
  - 2-second delay using Handler
  - ViewBinding for type-safe view access
  - Hilt dependency injection ready
  - Prepared for navigation to onboarding (commented out)

### 2. Clean Architecture Base Classes
- **BaseActivity**: Base class for activities without ViewModel
- **BaseActivityWithVM**: Base class for activities with ViewModel
- **BaseViewModel**: Base ViewModel with coroutine helpers
- **Resource**: Sealed class for handling data states (Success, Error, Loading)
- **ViewExtensions**: Extension functions for View visibility

### 3. Dependency Management
All dependencies are managed in `gradle/libs.versions.toml`:
- **AGP**: 8.7.3
- **Kotlin**: 1.9.24
- **KSP**: 1.9.24-1.0.20
- **Gradle**: 8.11.1

### 4. Libraries Included
- AndroidX Core, AppCompat, Material Design
- Hilt for dependency injection
- Room for local database
- Retrofit + OkHttp for networking
- Coroutines for async operations
- SDP/SSP for responsive dimensions
- ViewBinding enabled

## Configuration Details

### Gradle Configuration
- **Min SDK**: 24 (Android 7.0)
- **Target SDK**: 34 (Android 14)
- **Compile SDK**: 34
- **Java Version**: 17
- **Kotlin DSL**: Used for all Gradle files
- **ViewBinding**: Enabled in both modules

### Theme Configuration
- Material Design 3 theme
- NoActionBar style
- Custom splash screen theme
- Light status bar for splash screen

## Setup Instructions

### 1. Install Prerequisites
```bash
# Verify Java 17 or higher
java -version

# If not installed, install Java 17
# Ubuntu/Debian:
sudo apt-get install openjdk-17-jdk

# macOS (using Homebrew):
brew install openjdk@17
```

### 2. Install Android SDK
- Download and install Android Studio from https://developer.android.com/studio
- Or install command-line tools only

### 3. Configure SDK Path
Create/update `local.properties` in project root:
```properties
sdk.dir=/path/to/your/android/sdk
```

### 4. Build the Project
```bash
# Make gradlew executable (Unix/Mac)
chmod +x gradlew

# Build debug APK
./gradlew assembleDebug

# Install on connected device
./gradlew installDebug

# Run tests
./gradlew test
```

## Next Steps

To continue development:

1. **Implement Onboarding Screen**
   - Create `OnboardingActivity` in `app/src/main/java/com/synapse/app/ui/onboarding/`
   - Uncomment navigation code in `SplashScreenActivity`

2. **Add More Features**
   - Follow the Clean Architecture pattern
   - Create domain models in `domain/model/`
   - Create use cases in `domain/usecase/`
   - Create repositories in `data/repositories/`

3. **Customize Assets**
   - Replace `splash_background.xml` with actual image
   - Update `ic_synapse_logo.xml` with final logo design
   - Add custom fonts to `res/font/` directory

## Troubleshooting

### Build Fails with "SDK location not found"
- Ensure `local.properties` exists with correct `sdk.dir` path
- Or set `ANDROID_HOME` environment variable

### Java Version Error
- Ensure Java 17 or higher is installed
- Set `JAVA_HOME` environment variable if needed

### Gradle Sync Issues
- Run `./gradlew clean`
- Invalidate caches in Android Studio
- Delete `.gradle` folder and rebuild

## License

Copyright © 2024 Synapse

