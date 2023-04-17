def call (String hubUser, String project, String imageTag){
    sh """
        trivy image docker image tag ${hubUser}/${project}:latest > scan.txt
        cat scan.txt
    """
}