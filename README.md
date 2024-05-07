[![](https://jitpack.io/v/JaeparkYoon3908/GadgetUtil-android.svg)](https://jitpack.io/#JaeparkYoon3908/GadgetUtil-android)

<p>
    <img src="./images/Gadget.webp" width="200">
</p> 

## Gadget Util
오픈소스 프로젝트 연습용으로 만든 Gadget Utils 입니다. 안드로이드 개발에 필요한 다양한 Util 함수를 모았습니다.

## 다운로드
Step 1. 프로젝트의 root 위치에 있는 settings.gradle에 다음과 같이 추가해 주세요.
```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven(url = "https://jitpack.io")
    }
}
```
Step 2-1 or 2-2 중 하나를 선택하여 다음과 같이 추가해주세요.

Step 2-1. 모듈 안 build.gradle의 dependency에 다음과 같이 추가해 주세요. 
```kotlin
implementation("com.github.JaeparkYoon3908:GadgetUtil-android:Tag")
```
Step 2-2 libs.versions.toml 사용시 다음과 같이 추가해 주세요.
```toml
[versions]
gadget = "tag"
[libraries]
gadget-util = { group = "com.github.JaeparkYoon3908", name = "GadgetUtil-android", version.ref = "gadget" }
```
모듈 안의 build.gradle
```kotlin
implementation(libs.gadget.util)
```

## 사용법
Gadget Util은 Kotlin의 object로 구성되어 있습니다. Kotlin의 object는 thread-safe 하며 싱글턴으로 생성됩니다.  
<br>
사용 예시
```kotlin
val 10dpToPx = GadgetDisplay.dpToPx(10)
```
