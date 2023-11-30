pipeline{
    agent any
    stages {
        stage('Build') {
            steps {
                echo "Building.."
                sh '''
                echo "doing build stuff.."
                '''
                // git 'https://github.com/stanleyzzheng/notesapp'
                sh 'mvn -B -DskipTests clean package'
                // sh 'whoami'
                // sh 'pwd'
                // sh 'ls -la /var/lib/jenkins/workspace/my_first_build_pipeline'
            }
        }
        stage('Test') {
            steps {
                echo "Testing.."
                sh '''
                echo "doing test stuff.."
                '''
                sh 'mvn test'

            }
            post {
                always {
                    junit '**/target/surfire-reports/TEST-*.xml'
                }
            }
        }
        stage('Deliver') {
            steps {
                sh 'echo "Deliver...."'
 
                // sh 'ls -ltra'
                withEnv(['JENKINS_NODE_COOKIE=dontkill']) {
                    sh 'nohup java -jar target/firstspringproject-0.0.1-SNAPSHOT.jar > output.log 2>&1 &'
                }
                // sh 'java -jar target/firstspringproject-0.0.1-SNAPSHOT.jar'
                sh 'echo "doing delivery stuff.."'
                // sh 'whoami'
                // sh 'pwd'
                // sh 'ls -la /var/lib/jenkins/workspace/my_first_build_pipeline'
            }
        }
    }
}