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

	    stage('Build'){
            steps {
                sh "mvn clean install -DskipTests"
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

        stage('Incrementing version'){
            steps{
                script {
                   sh "mvn build-helper:parse-version versions:set \
                       -DnewVersion=\\\${parsedVersion.majorVersion}.\\\${parsedVersion.minorVersion}.\\\${parsedVersion.nextIncrementalVersion} \
                        versions:commit"

                    def updatedVersion = sh(script: 'mvn help:evaluate -Dexpression=project.version -q -DforceStdout', returnStdout: true).trim()
                    def buildNumber = env.BUILD_NUMBER
                    def commitSha = sh(script: "git rev-parse HEAD", returnStdout: true).trim()
                    env.IMAGE_VERSION = "$updatedVersion-$buildNumber-$commitSha"
                    echo "Incremented version: ${env.IMAGE_VERSION}"
               }
            }
        }

		stage('Build Docker image') {
            steps {

                 sh "docker build -t private-school:$IMAGE_NAME-$ ."
            }
        }
	}
}