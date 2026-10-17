# Kaspi QR — Android App

Простое Android-приложение, которое открывает https://kaspi.kz/qr в WebView.

## Иконка
- Красный фон (фирменный цвет Kaspi)
- QR-код по центру
- Надпись KASPI внизу

## Как собрать APK

### Способ 1: Android Studio (рекомендуется)
1. Скачай [Android Studio](https://developer.android.com/studio) и установи
2. Открой папку `kaspi-qr-app` через **File → Open**
3. Подожди пока синхронизируется Gradle (~2-3 минуты)
4. Нажми **Build → Build Bundle(s) / APK(s) → Build APK(s)**
5. APK появится в: `app/build/outputs/apk/debug/app-debug.apk`
6. Перекинь APK на телефон и установи

### Способ 2: Командная строка
```bash
cd kaspi-qr-app
./gradlew assembleDebug
```
APK: `app/build/outputs/apk/debug/app-debug.apk`

## Требования
- Android 5.0+ (API 21+)
- Интернет-соединение

## Структура проекта
```
kaspi-qr-app/
├── app/
│   ├── src/main/
│   │   ├── java/kz/kaspi/qr/
│   │   │   └── MainActivity.java      ← основной код
│   │   ├── res/
│   │   │   ├── mipmap-*/              ← иконки всех размеров
│   │   │   ├── layout/activity_main.xml
│   │   │   └── values/themes.xml
│   │   └── AndroidManifest.xml
│   └── build.gradle
├── build.gradle
├── settings.gradle
└── gradle.properties
```
