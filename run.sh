set -o errexit

./gradlew build --quiet

java -cp build/classes/java/main/ com.stormbreakerenterprises.Main
