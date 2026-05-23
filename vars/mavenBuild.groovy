def call() {

    catchError(buildResult: 'FAILURE', stageResult: 'FAILURE') {

        echo "Build Started"

        sh 'mvn clean install'

        echo "Build Successful"
    }

    echo "Pipeline Execution Continued"
}
