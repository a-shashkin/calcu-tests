# Automated mobile tests for Calcu app for Android

<img width="1518" alt="Calcu app in Android Studio Emulator" src="https://user-images.githubusercontent.com/47101779/212530756-fbae2f62-3701-4186-a9c0-34d3167ef7f4.png">

## Implemented following tests:
- Element presence tests on calculation screen
- Element presence tests in side menu
- Element interaction tests on calculation screen
- Calculation tests for operations of addition, subtraction, multiplication and division

## Technology stack:
<table>
<tbody>
<tr>
<td align="center"><src="https://www.jetbrains.com/idea/"><img src="https://starchenkov.pro/qa-guru/img/skills/Intelij_IDEA.svg" width="40" height="40"><br>IntelliJ IDEA</td>
<td align="center"><src="https://www.jetbrains.com/idea/"><img src="https://cdn-icons-png.flaticon.com/512/226/226777.png" width="40" height="40"><br>Java</td>
<td align="center"><src="https://www.jetbrains.com/idea/"><img src="https://starchenkov.pro/qa-guru/img/skills/Gradle.svg" width="40" height="40"><br>Gradle</td>
<td align="center"><src="https://www.jetbrains.com/idea/"><img src="https://starchenkov.pro/qa-guru/img/skills/JUnit5.svg" width="40" height="40"><br>JUnit5</td>
<td align="center"><src="https://www.jetbrains.com/idea/"><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/Android_Studio_Icon_3.6.svg/1900px-Android_Studio_Icon_3.6.svg.png" width="40" height="40"><br>Android Studio</td>
<td align="center"><src="https://www.jetbrains.com/idea/"><img src="https://cdn.freebiesupply.com/logos/large/2x/browserstack-logo-png-transparent.png" width="40" height="40"><br>Browserstack</td>
</tr>
<tr>
<td align="center"><src="https://www.jetbrains.com/idea/"><img src="https://starchenkov.pro/qa-guru/img/skills/Jenkins.svg" width="40" height="40"><br>Jenkins</td>
<td align="center"><src="https://www.jetbrains.com/idea/"><img src="https://github.githubassets.com/images/modules/logos_page/GitHub-Mark.png" width="40" height="40"><br>Github</td>
<td align="center"><src="https://www.jetbrains.com/idea/"><img src="https://starchenkov.pro/qa-guru/img/skills/Allure_EE.svg" width="40" height="40"><br>Allure TestOps</td>
<td align="center"><src="https://www.jetbrains.com/idea/"><img src="https://seeklogo.com/images/A/appium-logo-7A2DD5B4E3-seeklogo.com.png" width="40" height="40"><br>Appium</td>
<td align="center"><src="https://www.jetbrains.com/idea/"><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Telegram_logo.svg/2048px-Telegram_logo.svg.png" width="40" height="40"><br>Telegram Bot</td>
<td align="center"><src="https://www.jetbrains.com/idea/"><img src="https://img.informer.com/icons_mac/png/128/531/531471.png" width="40" height="40"><br>Appium Inspector</td>
</tr>
</tbody>
</table>

## Local launch (Android Studio)
Requires Android Studio, along with virtual device set up in AVD, and Appium Server.

To test locally in Android Studio emulator, a properties file must be present in /resources directory. For me, I went with the name "simulator.properties", and used the following data:

```bash
simulatorURL=http://127.0.0.1:4723/wd/hub
simulatorDevice=Pixel_4_API_30
simulatorOSVersion=11
simulatorPlatformName=Android
simulatorLocale=en
simulatorLanguage=en
simulatorAppPath=src/test/resources/Stylish Calculator - CALCU_4.2.2.apk
simulatorAppPackage=com.candl.athena
simulatorAppActivity=com.candl.athena.activity.Calculator
```

If your Appium server address, device, OS version, locale, language, or path to app happen to differ, change them according to your needs.

Launch can be made from IntelliJ IDEA via UI or terminal command:
```bash
gradle clean simulator
```

## Local launch (Browserstack)
A properties file must be present in /resources directory. For me, I went with the name "browserstack.properties", and used the following data:

```bash
browserstackURL=http://hub.browserstack.com/wd/hub
browserstackUsername=<YOUR BROWSERSTACK USERNAME GOES HERE>
browserstackPassword=<YOUR BROWSERSTACK ACCESS KEY GOES HERE>
browserstackDevice=Google Pixel 3
browserstackOSVersion=9.0
browserstackProject=Calcu tests
browserstackBuild=browserstack-build-1
browserstackName=calcu_appium_test
browserstackApp=<YOUR BROWSERSTACK APP ADDRESS AFTER UPLOADING GOES HERE>
```

Replace placeholder data with your own. If you wish, you can change other data according to your needs.

Tests will run remotely on Browserstack servers, and run results will be visible there.

Launch can be made from IntelliJ IDEA via UI or terminal command:
```bash
gradle clean browserstack
```

## Parameters for [Jenkins build](https://jenkins.autotests.cloud/job/C08-AShashkin-Calcu_mobile_tests/)

<img width="1436" alt="Screenshot 2023-01-15 at 00 42 11" src="https://user-images.githubusercontent.com/47101779/212531813-d7c21a6c-0aab-4960-83ac-0399436aae92.png">

Take note that Jenkins server isn't likely to have an Android Studio running, so running "simulator" task will most likely end in error.

## [Allure TestOps integration](https://allure.autotests.cloud/project/1802/dashboards)
### Test case tree

<img width="1436" alt="Screenshot 2023-01-15 at 00 42 42" src="https://user-images.githubusercontent.com/47101779/212531913-d9b8a790-74bf-4ed2-b30a-8f4863e785ae.png">

### Launch result

<img width="1436" alt="Screenshot 2023-01-15 at 00 43 05" src="https://user-images.githubusercontent.com/47101779/212531921-bbd7679c-fad3-4fd6-8df5-aecc7ee91fb0.png">

## Telegram notification

<img width="760" alt="Screenshot 2023-01-15 at 00 43 29" src="https://user-images.githubusercontent.com/47101779/212531934-aeb47a93-73d9-4130-b51d-8414009cc7b8.png">
