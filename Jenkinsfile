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
	    stage('Code coverage check'){
	        steps{
	            sh "mvn clean test jacoco:prepare-agent"
	            sh "mvn jacoco:check"
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