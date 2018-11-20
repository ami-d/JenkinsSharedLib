#!/usr/bin/env groovy

def call(String credentialsId, String userName, String ip){
	echo 'Deployment starts.'
	echo credentialsId
	withCredentials([sshUserPrivateKey(credentialsId: credentialsId, keyFileVariable: 'KEY_FILE')]) {
            echo "${KEY_FILE}"
            sh "scp -i ${KEY_FILE} $WORKSPACE/package/KRelease.ipa $userName@$ip:/Users/$userName/Desktop"
           
        }
    echo 'Deployment done.'
}