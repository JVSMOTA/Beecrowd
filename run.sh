#!/bin/bash

# Verifica se o argumento foi passado
if [ -z "$1" ]; then
  echo "Uso: bash run.sh <diretório ou caminho para Main.java>"
  exit 1
fi

# Acessa o argumento passado
ARG=$1

# Verifica se é um diretório ou um arquivo
if [ -d "$ARG" ]; then
  DIR=$ARG
  FILE="$DIR/Main.java"
elif [ -f "$ARG" ]; then
  FILE=$ARG
  DIR=$(dirname "$ARG")
else
  echo "Erro: Argumento inválido. Passe um diretório ou o caminho para Main.java."
  exit 1
fi

# Compila o arquivo Main.java
javac "$FILE"

# Verifica se a compilação foi bem-sucedida
if [ $? -eq 0 ]; then
  # Executa a classe Main
  java -cp "$DIR" Main
  
  # Remove o arquivo .class após a execução
  rm "$DIR/Main.class"
else
  echo "Erro na compilação do arquivo."
  exit 1
fi

