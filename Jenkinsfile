pipeline {
	agent any
	tools {
		jdk 'java-17'
		maven '3.9.6'
	}
	stages {
		stage('Build'){
			steps {
				bat "mvn clean install -DskipTests"
			}
		}
		stage('Test'){
			steps{
				bat "mvn test"
			}
		}
	}
}