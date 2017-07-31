
# firstImportJar 实践记录 #
导入jar包

      

## jar包下载和拷贝 ##
	1、到log4j官网下载 log4j2 的 jar包压缩包， 并解压
	2、在 firstImportJar Modul 新建 lib 子目录，将以上解压出的 log4j2 相关jar包拷贝到 lib目录：
		log4j-api-2.5.jar
		log4j-core-2.5.jar

## 依赖添加：jar包的设置 ##
	1、在 firstImportJar Module 点击右键
	2、在 open module setting(F4)|firstImportJar|Dependencies|“＋”|Jars or directories	
		将Jar包所在目录添加进来
	

## 编译和运行 ##
	1、右键点击  src/com/hello/HelloWorld.java|Run HelloWorld.main()

