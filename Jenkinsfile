pipeline{
    agent any
    stages {
        stage('Build') {
            steps {
                echo "Building.."
                sh '''
                echo "doing build stuff.."
                '''
            }
        }
        stage('Test') {
            steps {
                echo "Testing.."
                sh '''
                echo "doing test stuff.."
                '''
            }
        }
        stage('Deliver') {
            steps {
                sh 'echo "Deliver...."'
 
                sh 'ls -ltra'
                sh 'mvn clean package'
                sh 'nohup java -jar target/firstspringproject-0.0.1-SNAPSHOT.jar > output.log 2>&1 &'

                sh 'echo "doing delivery stuff.."'

            }
        }
    }
}