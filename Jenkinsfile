pipeline {
    agent any
    tools {
      openJDK 'openjdk17'
    }
	stages {
	    stage('checkout'){
            checkout scm
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