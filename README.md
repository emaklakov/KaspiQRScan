# Kaspi QR — Android App

Простое Android-приложение, которое перенаправляет в сервисы Kaspi (QR, Переводы, Госуслуги).

## Возможности приложения
- **Kaspi QR** — открывается по умолчанию при обычном запуске приложения (`https://kaspi.kz/qr`).
- **Ярлыки быстрого доступа (App Shortcuts)** — доступны при долгом нажатии на иконку приложения на рабочем столе:
  - 💸 **Переводы** (`Kaspi Переводы`) — быстрая ссылка на переводы (`https://l.kaspi.kz/nra4iI0BrUs`).
  - 🏛️ **Госуслуги** (`Kaspi Госуслуги`) — быстрая ссылка на госуслуги (`https://l.kaspi.kz/CZE9s42d1a1`).

## Иконки
- **Иконка приложения**:
  - Красный фон (фирменный цвет Kaspi `#F14635`)
  - QR-код по центру
  - Надпись KASPI внизу
- **Иконки ярлыков**:
  - Красный круглый фон `#F14635`
  - Белые векторные иконки для Переводов и Госуслуг

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
│   │   │   └── MainActivity.java          ← обработка экшенов и перенаправление
│   │   ├── res/
│   │   │   ├── drawable/                  ← векторные иконки для ярлыков
│   │   │   │   ├── ic_shortcut_transfer.xml
│   │   │   │   └── ic_shortcut_gov_services.xml
│   │   │   ├── mipmap-*/                  ← иконки приложения всех размеров
│   │   │   ├── values/
│   │   │   │   ├── strings.xml            ← тексты и названия ярлыков
│   │   │   │   └── themes.xml             ← тема приложения (Theme.KaspiQR)
│   │   │   └── xml/
│   │   │       └── shortcuts.xml          ← конфигурация ярлыков быстрого доступа
│   │   └── AndroidManifest.xml
│   └── build.gradle
├── build.gradle
├── settings.gradle
└── gradle.properties
```
