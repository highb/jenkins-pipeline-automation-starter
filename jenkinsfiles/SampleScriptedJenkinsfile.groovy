timestamps {
    node {
        stage('Generate data') {
            ansiColor('xterm') {
                sh "echo -e '\\e[32mGenerating data\\e[0m'"
            }
            try {
                sh 'echo `date` > data'
            } catch (exception) {
                cleanWs()
                throw exception
            }
        }
    }
}
