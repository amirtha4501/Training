@echo off
set path=%PATH%;C:\Program Files\Java1.8\jdk1.8.0_261
echo Compiling Bunny.java
javac -d . Bunny.java
pause
echo Running ClassB.java
java in.kpriet.training.java.abstraction.Bunny
pause
echo Compiling College.java
javac -d . College.java
pause
echo Running College.java
java in.kpriet.training.java.innerclass.College
pause