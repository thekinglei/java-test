java文件：Aaa.java
java编译；javac Aaa.java
java打包(假定打包为test.jar)：jar cvf test.jar AAA.class
如果包含多个文件(中间以空格分开，或者用*代替)：
1)  jar cvf test.jar a.class b.class
2)  jar cvf test.jar a.*
