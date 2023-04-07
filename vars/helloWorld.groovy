def call(Map config = [:]) {
    echo "hello ${config.name}. Today is ${config.dayOfWeek}"
}
