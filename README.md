# Compose Recomposition Demo

This project demonstrates various issues that can arise with recompositions in Jetpack Compose and how to solve them.

## Requirements

- **Android Studio**: Version 2024.1.1 Patch 2 (Koala) or later.
- **Android SDK**: Compile SDK version 34.
- **Kotlin**: Version 2.0.0.
- **Gradle**: Version 8.5.2.

## Setup

1. **Clone the repository**:

2. **Open the project** in Android Studio.

3. **Build the project**:
    - Use the `Build` menu in Android Studio or run `./gradlew build` from the command line.

4. **Run the app**:
    - Use the `Run` button in Android Studio or run `./gradlew installDebug` from the command line.

## Examples

1. **Unstable Class**: Demonstrates issues with recompositions when using an unstable class.
2. **Unstable External Class**: Shows how external classes can cause recomposition problems.
3. **Lambdas**: Explains how lambdas can affect recompositions.
4. **LazyList**: Discusses recomposition issues with `LazyList`.
5. **Columns**: Highlights problems with recompositions in columns.
6. **Continuously Changing State**: Demonstrates issues with state that changes continuously.
7. **Modifiers**: Shows how modifiers can impact recompositions.