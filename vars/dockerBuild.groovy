/* def call (String hubUser, String project, String imageTag){
    sh """
        docker image build -t ${hubUser}/${project} .
        docker image tag ${hubUser}/${project}:${imageTag}
        docker image tag ${hubUser}/${project}:latest
    """
} */
def call(String aws_account_id, String region, String ecr_repo){
    
    sh """
     sudo su
     docker build -t ${ecr_repo} .
     docker tag ${ecr_repo}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repo}:latest
    """
}