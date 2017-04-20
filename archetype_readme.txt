自定义 Archetype项目模板
转至元数据结尾
由 顾孝昀创建于二月 23, 2017 转至元数据起始
1、首先使用eclipse创建一个新的maven project，然后把配置好的一些公用的东西放到相应的目录下面
比如说会将一些常用的Java代码存放到src/main/java目录下面；
会将一些通用的配置文件放到src/main/resources目录下面；
如果是javeEE工程，还会有一些jsp等等的文件存放到src/main/webapp目录下面

2、然后在maven project的pom.xml文件中添加插件
================================================
<build> 
<pluginManagement>
<plugins>
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-archetype-plugin</artifactId>
<version>2.2</version>
</plugin>
</plugins>
</pluginManagement>
</build>
================================================
3、打开cmd窗口，cd到刚才创建的maven project的根目录，运行maven命令：
mvn archetype:create-from-project
然后会在target目录下面生成generated-sources目录，这个就是生成的 archetype
4、cd进入generated-sourced/archetype目录，运行maven命令：
mvn install
这样就把自定义的archetype安装到本地仓库了。
archetype安装的地址是在maven安装目录下面的conf/settings.xml文件中指定的(<localRepository>字节)。
默认会在 ~/.m2 目录下面生成一个archetype-catalog.xml文件（和默认的settings.xml在同一个目录），
声明了该archetype的groupId、artifactId和其他属性。
因为Eclipse创建maven项目过程中，选择的“Default Local”指向的地址就是 ~/.m2，
所以文件archetype-catalog.xml会被eclipse自动读取，
使用eclipse创建maven项目的时候可以在"Default Local"一项中找到刚才自定义archetype名字。

5、当eclipse的maven设置中，User Settings选择的settings.xml指向的本地仓库地址和maven安装目录下
的那个settings.xml中指向路径一样的时候，eclipse才能读取得到刚才安装的自定义的archetype的源文件，
这样eclipse才能复制源文件并创建项目。
6、如果想要卸载刚才安装的archetype，只需要将~/.m2目录下面的archetype-catalog.xml文件中对应的<archetype>字节段删掉，
并且把本地仓库中相应groupId和artifactId下面的文件删掉就可以了。
7、安装到本地仓库中的archetype只可以被自己使用，如果想要共享，那么在第四步的时候使用deploy命令，不要使用install命令。
