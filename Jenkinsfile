pipeline {
	agent docker{ image 'maven:3.9.6-eclipse-temurin-17'}
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