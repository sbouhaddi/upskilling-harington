pipeline {

	stages {

	    stage('checkout'){
            checkout scm
	    }
		stage('Build'){
		    agent{
                docker{ image 'maven:3.9.6-eclipse-temurin-17'}
            }
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