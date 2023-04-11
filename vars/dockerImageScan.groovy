/* def call (String hubUser, String project, String imageTag){
    sh """
        trivy image docker image tag ${hubUser}/${project}:latest > scan.txt
        cat scan.txt
    """
} */

def call(String aws_account_id, String region, String ecr_repo){
    
    sh """
     docker rmi ${ecr_repo}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repo}:latest
    """
}