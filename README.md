# Ouinet's test app

## Configuration

Create a `local.properties` file in the root of this project and set the
following value before building the app:
```groovy
CACHE_PUB_KEY="YOUR OUINET CACHE PUB KEY"
```

Those values will be loaded by Gradle during the build process and used later
by Ouinet's ConfigBuilder.