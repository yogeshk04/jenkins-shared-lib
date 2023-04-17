def call (String hubUser, String project, String imageTag){
    sh """
        docker image build -t ${project} .
        docker image tag ${project}:latest ${hubUser}/${project}:${imageTag}
    """
}