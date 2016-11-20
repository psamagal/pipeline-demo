gitlabSourceRepoName = "pipeline-demo"

node {
    def mvnHome = tool 'M3'
    env.JAVA_HOME="${tool 'J8u112'}"
    env.PATH="${env.JAVA_HOME}/bin:${env.PATH}"
    sh 'java -version'

    stage 'Checkout'
    echo "Checking out ${env.gitlabSourceRepoName}"
    git "https://github.com/psamagal/${gitlabSourceRepoName}.git"

    stage 'Build'
    sh "${mvnHome}/bin/mvn -B clean install"


}