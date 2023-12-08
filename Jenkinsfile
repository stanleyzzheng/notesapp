pipeline{
    agent any
    options {
        timeout(time: 5, unit: 'MINUTES') // Set the timeout duration (1 hour in this example)
    }
    stages {
        stage('Stop Service') {
            steps {
                script {
                    sh 'sudo systemctl stop backend'
                }
            }
        }
        stage('Build') {
            steps {
                echo "Building.."
                sh '''
                echo "doing build stuff.."
                '''
                sh 'mvn -B -DskipTests clean package'

            }
        }
        stage('Test') {
            steps {
                echo "Testing.."
                sh '''
                echo "doing test stuff.."
                '''
                // sh 'mvn test'

            }
            // post {
            //     always {
            //         junit '**/target/surfire-reports/TEST-*.xml'
            //     }
            // }
        }
        stage('Deliver') {
            steps {
                sh 'echo "Deliver...."'
 
                // withEnv(['JENKINS_NODE_COOKIE=dontkill']) {
                //     sh 'nohup java -jar target/firstspringproject-0.0.1-SNAPSHOT.jar > output.log 2>&1 &'
                // }
                sh 'sudo systemctl start backend'

                sh 'echo "doing delivery stuff.."'

            }
        }
    }
}