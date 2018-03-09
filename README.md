# Kubernetes Microservice Example

## system diagram
![diagram](https://raw.github.com/wiki/keitaro1020/k8s-example/k8s-example-system.png)

## Usage (on minikube)
1. [Install minikube](https://github.com/kubernetes/minikube)
2. Build & Create Docker Image
  1. minikube docker path
  ```
  $ eval $(minikube docker-env)
  ```
  2. frontend service build
  ```
  $ cd frontend/web
  $ npm install
  $ npm run build
  $ cd ../
  $ ./gradlew build docker
  ```
  3. bookservice build
  ```
  $ cd bookservice
  $ ./gradlew build docker
  ```
3. Create Kubernetes Namespace
```
$ kubectl create namespace bookshelf-system
```
4. Deploy
```
$ kubectl apply -f k8s-example-database.yaml 
$ kubectl apply -f k8s-example-bookservice.yaml 
$ kubectl apply -f k8s-example-frontend.yaml 
```
