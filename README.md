# Ouinet's test app

## Configuration

Create a `local.properties` file in the root of this project and set the
following values before building the app:
```groovy
CACHE_PUB_KEY="YOUR PUB KEY"
INJECTOR_USERNAME="YOUR INJECTOR USERNAME"
INJECTOR_PASSWORD="YOUR INJECTOR PASSWORD"
INJECTOR_TLS_CERT="<YOUR TLS CERT>"
TLS_CA_CERT_STORE_PATH="/path/to/your/cert/store/"
```

Those values will be loaded by Gradle during the build process and used later
by Ouinet's ConfigBuilder.