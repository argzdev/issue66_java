# issue 66
### Summary
- Initializing FirebaseApp without `google-services.json` will not allow Analytics to work. After enabling debug event logs. The error ` Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI
` is displayed:
### Steps to reproduce
1. Open app
2. Enable debug event logs via the following commands:
```
adb shell setprop log.tag.FA VERBOSE
adb shell setprop log.tag.FA-SVC VERBOSE
adb logcat -v time -s FA FA-SVC
```
3. Click Hello World, see terminal logs. Error ` Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI` is displayed.
