# Synapse - Quick Start Guide

## 🚀 Get Started in 3 Steps

### Step 1: Install Prerequisites

**Java 17 or Higher**
```bash
# Check current version
java -version

# Install Java 17 (Ubuntu/Debian)
sudo apt-get install openjdk-17-jdk

# Install Java 17 (macOS with Homebrew)
brew install openjdk@17
```

**Android SDK**
- Download Android Studio: https://developer.android.com/studio
- Or install command-line tools only

### Step 2: Configure Android SDK

Create `local.properties` file in project root:

```properties
sdk.dir=/path/to/your/android/sdk
```

**Example paths:**
- **Linux/Mac**: `sdk.dir=/Users/USERNAME/Library/Android/sdk`
- **Windows**: `sdk.dir=C\:\\Users\\USERNAME\\AppData\\Local\\Android\\sdk`

### Step 3: Build and Run

```bash
# Make gradlew executable (Unix/Mac only)
chmod +x gradlew

# Build the project
./gradlew assembleDebug

# Install on connected device/emulator
./gradlew installDebug
```

## 📱 What You'll See

The app will launch with a beautiful splash screen featuring:
- Gradient background
- Synapse logo in a circular container
- App title: "Synapse"
- Tagline: "AI-First Knowledge Companion"
- 2-second display duration

## 🛠️ Development Commands

```bash
# Clean build
./gradlew clean

# Build debug APK
./gradlew assembleDebug

# Build release APK
./gradlew assembleRelease

# Run unit tests
./gradlew test

# Run instrumented tests
./gradlew connectedAndroidTest

# Install debug APK
./gradlew installDebug

# Uninstall app
./gradlew uninstallDebug

# List all tasks
./gradlew tasks
```

## 📂 Key Files to Know

### Main Activity
- **File**: `app/src/main/java/com/synapse/app/ui/splash/SplashScreenActivity.kt`
- **Purpose**: Splash screen with 2-second delay

### Layout
- **File**: `app/src/main/res/layout/activity_splash_screen.xml`
- **Purpose**: Splash screen UI design

### Application Class
- **File**: `app/src/main/java/com/synapse/app/SynapseApplication.kt`
- **Purpose**: App initialization with Hilt

### Dependencies
- **File**: `gradle/libs.versions.toml`
- **Purpose**: Centralized dependency management

## 🎨 Customization

### Change App Name
Edit `app/src/main/res/values/strings.xml`:
```xml
<string name="app_name">Your App Name</string>
```

### Change Colors
Edit `app/src/main/res/values/colors.xml`:
```xml
<color name="splash_background">#FFFFFF</color>
<color name="logo_circle_bg">#337B6CD9</color>
```

### Change Splash Delay
Edit `SplashScreenActivity.kt`:
```kotlin
companion object {
    private const val SPLASH_DELAY = 2000L // Change this value
}
```

### Replace Logo
Replace `app/src/main/res/drawable/ic_synapse_logo.xml` with your logo

### Replace Background
Replace `app/src/main/res/drawable/splash_background.xml` with your background

## 🏗️ Project Structure

```
Synapse/
├── app/              # Main application module
│   └── src/
│       ├── main/     # Main source code
│       ├── test/     # Unit tests
│       └── androidTest/  # Instrumented tests
├── core/             # Core module with base classes
│   └── src/
│       └── main/     # Core source code
└── gradle/           # Gradle configuration
    └── libs.versions.toml  # Version catalog
```

## 📚 Documentation

- **README.md** - Project overview
- **PROJECT_SETUP.md** - Detailed setup guide
- **IMPLEMENTATION_SUMMARY.md** - Complete implementation details
- **QUICK_START.md** - This file

## 🐛 Troubleshooting

### "SDK location not found"
- Ensure `local.properties` exists with correct `sdk.dir` path
- Or set `ANDROID_HOME` environment variable

### "Java version" error
- Ensure Java 17+ is installed: `java -version`
- Set `JAVA_HOME` if needed

### Gradle sync fails
```bash
./gradlew clean
rm -rf .gradle
./gradlew build
```

### Build fails
```bash
# Check Gradle version
./gradlew --version

# Re-download dependencies
./gradlew build --refresh-dependencies
```

## 🎯 Next Steps

1. **Add Onboarding Screen**
   - Create new activity in `ui/onboarding/`
   - Uncomment navigation in `SplashScreenActivity`

2. **Add Main Screen**
   - Create main activity
   - Implement navigation from onboarding

3. **Add Features**
   - Follow Clean Architecture pattern
   - Use base classes from core module
   - Add domain, data, and UI layers

## 💡 Tips

- Use **ViewBinding** for type-safe view access
- Use **Hilt** for dependency injection
- Use **SDP/SSP** for responsive dimensions
- Follow **Clean Architecture** principles
- Write **tests** for your code

## 📞 Support

For issues or questions:
1. Check documentation files
2. Review error messages carefully
3. Ensure all prerequisites are installed
4. Verify Android SDK configuration

---

**Happy Coding! 🎉**

