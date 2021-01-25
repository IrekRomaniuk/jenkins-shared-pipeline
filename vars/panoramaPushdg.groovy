pipeline {
    agent any
    environment {
        API_KEY= credentials("${config.panorama_api_key}")
    }
    stages { 
        stage('Push Panorama device groups') {
            steps {
                sh """
                  ansible-playbook -i "localhost," ${config.playbook_path} -e "api_key=$API_KEY ip_address=${config.ip_address} device_group=${config.device_group}"
                """
            }
        }
    }
}