pipeline {

    agent any
    tools {
      maven '3.9.6'
    }
	stages {
	    stage('checkout'){
            steps{
                checkout scm
            }
	    }
	    stage('Spotless Check'){
	        steps{
	            sh "mvn spotless:check"
	        }
	    }
		stage('Build'){
			steps {
				sh "mvn clean install -DskipTests"
			}
		}
		stage('Test'){
			steps{
				sh "mvn test"
			}
		}
	}
}