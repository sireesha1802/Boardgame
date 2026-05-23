def call() {

    catchError(buildResult: 'FAILURE', stageResult: 'SUCCESS') {

        echo "Build Started"

        sh 'mvn cleahn install'

        echo "Build Successful"
    }

    echo "Pipeline Execution Continued"
}
