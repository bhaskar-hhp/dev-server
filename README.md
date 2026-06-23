# WebView App

Loads http://161.118.189.168:8082/ in a WebView.

## Build via GitHub Actions

1. Create a new repo on GitHub (e.g. `webview-app`)
2. Push this code:
   ```bash
   cd /tmp/opencode/github-project
   git init
   git add .
   git commit -m "Initial commit"
   git remote add origin https://github.com/YOUR_USER/webview-app.git
   git push -u origin main
   ```
3. Go to your repo → Actions tab → "Build APK" workflow
4. Click "Run workflow" (or push a change to trigger it)
5. Download the APK artifact when done

## Manual Build

```bash
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
./gradlew assembleRelease
```

The unsigned APK will be at `app/build/outputs/apk/release/app-release-unsigned.apk`.
