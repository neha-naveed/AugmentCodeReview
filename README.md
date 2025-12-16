# Synapse - AI-First Knowledge Companion

An Android application built with Clean Architecture principles.

## Project Structure

This project follows Clean Architecture with the following modules:

- **app**: Main application module containing UI and presentation layer
- **core**: Core module with base classes, utilities, and common dependencies

## Tech Stack

- **Language**: Kotlin 1.9.24
- **Build System**: Gradle 8.11.1 with Kotlin DSL
- **Android Gradle Plugin**: 8.7.3
- **Min SDK**: 24
- **Target SDK**: 34
- **Compile SDK**: 34

### Libraries

- **AndroidX Core**: Core Android libraries
- **Material Design**: Material Design components
- **Hilt**: Dependency injection
- **Room**: Local database
- **Retrofit**: Network calls
- **Coroutines**: Asynchronous programming
- **ViewBinding**: Type-safe view binding
- **SDP/SSP**: Scalable size units for responsive UI

## Features Implemented

### Splash Screen
- Clean, modern splash screen with app logo and tagline
- 2-second delay before navigation
- Follows Material Design guidelines

## Prerequisites

Before building the project, ensure you have:

1. **Java Development Kit (JDK) 17 or higher**
   - Check version: `java -version`
   - Download from: https://adoptium.net/

2. **Android SDK**
   - Install Android Studio from: https://developer.android.com/studio
   - Or install command-line tools from: https://developer.android.com/studio#command-tools

3. **Configure Android SDK Location**
   - Create or update `local.properties` file in the project root
   - Add the following line (adjust path to your SDK location):
     ```
     sdk.dir=/path/to/your/android/sdk
     ```
   - Example paths:
     - Linux/Mac: `sdk.dir=/Users/USERNAME/Library/Android/sdk`
     - Windows: `sdk.dir=C\:\\Users\\USERNAME\\AppData\\Local\\Android\\sdk`

## Building the Project

1. Clone the repository
2. Configure `local.properties` with your Android SDK path (see Prerequisites)
3. Open the project in Android Studio, or build from command line
4. Sync Gradle files
5. Run the app on an emulator or physical device

### Command Line Build

```bash
# Build debug APK
./gradlew assembleDebug

# Build release APK
./gradlew assembleRelease
```

## Running the App

```bash
./gradlew installDebug
```

## Architecture

The project follows Clean Architecture with three main layers:

1. **Presentation Layer** (UI)
   - Activities, Fragments, ViewModels
   - Located in `app/src/main/java/com/synapse/app/ui/`

2. **Domain Layer**
   - Use cases, domain models
   - Located in `app/src/main/java/com/synapse/app/domain/`

3. **Data Layer**
   - Repositories, data sources, mappers
   - Located in `app/src/main/java/com/synapse/app/data/`

## Dependency Management

All dependencies are managed centrally using `gradle/libs.versions.toml` for version catalog.

## License

Copyright © 2024 Synapse

