def call(String project, String ImageTag, String hubUser){
    
    sh """
     docker rmi ${project}:latest
     docker rmi ${hubUser}/${project}:${imageTag}
    """
}
