<<<<<<< HEAD
﻿talkie
======

Small sample project for students

Задание:

1. Создать проект, используя предложенные файлы с исходным кодом, и "собрать" его, используя Ant. 
   Запустить - убедиться, что собранный jar работает.

2. Создать второй проект с теми же исходными кодами, но который будет собираться с помощью Maven. 
   Лучше всего изначально создавать проект, используя Maven archetype plugin. Тогда структура проекта будет соответствовать стандартной. 
   Дальше нужно осуществить сборку с помощью Maven и, как и в прошлом примере, убедиться, что собранный jar работает.
   
   Получившийся проект закоммитить в свой репозиторий на github. Коммитить стоит начиная с папки src, т.к. при клонировании репозитория    по умолчанию создается папка с его именем и туда кладется все содержимое репозитория. Коммитить "рабочие" папки типа target или файлы/папки настроек для IDE не нужно.

3. Во втором проекте сделать следующие изменения (с соответсвующими изменениями в pom.xml, если это нужно):
    - добавить использование ресурсов (например, сделать, чтобы ответы хранились в файле и зачитывать его при старте. Файл должен находиться внутри проекта)
    - добавить использование внешней библиотеки (например, использовать StringUtils.isEmpty(String str) из библиотеки apache commons (groupId: commons-lang; artifactId: commons-lang)
    
   Все внесенные изменения тоже закоммитить в репозиторий.


Ссылка на презнтацию (было решено положить ее на Google Drive): https://docs.google.com/file/d/0B_D5AVi3D1-bOC1FbUFKUVRaZEE/edit?usp=sharing 
=======
students-jdbc
=============

Задание заключается в том, чтобы использовать базу данных для хранения вопросов пользователей и ответов на них в базе данных, а так же получение и запись этой информации на стороне сервлета.

Для этого необходимо создать структуру базы данных, состоящую как минимум из двух таблиц для раздельного хранения вопросов и ответов.

На стороне приложения необходимо создать класс, отвечающий за работу с базой данных, и составить SQL запросы, которые позволят записывать и читать все необходимые данные из базы.


MySQL java connector in Maven:
http://mvnrepository.com/artifact/mysql/mysql-connector-java/5.1.6


Лекции:
* Базы данных. SQL: https://drive.google.com/file/d/0B_D5AVi3D1-bUXZLelZSQlBFbHRSd3NkN2V2NWl3QWlpLUpj/
* JDBC. JNDI: https://drive.google.com/file/d/0B_D5AVi3D1-bZjVlN3FFOXloNDV2bWtGZ0t0ZG9zMnEyVGxB/
>>>>>>> ff0dd03ee6e774bc317fe44d6b405142ae770cc6
