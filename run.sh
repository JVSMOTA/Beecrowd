#!/bin/bash

# Verifica se o argumento foi passado
if [ -z "$1" ]; then
  echo "Uso: bash build.sh <diretório>"
  exit 1
fi

# Acessa o diretório passado como argumento
DIR=$1

# Compila o arquivo Main.java
javac $DIR/Main.java

# Executa a classe Main
java -cp $DIR Main

