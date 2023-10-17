В ходе выполнения задания были выполнены следующие пункты:
1. В rootProject создан class StringUtils с методом boolean isPositiveNumber(String str);
2. Написан один unit test для проверки этого метода.
3. В файле build.gradle сконфигурирован task jar для создания clever_task2-1.3.5.jar файла.
4. Создать мульти-модульный проект с двумя модулями: core, api. В файле build.setting они были подключены к проекту при помощи include.
5. В модуле core создан class Utils с методом boolean isAllPositiveNumbers(String… str). 
6. Использован clever_task2-1.3.5.jar сделанный на предыдущих этапах, переиспользован метод boolean isPositiveNumber(String str) в модуле core. Благодаря подключению его в 
build.gradle core модуля при помощи implementation.
7. Написан один unit test для проверки метода boolean isAllPositiveNumbers(String… str).
8. В модуле api создан class App с методом main.
9. К модулю api, в файле build.gradle этого модуля, были подключены .jar файлы из предыдущих этапов(расположены в build\libs своих модулей). 
Для запуска проекта необходимо открыть консль в build\libs модуля api и выполнить следующую команду: "java -jar api.jar 12 79", где 12 и 79 входные параметры. 