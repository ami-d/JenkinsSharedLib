#!/usr/bin/env groovy

def call(String credentialsId){
	echo 'Deployment starts.'
	echo credentialsId
	withCredentials([sshUserPrivateKey(credentialsId: credentialsId, keyFileVariable: 'KEY_FILE')]) {
            echo "${KEY_FILE}"
            sh "scp -i ${KEY_FILE} $WORKSPACE/package/KRelease.ipa kavit.patel@10.12.46.130:/Users/kavit.patel/Desktop"
           
        }
    echo 'Deployment done.'
}