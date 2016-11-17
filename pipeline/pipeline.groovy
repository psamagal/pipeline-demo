node {

    stage 'Checkout'
        sh "Checkout"
    stage 'Build'
        sh "Build"
    stage 'Publish'
        sh "Publish"
    stage 'Deploy'
        sh "Deploy"
    stage 'Smoke Tests'
        sh "Smoke Tests"
}