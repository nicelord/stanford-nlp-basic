#  stanford-nlp-basic

NLP libray used : [Stanford CoreNLP](https://stanfordnlp.github.io/CoreNLP) 

> Core logic is in the *Main.java* class, feel free to review/modify.

The logic simply do the following tasks :

 1. Get the text and hold it in the ***input*** variable
 2. Load the default NER pre-trained model provided by library
 3. Feed the model to read the ***input*** variable
 4. Configure the loaded model to set the output in *xml* format
 5. Print out the result

## prerequisites

- Java 8 (Jdk 1.8) 
- Maven

## installation

    git clone https://github.com/nicelord/stanford-nlp-basic.git

## build

    mvn clean package

## run the program

    java -jar target\stanford-nlp-basic-1.0-SNAPSHOT.jar

