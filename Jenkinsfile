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
                echo 'Deliver....'
                sh '''
                ./mvnw clean package
                ls -ltra
                nohup java -jar target/firstspringproject-0.0.1-SNAPSHOT.jar > output.log 2>&1 &
                echo "doing delivery stuff.."
                '''
            }
        }
    }
}