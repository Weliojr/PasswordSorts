Apresentação do meus primeiros commits deste repositório
consegui fazer algumas mudanças

Projeto Passwords

O dataset apresentado compreende a listagem de mais de 600 mil senhas, as quais o aluno deve fazer a classificação, afiltragem e a ordenação.

Você pode baixar o dataset diretamente através do linkLinks para um site externo. O arquivo a ser considerado é o passwords.csv
Regras para classificar senhas

Para a classificação, devemos considerar como entrada dos dados o arquivo entitulado passwords.csv. O aluno deve implemtar um código seguindo as regras abaixo para classificar as senhas, e gerar um novo arquivo password_classifier com a coluna (class) com cada classe para a respectiva senha. OBS: Senhas que porventura venham a ter mais de um tipo, o aluno pode escolher o tipo de que deve ser classificado.

    Muito Ruim: tamanho da string menor que 5, e só um tipo de caractere, por exemplo: só letra (letras minúsculas ou maiúsculas), só número ou só caractere especial. 

    Ruim: tamanho da string menor ou igual a 5, e só um tipos de caracteres, por exemplo: letra (letras minúsculas ou maiúsculas), número ou caractere especial. 

    Fraca: tamanho da string menor ou igual a 6, e só dois tipos de caracteres, por exemplo: letra(letras minúsculas e maiúsculas), número ou caractere especial. 

    Boa:  tamanho da string menor ou igual a 7, e só todos de caracteres, por exemplo: letra(letras minúsculas e maiúsculas), número e caractere especial.

    Muito Boa:  tamanho da string maior que 8, e só todos os tipos de caracteres, por exemplo: letra(letras minúsculas e maiúsculas), número ou caractere especial
    Sem Classificação: Senhas que não se qualificam com nenhuma das classificações acima.

 
Transformações

Para as tranforamções, devemos considerar como entrada dos dados o arquivo entitulado password_classifier.csv

    Transformar data para o formato a seguir DD/MM/AAAA
        Gerar um arquivo chamado passwords_formated_data.csv

    Filtrar senha pela categória Boa e Muito Boa.
        Gerar um arquivo chamado passwords_classifier.csv

Ordenações

Para as ordenações, devemos considerar como entrada dos dados o arquivo entitulado passwords_formated_data.csv

Lembrando que para cada questão abaixo deve ser utilizado todos os algoritmos de ordenação recomendados na descrição do projeto, sendo assim você deve gerar um arquivo diferente para cada algoritmo de ordenação / caso.

Sobre os casos, para efeito de análise dos algoritmos deve-se trabalhar com 3 casos (melhor, médio e pior) para cada um dos algoritmos. 

    Ordenar o arquivo completo de senhas pelo campo length em ordem decrescente.
        Deve-se gerar um arquivo para cada algoritmo de ordenação e o tipo de caso. Por exemplo, passwords_length_insertionSort_medioCaso.csv, passwords_length_insertionSort_piorCaso.csv, passwords_length_insertionSort_melhorCaso.csv
    Ordenar o arquivo completo de senhas por mês, (OBS: deve-se obter o mês a partir da data já formatada) da coluna data, de forma crescente.
        Deve-se gerar um arquivo para cada algoritmo de ordenação e o tipo de caso. Por exemplo, passwords_data_month_insertionSort_medioCaso.csv, passwords_month_data_insertionSort_piorCaso.csv, passwords_data_month_insertionSort_melhorCaso.csv
    Ordenar o arquivo completo de senhas pela coluna data de forma crescente.
        Deve-se gerar um arquivo para cada algoritmo de ordenação e o tipo de caso. Por exemplo, lpasswords_data_insertionSort_medioCaso.csv, passwords_month_insertionSort_piorCaso.csv, passwords_data_insertionSort_melhorCaso.csv

