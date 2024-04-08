[![](https://jitpack.io/v/YoonJaePark3908/GadgetUtil-android.svg)](https://jitpack.io/#YoonJaePark3908/GadgetUtil-android)

<p>
    <img src="./images/Gadget.webp" width="200">
</p> 

## Gadget Utils
오픈소스 프로젝트 연습용으로 만든 Gadget Utils 입니다. 안드로이드 개발에 필요한 다양한 Util 함수를 모았습니다.

## 다운로드
Step 1. 프로젝트의 root 위치에 있는 build.gradle에 다음과 같이 추가해주세요.
```groovy
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```
Step 2. 모듈 안 build.gradle의 dependency에 다음과 같이 추가해주세요.
```kotlin
implementation("com.github.YoonJaePark3908:GadgetUtil-android:Tag")
```