gitlabSourceRepoName = "pipeline-demo"

node {
    def mvnHome = tool 'M3'
    echo "Checking out ${env.gitlabSourceRepoName}"
    git "https://github.com/psamagal/${gitlabSourceRepoName}.git"


}