#!/usr/bin/env groovy

def call(){
	echo 'Deployment starts.'
	withCredentials([sshUserPrivateKey(credentialsId: "c09ec154-b893-4588-a5ab-919c75fc6808", keyFileVariable: 'KEY_FILE')]) {
            echo '$KEY_FILE'
            sh "scp -i ${KEY_FILE} $WORKSPACE/package/KRelease.ipa kavit.patel@10.12.46.130:/Users/kavit.patel/Desktop"
           
        }
    echo 'Deployment done.'
}