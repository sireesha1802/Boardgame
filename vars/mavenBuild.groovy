def call() {

    try {

        echo "Build Started"

        sh 'mvn clean install'

        echo "Build Successful"

    } catch(Exception e) {

        echo "Build Failed"

        echo "Error: ${e}"

        currentBuild.result = 'FAILURE'

    } finally {

        echo "Pipeline Execution Completed"
    }
}
