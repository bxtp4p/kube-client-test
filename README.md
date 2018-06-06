# About

This is just a simple example to test out the use of the [Official Java Kubernetes Client](https://github.com/kubernetes-client/java). I primarily was using this to test on Docker UCP.

In the [deployment.yaml](deployment.yaml) file, a service account is created. For this to work in UCP, make sure that this account is granted `Restricted Control` role across all namespaces.