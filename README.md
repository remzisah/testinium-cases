# testinium-cases


java project BUILD
___________________________________________________________________
project->Run As->
				Maven Build
				->Main >Goals="clean install spring-boot:run"
										&&
							   "clean install spring-boot:repackage"
				->JRE ->VM arguments:"-Dmaven.test.skip=true"  //skip tests
				

project->Run As->Run Configuration
								->JRE-< VM arguments="-Dmaven.test.skip=true" //skip test
				
				
project->Run As->				
				spring devtools client->
									Main->
									Goals="clean install spring-boot:repackage"						______________________________________________________________________________________________	
then							
 	find project->.jar file	
			using this direction
				and add Dockerfile  //->not file format
								[

								FROM openjdk:17-oracle  		//->free use
									ARG JAR_FILE=*.jar
									CPY ${JAR_FILE} -file name-.jar
									EXPOSE 1071					//->port:1071	
									ENTRYPOINT ["java","-jar","/-file name.jar"]
									
									]
						
				
		****.jar file ..buil Docker image*****
			
			command-> docker build -t  -docker image file name-
			....
			....building finished..
			
			GO GO-> Docker UI -> Images ->//You will see -docker image file name-
			
			------------------
			new create instance
			
			command -> docker run -cpuset-cpus=1,3,5 --name instanceName --rm -p 1071:1071 -d -docker image file name-    
				&&
				command -> docker run --cpus=0.50 --name instanceName --rm -p 1072:1071 -d -docker image file name-   


			****create docker network then create mysql image***
			
