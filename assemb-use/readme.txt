   <build>
     <finalName>imp_akka_server</finalName>
	
     <pluginManagement>   //需要删掉
       <plugins>
         <plugin>
           <artifactId>maven-compiler-plugin</artifactId>

           </executions>
         </plugin>
       </plugins>
     </pluginManagement>  //需要删掉
   </build>
   <reporting>
     <plugins>
     
     需要删除这两行，执行mvn package ，即可执行assembly插件
     否则：必须执行mvn package assembly:single 才能达到效果
